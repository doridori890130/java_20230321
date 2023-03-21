package day03;

import java.util.Scanner;

public class 소수 {

	public static void main(String[] args) {
		/*소수 : 약수가 1과 자기자신의 수만 가지는 수를 소수
		 * 소수 : 3, 5, 7, 11, 13....
		 * 소수는 약수가 2개인수
		 * num를 입력받아서 입력받은 num가 소수인지 아닌지 판별
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("-----------------------------");
		System.out.println("숫자를 입력해주세요");
		int num = scan.nextInt();
		int mea = 0;
		for(int i = 1 ; i<=num ; i++) {
			if(num%i == 0) {
				mea ++;
				}
			}
		if(mea == 2 ) {
			System.out.printf("%d 는 소수입니다\n",num);
			
		}
		else {
			System.out.printf("%d 는 소수가 아닙니다\n",num);
			
		}
		
		scan.close();
		
		
		int count = 0;
		int decount = 0;
		int sum=0;
		System.out.print("1~100사이의 소수 : ");
		for(int i = 1 ; i<=100; i++) {
			for(int j = 1; j<=i; j++) {
				if(i%j == 0) {
					count++;
				}
			}
			if(count == 2) {
				
				decount++;
				sum = sum +i;
				count = 0;
				System.out.printf("%d ",i);
			}
			else {
				count = 0;
			}
		}
		
		System.out.println();
		System.out.printf("소수의 갯수는 : %d\n", decount);
		System.out.printf("소수의 합은 : %d\n", sum);
	}
		
}
