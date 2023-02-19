import java.util.Scanner;

public class Q4_binSearchSpec {

	static int binSearchSen(int[] a, int n, int key) {
		
		System.out.print("   |");
		for(int j=0; j<n; j++)
			System.out.printf("%2d", j);
		System.out.print("\n---+");
		for(int j=0; j<n; j++)
			System.out.print("---");
		System.out.println();
		
		int i=0;
		int pl = 0; //�˻� ���� ������
		int pr = n-1; //�˻� ���� ����
		do{ //�˻� ������ ��ȿ�� ����
			int pc = (pl+pr)/2; //�߾� �ε���
        	System.out.print("   |");
        	if(pl < pc)
        		System.out.printf(String.format("%%%ds%%%ds+", pl*2+1, (pc-pl)*2), "<-", ""); //pl�� pc�� ������ �ִ� ���
        	else
        		System.out.printf(String.format("%%%ds<-+", pc*2), ""); //pl�� pc�ٴ� ���
        	
        	if(pc < pr)
        		System.out.printf(String.format("%%%ds->\n", (pr-pc)+1), ""); //pc�� pr�� ������ �ִ� ���
        	else
        		System.out.println("->"); //pc�� pr�� �ٴ� ��� ����� �ʿ���� �׳� ���ֱ�
        	System.out.printf("%3d|", pc);
        	for(int j=0;j<n;j++) {
    			System.out.printf("%2d", a[j]);
        	}
        	System.out.println(); 
        	System.out.println("   |");  
        	if (a[pc] == key)    // �˻� ����
	        	return pc;
        	else if(a[pc] < key) { //�˻� ������ �߾Ӻ��� ���ʿ� ����
        		pl = pc+1;
        	}
        	else //�˻� ������ �߾Ӻ��� �����ʿ� ����
        		pr = pc-1;
        	         
        } while(pl <= pr);
		
        return -1; //�˻� ����
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

        int idx = binSearchSen(x, num, ky);              // �迭 x���� ���� ky�� ��Ҹ� �˻�

        if (idx == -1)
            System.out.println("�˻� ���� ��Ұ� �����ϴ�.");
        else
            System.out.println(ky + "��(��) x[" + idx + "]�� �ֽ��ϴ�.");
        

	}

}
