import java.util.ArrayList;

public class Q6_no_recur {

	static ArrayList<Integer> list = new ArrayList<>();

	public static void main(String[] args) {

		recur3(5);

	}

	public static void recur3(int n) {
		while (true) {
			if (n > 0) { //������ �����ϴ� �̻� ù��° ��͸� ������� ��, �׵��� ���꿡�� ���Ǵ� n�� �����ص�(�ι�° ��Ϳ��� ���� ����)
				list.add(n);
				n--;
				continue;
			}
			if (!list.isEmpty()) {
				n = list.remove(list.size()-1); //����Ʈ�� �������� ����� ���� n����
				System.out.println(n);
				n = n - 2;
				continue;
			}
			
			break;

		}
	}

}
