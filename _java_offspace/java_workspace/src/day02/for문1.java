package day02;

public class for문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 규칙적인 작업을 반복적으로 할 때 사용하는 문법
		 * 종류 : for, while, do~while
		 * 
		 * for(초기화;조건식;증감연산식){
		 * 실행문 ;
		 * }
		 * 
		 * 1. 초기화 : 조건식이나, 실행문에서 사용하는 변수를 초기화 
		 * 처음 한번만 실행(생략가능)
		 * 2. 조건식 : 반복문의 반복을 결정하는 식, 참이면 반복, 거짓이면 그만.
		 * 생략가능 => 생략하면 무조건 true
		 * 3. 증감연산식 : 조건식에서 사용되는 변수를 증가/감소 시켜서 반복횟수를 결정하
		 * 
		 * 1~10까지 출력하는 예제
		 * 초기화 : 1부터(i=1)
		 * 조건식 : 10까지 (i<=10)
		 * 증감연산식 : 1씩 증가 (i = i+1)==i++
		 * 실행문 : i를 출력
		 * 반복 종료ㅛ수 실행문
		 */
		/* 지역변수의 범위 { 선언     소멸}
		 * 
		 */
		for(int i=1;i<=10;i++) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		for(int i=1; i<=10; i=i+2) {  //i=i+a => i+=a
			System.out.println(i+" ");
		}
		
		/* 10부터 1까지 출력
		 * 초기값
		 * 조건식
		 * 증감식
		 */
		for(int i = 10; i>=1 ; i--) {
			System.out.print(i+" ");
		}
		
		/* 1~10까지 짝수만(2,4,6,8,10)*/
		System.out.println();
		
		for(int i = 1; i <= 10; i++) {
			if(i%2 == 0) {
				System.out.print(i+" ");
			}
		}
		
		
		System.out.println();
		// 1~10까지의 합계
		//초기화 : 1부터
		//조건식 : 10까지
		//증감식 : i++
		int sum = 0;
		for(int i = 1 ; i <= 10; i++) {
			sum = sum+=i;
		}
		System.out.println(sum);

	}

}
