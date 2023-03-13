package day03;

public class Casting {
	public static void main(String[] args) {
//		System.out.println((int)3.7);	//3		(바꿔줄 타입)3.7	
//		System.out.println((double)1);	//1.0	(바꿔줄 타입)1
//		System.out.println((char)97);	//a		아스키코드

		int num1 = 10, num2 =20;
		String number1 = "10", number2= "20";
		
		System.out.println(num1 + num2);
		System.out.println(number1 + number2);
		System.out.println(3+2+"3"+5);		//	535
		System.out.println(3+(2+"3")+5);	//		()소괄호 먼저 23, 323, 3235 ()소괄호의 숫자2와 문자열3을 연결하면 문자열이 된다!! 그문자열을 연산할때에도 모두 문자열로 연결이 된다
		System.out.println("제 나이는" + num1 + "살 입니다.");
		
		System.out.println(Integer.parseInt(number1) + 20);
		System.out.println(Double.parseDouble("3.0")+ 0.5);
	
//	입력클래스: Scanner sc = new Scanner(System.in);
//	입력 메소드
//			next():		입력받은 값을 String 타입으로 돌려준다.
//						입력한 값을 띄어쓰기, 엔터로 구분하고 분리한다.
//			nextLine(): 입력받은 값을 String 타입으로 돌려준다.
//						띄어쓰기, 엔터도 값으로 입력된다. 한 줄 전체를 입력받는다.
//			nextInt():
	}
}
