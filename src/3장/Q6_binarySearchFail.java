import java.util.Arrays;
import java.util.Scanner;

public class Q6_binarySearchFail {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("��ڼ� : ");
		int num = stdIn.nextInt();
		int[] x = new int[num];				// ��ڼ��� num �� �迭 

		System.out.println("������������ �Է��ϼ���.");

		System.out.print("x[0] : ");		// �Ǿ� ��Ҹ� �Է¹���
		x[0] = stdIn.nextInt();

		for (int i = 1; i < num; i++) {
			do {
				System.out.print("x[" + i + "] : ");
				x[i] = stdIn.nextInt();
			} while (x[i] < x[i - 1]);	// �ٷ� ���� ��Һ��� ������ �ٽ� �Է�
		}

		System.out.print("�˻� �� : ");	// Ű���� �Է¹���
		int ky = stdIn.nextInt();

		int idx = Arrays.binarySearch(x, ky); //java.util.Arrays�� binarySearch(int[], int)�޼ҵ� ���
		//�ڷ����� ���� �޼ҵ� ȣ���� �����Ϸ��� �ڵ����� �����Ѵ�.

		if (idx < 0) {
			int insertP = -idx - 1;
            System.out.println("�˻� ���� ��Ұ� �����ϴ�.");
			System.out.printf("���� ����Ʈ: %d\n", insertP);
		} else
			System.out.println("�� ���� x[" + idx + "]�� �ֽ��ϴ�.");
	}
}