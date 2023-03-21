package day08;

public class 클래스03 {

	public static void main(String[] args) {
		/* Card 클래스 생성
		 * 
		 */
		Card c = new Card();
		c.cardPrint();
		
		c.setShape('♣');
		c.getShape();
		c.cardPrint();
		c.setShape('*');
		c.cardPrint();
		c.setNum(15);
		c.cardPrint();
		c.setNum(11);
		c.cardPrint();
		
		
		
		
		
		
		
	}

}
/* Card 클래스 : 포커게임에서 사용하는 카드를 나타내는 클래스
 * 모양 : 하트(♥), 클로버(♣), 스페이드(♠), 다이아(◆)
 * 숫자 : 1~10 J(11) Q(12) K(13) 
 * 
 * 클래스의 구성
 * - 멤버변수 : char shape, int num
 * - 메서드 : print
 * - getter / setter
 * - 생성자 : 하트1(♥1)
 * 
 *  */
class Card {
	
	//맴버 변수
	private char shape;
	private int num;
	
	//생성자 : 객체의 초기값을 생성
	public Card() {
		shape = '♥';
		num = 1;
	}
	// print 메서드
	
	public void cardPrint() {
		switch(num) {
		case 11: 
			System.out.print('J');
			break;
		case 12: 
			System.out.print('Q');
			break;
		case 13: 
			System.out.print('K');
			break;
		default :
			System.out.print(num);
		}
		System.out.println(shape); // 11♥ -> J♥
	}

	public char getShape() {
		return shape;
	}

	public void setShape(char shape) {
//		if(shape == '♥' ||shape == '♣'||shape == '♠'||shape == '◆' ) {
//			this.shape = shape;			
//		}
//		else {
//			shape = this.shape;
//			System.out.println("잘못된 문자입니다");
//		}
//
		switch(shape) {
		case '♥' : case '♣': case'♠': case '◆':
			this.shape = shape;
			break;
		
		default :
			this.shape = '♥';
			break;
		}
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		if(num <= 0 || num >=14) {
			this.num=1;
		}
		else {
			this.num = num;
		}
		
	}
	
	
	
}
