import java.io.*;
public class Q13 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("���簢���� ����մϴ�.\n���� ����: ");
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
