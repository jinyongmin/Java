package day03;

import java.util.Scanner;

public class InputTask3 {
public static void main(String[] args) {
	/*
	 * 
	 * 
	 * */
	Scanner sc = new Scanner(System.in);
	String msg1 ="정수1 입력: ";
	String msg2 ="정수2 입력: "; 
	System.out.print(msg1);
	String num1 = sc.next();
	System.out.print(msg2);
	String num2 = sc.next();
//	String C = Integer.parseInt(A)+Integer.parseInt(B);
	System.out.println("두 정수의 합은 " +(Integer.parseInt(num1)+Integer.parseInt(num2))+"입니다.");
	
	// 몰랏던것: 문자열과 정수열이 만나면 연결이 되어 계산이 되지 않는다.
	//			"두정수의합은" : 문자열  , Integer.ParseInt(A)+Integer.ParseInt(B):입력받은값을 스트링타입으로 저장한것을 정수형으로 바꿔준뒤에 정수끼리 연산을 하기위함!
			// 결론: 문자열 "" 을 만났을 때 정수형끼리 연산을 위해 ()를 사용한다 
	}
}
