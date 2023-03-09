import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5_cocktail_sort {

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

		cocktailSort(a, n);

	}

	// n�� ��Ҹ� ������ �迭 a�� ����� ���������ϴ� �޼ҵ�
	static void cocktailSort(int[] arr, int n) {

		int cprCnt = 0; // �� ī����
		int exCnt = 0; // ��ȯ ī����
		int exNum = 0; // �� �н����� ��ȯ ī����
		int flag = 0; // ���� �ߴܿ��� ���� �÷��׺���
		int doneO = 0; // Ȧ����° �н�, arr[doneO] �պκ��� ���ĿϷ�
		int doneE = n - 1; // ¦����° �н�, arr[doneE] �޺κ��� ���ĿϷ�

		int i = 0; // �н� ī����

		while (doneO != doneE) { // ���ʿ��� �����ؿ��ٰ� ���ĿϷ�� �κ��� ������ ������ �����۾� �ݺ�
			// Ȧ����° �н�, ���� ������Ҹ� �� ������ �ű��.
			if (i % 2 != 0) {
				// ó������ �迭 ������ �����ϸ�, �Ŀ��� doneE-1���� doneO���� ����
				System.out.println("�н�" + i++ + ":"); // �� ����Ŭ ��Ÿ���� �н� �κ�

				int last = n - 1; // ������ ��ȯ ��ġ �ʱ�ȭ
				for (int j = doneE; j > doneO; j--) { // done+1������ ���� �۾�
					for (int k = 0; k < j - 1; k++) {
						System.out.printf("%2d", arr[k]); // ���� ���� �� ��ȯ�κ� �պκ� j-1���� ���
					}
					cprCnt++;
					if (arr[j - 1] > arr[j]) {
						System.out.printf("%2d%c%d", arr[j - 1], '+', arr[j]);// ��ҿ� ��ȯ ����O ���
						swap(arr, j - 1, j);
						exCnt++; // ��ȯ ī����+1
						exNum++; // �� �н����� ��ȯ ī����+1
						last = j; // ������ ��ȯ �ε��� ����
					} else { // �̹� ���ĵǾ�����
						System.out.printf("%2d%c%d", arr[j - 1], '-', arr[j]);// ��ҿ� ��ȯ ����X ���
					}
					if (j != n - 1) { // j�� ������ ��� �ƴ϶�� ���� ���� �� ��ȯ�κ� �޺κ� j+1���� ���
						for (int k = j + 1; k < n; k++)
							System.out.printf("%2d", arr[k]);
					}
					System.out.println();
				}
				for (int z = 0; z < n; z++) // �н� ���� ��� �������� ���
					System.out.printf("%2d", arr[z]);
				System.out.println("\n");

				if (exNum == 0) { // ��ȯ Ƚ���� 0�̶�� ���� ������
					flag = 1; // ���� �ߴ�!
					break;
				}
				doneO = last; // ������ ��ȯ �ε������� ���� �Ϸ�
				System.out.println("doneO: " + doneO);
				
				
				// ¦����° �н�, ���� ū��Ҹ� �� �ڷ� �ű��.
			} else {
				// ó������ �迭 ó������ �����ϸ�, �Ŀ��� doneO+1���� doneE-1���� ����
				System.out.println("�н�" + i++ + ":"); // �� ����Ŭ ��Ÿ���� �н� �κ�

				int last = 0; // ������ ��ȯ ��ġ �ʱ�ȭ
				for (int j = doneO+1; j <= doneE; j++) { // done-1������ ���� �۾�
					for (int k = 0; k < j - 1; k++) {
						System.out.printf("%2d", arr[k]); // ���� ���� �� ��ȯ�κ� �պκ� j-1���� ���
					}
					cprCnt++;
					if (arr[j - 1] > arr[j]) {
						System.out.printf("%2d%c%d", arr[j - 1], '+', arr[j]);// ��ҿ� ��ȯ ����O ���
						swap(arr, j - 1, j);
						exCnt++; // ��ȯ ī����+1
						exNum++; // �� �н����� ��ȯ ī����+1
						last = j; // ������ ��ȯ �ε��� ����
					} else { // �̹� ���ĵǾ�����
						System.out.printf("%2d%c%d", arr[j - 1], '-', arr[j]);// ��ҿ� ��ȯ ����X ���
					}
					if (j != n - 1) { // j�� ������ ��� �ƴ϶�� ���� ���� �� ��ȯ�κ� �޺κ� j+1���� ���
						for (int k = j + 1; k < n; k++)
							System.out.printf("%2d", arr[k]);
					}
					System.out.println();
				}
				for (int z = 0; z < n; z++) // �н� ���� ��� �������� ���
					System.out.printf("%2d", arr[z]);
				System.out.println("\n");

				if (exNum == 0) { // ��ȯ Ƚ���� 0�̶�� ���� ������
					flag = 1; // ���� �ߴ�!
					break;
				}
				doneE = last; // ������ ��ȯ �ε������� ���� �Ϸ�
			}
		}

		if (flag == 1)
			System.out.println("���� �ߴ�");
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