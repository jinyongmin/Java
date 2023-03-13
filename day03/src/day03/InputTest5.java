package day03;

import java.util.Scanner;

public class InputTest5 {
public static void main(String[] args) {
	int number = 0;
	String msg = "정수를 입력해주세요 : ";
	Scanner sc = new Scanner(System.in);
	
	
	System.out.println(msg);
	number = sc.nextInt();
	
	System.out.println(number % 2);
	//코인 노래방 만들기
}
}
