package day09;

import java.util.Scanner;

public class BaseBallGame {

	public static void main(String[] args) {
		/* 야구 게임 메서드로 변경
		 * 랜덤번호생성
		 * 배열에 추가(중복메서드)
		 * 출력메서드
		 * 스타리읔 메서드
		 * 볼 메서드
		 * 
		 * */
		int com[] = new int[3];
		int user[] = new int[3];
		//랜덤수 범위
		int max = 9;
		int min = 1;
		int s=0, b=0;
		int count = 0;
		
		Scanner scan = new Scanner(System.in);
		randomArray(com, max, min);
		System.out.println(">> 야구게임 시작");
		System.out.println("컴퓨터가 수를 결정하였습니다.");
		
		while(s!=3) {
			// 사용자번호 입력받기
			System.out.println("1~9까지 숫자 3개입력 > ");
			for(int i = 0 ; i<user.length;i++) {
				user[i] = scan.nextInt();
			}
			count++;
			//결과 판정 strike / ball 각각 호출
			s= strike(com, user);
			b= ball(com, user);
			//System.out.println(s+"S "+b+"B");
			//0일때 표현하지 않게 처리
			if(s!=0) {
				System.out.print(s+"S ");
			}
			if(b!=0) {
				System.out.print(b+"B ");
			}
			System.out.println("게임횟수 : "+count);
			System.out.println();
			if(s==0&b==0) {
				System.out.println("OUT!!!");
			}
			
		
			}
		System.out.println("정답~!! 게임종료~");
		System.out.println();
		scan.close();
		}
		

	
	//랜덤번호 생성 : 매개변수로 범위를 설정 20~30 -> cnt :10 start : 20
	// 범위 : min, max 20~30 cnt -> max=min+1
	// (int)(math.random()*max-min+1)+min
	// 개수, 시작값 (int)(math.random();*개수)+시작
	public static int random(int max, int min) {   
		if(max<min){
			int tmp = max;
			max = min;
			min = tmp;						// max와 min의 숫자 값이 바뀌어서 들어올떄 처리(시작값이 작을수밖에없다)
		}
		return (int)(Math.random()*(max-min+1))+min;
	}
	
	//중복확인 메서드
	public static boolean isContain(int arr[], int num) {
		for(int i = 0 ; i < arr.length; i++) {
			if(arr[i]==num) {
				return true;
			}
		}
		return false;
	}
	
	//배열 생성 메서드 (중복제거)
	//true가 리턴되면 정상적으로 배열이 생성됨을 알려주는
	public static boolean randomArray(int[]arr , int max , int min) {
		if(arr == null) {
			return false;
		}
		if((max-min+1 < arr.length)) { //랜덤의 개수가 배열의 length보다 작다면
			return false;
		}
		int i=0;
		while(i<arr.length) {
			int r = random(max,min);
			if(!isContain(arr, r)) {
				arr[i] = r;
				i++;
			}
		}
		return true;
	}
	
	// 배열 출력 메서드
	
	public static void printArray(int arr[]) {
		for(int i= 0 ; i < arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();  //줄바꿈
	}
	
	// 스트라이크 메서드
	// 기능 : com[] , user[] 위치와 값이 일치하면 카운트 반환기능
	// 메서드명 : strike
	
	public static int strike(int com[], int user[]) {
		int cnt = 0;
		for(int i = 0; i < com.length ; i++ ) {
			if(com[i]==user[i]) {
				cnt++;
			}
		}
		return cnt;
	}
	
	// 볼메서드
	// 기능 : com[] user[] 위치상관없이 일치하면 카운트증가 반환가능
	//메서드면 : ball
	public static int ball(int com[], int user[]) {
		int cnt = 0;
		for(int i = 0 ;i < com.length ; i++) {
			if(isContain(user, com[i])) {
				cnt++;  //무조건 자리상관없이 일치하면 count 증가
			}
		}
		//스트라이크의 개수만큼 차감
		return cnt-strike(com,user);
	}
	
	
}
