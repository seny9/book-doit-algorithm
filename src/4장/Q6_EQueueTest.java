import java.util.Scanner;

public class Q6_EQueueTest {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		EQueue<String> eq = new EQueue<String>(5);

		while (true) {
			System.out.printf("���� ������ ���� : %d / %d\n", eq.size(), eq.getCapacity());
			System.out.print("(1) ��ť��(2) ��ť��(3) ��ũ (4) ���� (5) �˻� (0) ���� : ");

			int menu = stdIn.nextInt();
			if (menu == 0)
				break;

			int idx;
			String x;

			switch (menu) {
			case 1:
				System.out.print("������ : ");
				x = stdIn.next();
				try {
					eq.enqueue(x);
				} catch (EQueue.OverflowEQueueException e) {
					System.out.println("ť�� ���� á���ϴ�.");
				}
				break;

			case 2:
				try {
					x = eq.dequeue();
					System.out.println(" ��ť�� �����ʹ� " + x + "�Դϴ�.");
				} catch (EQueue.EmptyEQueueException e) {
					System.out.println("ť�� ��� �ֽ��ϴ�.");
				}
				break;

			case 3:
				try {
					x = eq.peek();
					System.out.println("��ũ�� �����ʹ� " + x + "�Դϴ�.");
				} catch (EQueue.EmptyEQueueException e) {
					System.out.println("ť�� ��� �ֽ��ϴ�.");
				}
				break;

			case 4: // ����
				eq.dump();
				break;

			case 5: { // �˻�
				System.out.print("������ : ");
				String str = stdIn.next();
				int n = eq.search(str);
				if (n != 0)
					System.out.printf("%d��° �����ͷ� �ε���%d�� ��ġ�� ����Ǿ� �ֽ��ϴ�.\n", n, eq.indexOf(str));
				else
					System.out.println("�� �����ʹ� ��ϵǾ� ���� �ʽ��ϴ�.");
				break;
			}
			}
		}
	}
}
