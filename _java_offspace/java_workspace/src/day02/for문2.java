package day02;

public class for문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 2*1=2, 2*2=4,....,2*9=18
		
		for(int num = 2; num<= 9 ; num++) {
		
		for(int i=1; i<=9 ; i++) {
			System.out.printf("%d x %d = %d \n" ,num,i,num*i);
			
		}
	}
		// 1~10까지의 홀수의 합, 짝수의합을 출력
		int evensum = 0;
		int oddsum = 0;
		
		for(int i=1;i<=10;i++) {
			if(i%2 == 0) {
				evensum = evensum+=i;
			}
			else if(i%2 != 0) {
				oddsum = oddsum+=i;
			}

		}
		System.out.println("짝수의 합 :  " +evensum);
		System.out.println("홀수의 합 :  " +oddsum);
		
		// 2중 for문
		// 2단, 3단, 4단, 5단... 9단
		
		for(int j=1 ; j<=9 ; j++) {
			
			for(int k=2; k<=9 ; k++) {
				System.out.printf("%dx%d=%d ",k,j,k*j);
				
			}
			System.out.println();
		}
		
	}

	

}
