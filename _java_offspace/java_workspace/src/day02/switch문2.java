package day02;

public class switch문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 주사위의 값을 출력하는 예제
		 * 주사위는 1~6까지의 랜덤수로 결정됨
		 */
		/*int random = (int)(Math.random()*6)+1;
		System.out.println(random);
		
		//switch문을 이용하여 num수만큼 전진
		switch(random) {
		case 1:
			System.out.println("1만큼 전진");
			break;
		case 2:
			System.out.println("2만큼 전진");
			break;
		case 3:
			System.out.println("3만큼 전진");
			break;
		case 4:
			System.out.println("4만큼 전진");
			break;
		case 5:
			System.out.println("5만큼 전진");
			break;
		case 6:
			System.out.println("6만큼 전진");
			break;
		}
*/
		int random1 = (int)(Math.random()*13)-6;
		System.out.println(random1);
		
		if(random1 == 0) {
			System.out.println("제자리입니다");
		}
		else if (random1 >0) {
			System.out.println(random1+"만큼 전진합니다");
		}
		else {
			System.out.println(Math.abs(random1)+"만큼 후진합니다");
		}
		

		
	}

}
