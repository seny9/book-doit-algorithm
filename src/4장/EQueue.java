
public class EQueue<E> {
	private E[] que;
	private int capacity;
	private int front;
	private int rear;
	private int num;
	
	// ť�� ������� ���
		public static class EmptyEQueueException extends RuntimeException {
			public EmptyEQueueException() {
			}
		}

		// ť�� ���� á�� ���
		public static class OverflowEQueueException extends RuntimeException {
			public OverflowEQueueException() {
			}
		}

	// ������
	@SuppressWarnings("unchecked")
	public EQueue(int maxLen) {
		num = 0;
		front = 0;
		rear = 0;
		capacity = maxLen;
		try {
			que = (E[]) new Object[capacity];
		} catch (OutOfMemoryError e) {
			capacity = 0;
		}
	}

	// ��ť
	public E enqueue(E e) throws OverflowEQueueException {
		if (num >= capacity) {
			throw new  OverflowEQueueException();
		}
		que[rear++] = e; // ������ �߰�
		num++; // �����ͼ� +1

		// ������ �ε������� �����͸� ��ť�� ��� rear�ε��� 0���� ���༭ ��� ��ť �����ϵ���
		if (rear == capacity) {
			rear = 0;
		}
		return e;
	}

	// ��ť
	public E dequeue() throws EmptyEQueueException{
		if (num <= 0) {
			throw new EmptyEQueueException();
		}
		E e = que[front++]; // �� �� ��� ���ְ� front�� ���� ��ҷ� ����
		num--; // �����ͼ� -1

		// ������ �ε������� �����͸� ��ť�� ��� front�ε��� 0���� ���༭ ��� ��ť �����ϵ���
		if (front == capacity) {
			front = 0;
		}
		return e;
	}

	// ����Ʈ ������ ����
	public E peek() throws EmptyEQueueException {
		if (num <= 0) {
			throw new EmptyEQueueException();
		}
		return que[front];
	}

	// Ŭ����
	public void clear() {
		num = 0;
		front = 0;
		rear = 0;
	}

	// �˻�, �����Ͱ� ����Ǵ� �ε����� �������ִ� ���� �ƴϹǷ� ����
	public int indexOf(E e) {
		for (int i = 0; i < num; i++) {
			int idx = (i + front) % capacity; // front�ε������� ����, ���� �ε��� �ִ밪�� �����ϸ� �迭 ũ��� �����༭ �ٽ� �ε��� 0���� �ٽ� �����ϵ���
			if (que[idx].equals(e)) //��� Ÿ�� ���ϱ� ���ؼ� equals
				return idx;
		}
		return -1;
	}
	
	//������ ��ġ�� �ƴ� ť �ȿ����� ������ġ ��ȯ(1���ͽ���)
	public int search(E e) {
		for(int i=0; i<num; i++) { //������ ����ŭ
			int idx = (i + front) % capacity;
			if (que[idx].equals(e))
				return i+1; //�˻��� ���� ������� �ϵ� ��ȯ�� ������ ��ġ��
		}
		return -1;
	}

	public int getCapacity() {
		return capacity;
	}

	public int size() {
		return num;
	}

	public boolean isEmpty() {
		return num <= 0;
	}

	public boolean isFull() {
		return num >= capacity;
	}

	public void dump() {
		if (num <= 0) {
			throw new EmptyEQueueException();
		} else {
			for (int i = 0; i < num; i++) { // ����Ʈ - ���� ���
				System.out.println(que[(i + front) % capacity] + " ");
			}
			System.out.println();
		}
	}

}
