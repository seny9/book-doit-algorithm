import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q3_get_gcd {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("�ִ����� ���� �迭 ��Ұ��� �Է�: ");
		int n = Integer.parseInt(br.readLine()); //�迭 ũ��
		
		int[] arr = new int[n]; //ũ�Ⱑ n�� �迭 ����
		
		//�迭�� ��� �Է�
		for(int i=0; i<n; i++) {
			System.out.print("�迭 " + i + "��° ����Է�: ");
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		System.out.println("�迭 ��ҵ��� �ִ������� " + gcdArray(arr) + "�Դϴ�.");
		
	}
	
	//int�� �迭 �� ��ҵ��� �ִ����� ���ϴ� �޼ҵ�
	public static int gcdArray(int[] a) {
		
		int len = a.length;
		if(len == 1) //�迭 ��� �ϳ��� ���
			return a[0];
		
		//ó�� �� ����� �ִ����� ���ϱ�
		int rslt = gcd(a[0], a[1]);
		
		//2��° ��Һ��� gcd(�ִ�����, a[i])
		for(int i=2; i<len; i++) {
			if(rslt == 1) //�ִ������� 1�� ���� ��� ����
				break;
			rslt = gcd(rslt, a[i]);
		}
		return rslt;
		
	}
	
	//�� �� �ִ����� ���ϴ� �޼ҵ�
	public static int gcd(int n1, int n2) {
		if(n2 == 0)
			return n1;
		else {
			return gcd(n2, n1%n2);
		}
	}

}
