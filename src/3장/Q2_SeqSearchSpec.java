import java.util.Scanner;

public class Q2_SeqSearchSpec {

	static int seqSearchSen(int[] a, int n, int key) {
        int i = 0;

        a[n] = key;             // ���ʸ� �߰�
        
        System.out.print("   |");
        for(int j=0; j<n; j++)
        	System.out.printf("%2d", j);
        System.out.print("\n---+");
        for(int j=0; j<n; j++)
        	System.out.print("---");
        System.out.println();

        
        for(;;i++) {
        	System.out.print("   |");
        	System.out.printf(String.format("%%%ds*\n", i*2+1), ""); //���ڿ� ������ ����
        	System.out.printf("%3d|", i);
        	for(int j=0;j<n;j++) {
    			System.out.printf("%2d", a[j]);
        	}
        	System.out.println(); 
        	if (a[i] == key)    // �˻� ����
	        	break;
        	System.out.println("   |");           
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
            System.out.println("�� ���� x[" + idx + "]�� �ֽ��ϴ�.");
    }
}