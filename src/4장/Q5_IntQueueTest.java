import java.util.Scanner;

public class Q5_IntQueueTest {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		IntQueue q = new IntQueue(5);

		while (true) {
			System.out.println("���� ������ ���� : " + q.size() + " / " + q.getCapacity());
			System.out.print("(1) ��ť��(2) ��ť��(3) ��ũ ��(4)indexof (5)search (6) ����  (7) Ŭ����(0) ���� : ");

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

			case 4: //indexof
				System.out.print("ť���� ������ ��ġ �˻��� ������ �Է�: ");
				int find = stdIn.nextInt();
				try {
					int idx = q.indexOf(find);
					System.out.println("�ش� �����ʹ� �ε���" + idx + "�� �ֽ��ϴ�.");
			} catch (IntQueue.EmptyIntQueueException e) {
					System.out.println("ť�� ����ֽ��ϴ�.");
				}
				break;

			case 5: // search
				System.out.print("ť���� ���� ��ġ �˻��� ������ �Է�: ");
				int search = stdIn.nextInt();
				try {
					int idx = q.search(search);
					System.out.println("�ش� �����ʹ� �ε���" + idx + "�� �ֽ��ϴ�.");
			} catch (IntQueue.EmptyIntQueueException e) {
					System.out.println("ť�� ����ֽ��ϴ�.");
				}
				
				break;
				
			case 6: //dump
				q.dump();
				break;
				
			case 7: //Ŭ����
				q.clear();
				break;
			}
		}
	}
}
