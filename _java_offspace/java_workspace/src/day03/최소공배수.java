package day03;

public class 최소공배수 {

	public static void main(String[] args) {
		/* 최소공배수 구하기
		 * 
		 * 배수 : 곰해서 나타나는 수
		 * 공배수 : 두 정수에서 공통적으로 있는 배수
		 * 최소공배수 : 공통된 배수중 가장 작은수
		 * 
		 */
		
		/*int num1 = 24;
		int num2 = 35;
		for(int i = num1; ;i=i+num1 ) {
			if(i%num1 == 0 && i%num2 ==0) {
				System.out.printf("두 수의 최소공배수 : %d ", i);
				break;
			}
		}
		
		/*최소 공배수를 구하는 다른방법
		 * 두수를 곱해서 최대공약수로 나누기
		 * 10*15 = 150/5 = 30
		 * 
		 */
		
		int num3 = 24;
		int num4 = 12;
		
		for(int i=num3;; i--) {
			if(num3%i ==0 && num4%i == 0) {
				System.out.printf("두수의 최소공배수 : %d " , num3*num4/i );
				break;
			}
			
		}
		
	}

}
