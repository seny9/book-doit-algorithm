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

		insertionSort(a, n);
	}

	// �迭�ȿ� ������ ��Ҵ� �ڿ������ ����, a[0]�� -1�� �Ѵ�
	static void insertionSort(int[] a, int n) {
		a[0] = -1; //���ʰ� ����
		for (int i = 2; i < n + 1; i++) {
			int j;
			int tmp = a[i];
			for (j = i; tmp < a[j - 1]; j--) { // a[0]���� �� ��� ��
				a[j] = a[j - 1]; // ��� �ڷ� �б�
			}
			a[j] = tmp; // tmp���� ���� ��� �ٷ� ������ ��ġ

		}

		for (int z = 0; z < n+1; z++) // ���� �Ϸ� �迭 ���
			System.out.printf("%2d", a[z]);
		System.out.println();

	}

}
