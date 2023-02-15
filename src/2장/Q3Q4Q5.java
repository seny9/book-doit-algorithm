import java.util.Arrays;

public class Q3Q4Q5 {

	//--- �迭 ��� a[idx1]�� a[idx2]�� ���� �ٲ� ---//
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];  a[idx1] = a[idx2];  a[idx2] = t;
    }

    //--- �迭 a�� ��Ҹ� �������� ���� ---//
    static void reverse(int[] a) {
        for (int i = 0; i < a.length / 2; i++)
            swap(a, i, a.length - i - 1);
        System.out.println("���� ���� �迭: " + Arrays.toString(a));
    }
    
    //�迭 �� ���ϴ� �޼ҵ�
    static int sumOf(int[] a) {
    	int sum = 0;
    	for(int i=0; i<a.length; i++) {
    		sum += a[i];
    	}
    	return sum;
    }
    
    //�迭 b�� a�� �����ϴ� �޼ҵ�
    static void copy(int[] a, int[] b) {
    	//1
    	a = b.clone();
    	//2. �� ���� (�ε���0���� ����)
//    	Arrays.copyOf(a, a.length);
    	//3. ������, �� ���� ����
//    	Arrays.copyOfRange(a, 0, a.length);
    	//4. ��� �迭 ���� ��ġ ���� ����
//    	System.arraycopy(b, 0, a, 0, a.length);
    	System.out.println("���� �迭: " + Arrays.toString(a));
    	
    }
    
    static void rcopy(int[] a, int[] b) {
    	a = b.clone(); //�迭 ����
    	reverse(a); //���� ����
    }

    public static void main(String[] args) {

        int[] x = {2,5,1,3,9,6,7};
        
        int[] y = new int[x.length]; //������ �迭
        int[] z = new int[x.length];//�Ųٷ� ������ �迭

        int sum = sumOf(x); //�迭 ���� ��
        System.out.println("�迭 ��: " + sum);
        copy(y, x); //�迭 ����
        rcopy(z, x); //�迭 �Ųٷ� ����

    }
}