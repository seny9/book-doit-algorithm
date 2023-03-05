import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.*;

public class Q8_hanoi_no_recur {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("�ϳ��� ž ������ ����: ");
		int n = Integer.parseInt(br.readLine());

		move(n, 1, 3); // n���� ������ 1�� ��տ��� 3�� ������� �ű��
	}

	// no�� ������ x�� ��տ��� y�� ������� �ű��
	static void move(int no, int x, int y) {

		Stack<Integer> s = new Stack<>();
		
		//�޼ҵ� ó�� ȣ�� �� �� ���� �Ű����� push
		s.push(no);
		s.push(x);
		s.push(y);
		while (true) {

			if (no > 1) {
				// ù��° ��� ���� ������ �Ű����� push
				no--;
				y = 6 - x - y;
				s.push(no);
				s.push(x);
				s.push(y);
				continue;
			}

			if (!s.isEmpty()) {
				// LIFO �ݴ�������� �� ����
				y = s.pop();
				x = s.pop();
				no = s.pop();
				System.out.printf("���� [%d]��(��) %d�� ��տ��� %d�� ������� �ű�\n", no, x, y);
				if (no > 1) {
					// �ι�° ��� ���� ������ �Ű����� push
					no--;
					x = 6 - x - y;
					s.push(no);
					s.push(x);
					s.push(y);
				}
				continue;
			}
			break;
		}
	}
}