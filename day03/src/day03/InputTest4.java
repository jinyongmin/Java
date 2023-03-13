package day03;

import java.util.Scanner;

/*
 *두 자릿수 정수를 입력 받고 십의 자리,
 *일의 자리를 출력하는 프로그램 만들기 
 * 
 * 1. 변수 3개를 선언  (int)
 * 2. 출력한다. (두 자릿수 정수를 입력하세요 :)
 * 3. 입력받아서 저장한다.
 * 4. 연산한다.
 * 4-1. 입력받은 값을 10으로 나누기	(10의 자리)
 * 4-2. 입력받은 값을 10으로 나눈 나머지를 구한다 (1의 자리)
 * 
 * 5.결과를 출력한다. (십의 자리는 ~이고, 일의 자리는 ~이다.)
 * */
public class InputTest4 {
	public static void main(String[] args) {
		int number = 0, result1 =0, result2 = 0;
		Scanner sc = new Scanner(System.in);
		String msg = "두 자릿수 정수를 입력하세요 : ";
		
		
		System.out.println(msg);
		number = sc.nextInt();
		result1 = number / 10;
		result2 = number % 10;
		System.out.println("십의자리는 " + result1 + "이고, 일의 자리는 " + result2 +"입니다.");
	
		
		
//		%를 활용하여 배수로 이용이 가능하다
	}

}
