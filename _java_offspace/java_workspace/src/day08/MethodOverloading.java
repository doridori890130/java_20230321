package day08;

public class MethodOverloading {

	public static void main(String[] args) {
		/*	메소드 오버로딩(Method Overloadin)
		 *  -동일한 이름을 가지는 메서드를 여러개 만드는 경우
		 *  1. 매개변수의 개수가 다르면 가능.
		 *  2. 매개변수의 종류(자료형)가 다르면 가능.
		 *  리턴타입은 상관없음 매개변수 이름도 상관없음.
		 * 
		 */
		System.out.println(sum(1,2));
		
		/*	가변길이 메서드
		 *  1+2, 1+2+3, 45+78
		 *  피연산자의 값이 일정하지 않을경우 매개변수의 개수와 상관없이 매개값을 출력위해 사용
		 * */
		
		System.out.println(sum(1,2,3,4,5,6,7));
		
		
	}

	/* 더하기 하는 메서드 생성
	 * int num1, int num2 를 매개변수로 받아 더한연산결과를 리턴
	 * 
	 */
	public static int sum(int num1,int num2) {
		return num1+num2;
	}
	
	public static int sum(int num1,int num2,int num3) {
		return num1+num2+num3;
	}
	
	/* 더하기 하는 메서드 생성
	 * 매개변수 : double 자료형 
	 * 메서드명 : sum
	 * */
	public static double sum(double num1,double num2) {
		return num1 + num2;
	}
	public static int sum(int ...num) {
	// rkqusrlfdl num는 배열처럼사용
	int sum = 0;
	for(int i = 0 ; i < num.length ; i++) {
		sum = sum + num[i];
		}
		return sum;
	}
}
