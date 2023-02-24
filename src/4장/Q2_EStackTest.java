import java.util.Scanner;

public class Q2_EStackTest {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		EStack<Integer> s = new EStack<Integer>(64); // �ִ� 64 ���� Ǫ���� �� �ִ� ����

		while (true) {
			System.out.println(); // �޴� ������ ���� �� �� �߰�
			System.out.printf("���� ������ ����: %d / %d\n", s.size(), s.getCapacity());
			System.out.print("(1)Ǫ�á�(2)�ˡ�(3)��ũ��(4)������(5)�˻� (6)Ŭ���� (7)á���� Ȯ�� (0)����: ");

			int menu = stdIn.nextInt();
			if (menu == 0)
				break;

			Integer o;
			switch (menu) {
			case 1: // Ǫ��
				o = stdIn.nextInt();
				try {
					s.push(o);
				} catch (IntStack.OverflowIntStackException e) {
					System.out.println("������ ���� á���ϴ�.");
				}
				break;

			case 2: // ��
				try {
					o = s.pop();
					System.out.println("���� �����ʹ� " + o + "�Դϴ�.");
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("������ ����ֽ��ϴ�.");
				}
				break;

			case 3: // ��ũ
				try {
					o = s.peek();
					System.out.println("��ũ�� �����ʹ� " + o + "�Դϴ�.");
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("������ ����ֽ��ϴ�.");
				}
				break;

			case 4: // ����
				s.dump();
				break;

			case 5:
				System.out.print("�˻��� ������ �Է�: ");
				Integer search = stdIn.nextInt();
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

