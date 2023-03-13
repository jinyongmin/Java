package day03;

import java.util.Scanner;

public class CoinTest {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	final int PRICE = 300;			//상수값을 대문자로 표현하면 다들 알아본다
	String msg = "어서오세요 코인노래방입니다!";
	String msg1 = "금액입력 : ";
	String msg2 = "곡을 부를 수 있으며 잔돈은 ";
	String msg3 = "원 입니다.";
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
	
	
	// 변수를 초기화 시켜줌
	// 변수 = sc.next(); 로 입력을 받음
	// 값을 새롭게 저장할 변수 = 입력받은 변수이름 %,/를 사용
	//그 다음 출력할때 사용
	
	}
}
