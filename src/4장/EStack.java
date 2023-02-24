import java.util.EmptyStackException;

public class EStack<E> {

	private E[] stk; // ��ü�� ����
	private int capacity; // ���� �뷮
	private int ptr; // ���� ������

	// ���� ó��
//	�Ʒ� ���ܵ�(RuntimeException ���)�� � Ÿ���� ������ �𸣱� ������ JVM�� ���� �ν��Ͻ��� �����Ҽ� �ִ� ����� ����?
//	static���̴ϱ� ��������
//		//������ ������� ���
//		public class EmptyIntStackException extends RuntimeException {
//			public EmptyIntStackException() { }
//		}
//		
//		//������ ��� á�� ���
//		public class OverflowIntStackException extends RuntimeException {
//			public OverflowIntStackException() { }
//		}

	// ������
	// ��Ÿ�� ���� �迭�� Ÿ���� Object�� Ÿ�� ������ ������ ���� �� �ִµ�
	// �츮�� push �� EŸ�Ը� ���� ���̹Ƿ� Ÿ�� �������� ����ȴ�. ���� ��� ���ܽ�Ű�� �ȴ�.
	@SuppressWarnings("unchecked")
	public EStack(int maxLen) {
		ptr = 0; // ���� �عٴڿ��� ����
		capacity = maxLen; // ���� ���� ����
		try {
			stk = (E[]) new Object[capacity]; // ��� ��ü Ÿ���� ���� �� �ְ� ���ְ� ���׸� Ÿ��ĳ����
		} catch (OutOfMemoryError e) { // �޸� ������ ���� �� �޸� ����
			capacity = 0;
		}
	}

	public E push(E e) throws StackOverflowError {
		// push���� ���� ���� á�� ��� ����ó��
		if (ptr >= capacity) {
			throw new StackOverflowError("������ ���� á���ϴ�.");
		}
		return stk[ptr++] = e; // ���� ������ �迭�� �� �־��ְ� �� ����, ������ +1
	}

	public E pop() throws EmptyStackException {
		// pop���� ������ ������� ��� ����ó��
		if (ptr <= 0) {
			throw new EmptyStackException();
		}
		return stk[ptr--]; // �ش� ������ ��� ���� �� ������ �ϳ� �����
	}

	// peek
	public E peek() throws EmptyStackException {
		// peek���� ���� ������� ��� ����ó��
		if (ptr <= 0) {
			throw new EmptyStackException();
		}
		return stk[ptr - 1]; // top��� ����
	}

	public void clear() {
		ptr = 0;
	}

	// ��� �˻�
	public int indexOf(E e) {
		for (int i = 0; i < ptr; i++) {
			if (stk[i].equals(e)) {
				return i;
			}
		}
		return -1;
	}

	// ���� �뷮 ��ȯ
	public int getCapacity() {
		return capacity;
	}

	// ���� �ȿ� �ִ� ������ ���� ��ȯ
	public int size() {
		return ptr; // �����ʹ� ���������� push�� �ε��� ���� �ε����� ����Ű�� ������ ���ʿ� �ε����� 0���� �����ϱ� ������ ���� ���ȴ�.
	}

	// ���� ����á���� ���� ��ȯ
	public boolean isFull() {
		return ptr >= capacity;
	}

	// ���� �� ��ҵ��� bottom -> top������ ���
	public void dump() {
		if (ptr <= 0) {
			System.out.println("���� �����");
		} else {
			for (int i = 0; i < ptr; i++) {
				System.out.print(stk[i] + " ");
			}
			System.out.println();
		}
	}
}
