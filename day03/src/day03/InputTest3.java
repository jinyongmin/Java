package day03;

import java.util.Scanner;

public class InputTest3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
//	String msg1 = "�����ϴ� ���� : ", msg2 = "�����ϴ� ���� : ", animal= null;
//	int number = 0;
//	
//	System.out.println(msg1);
//	number = sc.nextInt();
//	
//	System.out.println(msg2);
//	animal = sc.nextLine();
//	
//	System.out.printf("���� �����ϴ� ���ڴ� %d�̰�, ���� �����ϴ� ������ %s�̴�.",number, animal);

	// ������: �����ϴ� ���ڸ� �Է¹ް�, �����ϴ� ������ �Է��� �޾ƾ��ϴµ�,
	// ���ڸ� �Է��ϰ��� ������ �Է��� �����ʰ� �������� �Ѿ��.
	// ����:nextInt�� ���� 10�� ������, '����'�� ��𰡿� �����ִ�.->�����ϴµ��� �Է¹����� ���͸� �Է¹ް� �ٷ� ��µ�
	// next, nextInt, nextDouble ����ϰ��� nextLine�� ����Ѵ�.
	// nextLine ���ͱ��� ������
		
	
	String msg1 = "�����ϴ� ���� : ", msg2 = "�����ϴ� ���� : ", animal = null;
	String resultMsg = "���� �����ϴ� ���ڴ� %d�̰�, ���� �����ϴ� ������ %s�̴�.";
	int number = 0;
	
	System.out.println(msg1);
	number = sc.nextInt();
	sc.nextLine();		//enter�� ��������!
	System.out.println(msg2);
	animal = sc.nextLine();
	
	System.out.printf(resultMsg,number, animal);

}
}
