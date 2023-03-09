import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2_bubble_sort_spec {

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

		bubbleSort(a, n);

//		System.out.println(Arrays.toString(a));

	}

	// n�� ��Ҹ� ������ �迭 a�� ���������ϴ� �޼ҵ�
	static void bubbleSort(int[] arr, int n) {
		int cprCnt = 0; //�� ī����
		int exCnt = 0; //��ȯ ī����
		for (int i = 0; i < n - 1; i++) {
			System.out.println("�н�" + (i + 1) + ":"); // �� ����Ŭ ��Ÿ���� �н� �κ�
			for (int j = n - 1; j > i; j--) {
				for (int k = 0; k < j - 1; k++) {
					System.out.printf("%2d", arr[k]); // ���� ���� �� ��ȯ�κ� �պκ� j-1���� ���
				}
				cprCnt++;
				if (arr[j - 1] > arr[j]) { // ���� ����
					System.out.printf("%2d%c%d", arr[j - 1], '+', arr[j]);// ��ҿ� ��ȯ ����O ���
					swap(arr, j - 1, j);
					exCnt++;

				} else { // �̹� ���ĵǾ�����
					System.out.printf("%2d%c%d", arr[j - 1], '-', arr[j]);// ��ҿ� ��ȯ ����X ���
				}
				if (j != n - 1) { // j�� ������ ��� �ƴ϶�� ���� ���� �� ��ȯ�κ� �޺κ� j+1���� ���
					for (int k = j + 1; k < n; k++)
						System.out.printf("%2d", arr[k]);
				}
				System.out.println();

			}
			for (int z = 0; z < n; z++) //�н� ���� ��� �������� ���
				System.out.printf("%2d", arr[z]);
			System.out.println("\n");
		}
		System.out.println("�񱳸� " + cprCnt + "ȸ �߽��ϴ�");
		System.out.println("��ȯ�� " + exCnt + "ȸ �߽��ϴ�");
	}

	// �̿��� �� ��� ����Ī ���ִ� �޼ҵ�
	static void swap(int[] arr, int idx1, int idx2) {
		int tmp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = tmp;
	}

}