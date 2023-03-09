import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q9_binary_insertion_sort {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("�����˻��� �̿��� �������� �� �迭 ��� ����: ");
		int n = Integer.parseInt(br.readLine());

		int[] a = new int[n]; // ��Ұ� n+1���� �迭 ����, a[0]�� ���ʰ� ����

		// �迭�� ��� ����
		for (int i = 0; i < n; i++) {
			System.out.print("�ε��� " + i + " ��� �Է�: ");
			a[i] = Integer.parseInt(br.readLine());
		}

		insertionSort(a, n);

	}

	static void insertionSort(int[] a, int n) {

		for (int i = 1; i < n; i++) {
			int tmp = a[i];
			//�Ʒ� ������ �̹� ���ĵ� �κп��� a[i]�� �� ��ġ ã�� ��
//			for (j = i; j > 0 && a[j - 1] > tmp; j--) { // �ε��� 0�̻��̸鼭 tmp��Һ��� ū ��ҵ�
//				a[j] = a[j - 1]; // ��� �ڷ� �б�
//			}
			int loc = binarySearch(a, 0, i, tmp); //�迭 a�� ���ĵ� �κ� �ε��� 0���� i���� tmp�� �� ��ġ �����˻����� ã��
			
			//���ڸ��� �ڷ� �б�
			for(int j=i; loc<j; j-- ) {
				a[j] = a[j-1];
			}
			a[loc] = tmp; // tmp���� ���� ��� �ٷ� ������ ��ġ

		}
		for (int z = 0; z < n; z++) // ���� �Ϸ� �迭 ���
			System.out.printf("%2d", a[z]);
		System.out.println();
	}

	static int binarySearch(int[] a, int start, int end, int key) {

		int pl = start; // �˻� ���� ������
		int pr = end; // �˻� ���� ����
		do { // �˻� ������ ��ȿ�� ����
			int pc = (pl + pr) / 2; // �߾� �ε���

			if (a[pc] >= key && a[pc-1] <= key) // pc�ڸ� �� �� ����
				return pc;
			else if (a[pc] < key) { // �˻� ������ �߾Ӻ��� ���ʿ� ����
				pl = pc + 1;
			} else // �˻� ������ �߾Ӻ��� �����ʿ� ����
				pr = pc - 1;

		} while (pl <= pr);

		return -1; // �˻� ����
	}

}
