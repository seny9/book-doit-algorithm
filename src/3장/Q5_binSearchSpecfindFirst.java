import java.util.Scanner;

public class Q5_binSearchSpecfindFirst {

static int binSearchX(int[] a, int n, int key) {
		
		int pl = 0; //�˻� ���� ������
		int pr = n-1; //�˻� ���� ����
		do{ //�˻� ������ ��ȿ�� ����
			int pc = (pl+pr)/2; //�߾� �ε���

        	if (a[pc] == key) {    // �˻� ����
        		for(;pc>pl;pc--) { //�� ���� Ű�� ã��
        			if(a[pc] != key) //Ű���� �ƴ� �� ��
        				break;
        		}
	        	return pc+1;
        	}
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

        int idx = binSearchX(x, num, ky);              // �迭 x���� ���� ky�� ��Ҹ� �˻�

        if (idx == -1)
            System.out.println("�˻� ���� ��Ұ� �����ϴ�.");
        else
            System.out.println("ù��° " + ky + "��(��) x[" + idx + "]�� �ֽ��ϴ�.");
        

	}

}