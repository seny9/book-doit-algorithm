
public class IntStack {
	
	private int[] stk; //���ÿ� �迭
	private int capacity; //�迭�� ���� �� �ִ� �뷮
	private int ptr; //������
	
	//���� ó��
	
	//������ ������� ���
	public class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() { }
	}
	
	//������ ��� á�� ���
	public class OverflowIntStackException extends RuntimeException {
		public OverflowIntStackException() { }
	}
	
	//������
	public IntStack(int maxLen) {
		ptr = 0; //���� �عٴڿ��� ����
		capacity = maxLen; //���� ���� ����
		try {
			stk = new int[capacity];
		}catch (OutOfMemoryError  e) { //�޸� ������ ���� �� �޸� ����
			capacity = 0;
		}
	}
	
	//push
	public int push(int x) throws OverflowIntStackException{
		//push ���� ���� ���� á�� ��� ���� ó��
		if(ptr >= capacity) {
			throw new OverflowIntStackException();
		}
		return stk[ptr++] = x; //�����Ϳ� �� �־��ְ� �� ����, ������+1
	}
	
	//pop
	public int pop() throws EmptyIntStackException{
		//pop ���� ������ ������� ��� ���� ó��
		if(ptr <= 0) {
			throw new EmptyIntStackException();
		}
		return stk[--ptr]; // �ش� ������ ��� ���� �� ������ �ϳ� �����
		
	}
	
	//peek
	public int peek() throws EmptyIntStackException{
		//���� peek ���� ���� ����ִٸ� ���� ó��
		if(ptr <= 0) {
			throw new EmptyIntStackException();
		}
		return stk[ptr - 1]; //����� ��� ����
	}
	
	//���� ��� ����
	public void clear() {
		ptr = 0; //�����͸� 0���� �ʱ�ȭ�ؼ� bottom���� �ٽ� ����ǵ��� ��
	}
	
	//���� �� ��� �˻�
	public int indexOf(int x) {
		//for(int i= ptr-1; i >= 0; i++) { //top���� bottom���� �˻� -> ���� pop�Ǵ� ��Ҹ� ���� ã��
		for(int i = 0; i < ptr; i++) { //bottom���� ������-1(��Ұ� �ִ� ��)���� �˻� -> ���߿� pop�Ǵ� ��Ҹ� ���� ã��
			if(stk[i] == x)
				return i;
		}
		return -1;
	}
	
	//���� �뷮 ��ȯ
	public int getCapacity() {
		return capacity;
	}
	
	//���� �ȿ� �ִ� ������ ���� ��ȯ
	public int size() {
		return ptr; //�����ʹ� ���������� push�� �ε��� ���� �ε����� ����Ű�� ������ ���ʿ� �ε����� 0���� �����ϱ� ������ ���� ���ȴ�.
	}
	
	//���� ����á���� ���� ��ȯ
	public boolean isFull() {
		return ptr >= capacity;
	}
	
	//���� �� ��ҵ��� bottom -> top������ ���
	public void dump() {
		if(ptr <= 0) {
			System.out.println("���� �����");
		}
		else {
			for(int i = 0; i < ptr; i++) {
				System.out.print(stk[i] + " ");
			}
			System.out.println();
		}
	}

}
