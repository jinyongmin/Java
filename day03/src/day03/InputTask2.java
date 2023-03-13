package day03;

import java.util.Scanner;

public class InputTask2 {
	public static void main(String[] args) {
		
		/*
		 * 1. 출력하기(이름을 입력해주세요 : )
		 * 2. 변수만들기
		 * 3. 입력받아서 변수에 저장하기
		 * 4. 출력하기(~~님 안녕하세요)
		 * 5. 출력하기(~~님 안녕히가세요)
		 * 
		 * 
		 * 
		 * */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력해주세요: ");
		String name = sc.nextLine();
		System.out.println(name+"님 안녕하세요");
		System.out.println(name+"님 안녕히가세요");
		
		
		
		
	}
}
