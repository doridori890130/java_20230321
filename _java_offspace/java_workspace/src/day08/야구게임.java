package day08;

import java.util.Scanner;

//import day07.Lotto예제;

public class 야구게임 {

	public static void main(String[] args) {
		/* 야구게임
		 * 컴퓨터가 3자리의 숫자를 생성(1~9까지만) 배열
		 * 유저가 3자리의 숫자를 맞추는 게임.  배열
		 * 3  5  7
		 * 3  4  6
		 * 1s
		 * 자리와 숫자가 일치하면 strike
		 * 숫자만 일치하면 ball, 아무것도 안맞으면 out
		 * 
		 * 3  5  7
		 * 3  7  8
		 * 1s 1b
		 * 
		 * 3  5  7
		 * 6  8  1
		 * 3out 
		 * 
		 * --야구게임 시작
		 * 컴퓨터가 숫자를 정했습니다.
		 * 숫자를 입력해주세요. (1~9, 3자리) >
		 * 3 5 6
		 * 2s
		 * 3s 다맞으면 종료(게임횟수출력)
		 * 숫자를 맞출때까지 반복
		 */
		
		//1. Scanner 열기
		Scanner scan = new Scanner(System.in);
		
		//2.변수들을 선언
		int[] comNum = new int[3]; // 컴퓨터 배열
		int[] myNum = new int[3]; // 내 배열
		int count = 0; // 게임횟수 출력용
		
		//3. 컴퓨터가 결정한 3가지 숫자를 중복되지않게 추출
		for(int i =0; i<comNum.length;i++) {
			comNum[i]=(int)(Math.random()*9)+1; // 1~9까지
			for(int j=0; j<i;j++) {
				if(comNum[i]==myNum[i]) {
					i--;
					break; //(for j)의 구문을 빠져나감.
				}
			}
		}
		
		// lotto 예제에서 만든 메서드 호출
//		Lotto예제 lotto = new Lotto예제();
//		lotto.saveNumner(comNum);
//		lotto.printNumber(comNum);
		
		
		
		
		System.out.println(">>야구게임 시작");
		System.out.println("컴퓨터가 숫자를 결정했습니다.");
		
		//4. 사용자 숫자 입력받기
		while(true) {
			int s = 0;
			int b = 0;
			System.out.println(">숫자 입력(1~9, 숫자3개 : ");
			
			//숫자로 입력받는 경우
//			for(int i =0; i<myNum.length; i++) {
//				myNum[i]=scan.nextInt();
			
			//값을 문자로 입력받는 경우
			String myStr = scan.next(); /// 789 => 한자리씩 잘라서 배열에 저장
			String[] myNumStrArr = myStr.split(""); //한글자씩 잘라서 배열로 저장
			for(int i = 0 ; i<myNum.length ; i++) {
				myNum[i]=Integer.parseInt(myNumStrArr[i]); //String => int Integer.parseint
			}
			count++; //카운트 1회증가
			
			//숫자비교
			for(int i = 0; i<comNum.length ; i++) {			// 컴퓨터 Num 기준탐색
				for(int j = 0 ; j < myNum.length; j++) {	// mynum 기준 탐색
					if(comNum[i] == myNum[j] && i==j) { 		// 스트라이크 기준조건 (값 & 자리수 같을경우)
						s++;
					}else if(comNum[i]==myNum[j] && i!=j) {	// 볼 기준조건(값 & 자리수가 다를경우)
						b++;
					}
					
				}
			}
			//출력조건
			//out 조건(아무것도 안맞을경우)
			if(s==0 && b==0) {
				System.out.println("out!!!");
			}else {
				System.out.println("> "+s+"S "+b+"B");
				System.out.println("시도횟수 : "+count);
			}
			
			
			if(s==3) {
				System.out.println("축~ 정답!!");
				//System.out.println("시도횟수 : "+count);
				break;
			}
			
		}
		scan.close();
			
			
		
		
		
		
		
		

	}

}
