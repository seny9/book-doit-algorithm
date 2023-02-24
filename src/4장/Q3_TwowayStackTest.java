import java.util.Scanner;

public class Q3_TwowayStackTest {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		TwowayStack s = new TwowayStack(64); // �ִ� 64 ���� Ǫ���� �� �ִ� ����

		while (true) {
			System.out.println(); // �޴� ������ ���� �� �� �߰�
			System.out.printf("���� A���� ������ ����: %d B���� ������ ����: %d / %d\n", s.sizeA(), s.sizeB(), s.getCapacity());
			System.out.print("(1)AǪ�á�(2)BǪ��\n(3)A�� (4)B��\n(5)A��ũ (6)B��ũ\n(7)���� (8)A�˻� (9)B�˻� (10)Ŭ���� (11)á���� Ȯ�� (0)����: ");

			int menu = stdIn.nextInt();
			if (menu == 0)
				break;

			int x;
			switch (menu) {
			case 1: // Ǫ��
				System.out.print("A���ÿ� ���� ������: ");
				x = stdIn.nextInt();
				try {
					s.pushA(x);
				} catch (IntStack.OverflowIntStackException e) {
					System.out.println("������ ���� á���ϴ�.");
				}
				break;

			case 2: // Ǫ��
				System.out.print("B���ÿ� ���� ������: ");
				x = stdIn.nextInt();
				try {
					s.pushB(x);
				} catch (IntStack.OverflowIntStackException e) {
					System.out.println("������ ���� á���ϴ�.");
				}
				break;

			case 3: // ��
				try {
					x = s.popA();
					System.out.println("A���ÿ��� ���� �����ʹ� " + x + "�Դϴ�.");
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("������ ����ֽ��ϴ�.");
				}
				break;

			case 4: // ��
				try {
					x = s.popB();
					System.out.println("B���ÿ��� ���� �����ʹ� " + x + "�Դϴ�.");
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("������ ����ֽ��ϴ�.");
				}
				break;

			case 5: // ��ũ
				try {
					x = s.peekA();
					System.out.println("A���ÿ��� ��ũ�� �����ʹ� " + x + "�Դϴ�.");
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("������ ����ֽ��ϴ�.");
				}
				break;

			case 6: // ��ũ
				try {
					x = s.peekB();
					System.out.println("B���ÿ��� ��ũ�� �����ʹ� " + x + "�Դϴ�.");
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("������ ����ֽ��ϴ�.");
				}
				break;

			case 7: // ����
				s.dump();
				break;

			case 8:
				System.out.print("A���ÿ��� �˻��� ������ �Է�: ");
				int searchA = stdIn.nextInt();
				try {
					int idx = s.indexOfA(searchA);
					System.out.println("�ش� �����ʹ� �ε���" + idx + "�� �ֽ��ϴ�.");
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("������ ����ֽ��ϴ�.");
				}
				break;

			case 9:
				System.out.print("B���ÿ��� �˻��� ������ �Է�: ");
				int searchB = stdIn.nextInt();
				try {
					int idx = s.indexOfB(searchB);
					System.out.println("�ش� �����ʹ� �ε���" + idx + "�� �ֽ��ϴ�.");
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("������ ����ֽ��ϴ�.");
				}
				break;

			case 10:
				System.out.print("������ ���� �����?(N/y): ");
				char ch = stdIn.next().charAt(0);
				if (ch == 'y') {
					s.clear();
					System.out.println("������ ���� ������ϴ�");
				} else {
					System.out.println("���� ���� ���");
				}
				break;

			case 11:
				if (s.isFull())
					System.out.println("������ ��� á���ϴ�.");
				else
					System.out.println("������ ���� ���� �ʾҽ��ϴ�.");
				break;

			}
		}
	}
}