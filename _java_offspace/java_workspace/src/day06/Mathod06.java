package day06;

import java.util.Scanner;

public class Mathod06 {

	public static void main(String[] args) {
		/* 구구단출력
		 * 구구단1단을 출력하는 메서드
		 * 7단
		 */
		
		Scanner scan = new Scanner(System.in);
		int num = 0 ;
		
		System.out.println("보고싶은 구구단은?");
		num = scan.nextInt();
		
		mulTable(num);
		scan.close();
		
		
	}

	/* 기   능: 구구단 1단을 출력
	 * 리턴타입 : void
	 * 매개변수 : int
	 * 메서드명 : multable
	 */
	
	public static void mulTable(int num) {
		for(int i = 1 ; i <= 9; i++) {
			System.out.printf("%d  x  %d = %d\n", num, i , num*i );
		}
	}
	
	
}
