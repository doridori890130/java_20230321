package day06;

public class Method02 {

	public static void main(String[] args) {
		/* Method : 매서드 => 기능 함수
		 * - 접근제한자 : 접근할수 잇는 주제의 제한범위
		 * - 리턴타입 : 메서드 실행 후 결과로 얻을수 있는 값 (자료형으로 표현)
		 * - 메서드명 : 메서드를 구분하는 명, 소문자로 시작, 카멜표기볍을 사용
		 * - 매개변수 : 기능을 수행하기 위해 필요로 하는 정보값
		 * - void : 반환할 값이 없을 경우
		 * 
		 * 접근제한자 리턴타입 메서드명 (매개변수) {
		 * 기능구현
		 * }
		 * 
		 * 리턴타입이 있을 경우 : void가 아닌경우 는 반드시 return을 포함해야 함.
		 * 
		 * 메서드의 위치 클래스안쪽, 다른 메서드 밖
		 * 
		 */

		int hap = sum(50,70);
		System.out.println(hap);
		sumPrint(50,70);
		int gop = mult(5,7);
		System.out.println(gop);

	}
/*
	//메서드의 위치
	/* 기능 : 두 정수가 주어지면 두 정수의합을 알려주는 메서드
	 * 리턴타입 : 합 => int
	 * 매개변수 : 두 정수 => 두 정수 => int num1, int num2
	 * 메서드명 : sum
	 *
	 */
	
	public static int sum(int num1, int num2) {
		return num1 +num2;
		
	}
	
	/* 기능 : 두 정수가 주어지면 두 정수의 합을 출력하는 메서드
	 * 리턴타입 : void
	 * 매개변수 : 두 정수 => int num1, int num2
	 */
	
	public static void sumPrint(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	
	/* 기능 : 두 정수가 주어지면 두 정수의 곱을 알려주는 메서드
	 * 리턴타입 : 곱 => int
	 * 매개변수 : 두 정수 => int num1, int num2
	 * 메서드명 : mult
	 */
	
	public static int mult(int num1, int num2) {
		return num1*num2;
	}
}
