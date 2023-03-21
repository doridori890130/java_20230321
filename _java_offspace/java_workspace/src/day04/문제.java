package day04;

import java.util.Scanner;

public class 문제 {

	public static void main(String[] args) {
		/* 1~50사이의 랜덤수 하나를 생성 후 맞추는 게임.
		 * 예) 컴퓨터가 랜덤수를 생성됐습니다. : 45
		 * 입력: 20
		 * up!
		 * 사용자입력 : 30
		 * up!
		 * 사용자 입력 : 49
		 * down!
		 * 사용자 입력 : 45
		 * 정답입니다.
		 * 
		 */
		int random = (int)(Math.random()*50)+1; // 랜덤값 생성
		System.out.println("컴퓨터가 랜덤수를 생성했습니다 맞춰보던지!(1~50)");
		Scanner scan = new Scanner(System.in);
		int num = 0, count=0 ;
		do {
			System.out.print("입력 : ");
			num = scan.nextInt();
			count++;
			if(count >= 5) {
				System.out.println("횟수 초과 탈락~!");
				break;
			}
			else {
				if(num < 1 || num >50) {
					System.out.println("범위값이 아닙니다");
				}
				else {
					if(num > random) {
						System.out.println("Down!");
					}
					else if(num < random) {
						System.out.println("Up!");
					}
					else if(num == random ) {
						System.out.println("정답입니다");
						System.out.printf("%d번만에 맞췄습니다\n", count);
					}
			}
			}
		}
		while(num!=random);
		
		
		
		scan.close();

	}

}
