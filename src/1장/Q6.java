import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("1���� n������ ������ ���մϴ�.");
 		System.out.print("n�� �� : ");
		int n = sc.nextInt();

		int sum = 0;
		int i = 1;

		while (i <= n) {
			System.out.println("i: " + i);
			sum += i;
			i++;
		}
		System.out.println("1���� " + n + "������ ������ " + sum + "�Դϴ�.");
	}

}
