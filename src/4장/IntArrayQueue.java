
public class IntArrayQueue {
	private int[] que; // ť �迭
	private int capacity; // ť �뷮
	private int num; // ���� ������ ����

	//���� ó��
	
	//ť�� ������� ���
	public class EmptyIntArrayQueueException extends RuntimeException {
		public EmptyIntArrayQueueException() {
		}
	}

	//ť�� ���� á�� ���
	public class OverflowIntArrayQueueException extends RuntimeException {
		public OverflowIntArrayQueueException() {
		}
	}
	
	public IntArrayQueue(int maxLen) {
		num = 0;
		capacity = maxLen;
		try {
				que = new int[capacity];
		}catch (OutOfMemoryError e) {
			capacity = 0;
		}
	}
	
	//��ť
	public int enqueue(int x) throws OverflowIntArrayQueueException{
		if(num >= capacity) {
			throw new OverflowIntArrayQueueException();
		}
		return que[num++] = x;
	}
	
	//��ť
	public int dequeue() throws EmptyIntArrayQueueException{
		if(num <= 0) {
			throw new EmptyIntArrayQueueException();
		}
		int item = que[0];
		for(int i=0; i < num-1; i++)
			que[i] = que[i+1]; //�ϳ��� ������ ����ش�.
		num--;
		return item;
	}
	
	//��ũ
	public int peek() throws EmptyIntArrayQueueException{
		if(num <= 0) {
			throw new EmptyIntArrayQueueException();
		}
		return que[0]; //����Ʈ ��� ����
	}
	
	//�˻�
	public int indexOf(int x) {
		for(int i=0; i< num; i++) {
			if(que[i] == x)
				return i;
		}
		return -1;
	}
	
	//Ŭ����
	public void clear() {
		num=0;
	}
	
	//�뷮 ��ȯ
	public int capacity() {
		return capacity;
	}
	
	//������ �� ��ȯ
	public int size() {
		return num;
	}
	
	//���� á���� Ȯ��
	public boolean isFull() {
		return num>=capacity;
	}
	
	//��� �ִ��� Ȯ��
	public boolean isEmpty() {
		return num<=0;
	}
	
	//����
	public void dump() {
		if(num <= 0)
			System.out.println("ť�� �������");
		else {
			for(int i=0; i<num; i++)
				System.out.print(que[i] + " ");
			System.out.println();
		}
	}
	

}
