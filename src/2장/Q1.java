import java.util.Random;
//import java.util.Scanner;

public class Q1 {

	static int maxOf(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++)
            if (a[i] > max)
                max = a[i];
        return max;
    }

    public static void main(String[] args) {
        Random rand = new Random();
//        Scanner stdIn = new Scanner(System.in);

        System.out.println("Ű�� �ִ��� ���մϴ�.");
        
        int num = 1 + rand.nextInt(10); //1~10���� ��� �� ������ ����, seed=10
        System.out.println("��� ��: " + num);
        
        int[] height = new int[num];              // ��ڼ��� num�� �迭�� ����

        System.out.println("Ű�� �ִ��� ���մϴ�.");
        for (int i = 0; i < num; i++) {
            height[i] = 100 + rand.nextInt(90);        // ��ڰ��� ������ ����
            System.out.println("height[" + i + "] : " + height[i]);
        }

        System.out.println("�ִ��� " + maxOf(height) + "�Դϴ�.");
    }
}