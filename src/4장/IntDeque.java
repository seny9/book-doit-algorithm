public class IntDeque {

	private int[] deque;
	private int capacity;
	private int front;
	private int rear;
	private int num;

	// ���� ������� ���
	public static class EmptyIntDequeException extends RuntimeException {
		public EmptyIntDequeException() {
		}
	}

	// ���� ���� á�� ���
	public static class OverflowIntDequeException extends RuntimeException {
		public OverflowIntDequeException() {
		}
	}

	public IntDeque(int maxLen) {
		num = 0;
		front = 0;
		rear = 0;
		capacity = maxLen;
		try {
			deque = new int[capacity];
		} catch (OutOfMemoryError e) {
			capacity = 0;
		}
	}

	// �տ��� ��ť, ������ ó�� �� ������ ��ť
	public int enqueueF(int x) {
		if (num >= capacity) {
			throw new OverflowIntDequeException();
		}
		front--; //���� ������ ������ ������ �ű�
		if (front< 0) {
			front = capacity - 1; // ������ ���� �迭 �ε��� 0���� �۾��� ��� front�� �ڷ� �Ѱ��ֱ�
		}
		deque[front] = x; // �Ű��� �����Ϳ� ���� ������ �߰�
		num++; // �����ͼ� +1

		return x;
	}

	// �ڿ��� ��ť, ������ ��ť �� ������ ó��
	public int enqueueR(int x) {
		if (num >= capacity) {
			throw new OverflowIntDequeException();
		}
		deque[rear++] = x; //������ ���� �߰� ��, ���� ������ ������ ������ �ű�
		if (rear == capacity) {
			rear = 0; // ���� ������ ���� �迭�� �Ѿ ��� �ٽ� rear�� ������ �Ѱ��ֱ� 
		}
		num++; // �����ͼ� +1

		return x;
	}

	// �տ��� ��ť, ������ ��ť�� �� ������ ó��
	public int dequeueF() {
		if (num <= 0) {
			throw new EmptyIntDequeException();
		}
		int item = deque[front++];
		if (front == capacity) {
			front = 0; // �����Ͱ� �迭 ���������� �� ��ť�� ��� front�� ������ �Ѱ��ֱ�
		}
		num--; // ������ �� -1
		return item;
	}

	// �ڿ��� ��ť, ������ ó�� �� ������ ��ť
	public int dequeueR() {
		if (num <= 0) {
			throw new EmptyIntDequeException();
		}
		if (--rear < 0) {
			rear = capacity-1; // ���� ��ť�� ���� �迭 �ε���0���� �۾��� ��� rear�� �ڷ� �Ѱ��ֱ�
		}
		num--; // ������ �� -1
		int item = deque[rear];
		return item;
	}
	
	//�տ��� peek
	public int peekF() throws EmptyIntDequeException{
		if(num <= 0) {
			throw new EmptyIntDequeException();
		}
		return deque[front];
	}
	
	//�ڿ��� peek
	public int peekR() throws EmptyIntDequeException{
		if(num <= 0) {
			throw new EmptyIntDequeException();
		}
		if(rear == 0) { //���� rear �����Ͱ� �迭 ���� �տ� �ִ� ��� ���� �� �����͸� �����ش�
			return deque[capacity-1];
		}
		return deque[rear-1]; //�ƴ϶�� �ܼ��� �� ĭ �տ� �ִ� �����͸� �����ش�
	}
	
	//�˻�
	public int indexOf(int x) {
		for(int i=0; i<num; i++) {
			int idx = (i + front) % capacity;
			if(deque[idx] == x)
				return idx;
		}
		return -1;
	}
	
	//���� ��ġ �˻�
	public int search(int x) {
		for(int i=0; i<num; i++) {
			int idx = (i + front) % capacity;
			if(deque[idx] == x)
				return i+1;
		}
		return -1;
	}
	
	//Ŭ����
	public void clear() {
		num=0;
		front=0;
		rear=0;
	}
	
	//�뷮
	public int getCapacity() {
		return capacity;
	}
	
	//�����ͼ�
	public int size() {
		return num;
	}
	
	//����ִ���
	public boolean isEmpty() {
		return num==0;
	}
	
	//���� ���ִ���
	public boolean isFull() {
		return num==capacity;
	}
	
	//����
	public void dump() {
		if(num <= 0) {
			throw new EmptyIntDequeException();
		}
		for(int i=0; i<num; i++)
			System.out.print(deque[(i+front) % capacity] + " ");
		System.out.println();
	}
}
