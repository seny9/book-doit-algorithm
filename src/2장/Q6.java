import java.util.Scanner;

public class Q6 {

	//--- ������ x�� r������ ��ȯ�Ͽ� �迭 d�� �Ʒ��ڸ����� �־� �ΰ� �ڸ����� ��ȯ ---//
    static int cardConv(int x, int r, char[] d) {
        int digits = 0; // ��ȯ �� �ڸ���
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"; //2�������� 16�������� Ŀ�� ����
        
        System.out.println(r + String.format(" |%8d", x));
        do {
        	d[digits] = dchar.charAt(x % r);    // r�� ���� �������� ����
            char dr = d[digits++];
            x /= r;
            System.out.println("  + --------");
            if(x == 0) //x�� 0�� �ƴҶ��� �����Ǵ� �ݺ����ε� x�� 0�϶��� �������� �ΰ�����, ������ �б�
            	System.out.println(String.format("%11d ...%s", x, dr));
            else
            	System.out.println(r + String.format(" |%8d ...%s", x, dr));
            
        } while (x != 0);

        for (int i = 0; i < digits / 2; i++) {    // �迭 d�� ���� ���ڿ��� ���� ����
            char t = d[i];
            d[i] = d[digits - i - 1];
            d[digits - i - 1] = t;
        }

        return digits;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int no;                       // ��ȯ�� ����
        int cd;                       // ���
        int dno;                      // ��ȯ �� �ڸ���
        int retry;                    // �ٽ� �� ��?
        char[] cno = new char[32];    // ��ȯ �� �� �ڸ��� ���ڸ� �־� �δ� ���� �迭

        System.out.println("10������ ��� ��ȯ�մϴ�.");
        do {
            do {
                System.out.print("��ȯ�ϴ� ���� �ƴ� ����: ");
                no = stdIn.nextInt();
            } while (no < 0);

            do {
                System.out.print("� ������ ��ȯ�ұ��?(2-36): ");
                cd = stdIn.nextInt();
            } while (cd < 2 || cd > 36);

            dno = cardConv(no, cd, cno);            // no�� cd ������ ��ȯ

            System.out.print(cd + "������ ");
            for (int i = 0; i < dno; i++)            // ������� ǥ��
                System.out.print(cno[i]);
            System.out.println("�Դϴ�.");

            System.out.print("�ٽ� �� �� �ұ��? (1����/0���ƴϿ�): ");
            retry = stdIn.nextInt();
        } while (retry == 1);
    }
}