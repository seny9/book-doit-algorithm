
public class Q9_8queen {

	static boolean[] flag_a = new boolean[8]; // �࿡ �ϳ��� ��ġ�ϱ� ���� �迭
	static boolean[] flag_b = new boolean[15]; // �밢���� �ϳ��� ��ġ�ϱ� ���� �迭
	static boolean[] flag_c = new boolean[15];
	static int[] pos = new int[8]; // �� ������ ���� �� ��ġ

	static void print() {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (j == pos[i])
					System.out.printf("%2s", "��");
				else
					System.out.printf("%2s", "��");
			}
			System.out.println();
		}
		System.out.println();
	}

	static void set(int i) {
		for (int j = 0; j < 8; j++) {
			if (flag_a[j] == false && flag_b[i + j] == false && flag_c[i - j + 7] == false) {
				pos[i] = j; // i���� ���� j�࿡ ��ġ�ϵ��� �Ѵ�
				if (i == 7)
					print();
				else {
					flag_a[j] = flag_b[i + j] = flag_c[i - j + 7] = true;
					set(i + 1);
					flag_a[j] = flag_b[i + j] = flag_c[i - j + 7] = false;
				}
			}
		}
	}

	public static void main(String[] args) {
		set(0);
	}
}
