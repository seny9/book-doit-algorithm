//�迭�� �տ��� �����ؼ� ������������ ���������ϱ�
import java.io.*;
import java.util.Arrays;

public class Q1_bubble_sort_start_first {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("�������� �� �迭 ��� ����: ");
		int n = Integer.parseInt(br.readLine());
		
		int[] a = new int[n]; //��Ұ� n���� �迭 ����
		
		//�迭�� ��� ����
		for(int i=0; i<n; i++) {
			System.out.print("�ε��� " + i + " ��� �Է�: ");
			a[i] = Integer.parseInt(br.readLine());
		}
		
		bubbleSort(a, n);
		
		System.out.println(Arrays.toString(a));

	}
	
	//n�� ��Ҹ� ������ �迭 a�� ���������ϴ� �޼ҵ� 
	static void bubbleSort(int[] arr, int n) {
		for(int i=n-1; i>0; i--) { //�迭 ���� ���� �Ϸ��� �κ�
			for(int j=0; j<i; j++) { //���ĵ��� ���� ��� ����, i-1���� ����
				if(arr[j+1] < arr[j]) {
					swap(arr, j, j+1);
				}
			}
		}
	}
	
	//�̿��� �� ��� ����Ī ���ִ� �޼ҵ�
	static void swap(int[] arr, int idx1, int idx2) {
		int tmp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = tmp;
	}

}
