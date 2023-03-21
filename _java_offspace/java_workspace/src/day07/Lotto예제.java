package day07;

public class Lotto예제 {

	public static void main(String[] args) {
		/* 로또번호를 생성(1~45까지 랜덤으로 번호를 생성)
		 * 로또번호 = 사용자번호 6자리 (1~45) : 자동번호
		 * 당첨번호 = 당첨번호 6자리 +1자리(보너스번호) (1~45)
		 * 
		 * 사용자번호, 당첨번호를 랜덤으로 발생시켜
		 * 로또의 등수를 확인
		 */
		
		//배열은 main에서 생성
		int lotto[] = new int[7];
		int user[] = new int[6];
		
		saveNumner(lotto);
		

		
		saveNumner(user);
		
	
		System.out.print("로또번호 : ");
		printNumber(lotto);
		System.out.println();
		System.out.print("사용자 번호 : ");
		printNumber(user);
		System.out.println();
		int rank = checkRank(user, lotto);
		
		if(rank <=5) {
			System.out.printf("%d등입니다" ,rank);	
		}
		else {
			System.out.println("꽝입니다");
		}
		
		
		
		
		
	}
	
	
	/* 1. 번호 랜덤으로 생성 가능.
	 * 1~45범위의 랜덤번호 생성후 리턴
	 * 리턴타입 : int
	 * 매개변수 : x
	 * 메서드명 : createNumber
	 * 
	 */
	
	public static int createNumber() {
		int randomNumber = (int)(Math.random()*45)+1;
		return randomNumber;
	}

	
	/* 2. 랜덤 번호를 배열에 저장하는 기능.
	 * 리턴타입 :int[]
	 * 매개변수 :int[]
	 * 메서드명 :saveNumber
	 * 
	 */
	public static int[] saveNumner(int[] arr) {
		int i= 0;
		while(i<arr.length) {
			int r = createNumber();
			if(!duplicationNumber(arr, r)) {
				arr[i]=r;
				i++;
			}
		}
		return arr;
	}
	
	/* 3. 정수 배열을 콘솔에 출력하는 기능.
	 * 리턴타입 : void
	 * 매개변수 : int[]
	 * 메서드명 : printNumber
	 */
	public static void printNumber(int[] arr) {
		for(int i =0 ; i < arr.length ; i++) {
			System.out.printf("%d ",arr[i]);
		}
	}
	
	/* 4. 같은값이 들어가지않게 체크
	 * 리턴타입 : boolean
	 * 매개변수 : int[] int
	 * 메서드명 : duplicationNumber
	 * 
	 */
	
	public static boolean duplicationNumber(int[] arr, int a) {
		for(int i = 0; i < arr.length ; i++) {
			if(arr[i] == a) {
				return true;
			}
		}			
		return false;

	}
	
	/* 5. 등수 체크하는 기능.
	 *  리턴타입 : int
	 *  매개변수 : int lotto[] int user[]
	 *  메서드명 : lottoRank
	 *  
	 *  --당첨기준
	 *  6개일치 : 1등
	 *  5개일치 + 보너스 : 2등
	 *  5개일치 : 3등
	 *  4개일치 : 4등
	 *  3개일치 : 5등
	 */
	public static int checkRank(int[] arr, int[] arr1) {
		if(arr1.length <= arr.length) {
			return -1;
		}
		int count = 0;
		int rank = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr1.length-1 ; j++) {
				if(arr[i]==arr1[j]) {
					count++;
				}
		}
			
		switch(count) {
		case 6 : rank=1;
		break;
		case 5 : rank = (duplicationNumber(arr, arr1[arr1.length]))? 2:3;		
		break;
		case 4  : rank = 4;
		break;
		case 3  : rank = 5;
		break;
		default : rank= 6;
		
		
		}
	}
		return rank;
	}
}
