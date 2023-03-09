import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q6_selection_sort_spec {

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

		selectionSort(a, n);

	}

	static void selectionSort(int[] a, int n) {

		for (int i = 0; i < n - 1; i++) { // �ε��� i�� ��ȯ
			int min = i;
			System.out.printf(String.format("%%%ds*", (i * 2) + 1), ""); //���� �Ϸ�� �κ�, ����2ĭ���� ��
			for (int j = i + 1; j < n; j++) {
				if (a[j] < a[min]) {
					min = j;
				}
			}
			System.out.printf(String.format("%%%ds+", (min*2)-((i * 2) + 1)), ""); //(min���� ���� - *���� ����)��ŭ ���� Ȯ�� �� ���
			System.out.println();
			for (int z = 0; z < n; z++)
				System.out.printf("%2d", a[z]);
			System.out.println();
			swap(a, i, min);
		}
		System.out.println();
		for (int z = 0; z < n; z++) //���� ���� ���
			System.out.printf("%2d", a[z]);
		System.out.println();
	}

	// �̿��� �� ��� ����Ī ���ִ� �޼ҵ�
	static void swap(int[] arr, int idx1, int idx2) {
		int tmp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = tmp;
	}

}
