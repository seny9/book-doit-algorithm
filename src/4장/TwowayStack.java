
public class TwowayStack {

	private int[] stk;
	private int capacity;
	private int APtr; // ���� ���̵� ���� ������
	private int BPtr; // ������ ���̵� ���� ������

	// ���� ó��

	// ������ ������� ���
	public class EmptyTwowayStackException extends RuntimeException {
		public EmptyTwowayStackException() {
		}
	}

	// ������ ��� á�� ���
	public class OverflowTwowayStackException extends RuntimeException {
		public OverflowTwowayStackException() {
		}
	}

	// ������
	public TwowayStack(int maxLen) {
		APtr = 0; // ���� ���� �عٴ��� �迭 �ε��� 0
		BPtr = maxLen - 1; // ������ ���� �عٴ��� �迭 �ε��� ������
		capacity = maxLen; // ���� ���� ����
		try {
			stk = new int[capacity];
		} catch (OutOfMemoryError e) { // �޸� ������ ���� �� �޸� ����
			capacity = 0;
		}
	}

	// A �迭�� push
	public int pushA(int x) throws OverflowTwowayStackException {
		// push ���� B������ �������� �Ѿ ��� ����ó��
		if (APtr >= BPtr) {
			throw new OverflowTwowayStackException();
		}
		return stk[APtr++] = x; // �����Ϳ� �� �־��ְ� �� ����, ������+1
	}

	// A �迭���� pop
	public int popA() throws EmptyTwowayStackException {
		// pop ���� ������ ������� ��� ���� ó��
		if (APtr <= 0) {
			throw new EmptyTwowayStackException();
		}
		return stk[--APtr]; // �ش� ������ ��� ���� �� ������ �ϳ� �����

	}

	// B �迭�� push
	public int pushB(int x) throws OverflowTwowayStackException {
		// push ���� A������ �������� �Ѿ ��� ����ó��
		if (BPtr <= APtr) {
			throw new OverflowTwowayStackException();
		}
		return stk[BPtr--] = x; // �����Ϳ� �� �־��ְ� �� ����, ������+1
	}

	// B �迭���� pop
	public int popB() throws EmptyTwowayStackException {
		// pop ���� ������ ������� ��� ���� ó��
		if (BPtr >= capacity) {
			throw new EmptyTwowayStackException();
		}
		return stk[++BPtr]; // �ش� ������ ��� ���� �� ������ �ϳ� �����

	}

	// A�迭 peek
	public int peekA() throws EmptyTwowayStackException {
		// peek ���� ������ ������� ��� ���� ó��
		if (APtr <= 0) {
			throw new EmptyTwowayStackException();
		}
		return stk[APtr - 1]; // ����� ��� ����
	}

	// B�迭 peek
	public int peekB() throws EmptyTwowayStackException {
		// peek ���� ������ ������� ��� ���� ó��
		if (BPtr >= capacity) {
			throw new EmptyTwowayStackException();
		}
		return stk[BPtr + 1]; // ����� ��� ����
	}

	// ���� ��� ����
	public void clear() {
		APtr = 0; // �����͸� 0���� �ʱ�ȭ�ؼ� A������ bottom���� �ٽ� ����ǵ��� ��
		BPtr = capacity - 1; // �����͸� �迭�� ������ �ε����� �ʱ�ȭ�ؼ� B������ bottom���� �ٽ� ����ǵ��� ��
	}

	// A���� �� ��� �˻�
	public int indexOfA(int x) {
		for (int i = 0; i < APtr; i++) { // bottom���� ������-1(��Ұ� �ִ� ��)���� �˻� -> ���߿� pop�Ǵ� ��Ҹ� ���� ã��
			if (stk[i] == x)
				return i;
		}
		return -1;
	}

	// B���� �� ��� �˻�
	public int indexOfB(int x) {
		for (int i = capacity - 1; i > BPtr; i--) { // bottom���� ������+1(��Ұ� �ִ� ��)���� �˻� -> ���߿� pop�Ǵ� ��Ҹ� ���� ã��
			if (stk[i] == x)
				return -(i-capacity+1);
		}
		return -1;
	}

	// ���� �뷮 ��ȯ
	public int getCapacity() {
		return capacity;
	}

	// A���� �ȿ� �ִ� ������ ���� ��ȯ
	public int sizeA() {
		return APtr; // �����ʹ� ���������� push�� �ε��� ���� �ε����� ����Ű�� ������ ���ʿ� �ε����� 0���� �����ϱ� ������ ���� ���ȴ�.
	}

	// B���� �ȿ� �ִ� ������ ���� ��ȯ
	public int sizeB() {
		return -(BPtr-capacity+1); //capacity-1 �ε������� ������, ���� �ε������� �����͸� �������� ����� �����ϹǷ� ��ȣ ����� �ٲ��ش�
	}

	// ���� ����á���� ���� ��ȯ
	public boolean isFull() {
		return APtr == BPtr;
	}

	// A���ð� B���� �� ��ҵ��� bottom -> top������ ���
	public void dump() {
		//A���� ����
		if (APtr <= 0) {
			System.out.println("A���� �����");
		} else {
			System.out.println("A����");
			for (int i = 0; i < APtr; i++) {
				System.out.print(stk[i] + " ");
			}
			System.out.println();
		}
		//B���� ����
		if (BPtr >= capacity) {
			System.out.println("B���� �����");
		} else {
			System.out.println("B����");
			for (int i = capacity-1; i > BPtr; i--) {
				System.out.print(stk[i] + " ");
			}
			System.out.println();
		}
	}

}
