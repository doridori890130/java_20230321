package day09;

public class CardPackMain {

	public static void main(String[] args) {
		/*	카드 생성
		 * 	
		 * 
		 * */
		
	//	Card c = new Card();
//		c.cardPrint();
		
		CardPack cp = new CardPack();
//		Card tmp = cp.pick(); // 가장위에 있는 카드 한장을 pick Card 객체에 저장
//		tmp.cardPrint();
//		 tmp = cp.pick();
//		tmp.cardPrint();
//		 tmp = cp.pick();
//		tmp.cardPrint();
		//모양대로 4열 횡대
		//한 모양이 끝나면 줄바꿈
		for(int j = 0 ; j < 4 ; j++) {
			for(int i = 0 ; i < 13 ; i++) {
				Card tmp = cp.pick();
				tmp.cardPrint();
			}
			System.out.println();
		}
	System.out.println("------------------------------");
	cp.init(); // 다시 52개 생성
//	cp.shuffle();
	a : for(int j = 0 ; j <= 4 ; j++) {
		for(int i = 0 ; i <= 13 ; i++) {
			Card tmp = cp.pick();
			if(tmp != null) {
				tmp.cardPrint();
			}
			else {
				System.out.println();
				System.out.println("------------------------------");
				System.out.println("카드가없습니다  초기화 하세요. ");
				break a;
			}
		}
		System.out.println();
		
	}
	System.out.println("------------------------------");
	}
		
		
	

}
