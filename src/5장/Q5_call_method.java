import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5_call_method {
	
	static String[] memo;
	//�� �޼ҵ� ȣ�� ī����, 
	static int cnt1;
	static int cnt2;
	

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("�޼ҵ� �Ű����� �Է�: ");
		int n = Integer.parseInt(br.readLine());
		
		memo = new String[n+2]; // �ε��� 0��1�� 0, -1 �Ű������� ���� �� �޸��ϱ� ���� n���� +2������ �迭 ����
		
		cnt1++; //�⺻ recur�Լ� ȣ�� ����
		recur(n);
		cnt2++; //�޸�ȭ recur�Լ� ȣ�� ����
		recurMemo(n);
		
		System.out.println("�⺻ recur�Լ� �޼ҵ� ȣ�� Ƚ��: " + cnt1);
		System.out.println("�޸�ȭ�� recur�Լ� �޼ҵ� ȣ�� Ƚ��: " + cnt2);

	}

	static void recur(int n) {
		if (n > 0) {
			recur(n - 1);
			System.out.println(n);
			recur(n - 2);
			cnt1 = cnt1+2;
		}
	}

	static void recurMemo(int n) {
		if (memo[n + 1] != null)
			System.out.print(memo[n + 1]);
		else {
			if (n > 0) {
				recurMemo(n - 1);
				System.out.println(n);
				recurMemo(n - 2);
				cnt2 = cnt2+2;
				memo[n + 1] = memo[n] + n + "\n" + memo[n - 1];
			} else {
				memo[n + 1] = ""; // n�� 0�̳� -1�� ���
			}
		}
	}

}
