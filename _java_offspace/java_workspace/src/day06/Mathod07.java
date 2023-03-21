package day06;

import java.util.Scanner;

public class Mathod07 {

	public static void main(String[] args) {
		/* 숫자와 기호를 주고 기호를 숫자만큼출력
		 * ex) 3, * => ***
		 * ex) 5, O => OOOOO
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		int num = 0;
		String str;
		System.out.print("반복하실 횟수를 입력해주세요 : ");
		num = scan.nextInt();
		System.out.println();
		System.out.print("반복하실 문자를 입력해주세요 : ");
		str = scan.next();
		System.out.println();
		
		System.out.println("======출력값======");
		strPrint(num, str);
		
		
		scan.close();
	}
	
	
	/* 매개변수: int , String
	 * 리턴타입: String
	 * 메서드명: strPrint
	 */
	public static void strPrint(int num, String a) {
		for(int i = 1; i <= num ; i++) {
			System.out.printf(a);
		}
	}

	
}
