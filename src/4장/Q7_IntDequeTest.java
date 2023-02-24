import java.util.Scanner;

public class Q7_IntDequeTest {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		IntDeque dq = new IntDeque(64); // �ִ� 64���� ��ť�� �� �ִ� ��

		while (true) {
			System.out.println("���� ������ ���� : " + dq.size() + " / " + dq.getCapacity());
			System.out.print("(1)�� ��ť��(2)�� ��ť (3)�� ��ť (4)�� ��ť (5)�� ��ũ (6)�� ��ũ (7)���� (8)�˻� (9)Ŭ���� (0) ���� : ");

			int menu = stdIn.nextInt();
			if (menu == 0)
				break;

			int x = 0;
			switch (menu) {
			case 1: // �� ��ť
				System.out.print("�տ� ��ť�� ������ : ");
				x = stdIn.nextInt();
				try {
					dq.enqueueF(x);
				} catch (IntArrayQueue.OverflowIntArrayQueueException e) {
					System.out.println("ť�� ���� á���ϴ�.");
				}
				break;
				
			case 2: // �� ��ť
				System.out.print("�ڿ� ��ť�� ������ : ");
				x = stdIn.nextInt();
				try {
					dq.enqueueR(x);
				} catch (IntArrayQueue.OverflowIntArrayQueueException e) {
					System.out.println("ť�� ���� á���ϴ�.");
				}
				break;

			case 3: // �� ��ť
				try {
					x = dq.dequeueF();
					System.out.println("�տ��� ��ť�� �����ʹ� " + x + "�Դϴ�.");
				} catch (IntArrayQueue.EmptyIntArrayQueueException e) {
					System.out.println("ť�� ��� �ֽ��ϴ�.");
				}
				break;
				
			case 4: // �� ��ť
				try {
					x = dq.dequeueR();
					System.out.println("�ڿ��� ��ť�� �����ʹ� " + x + "�Դϴ�.");
				} catch (IntArrayQueue.EmptyIntArrayQueueException e) {
					System.out.println("ť�� ��� �ֽ��ϴ�.");
				}
				break;

			case 5: // �տ��� ��ũ
				try {
					x = dq.peekF();
					System.out.println("�տ��� ��ũ�� �����ʹ� " + x + "�Դϴ�.");
				} catch (IntArrayQueue.EmptyIntArrayQueueException e) {
					System.out.println("ť�� ��� �ֽ��ϴ�.");
				}
				break;
				
			case 6: // �ڿ��� ��ũ
				try {
					x = dq.peekR();
					System.out.println("�ڿ��� ��ũ�� �����ʹ� " + x + "�Դϴ�.");
				} catch (IntArrayQueue.EmptyIntArrayQueueException e) {
					System.out.println("ť�� ��� �ֽ��ϴ�.");
				}
				break;

			case 7: // ����
				dq.dump();
				break;

			case 8: // �˻�
				System.out.print("������ �˻��� ������ �Է�: ");
				int search = stdIn.nextInt();
				try {
					int idx = dq.search(search);
					System.out.println("�ش� �����ʹ� �ε���" + idx + "�� �ֽ��ϴ�.");
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("������ ����ֽ��ϴ�.");
				}
				break;
				
			case 9: // Ŭ����
				dq.clear();
				break;
			}
		}
	}
}
