import java.util.Scanner;

public class Q1_IntStackTest {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		IntStack s = new IntStack(64); // �ִ� 64 ���� Ǫ���� �� �ִ� ����

		while (true) {
			System.out.println(); // �޴� ������ ���� �� �� �߰�
			System.out.printf("���� ������ ����: %d / %d\n", s.size(), s.getCapacity());
			System.out.print("(1)Ǫ�á�(2)�ˡ�(3)��ũ��(4)������(5)�˻� (6)Ŭ���� (7)á���� Ȯ�� (0)����: ");

			int menu = stdIn.nextInt();
			if (menu == 0)
				break;

			int x;
			switch (menu) {
			case 1: // Ǫ��
				System.out.print("������: ");
				x = stdIn.nextInt();
				try {
					s.push(x);
				} catch (IntStack.OverflowIntStackException e) {
					System.out.println("������ ���� á���ϴ�.");
				}
				break;

			case 2: // ��
				try {
					x = s.pop();
					System.out.println("���� �����ʹ� " + x + "�Դϴ�.");
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("������ ����ֽ��ϴ�.");
				}
				break;

			case 3: // ��ũ
				try {
					x = s.peek();
					System.out.println("��ũ�� �����ʹ� " + x + "�Դϴ�.");
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("������ ����ֽ��ϴ�.");
				}
				break;

			case 4: // ����
				s.dump();
				break;

			case 5:
				System.out.print("�˻��� ������ �Է�: ");
				int search = stdIn.nextInt();
				try {
					int idx = s.indexOf(search);
					System.out.println("�ش� �����ʹ� �ε���" + idx + "�� �ֽ��ϴ�.");
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("������ ����ֽ��ϴ�.");
				}
				break;

			case 6:
				System.out.print("������ ���� �����?(N/y): ");
				char ch = stdIn.next().charAt(0);
				if (ch == 'y') {
					s.clear();
					System.out.println("������ ���� ������ϴ�");
				} else {
					System.out.println("���� ���� ���");
				}
				break;

			case 7:
				if (s.isFull())
					System.out.println("������ ��� á���ϴ�.");
				else
					System.out.println("������ ���� ���� �ʾҽ��ϴ�.");
				break;

			}
		}
	}
}
