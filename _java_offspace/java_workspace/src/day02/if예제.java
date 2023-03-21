package day02;

import java.util.Scanner;

public class if예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 정수를 입력받아서 정수가 짝수인지 홀수인지 판단하여 출력
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력해주세요");
		
		int num = scan.nextInt();
		
		if(num % 2 == 0) {
			System.out.println(num+"는 짝수");
		}
		else {
			System.out.println(num+"는 홀수");
		}
		
		scan.close();
		
		

	}

}
