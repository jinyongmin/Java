package day03;

import java.util.Scanner;

public class InputTask3 {
public static void main(String[] args) {
	/*
	 * 
	 * 
	 * */
	Scanner sc = new Scanner(System.in);
	String msg1 ="����1 �Է�: ";
	String msg2 ="����2 �Է�: "; 
	System.out.print(msg1);
	String num1 = sc.next();
	System.out.print(msg2);
	String num2 = sc.next();
//	String C = Integer.parseInt(A)+Integer.parseInt(B);
	System.out.println("�� ������ ���� " +(Integer.parseInt(num1)+Integer.parseInt(num2))+"�Դϴ�.");
	
	// ��������: ���ڿ��� �������� ������ ������ �Ǿ� ����� ���� �ʴ´�.
	//			"������������" : ���ڿ�  , Integer.ParseInt(A)+Integer.ParseInt(B):�Է¹������� ��Ʈ��Ÿ������ �����Ѱ��� ���������� �ٲ��صڿ� �������� ������ �ϱ�����!
			// ���: ���ڿ� "" �� ������ �� ���������� ������ ���� ()�� ����Ѵ� 
	}
}
