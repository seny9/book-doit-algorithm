//�Ƕ�̵� �����
import java.util.Scanner;
public class Q15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� ��: ");
		int n = sc.nextInt();
		
		spira(n);
	}
	
	static void spira(int n) {
		for(int i=1; i<=n; i++) { //�� ����
			int j;
			for(j=1; j<=n-i; j++) { //���� ���� ó��
				System.out.print(" ");
			}
			//����ó�� ���ĺ��� ���� ����ó�� ���� ��ŭ ��Ī���� ���ʵ� ���� ������ *ä���
			//j �ε����� 1���� ���� ������ n��° �ٿ� *2�ϴ��� -1��ŭ *���
			for(int k=j; k<=n*2-j; k++) { 
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
