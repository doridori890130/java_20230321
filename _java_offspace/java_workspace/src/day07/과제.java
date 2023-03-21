package day07;


import java.util.Scanner;

public class 과제 {
	static Scanner scan = new Scanner(System.in);
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
		
		int[] user = new int[3];
		int[] com  = new int[3];
	
		
		
		System.out.println("===    야구게임시작 >");
		comArray(com);
		System.out.println("컴퓨터가 숫자를 정했습니다!");
		userArray(user);
		compareArray(com, user);
		
		
		
		
	}
	/* 기능 : 랜덤수 생성
	 * 매개변수 : x
	 * 리턴타입 : int
	 * 메서드명 : random
	 */
	public static int random() {
		return (int)(Math.random()*9)+1;
	}
	/* 기능 : 숫자 중복 x
	 * 리턴타입 : boolean
	 * 매개변수 : int[] int 
	 * 메서드명 : isContain
	 */
	public static boolean isContain(int[] arr , int num) {
		for(int tmp : arr) {
			if(tmp == num) {
				return true;
			}
		}
		return false;
	}
	
	/* 기능 : 컴퓨터 3자리 수 생성
	 * 매개변수 : int[]
	 * 리턴타입 : int[]
	 * 메서드명 : comArray
	 */
	public static int[] comArray(int[] cArray) {
		
		int i = 0;
		while(i < cArray.length) {
			int comNumber = random();
			if(!isContain(cArray, comNumber)) {
				cArray[i]= comNumber;
				i++;
			}
		}
		return cArray;
	}
	
	/* 기능 : 유저의 3자리수 입력
	 * 매개변수 : int[]
	 * 리턴타입 : int[]
	 * 메서드명 : userArray
	 */
	
	public static int[] userArray(int[] uArray) {
		
		System.out.printf("-> 숫자 세개를 입력해주세요(1~9 ,3개) =    ");
		String myStr = scan.next(); /// 789 => 한자리씩 잘라서 배열에 저장
		String[] myNumStrArr = myStr.split(""); //한글자씩 잘라서 배열로 저장
		for(int i = 0 ; i<uArray.length ; i++) {
			uArray[i]=Integer.parseInt(myNumStrArr[i]); //String => int Integer.parseint
		}
		return uArray;
	}
	
	/* 기능 : 컴퓨터 와 유저의 숫자 비교
	 * 매개변수 : int[] computer / int[] user
	 * 리턴타입 : void
	 * 메서드명 : compareArray
	 */
	
	public static void compareArray(int[] com, int[] user) {
	
		int cnt = 0;
		while(true) {
			int sCount = 0;
			int bCount = 0;
			cnt++;
		for(int i = 0; i < com.length ; i++) {
			for(int j = 0 ; j < user.length ; j++) {
				if(com[i]==user[j]) {
					if(i==j) {
						sCount++;
					}
					else {
						bCount++;
					}
				}
			}
		}
		if(sCount ==3) {
			System.out.printf("정답! %d번만에 맞췄습니다", cnt);
			break;
		}
		if(sCount==0 && bCount==0) {
			System.out.println("out!!!!!!!");
		}
		
		System.out.printf("Strike : %d ",sCount);
		System.out.printf("Ball : %d ",bCount);
		System.out.println();
		
		userArray(user);
		
		
		}
	}
	
	
	
}
