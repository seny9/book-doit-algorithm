import java.util.Stack;

public class Q10_8queen_no_recur {

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

		Stack<Integer> s = new Stack<>();
		boolean keepGoing = false;
		int keepJ = 0;

		while (true) {
			//���ÿ� ����ִ� ��,�� ���� ��� ���ֱ� ���ؼ� j�� 0���� �ʱ�ȭ�Ǵ� �� ����
			//�ʹݿ� flag_a[0]�� false�ΰ� �������� ���ǰ� �� ���ķδ� ������ ����
			int j = 0; 
			if (keepGoing == true) { // �ٽ� ���ִ� �ݺ��� ���ֱ� ���ؼ� �ϴ� j�� �̾ ���
				j = keepJ;
			}
			
			for (; j < 8; j++) {
				if (flag_a[j] == false && flag_b[i + j] == false && flag_c[i - j + 7] == false) {
					pos[i] = j; // i���� ���� j�࿡ ��ġ�ϵ��� �Ѵ�
					if (i == 7)
						print();
					else {
						flag_a[j] = flag_b[i + j] = flag_c[i - j + 7] = true;
						// ���� i�� j ����

						s.push(i);
						s.push(j);
						j = 0;
						i++;
						continue;

					}
				}
			}
			if (!s.isEmpty()) {
				// �ٽ� �������� flag���� false�� �ٲٱ�
				j = s.pop();
				i = s.pop();
				flag_a[j] = flag_b[i + j] = flag_c[i - j + 7] = false;
				j++; // �ٽ� logicLoop�� �̵��� ���� ���ؼ� j++���ֱ�
				keepJ = j;
				keepGoing = true;
			}
		}

	}

	public static void main(String[] args) {
		set(0);
	}
}
