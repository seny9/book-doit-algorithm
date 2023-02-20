import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Q7_binarySearchWithGeneric {

	//--- ��ü�˻� ������ ---//
    static class PhyscData {
        private String name;          // �̸�
        private int    height;        // Ű
        private double vision;        // �÷�

        //--- ������(constructor) ---//
        public PhyscData(String name, int height, double vision) {
            this.name = name;  this.height = height;  this.vision = vision;
        }

        //--- ���ڿ��� ����� ��ȯ�ϴ� �޼��� --//
        public String toString() {
            return name + " " + height + " " + vision;
        }

        //--- Ű�� ������������ �����ϱ� ���� comparator ---//
        public static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();

        private static class HeightOrderComparator implements Comparator<PhyscData> {
            public int compare(PhyscData d1, PhyscData d2) {
                return (d1.vision < d2.vision) ?  1 :
                       (d1.vision > d2.vision) ? -1 : 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        PhyscData[] x = {
        	// Ű�� ������������ ����
            new PhyscData("������", 162, 0.3),
            new PhyscData("�̼���", 168, 0.4),
            new PhyscData("Ȳ����", 169, 0.8),
            new PhyscData("������", 171, 1.5),
            new PhyscData("������", 173, 0.7),
            new PhyscData("����", 174, 1.2),
            new PhyscData("���ؼ�", 175, 2.0),
        };
        	
        System.out.print("Ű�� �� cm�� ����� ã�� �ֳ���?: ");
        int height = stdIn.nextInt();                // Ŷ���� �о� ����
        int idx = Arrays.binarySearch(
                        x,                                 // �迭 x����
                        new PhyscData("", height, 0.0),    // Ű�� height�� ��Ҹ�
                        PhyscData.HEIGHT_ORDER             // HEIGHT_ORDER�� ���� �˻�
                     );

        Arrays.sort(x, PhyscData.HEIGHT_ORDER); //�迭 ����
        for(int i=0; i<x.length; i++)
        	System.out.println("���� ���: " + x[i].toString()); //���ĵ� �迭 ���
        
        if (idx < 0)
            System.out.println("�� ���� ��Ұ� �����ϴ�.");
        else {
            System.out.println("�� ���� x[" + idx + "]�� �ֽ��ϴ�.");
            System.out.println("ã�� ������: " + x[idx]);
        }
    }
}