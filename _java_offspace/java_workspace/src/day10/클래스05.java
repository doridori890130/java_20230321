package day10;

public class 클래스05 {

	public static void main(String[] args) {
		/* 	static이 붙은 맴버 변수/메서드들을 클래스 맴버 /메서드 라고한다.
		 * 	static이 안 붙은 맴버 변수 , 메서드들을 객체(인스턴스) 맴버변수/메서드라고한다.
		 * 
		 * 	- 객체 맴버변수/메서드는 객체를 통해 사용되고, 생성된다.
		 * 	- 각 객체마다 독립적인 변수/메서드가 된다.
		 * 
		 * 	- 클래스 맴버변수/메서드는 클래스를 통해 사용된다.
		 * 	- 클래스명, 메서드호출
		 * 	- 객체를 통해 호출되는 것이 가능하나 일반적이지 않다.
		 * 	
		 * 	- 클래스/객체 변수의 생성시점이 다라서 메서드에 사용될 수 있는 환경이 다르다.
		 * 	- 객체 맴버 이미 클래스가 생성된 후에 생성 클래스의 맴버 메서드에서 사용할 수 있다.
		 * 	- 클래스 맴버 변수는 클래스/객체 맴버에서 모두 사용할 수 있다.
		 * 	- 객체 맴버 변수는 클래스 맴버 메서드에서 사용할수 없다.
		 * 	- 객체 맴버는 객체맴버 메서드에서만 사용할 수 있다.
		 * 	- 
		 * */
		//객체 메서드 접근방식 : 객체생성 후 객체명.메서드명()
		TV t = new TV();
		t.printPower();
		
		//클래스 맴버 메서드 접근방식 : 클래스명, 메서드명
		TV.printBrand();
	}

}

class TV{
	private boolean power;
	public static String brand= "Samsung"; //final : 최종 수정할수 없는 상수
	
	public void printPower() {
		if(power) {
			System.out.println("tv가 켜졌습니다");
		}else {
			System.out.println("tv가 꺼졌습니다.");
		}
		System.out.println("제조사 : "+brand);
	}
	public static void printBrand() {
		System.out.println("제조사 : "+brand);
		//System.out.println(poewr); // 불가능 (static 인 애들만 출력가능)
	}
	public void powerOn() {
		power = true;
	}
	public void powerOff() {
		power = false;
	}
	
	
}
