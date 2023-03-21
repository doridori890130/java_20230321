package day03;

public class continue문 {

	public static void main(String[] args) {
		// continue : pass, 조건에 맞다면 ㅔㅁㄴㄴ
		
		//1~10까지 출력 5번빼고 출력
		// 1 2 3 4 6 7 8 9 10
		
		
		for(int i=1; i<=10 ; i++) {
			if(i==5) {
				continue;
			}
			System.out.println(i+" ");
		}
		// 1~10짝수만 출력 홀수는 pass continue를 사용하여 작성
		
		for(int j = 1; j <= 10 ; j++) {
			if(j%2 == 1) {
				continue;
			}
			System.out.printf("%d ", j );
		}
		
		
		
		
		
	}

}
