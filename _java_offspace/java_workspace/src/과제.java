
public class 과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 1~100까지 2의배수(짝수)를 출력
		 * 2,4,6,8,10
		 * 12,14,16,18,20
		 */
		int j = 0;
		for(int i = 1 ; i<=100 ; i++) { 
			if(i%2 == 0) {
				System.out.printf("%d ",i);
				j++;
				if(j==5) {
					System.out.println();
					j=0;
				}
			}
			
			
		}

	}

}
