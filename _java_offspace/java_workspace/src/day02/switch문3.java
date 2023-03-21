package day02;

public class switch문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*계절을 출력
		 * 1~12월까지 랜덤으로 생성 후 월과 계절을 출력
		 * 3~5 봄 6~8 여름 9~11 가을 12~2 겨울
		 * */

		int random = (int)(Math.random()*12)+1;
		
		if(random <= 5 && random >=3) {
			System.out.println(random);
			System.out.println("봄입니다");
		}
		if(random <= 8 && random >= 6 ) {
			System.out.println(random);
			System.out.println("여름입니다");
		}
		if(random<=11 && random>=9) {
			System.out.println(random);
			System.out.println("가을입니다");
		}
		if(random ==12 || random <=2) {
			System.out.println(random);
			System.out.println("겨울입니다");
		}
		int month = (int)(Math.random()*12)+1;
		
		switch(month) {
		case 3: case 4: case 5:
			System.out.println(month+"월의 계절은 봄입니다.");
			break;
		case 6: case 7: case 8:
			System.out.println(month+"월의 계절은 여름입니다.");
			break;
		case 9: case 10: case 11:
			System.out.println(month+"월의 계절은 가을입니다.");
			break;
		case 12: case 1: case 2:
			System.out.println(month+"월의 계절은 겨울입니다.");
			break;
			
		}
	}

	
}
