import java.io.*;

public class Q1_factorial_no_recursive {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("���丮�� ������ ���� �Է�: ");
		int num = Integer.parseInt(br.readLine()); //���丮�� ������ ���� �Է�
		
		System.out.print(num + "!�� ");
		
		for(int i=num-1; i>0; i--)
			num *= i;
		
		System.out.println(num);
	}

}
