import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int sum = 0;
		if(n%2 == 0) { //n�� ¦����� ��Ȯ�� ������
			sum = (1+n)*(n/2);
		}
		else { //n�� Ȧ���� ��� ���������� �糡 ���Ѽ�/2�� �ϳ� ����
			sum = (1+n)*(n/2) + (1+n)/2;
			
		}
		System.out.println("sum: " + sum);
	}

}
