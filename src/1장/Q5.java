
public class Q5 {

	public static void main(String[] args) {
		System.out.println("med3(1,2,3) = " + med3(1,2,3));      // c��b��a
	}
	
	static int med3(int a, int b, int c) {
		if ((b >= a && c <= a) || (b <= a && c >= a))
			return a;
		else if ((a > b && c < b) || (a < b && c > b))
			return b;
		return c;
	}

}
/***
 * ù��° ���ǹ����� �̹� a�� b�� ��Ұ� �������� ������ 
 * �� ���Ŀ� �� ��Ҹ� �ٷ�� ���� ���� ������ �ݺ��ϴ� ���̹Ƿ� ȿ���� ���� �ʴ�
 */
