package day03;

import java.util.Scanner;

public class InputTask1 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
//	System.out.print("이름을 입력하세요 : ");
//	String name = sc.next();
//	System.out.print(name+"님 안녕하세요");

	
	System.out.print("이름을 입력하세요 : ");
	System.out.printf("%s님 안녕하세요", sc.next());
	}
}
