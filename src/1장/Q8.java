import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("��: " + sumof(a,b));
	}
	
	static int sumof(int a, int b) {
		if(a > b) { //a�� ū ���
			if((a-b+1) % 2 == 0) { //���� ¦���� ���ϴ� ���
				return (a+b)*((a-b+1)/2); //���콺 ����
			}
			else { //Ȧ���� ���ϴ� ���
				return (a+b)*((a-b+1)/2) + (a+b)/2; //���콺 ����
				
			}
		}
		else if(a < b) { //b�� ū ���
			if((b-a+1) % 2 == 0) { //���� ¦���� ���ϴ� ���
				return (a+b)*((b-a+1)/2); //���콺 ����
			}
			else { //Ȧ���� ���ϴ� ���
				return (a+b)*((b-a+1)/2)+ (a+b)/2; //���콺 ����
				
			}
			
		}
		else { //a�� b�� ���� ��� �ش� �� ���
			return a;
		}
	}

}
