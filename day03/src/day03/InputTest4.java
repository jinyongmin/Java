package day03;

import java.util.Scanner;

/*
 *�� �ڸ��� ������ �Է� �ް� ���� �ڸ�,
 *���� �ڸ��� ����ϴ� ���α׷� ����� 
 * 
 * 1. ���� 3���� ����  (int)
 * 2. ����Ѵ�. (�� �ڸ��� ������ �Է��ϼ��� :)
 * 3. �Է¹޾Ƽ� �����Ѵ�.
 * 4. �����Ѵ�.
 * 4-1. �Է¹��� ���� 10���� ������	(10�� �ڸ�)
 * 4-2. �Է¹��� ���� 10���� ���� �������� ���Ѵ� (1�� �ڸ�)
 * 
 * 5.����� ����Ѵ�. (���� �ڸ��� ~�̰�, ���� �ڸ��� ~�̴�.)
 * */
public class InputTest4 {
	public static void main(String[] args) {
		int number = 0, result1 =0, result2 = 0;
		Scanner sc = new Scanner(System.in);
		String msg = "�� �ڸ��� ������ �Է��ϼ��� : ";
		
		
		System.out.println(msg);
		number = sc.nextInt();
		result1 = number / 10;
		result2 = number % 10;
		System.out.println("�����ڸ��� " + result1 + "�̰�, ���� �ڸ��� " + result2 +"�Դϴ�.");
	
		
		
//		%�� Ȱ���Ͽ� ����� �̿��� �����ϴ�
	}

}
