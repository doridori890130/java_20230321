package day06;

public class Mathod05 {

	public static void main(String[] args) {
		/* 2~100까지의 소수를 출력
		 * 
		 * 2~100까지 for 문을 돌려서 isPrime 호출 후 true 라면 출력
		 * 
		 */
		int sum=0;
		for(int i=2; i<=100; i++) {
			isPrime(i);
			if(isPrime(i) == true) {
				System.out.print(i+" ");
				sum=sum+i;
			}
		}
		System.out.println();
		System.out.println("----소수의 합계-----");
		System.out.printf("%d" , sum);
		

	}

	/* 기능 : 정수가 주어지면 이 정수가 소수인지 아닌지 판별(true / false)
	 * 소수 : 1과 자기자신만을 약수로 가지는 수
	 * 리턴타입 : boolean
	 * 매개변수 : int
	 * 메서드명 : isPrime
	 */
	
	public static boolean isPrime(int num) {
		int mea = 0;
		for(int i = 1; i <= num ; i++) {
			
			if(num % i == 0) {
				mea++;
			}
		}
		
		boolean prime = mea ==	2;
		return prime;
		
	}
	
	
}
