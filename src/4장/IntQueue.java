
public class IntQueue {
	private int[] que;
	private int capacity;
	private int front;
	private int rear;
	private int num;

	// ť�� ������� ���
	public class EmptyIntQueueException extends RuntimeException {
		public EmptyIntQueueException() {
		}
	}

	// ť�� ���� á�� ���
	public class OverflowIntQueueException extends RuntimeException {
		public OverflowIntQueueException() {
		}
	}

	// ������
	public IntQueue(int maxLen) {
		num = 0;
		front = 0;
		rear = 0;
		capacity = maxLen;
		try {
			que = new int[capacity];
		} catch (OutOfMemoryError e) {
			capacity = 0;
		}
	}

	// ��ť
	public int enqueue(int x) throws OverflowIntQueueException {
		if (num >= capacity) {
			throw new OverflowIntQueueException();
		}
		que[rear++] = x; // ������ �߰�
		num++; // �����ͼ� +1

		// ������ �ε������� �����͸� ��ť�� ��� rear�ε��� 0���� ���༭ ��� ��ť �����ϵ���
		if (rear == capacity) {
			rear = 0;
		}
		return x;
	}

	// ��ť
	public int dequeue() throws EmptyIntQueueException {
		if (num <= 0) {
			throw new EmptyIntQueueException();
		}
		int item = que[front++]; // �� �� ��� ���ְ� front�� ���� ��ҷ� ����
		num--; // �����ͼ� -1

		// ������ �ε������� �����͸� ��ť�� ��� front�ε��� 0���� ���༭ ��� ��ť �����ϵ���
		if (front == capacity) {
			front = 0;
		}
		return item;
	}

	// ����Ʈ ������ ����
	public int peek() throws EmptyIntQueueException {
		if (num <= 0) {
			throw new EmptyIntQueueException();
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
	public int indexOf(int x) {
		for (int i = 0; i < num; i++) {
			int idx = (i + front) % capacity; // front�ε������� ����, ���� �ε��� �ִ밪�� �����ϸ� �迭 ũ��� �����༭ �ٽ� �ε��� 0���� �ٽ� �����ϵ���
			if (que[idx] == x)
				return idx;
		}
		return -1;
	}
	
	//������ ��ġ�� �ƴ� ť �ȿ����� ������ġ ��ȯ(1���ͽ���)
	public int search(int x) {
		for(int i=0; i<num; i++) { //������ ����ŭ
			int idx = (i + front) % capacity;
			if (que[idx] == x)
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
			throw new EmptyIntQueueException();
		} else {
			for (int i = 0; i < num; i++) { // ����Ʈ - ���� ���
				System.out.println(que[(i + front) % capacity] + " ");
			}
			System.out.println();
		}
	}

}
