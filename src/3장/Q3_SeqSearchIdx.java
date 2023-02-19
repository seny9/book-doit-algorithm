import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
public class Q3_SeqSearchIdx {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("��� �� �Է�:" );
		int n = Integer.parseInt(br.readLine()); //�迭 
		
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		System.out.print("ã������ Ű �Է�:" );
		int key = Integer.parseInt(br.readLine());
		
		int[] idx = new int[n]; //�ϴ� �ִ� ���� �� �ִ� n���� ũ�� ���� , å���� searchIdx�� �Ű������� �迭�� ����
		int idxNum = searchIdx(arr, n, key, idx);
		System.out.print("�� " + idxNum + "�� �˻��� �Ǿ����ϴ�.\n�˻� �ε��� ��ġ: ");
		for(int val: idx) {
			if(val == -1)
				break;
			System.out.print(val + " ");
		}
		
	}
	
	static int searchIdx(int[] a, int n, int key, int[] idx) {
		
		int j=0;
		for(int i=0; i<n; i++) {
			if(a[i] == key) {
				idx[j++] = i; // Ű���� ã���� ��� idx�迭�� �ε��� ����
			}
		}
		idx[j] = -1; //�ε��� ������ �κа� �ܼ� �ʱ�ȭ �κ� ������ ���� ǥ��
		return j; 
	}

}
