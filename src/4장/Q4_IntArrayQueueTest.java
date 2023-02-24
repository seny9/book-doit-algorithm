import java.util.Scanner;

public class Q4_IntArrayQueueTest {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		IntArrayQueue q = new IntArrayQueue(64); // �ִ� 64���� Ǫ���� �� �ִ� ť

		while (true) {
			System.out.println("���� ������ ���� : " + q.size() + " / " + q.capacity());
			System.out.print("(1) ��ť��(2) ��ť��(3) ��ũ (4) ������(5) Ŭ����(0) ���� : ");

			int menu = stdIn.nextInt();
			if (menu == 0)
				break;

			int x = 0;
			switch (menu) {
			case 1: // ��ť
				System.out.print("������ : ");
				x = stdIn.nextInt();
				try {
					q.enqueue(x);
				} catch (IntArrayQueue.OverflowIntArrayQueueException e) {
					System.out.println("ť�� ���� á���ϴ�.");
				}
				break;

			case 2: // ��ť
				try {
					x = q.dequeue();
					System.out.println(" ��ť�� �����ʹ� " + x + "�Դϴ�.");
				} catch (IntArrayQueue.EmptyIntArrayQueueException e) {
					System.out.println("ť�� ��� �ֽ��ϴ�.");
				}
				break;

			case 3: // ��ũ
				try {
					x = q.peek();
					System.out.println("��ũ�� �����ʹ� " + x + "�Դϴ�.");
				} catch (IntArrayQueue.EmptyIntArrayQueueException e) {
					System.out.println("ť�� ��� �ֽ��ϴ�.");
				}
				break;

			case 4: // ����
				q.dump();
				break;

			case 5: // Ŭ����
				q.clear();
				break;
			}
		}
	}
}
