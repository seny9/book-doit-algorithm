import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2_Euclid_no_recursive {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("�ִ����� ���� �� ���� �Է�(�����̽��� ����): ");
		String[] str = (br.readLine()).split(" ");

		int n1 = Integer.parseInt(str[0]);
		int n2 = Integer.parseInt(str[1]);

		System.out.println("�� ���� �ִ������� " + getRslt(n1, n2) + "�Դϴ�.");

	}

	//n1�� n2�� �ִ����� ���ϴ� �޼ҵ�
	public static int getRslt(int n1, int n2) {

		if (n1 > n2) { // n1�� ū ���� ���
			if (n2 == 0) { // ���� ���� 0�� ��� ū ���� �ִ�����
				return n1;
			} else {
				while (true) {
					if (n1 % n2 == 0) { // ū ���� ���� ���� ������ �������ٸ�
						return n2;
					} else { // ū ���� ���� ���� ������ �������� �ʴ´ٸ�
						n2 = n1 % n2; // ū ���� ���� ���� ���� �������� ���� ���� ������Ʈ
					}
				}
			}
		} else { // n1�� ���� ���� ���, n1�� n2�� �ٲ�
			if (n1 == 0) {
				return n2;
			} else {
				while (true) {
					if (n2 % n1 == 0) {
						return n1;
					} else {
						n1 = n2 % n1;
					}
				}
			}

		}

	}
}
