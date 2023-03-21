package day06;

import java.util.Scanner;

public class 과제 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		/* 계산기 ( +, - ,* , / , %)
		 * 메서드에서 바로 출력 (3 + 2 = 5)
		 * 1. 숫자를 입력받는 메서드
		 * 		- 숫자는 배열로 입력받기
		 * 2. 메뉴 메서드
		 *   	- 원하는 계산을 선택해주세요 >
		 * 		- 1:덧셈 2:뺄셈 3:곱셈 4:나눗셈 5:나머지
		 * 3. 각 기능 메서드 
		 * 
		 *  main에서 처리되어야 되는 부분
		 * 	1) 1번 메서드 호출 => 숫자를 배열로 저장
		 *  2) 2번 메서드 호출 => 내가 선택한 번호 가져오기
		 *  3) switch(2번 return) 
		 *  4) case 에 따라 계산기 메서드 호출
		 */
		System.out.println("======메뉴=======");
		System.out.print("1.덧셈\t");
		System.out.print("2.뺄셈\t");
		System.out.print("3.곱셈\t");
		System.out.print("4.나눗셈\t");
		System.out.print("5.나머지");
		System.out.println();
		int[] arr = new int[2];
		int menunum= 0 ;
		arr = inNumber();
		menunum = menu();
		switch(menunum) {
		case 1: sum(arr);
		break;
		case 2: imsub(arr);
		break;
		case 3: mul(arr);
		break;
		case 4: div(arr);
		break;
		case 5: rem(arr);
		break;
		default : System.out.println("잘못입력하셧습니다");
		break;
		}
		
		
		
		
		
	}
	
	public static void sum(int inNumber[]) {
		int sum = 0;
		sum = inNumber[0] + inNumber[1]; 
		System.out.printf("%d + %d = %d",inNumber[0],inNumber[1],sum);
	}
	
	public static void imsub(int inNumber[]) {
		int imsub = 0;
		imsub = inNumber[0]-inNumber[1];
		System.out.printf("%d - %d = %d",inNumber[0],inNumber[1],imsub);
	}
	
	public static void mul(int inNumber[]) {
		int mul = 0;
		mul = inNumber[0]*inNumber[1];
		System.out.printf("%d * %d = %d",inNumber[0],inNumber[1],mul);
	}
	public static void div(int inNumber[]) {
		double div = 0;
		div = (double)inNumber[0]/inNumber[1];
		System.out.printf("%d / %d = %d",inNumber[0],inNumber[1],div);
	}
	public static void rem(int inNumber[]) {
		int rem = 0;
		rem = inNumber[0]%inNumber[1];
		System.out.printf("%d % %d = %d",inNumber[0],inNumber[1],rem);
	}
	
		/* 기   능 : 숫자를 입력 받는 메서드
		 * 리턴타입 : int[]
		 * 매개변수 : x
		 * 메서드명 : inNumber
		 */
	public static int[] inNumber() {

		int[] inNumber = new int[2];
		System.out.println("두 숫자를 입력해주세요");
		for(int i = 0 ; i<inNumber.length ; i++) {
			inNumber[i] = scan.nextInt();
		}
		return inNumber;
	}
	/* 기능 : 메뉴
	 * 매개변수 : 
	 * 리턴타입 : int
	 * 메서드명 : menu
	 */
	
	public static int menu() {
		
		System.out.println("원하는 계산을 입력해주세요 =>  ");
		int menuChoice = 0;
		menuChoice = scan.nextInt();
		
		return menuChoice;
			
	}

	/* 각 기능 에 대한 출력 메서드
	 * 리턴 : void
	 * 매개변수 : 배열
	 */
	
	
}
