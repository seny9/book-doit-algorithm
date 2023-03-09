import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q7_insertion_sort_spec {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("�������� �� �迭 ��� ����: ");
		int n = Integer.parseInt(br.readLine());

		int[] a = new int[n]; // ��Ұ� n���� �迭 ����

		// �迭�� ��� ����
		for (int i = 0; i < n; i++) {
			System.out.print("�ε��� " + i + " ��� �Է�: ");
			a[i] = Integer.parseInt(br.readLine());
		}

		insertionSort(a, n);

	}

	static void insertionSort(int[] a, int n) {

		for (int i = 1; i < n; i++) {
			for (int z = 0; z < n; z++) // ���� �� �迭 ���
				System.out.printf("%2d", a[z]);
			System.out.println();

			int j;
			int tmp = a[i];
			for (j = i; j > 0 && a[j - 1] > tmp; j--) { // �ε��� 0�̻��̸鼭 tmp��Һ��� ū ��ҵ�
				a[j] = a[j - 1]; // ��� �ڷ� �б�
			}
			a[j] = tmp; // tmp���� ���� ��� �ٷ� ������ ��ġ

			int cnt = i - j; //i�ε����� j�ε������̸�ŭ -���, 2ĭ �����̹Ƿ� 1����->1�� ���, 2����->3�� ��°� ���� Ȧ���� ����ؾ���
			if(cnt == 0)
				System.out.printf(String.format("%%%ds+",i*2+1), "");
			else {
				System.out.printf(String.format("%%%ds^",(j*2+1)), "");
				for(int k=1; k<=cnt*2-1; k++)
					System.out.print("-");
				System.out.print("+");
			}
				
			System.out.println();

		}
		for (int z = 0; z < n; z++) // ���� �Ϸ� �迭 ���
			System.out.printf("%2d", a[z]);
		System.out.println();
	}

}
