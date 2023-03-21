package day05;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* 가위바위보게임 만들기
		 * 컴퓨터가 가위, 바위, 보 중 랜덤으로 선택( 0= 가위, 1=바위, 2=보)
		 * 내가 가위, 바위, 보 중 선택해서 입력
		 * 승 패 무의 결과를 출력
		 * 상황연산자(조건식)? true : false;
		 */
		
		Scanner scan = new Scanner(System.in);
		int random = 0;
		int Computer = 0;
		int User = 0;
		String arr[] = { "가위","바위","보"};
		
		
		do {
			random = (int)(Math.random()*3);
			Computer = random;
			System.out.println("=====컴퓨터가 가위바위보를 선택하였습니다====");
			System.out.print("가위바위보를 선택해주세요(0:가위 ,1:바위, 2:보) : ") ;
			User = scan.nextInt();
			if(User == 0 || User==2|| User==1) {
				if(Computer == 0) {
					if(User == 1) {
						System.out.println("당신이 이겼습니다");
					}
					else if(User == 2) {
						System.out.println("컴퓨터가 이겼습니다");
					}
					else if(User== 0) {
						System.out.println("비겼습니다");
					}
				}
				if(Computer == 1) {
					if(User == 2) {
						System.out.println("당신이 이겼습니다");
					}
					else if(User == 0) {
						System.out.println("컴퓨터가 이겼습니다");
					}
					else if(User== 1) {
						System.out.println("비겼습니다");
					}
				}
				if(Computer == 2) {
					if(User == 0) {
						System.out.println("당신이 이겼습니다");
					}
					else if(User == 1) {
						System.out.println("컴퓨터가 이겼습니다");
					}
					else if(User== 2) {
						System.out.println("비겼습니다");
					}
				}
			}
			else {
				System.out.println("잘못된값입니다");
			}
			System.out.printf("**컴퓨터는 %s를 냈습니다**\n", arr[Computer]);
			
			
				
		}while(true);
		
		

	}
	

}
