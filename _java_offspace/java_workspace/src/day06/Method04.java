package day06;

public class Method04 {

	public static void main(String[] args) {
		/* 1. 랜덤(1~100) 정수 5개를 배열에 담는 메서드
		 * 2.배열을 전달받아서 평균을 연산하는 메서드(평균:double 을 리턴)
		 * 3. 정수 5개와 평균을 출력하는 메서드
		 * 
		 *  main에서는 연산식이 있으면 안됨.
		 *  메서드간의 데이터 전달 및 호출만 있어야함
		 *  
		 */
		
		int random[]=new int[5];
		random = ese();
		
		avg(random);
		numPrint(random);
		
		
		
	}

	// 1.랜덤정수 받아서 5개 배열에 담는 메서드
	// 2.리턴타임 : ese[]
	// 3.매개변수 : x
	
	public static int[] ese() {
		int ese[] = new int[5];
		for(int i=0 ; i<ese.length ; i++ ) {
			int random = (int)(Math.random()*100)+1;
			ese[i] = random;
		}
		return ese;
	}
	
	//1.배열을 전달받아 평균을 연산하는 메서드
	//2.리턴타입 : double
	//3.매개변수 : ese[]
	
	public static double avg(int arr[]) {
		int sum = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			sum = sum + arr[i];
		}
		double avg = (double)sum /arr.length;
		return avg;
	}
	
	//1. 정수 5개와 평균을 출력하는 메서드
	//2. 리턴타입 : void
	//3. 매개변수 : 배열?
	
	public static void numPrint(int arr[]) {
		System.out.print("5개의 정수 : ");
		for(int i = 0; i<arr.length ; i++) {
			System.out.printf("%d  ",arr[i]);
		}
		System.out.println();
		avg(arr);
		System.out.print("평균 :  ");
		System.out.println(avg(arr));
		

	}
	
}
