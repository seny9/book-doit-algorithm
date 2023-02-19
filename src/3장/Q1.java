import java.util.Scanner;

public class Q1 {

	    //--- ��ڼ��� n�� �迭 a���� key�� ���� ���� ��Ҹ� ���ʹ����� ���� �˻� ---//
    static int seqSearchSen(int[] a, int n, int key) {
        int i = 0;

        a[n] = key;             // ���ʸ� �߰�

        for(;;i++) {
            if (a[i] == key)    // �˻� ����
                break;      
        }
        return i == n ? -1 : i;
    }
	
	public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("��ڼ� : ");
        int num = stdIn.nextInt();
        int[] x = new int[num + 1];                        // ��ڼ��� num + 1�� �迭

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = stdIn.nextInt();
        }

        System.out.print("�˻� �� : ");                    // Ű���� �з¹���
        int ky = stdIn.nextInt();

        int idx = seqSearchSen(x, num, ky);              // �迭 x���� ���� ky�� ��Ҹ� �˻�

        if (idx == -1)
            System.out.println("�˻� ���� ��Ұ� �����ϴ�.");
        else
            System.out.println("�˻� ���� x[" + idx + "]�� �ֽ��ϴ�.");
    }
}