import java.util.Arrays;

public class Q2 {

	//--- �迭 ��� a[idx1]�� a[idx2]�� ���� �ٲ� ---//
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];  a[idx1] = a[idx2];  a[idx2] = t;
    }

    //--- �迭 a�� ��Ҹ� �������� ���� ---//
    static void reverse(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
        	System.out.println(Arrays.toString(a));
        	System.out.println("a[" + i + "]�� a[" + (a.length-i-1) + "]�� ��ȯ�մϴ�");
            swap(a, i, a.length - i - 1);
            
        }
    }

    public static void main(String[] args) {

        int[] x = {2,5,1,3,9,6,7};

        reverse(x);        // �迭 a�� ��Ҹ� �������� ����

        System.out.println(Arrays.toString(x));
        System.out.println("���� ������ ���ƽ��ϴ�.");
    }
}