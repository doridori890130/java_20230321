package day12;

import java.util.Scanner;

public class Exception02 {

	public static void main(String[] args) {
		// num1, num2, 연산자 입력하여 메서드 실행
		// 예외처리
		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.print("첫번째 수를 입력해주세요 >");
//		int num1 = scan.nextInt();
//		System.out.println();
//		System.out.print("두번째 수를 입력해주세요 >");
//		int num2 = scan.nextInt();
//		System.out.println();
//		System.out.print("연산자를 입력해주세요 >");
//		String operator = scan.next();
//		
//		calc(num1, num2, operator);
//		
//		scan.close();
		try {
			//예외 발생가능성이 있는 구문
			System.out.println(calc(4,0,'+'));
			System.out.println(calc(4,0,'-'));
			System.out.println(calc(4,0,'*'));
			System.out.println(calc(4,0,'$'));
			System.out.println(calc(4,0,'/'));
			System.out.println(calc(4,0,'%'));
		}catch(Exception e) {
			//예외 발생 문구 출력.
			System.out.println(e.getMessage());
//			e.printStackTrace();
		}
		System.out.println("계산기 종료");
		
		
		
		
		
	}

//	public static void calc(int num1 , int num2, String op) {
//		switch(op) {
//		case "+" : System.out.println(num1+ op + num2+ "="+(num1 + num2));
//			break;
//		case "-" : System.out.println(num1+ op + num2+ "="+(num1 - num2));
//			break;
//		case "*" : System.out.println(num1+ op + num2+ "="+(num1 * num2));
//			break;
//		case "/" : try {
//					System.out.println(num1+ op + num2+ "="+(num1 / num2));
//					}catch(Exception e){
//						System.out.println("0으로 나누었습니다. 예외~");
//					}
//		}
//	}
	
	//기능 : 두수를 입력받고, 연산자를 입력받아 4칙연산의 결과를 리턴하는 메서드 생성
	//throw 를 발생시키게 되면 예외를 메서드를 호출하는 객체에게 넘기는 현상이 발생됨
	//throw를 발생시키면 메서드 선언부 끝에 throws 발생할 수 있는 예외를 반드시 적어야함.
	//throw new RuntimeException의 경우 생략가능.
	public static double calc(int num1, int num2, char op) {
		double res = 0;
		// 예외처리는 앞에서 미리 해주는게 좋음
		if((op== '/' || op == '%') && num2 == 0) {
			throw new RuntimeException("num2는 0이 될수없습니다.");
		}
		switch(op) {
		case '+' : res = num1+num2; break;
		case '-' : res = num1-num2; break;
		case '*' : res = num1*num2; break;
		case '/' : res = num1/num2; break;
		case '%' : res = num1%num2; break;
		default:
			throw new RuntimeException(op+"는 산술연산자가 아닙니다.");
		}
		return res;
	}
	
}
