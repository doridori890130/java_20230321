package day04;

public class while문 {

	public static void main(String[] args) {
		/* while(조건식){
		 * 실행문; // 실행문은 조건식이 false가 될수있는 구문을 포함해야함.
		 * 증감식;
		 * }
		 * 
		 * 초기화
		 * while(조건식){
		 * 실행문;
		 * 증감식;
		 * }
		 */
		
		/* 1~10까지 출력*/
		
		for(int i = 1 ; i <=10 ; i++) {
			System.out.printf("%d ", i);
		}
		System.out.println();
		
		System.out.println(" > while문 활용");
		int i = 1; // 초기값
		while(i<=10) {	//조건식
			System.out.print(i+" ");
			//증감식
			i++;
		}
		System.out.println();
		System.out.println(" >> while 문을 활용하여 짝수만 출력");
		
		int j = 2; //초기값
		while(j<=10) {    // 조건식 = 반복을 하기 위한 조건
			if(j%2 == 0) {
				System.out.printf("%d ", j);
			}
			
			j++;
		
		}
		System.out.println();
		// continue문을 이용한 1~10까지 짝수출력
		int k = 0 ;
		while(k<=10) {
			k++;
			if(k%2 != 0) {
				continue;			// 컨티뉴가되면서 아래 실행문이 실행이 안되기때문에 1이 계속유지가되서 증감식을 위로올려줌
			}
			System.out.printf("%d ", k);
		}
	}

}
