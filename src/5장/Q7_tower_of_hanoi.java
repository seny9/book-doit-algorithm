import java.io.*;

public class Q7_tower_of_hanoi {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("�ϳ��� ž ������ ����: ");
		int n = Integer.parseInt(br.readLine());
				
		move(n, 1, 3); //n���� ������ 1�� ��տ��� 3�� ������� �ű��
	}

	// no�� ������ x�� ��տ��� y�� ������� �ű��
	static void move(int no, int x, int y) {
		if (no > 1) {
			move(no - 1, x, 6 - x - y); // ����� 1, 2, 3�� �̹Ƿ� 6
		}

		System.out.printf("���� [%d]��(��) %c�� ��տ��� %c�� ������� �ű�\n", no, (char)x+64, (char)y+64); // �ƽ�Ű�ڵ� 65 -> A

		if (no > 1) {
			move(no - 1, 6 - x - y, y);
		}
	}
}
