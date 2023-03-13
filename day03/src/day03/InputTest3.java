package day03;

import java.util.Scanner;

public class InputTest3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
//	String msg1 = "좋아하는 숫자 : ", msg2 = "좋아하는 동물 : ", animal= null;
//	int number = 0;
//	
//	System.out.println(msg1);
//	number = sc.nextInt();
//	
//	System.out.println(msg2);
//	animal = sc.nextLine();
//	
//	System.out.printf("내가 좋아하는 숫자는 %d이고, 내가 좋아하는 동물은 %s이다.",number, animal);

	// 문제점: 좋아하는 숫자를 입력받고, 좋아하는 동물도 입력을 받아야하는데,
	// 숫자를 입력하고나면 동물을 입력을 받지않고 다음으로 넘어간다.
	// 이유:nextInt를 쓰면 10만 가져감, '엔터'는 어디가에 남아있다.->좋아하는동물 입력받을때 엔터를 입력받고 바로 출력됨
	// next, nextInt, nextDouble 사용하고나서 nextLine을 사용한다.
	// nextLine 엔터까지 가지고감
		
	
	String msg1 = "좋아하는 숫자 : ", msg2 = "좋아하는 동물 : ", animal = null;
	String resultMsg = "내가 좋아하는 숫자는 %d이고, 내가 좋아하는 동물은 %s이다.";
	int number = 0;
	
	System.out.println(msg1);
	number = sc.nextInt();
	sc.nextLine();		//enter를 가지고간다!
	System.out.println(msg2);
	animal = sc.nextLine();
	
	System.out.printf(resultMsg,number, animal);

}
}
