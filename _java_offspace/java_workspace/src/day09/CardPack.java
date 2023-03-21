package day09;

public class CardPack {
	/*	CardPack 클래스
	 *	- 카드팩 : 52장의 카드들
	 *
	 * 
	 * 	- 카드를 섞는 기능
	 *  - 한장을 선택하는 기능
	 *  - 카드 초기화 기능
	 *  - 출력 기능 - card 클래스에서 가져오기
	 *  - 생성자 - 52장의 카드를 모두 생성
	 *  
	 *  
	 * */
	
	//맴버변수
	//카드를 담을수 잇는 배열 52장
	
	//맴버변수
	//카드를 담을수 있는 배열 52장
	private Card[] pack = new Card[52]; 	// 카드 팩 배열
	private int cnt = 0 ; 	// 카드가 남은 개수
	
	//카드 섞기 기능
	//메서드명 : shuffle
	//매개변수 : 배열
	//리턴타입 : 배열
	
	public void shuffle() {
		int min= 0;
		int max= pack.length-1;
		
		
		for(int i = 0 ; i < pack.length ; i++ ) {
			int index = (int)(Math.random()*(max-min+1))+min;
				Card tmp = pack[i] ;
				pack[i]=pack[index];
				pack[index] = tmp;
						
		}
	}
	
	//카드를 한장 빼내는 기능
	//메서드명 : pick
	//리턴타입 : 카드1장
	//cnt = 52 가정
	
	public Card pick() {
		if(cnt == 0) {
			return null;
		}
		cnt--;
		return pack[cnt];
		
	}
	
	//초기화
	public void init() {
//		cnt =52;
		char shape='♥';
		for(int i = 1; i<=4 ; i++) {
			switch(i) {
			case 1: shape='♥';
			break;
			case 2: shape='♣';
			break;
			case 3: shape='♠';
			break;
			case 4: shape='◆';
			break;
			}
			for(int j = 1 ; j <= 13;j++) {
				Card c = new Card(); // 카드 한장 생성
				c.setShape(shape);
				c.setNum(j);
				pack[cnt]= c;		//shape = 하
				cnt++;
			}
		}
	}
	
	//생성자 => 52장의 카드를 생성
	
	public CardPack() {
		// case '♥' : case '♣' : case '♠' : case '◆':
		char shape='♥';
		for(int i = 1; i<=4 ; i++) {
			switch(i) {
			case 1: shape='♥';
			break;
			case 2: shape='♣';
			break;
			case 3: shape='♠';
			break;
			case 4: shape='◆';
			break;
			}
			for(int j = 1 ; j <= 13;j++) {
				Card c = new Card(); // 카드 한장 생성
				c.setShape(shape);
				c.setNum(j);
				pack[cnt]= c;		//shape = 하
				cnt++;
			}
		}
	}
}
