package day03;

public class Casting {
	public static void main(String[] args) {
//		System.out.println((int)3.7);	//3		(�ٲ��� Ÿ��)3.7	
//		System.out.println((double)1);	//1.0	(�ٲ��� Ÿ��)1
//		System.out.println((char)97);	//a		�ƽ�Ű�ڵ�

		int num1 = 10, num2 =20;
		String number1 = "10", number2= "20";
		
		System.out.println(num1 + num2);
		System.out.println(number1 + number2);
		System.out.println(3+2+"3"+5);		//	535
		System.out.println(3+(2+"3")+5);	//		()�Ұ�ȣ ���� 23, 323, 3235 ()�Ұ�ȣ�� ����2�� ���ڿ�3�� �����ϸ� ���ڿ��� �ȴ�!! �׹��ڿ��� �����Ҷ����� ��� ���ڿ��� ������ �ȴ�
		System.out.println("�� ���̴�" + num1 + "�� �Դϴ�.");
		
		System.out.println(Integer.parseInt(number1) + 20);
		System.out.println(Double.parseDouble("3.0")+ 0.5);
	
//	�Է�Ŭ����: Scanner sc = new Scanner(System.in);
//	�Է� �޼ҵ�
//			next():		�Է¹��� ���� String Ÿ������ �����ش�.
//						�Է��� ���� ����, ���ͷ� �����ϰ� �и��Ѵ�.
//			nextLine(): �Է¹��� ���� String Ÿ������ �����ش�.
//						����, ���͵� ������ �Էµȴ�. �� �� ��ü�� �Է¹޴´�.
//			nextInt():
	}
}
