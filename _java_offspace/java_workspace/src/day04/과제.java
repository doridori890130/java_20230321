package day04;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* 주사위를 던져서 총 30칸을 이동하면 완주
		 * 주사위 : 1~6가지의 랜덤수
		 * 주사위 3
		 * 3칸전진 => 27칸 남았습니다
		 * 주사위 : 6
		 * 6칸 전진 => ~칸 남았습니다
		 * ...
		 * 도착~!! 총이동횟수 : 00번
		 */
		
		  //주사윈 랜덤
		int des = 30; // 도착지점
		int count = 0; // 총 이동횟수
		Scanner scan = new Scanner(System.in);
		
		do {
			
			System.out.println("주사위를 던지려면 y을 입력하세요");
			char dice = scan.next().charAt(0);
			if(dice =='y') {
							int random = (int)(Math.random()*6)+1;
			
							System.out.printf("주사위 %d!\n", random);
							des = des - random;
							count++;
							if(des<0) {
								System.out.printf("%d칸 전진 => 0칸 남았습니다\n", random);
							}
							else{
								System.out.printf("%d칸 전진 => %d칸 남았습니다\n", random,des);
							}
							System.out.println("-----------------------");
			}
		}while(des > 0);
		
		System.out.println("도착~!!!");
		System.out.printf("총 이동횟수 : %d ", count);
		
		
		scan.close();
	}

}
