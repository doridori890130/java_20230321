package day08;



public class MathodOverloadingEx01 {

	public static void main(String[] args) {
		/*	calc(1,2,"+")
		 * 	calc(1,"+",2)
		 * 	calc("+" 1,2)
		 * 	메서드 오버로딩을 이용하여 두 정수와 연산자 입력받아 연산자의 위치에 상관없이
		 * 	연산의 결과가 출력되는 ㅊ및 메서드를 완성
		 * 	잘못된 연산자가 들어오면 잘못된 연산자 입니다.
		 * */
		
		calc(1,2,"+");
		calc("+",1,2);
		calc(1,"+",2);
		
		calc(1.0,2,"/");
		

	}

	// 계산 메소드
	public static void calc(int num1, int num2, String arith) {
		switch(arith) {
		case "+" : sum(num1,num2);
				System.out.println(sum(num1,num2));
				break;
		case "-" : sub(num1,num2);
				System.out.println(sub(num1,num2));
				break;
		case "*" : mult(num1,num2);
				System.out.println(mult(num1,num2));
				break;
		case "/" : div(num1,num2);
				System.out.println(div(num1,num2));
				break;
		case "%" : mod(num1,num2);
				System.out.println(mod(num1,num2));
				break;
		}
	}
	public static void calc(int num1, String arith, int num2) {
		switch(arith) {
		case "+" : sum(num1,num2);
				System.out.println(sum(num1,num2));
				break;
		case "-" : sub(num1,num2);
				System.out.println(sub(num1,num2));
				break;
		case "*" : mult(num1,num2);
				System.out.println(mult(num1,num2));
				break;
		case "/" : div(num1,num2);
				System.out.println(div(num1,num2));
				break;
		case "%" : mod(num1,num2);
				System.out.println(mod(num1,num2));
				break;
		}
	}
	
	public static void calc(String arith, int num1, int num2) {
		switch(arith) {
		case "+" : sum(num1,num2);
				System.out.println(sum(num1,num2));
				break;
		case "-" : sub(num1,num2);
				System.out.println(sub(num1,num2));
				break;
		case "*" : mult(num1,num2);
				System.out.println(mult(num1,num2));
				break;
		case "/" : div(num1,num2);
				System.out.println(div(num1,num2));
				break;
		case "%" : mod(num1,num2);
				System.out.println(mod(num1,num2));
				break;
		}
	}
	
	public static void calc(String arith, double num1, int num2) {
		switch(arith) {
		case "+" : sum(num1,num2);
				System.out.println(sum(num1,num2));
				break;
		case "-" : sub(num1,num2);
				System.out.println(sub(num1,num2));
				break;
		case "*" : mult(num1,num2);
				System.out.println(mult(num1,num2));
				break;
		case "/" : div(num1,num2);
				System.out.println(div(num1,num2));
				break;
		case "%" : mod(num1,num2);
				System.out.println(mod(num1,num2));
				break;
		}
	}
	public static void calc(double num1, int num2, String arith) {
		switch(arith) {
		case "+" : sum(num1,num2);
				System.out.println(sum(num1,num2));
				break;
		case "-" : sub(num1,num2);
				System.out.println(sub(num1,num2));
				break;
		case "*" : mult(num1,num2);
				System.out.println(mult(num1,num2));
				break;
		case "/" : div(num1,num2);
				System.out.println(div(num1,num2));
				break;
		case "%" : mod(num1,num2);
				System.out.println(mod(num1,num2));
				break;
		}
	}
	public static void calc(double num1, String arith, int num2) {
		switch(arith) {
		case "+" : sum(num1,num2);
				System.out.println(sum(num1,num2));
				break;
		case "-" : sub(num1,num2);
				System.out.println(sub(num1,num2));
				break;
		case "*" : mult(num1,num2);
				System.out.println(mult(num1,num2));
				break;
		case "/" : div(num1,num2);
				System.out.println(div(num1,num2));
				break;
		case "%" : mod(num1,num2);
				System.out.println(mod(num1,num2));
				break;
		}
	}
	
	
	
	// 각 사칙연산 메소드
	
	public static int sum(int num1, int num2) {			// 두정수를 입력받아 덧셈
		return num1+num2;
	}
	
	public static int sub(int num1, int num2) {
		return num1-num2;
	}
	
	public static int mult(int num1, int num2) {
		return num1*num2;
	}
	public static int div(int num1, int num2) {
		return num1/num2;
	}
	
	public static int mod(int num1, int num2) {
		return num1%num2;
	}
	
	
	// int num1 = double 일경우
	public static double sum(double num1, int num2) {			// 두정수를 입력받아 덧셈
		return num1+num2;
	}
	
	public static double sub(double num1, int num2) {
		return num1-num2;
	}
	
	public static double mult(double num1, int num2) {
		return num1*num2;
	}
	public static double div(double num1, int num2) {
		return num1/num2;
	}
	
	public static double mod(double num1, int num2) {
		return num1%num2;
	}
	
	
	
	
}
