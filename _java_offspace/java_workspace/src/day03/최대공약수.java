package day03;

public class 최대공약수 {

	public static void main(String[] args) {
		/*최대공약수
		 * 공약수 : 두수의 공통된 약수
		 * 최대공약수 : 투수의 공통된 약수중 가장 큰값
		 * 
		 * 
		 */
		
		int num1 = 8;
		int num2 = 12;
		//두 수의 공약수만 출력
		int gcd = 0;
		for(int i = 1; i <= num1 ; i++) {
		//공통적으로 나누어 떨어지는지 체크
			if(num1 % i == 0 && num2 % i ==0) {
				gcd = i;
			}
		
		}
		System.out.println("두 수의 최대공약수 : "+gcd);
		
		int num3 = 24;
		int num4 = 12;
		
		
		for(int k = num3 ; k>=1 ; k--) {
			if(num3%k == 0 && num4%k ==0) {
				System.out.printf("두수의 최대공약수 : %d ",k);
				break; //처음 만나는 공약수가 최대공약수 바로 break;
			}
		}
		
		
	}
	
	

}
