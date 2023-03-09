import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q8_insertion_sort_sentinel {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("���ʸ� �̿��� �������� �� �迭 ��� ����: ");
		int n = Integer.parseInt(br.readLine());

		int[] a = new int[n + 1]; // ��Ұ� n+1���� �迭 ����, a[0]�� ���ʰ� ����

		// �迭�� ��� ����
		for (int i = 1; i < n + 1; i++) {
			System.out.print("�ε��� " + i + " ��� �Է�: ");
			a[i] = Integer.parseInt(br.readLine());
		}

		insertionSort(a, n+1);
	}

	// �迭�ȿ� ������ ��Ҵ� �ڿ������ ����
	static void insertionSort(int[] a, int n) {
		for (int i = 2; i < n; i++) {
			int j;
			int tmp = a[0] = a[i]; //tmp�� a[0]�� a[i] �� ����
			for (j = i; tmp < a[j - 1]; j--) {
				a[j] = a[j - 1]; // ��� �ڷ� �б�
			}
			if (j > 0) a[j] = tmp; // ���ʰ��� 0�ε��� �ٷ� �������� ���� ��� �ٷ� ������ ��ġ

		}

		for (int z = 1; z < n; z++) // ���� �Ϸ� �迭 ���, ���� ���� ���
			System.out.printf("%2d", a[z]);
		System.out.println();

	}

}
