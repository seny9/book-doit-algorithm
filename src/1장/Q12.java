
public class Q12 {

	public static void main(String[] args) {

		//���� ���ϴ� �� ���
		System.out.print("   |");
		for(int i=1; i<=9; i++) {
			System.out.print(String.format("%3d", i));
		}
		System.out.println();
		
		//���м� ���
		System.out.println("---+---------------------------");
		
		//���� ���ϴ� ���� ���� ��� ���
		for(int i=1; i<=9; i++) {
			System.out.print(" " + i + " |");
			for(int j=1; j<=9; j++) {
				System.out.print(String.format("%3d", i+j));
			}
			System.out.println();
		}

	}

}
