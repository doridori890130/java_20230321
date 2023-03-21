package day03;

public class 이중for문1 {

	public static void main(String[] args) {
		/* for(초기화;3조건식;증감식){
		 * 실행문;
		 * for(초기화; 조건식; 8증감식){
		 * 실행문;
		 * 	}
		 * }
		 * 
		 * 가로/세로 5개 별을찍어보자
		 */
		
		for(int i = 1; i <=5; i++) {
			for(int j=1; j <=5 ; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
/* 	* i= j=1
 *  **
 *  ***
 *  ****
 *  *****
 */
		
/*
		int j; int k;
		for(int i = 1 ; i<= 5 ; i++) {
			for(j = 1 ; j<=5-i ; j++) {
				System.out.print(" ");
			}
			for(k = 1; k<=i ; k++) {
				System.out.print("*");
			}
			System.out.println();
	}
	*/
		/*if문을 이용한방법
		 */
		for(int i=1; i <= 5 ; i++) {
			for(int j =1; j<=5; j++) {
				if(j<=5-i) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	
	}

}
