//�����̵�ﰢ�� ���
import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�����̵�ﰢ���� �Ѻ��� ���� �Է�: ");
		int n = sc.nextInt();
		triangleLB(n); //���ʾƷ��� ����
		System.out.println();
		triangleLU(n); //�������� ����
		System.out.println();
		triangleRU(n); //���������� ����
		System.out.println();
		triangleRB(n); //�����ʾƷ��� ����

	}
	
	static void triangleLB(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) { //1���� 1�� �����ϸ鼭 ���
				System.out.print("*");
			}
		System.out.println();
		}
	}
	
	static void triangleLU(int n) {
		for(int i=n; i>=1; i--) {
			for(int j=i; j>=1; j--) { //n���� 1�� �����ϸ鼭 ���
				System.out.print("*");
			}
		System.out.println();
		}
	}
	
	static void triangleRU(int n) {
		int j;
		for(int i=1; i<=n; i++) {
			for(j=1; j<i; j++) { //1�� ������� ���� ä���
				System.out.print(" ");
			}
			for(int k=j; k<=n; k++) { //���� ���ķ� ���� ���� *�� ä���
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void triangleRB(int n) {
		int j;
		for(int i=1; i<=n; i++) {
			for(j=n; j>i; j--) { //n-1�� ������� ���� ä���
				System.out.print(" ");
			}
			for(int k=j; k>=1; k--) { //���� ���ķ� ���� ���� *�� ä���
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
