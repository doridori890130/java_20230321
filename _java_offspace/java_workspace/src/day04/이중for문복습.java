package day04;

public class 이중for문복습 {

	public static void main(String[] args) {
		/* 다음을 출력하시오
		 * 1 2 3
		 * 4 5 6
		 * 7 8 9
		 */
		int count = 0 ;
		for(int j = 1 ; j <=9 ; j++) {
				System.out.printf("%d ",j);
				count++;
				if(count ==3) {
					System.out.println();
					count = 0;
				}
		}
		//cnt ++ :표현하고 증가 , ++cnt : 증가하고 표현
		int num= 0;
		for(int i = 1 ; i <= 3 ; i++) {
			for(int k = 1 ; k <= 3 ; k++) {
				num= num+1;
				System.out.printf("%d ", num);
				}
			System.out.println();

			}
		
		for(int i= 1; i<=9; i++) {
			
		}
		
		
		}


}
