package day03;

import java.util.Scanner;

public class CoinTest {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	final int PRICE = 300;			//������� �빮�ڷ� ǥ���ϸ� �ٵ� �˾ƺ���
	String msg = "������� ���γ뷡���Դϴ�!";
	String msg1 = "�ݾ��Է� : ";
	String msg2 = "���� �θ� �� ������ �ܵ��� ";
	String msg3 = "�� �Դϴ�.";
	int money = 0;
	int song = 0;
	int coin = 0;
	
	
	
	
	System.out.println(msg);
	System.out.print(msg1);
	money = sc.nextInt();
//	sc.nextLine();
	song = money/PRICE;
	coin = money%PRICE;
	System.out.println(song+msg2+coin+msg3);
	
	
	// ������ �ʱ�ȭ ������
	// ���� = sc.next(); �� �Է��� ����
	// ���� ���Ӱ� ������ ���� = �Է¹��� �����̸� %,/�� ���
	//�� ���� ����Ҷ� ���
	
	}
}
