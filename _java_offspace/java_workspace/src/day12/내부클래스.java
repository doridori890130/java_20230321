package day12;

public class 내부클래스 {

	public static void main(String[] args) {
		/*	내부클래스란 : 클래스 내부에 선언한 클래스
		 * 	- 내부클래스를 포함한 외부클래스와 밀접한 연관이 있고, 다른외부에서
		 * 		내부클래스를 사용할일이 없을경우 사용
		 * 
		 * 	- 중첩클래스라고도 함
		 *  - 인스턴스 내부클래스, 정적(static) 내부 클래스 , 지역(local)
		 *  	,익명(anonymous) 내부클래스(가장많이씀) -> 익명클래스를 사용하기 위해 내부 클래스를 사용
		 *  
		 *  - 내부적으로 활용할 목적으로 만드는 클래스이기 때문에 private으로 선언 하는 것을 권장
		 *  - 내부 클래스 생성시기 : 외부클래스가 생성된 후 생성됨.(static 은 다름)
		 *  - private 이 아닌 내부 클래스는 다른 외부클래스에서 생성할수 있음.
		 *  
		 *  
		 * */
		
		Outclass out = new Outclass(); //Inclass 도 같이생성
		
		System.out.println("외부 클래스를 이용하여 내부클래스의 메서드를 호출");
		out.usingClass();
		
		System.out.println();
		
		//외부클래스에서 내부클래스를 생성 => private 으로 선언된 내부클래스는 접근 불가
		Outclass.Inclass inClass = out.new Inclass();
		inClass.inClassprint();
		
		//외부클래스에서 바로 정적(static) 내부 클래스 생성
		Outclass.InStaticClass.sTest();

		// s
		System.out.println();
		System.out.println("정적(static) 내부 클래스의 일반 메서드 호출");
		Outclass.InStaticClass sInClass = new Outclass().InStaticClass();
		
	}

}

class Outclass{
	
	private int num= 10;
	private static int sNUM = 20;
	private Inclass in;
	//outclass 맴버변수로 추가하는 것과 같은 효과
	
	public Outclass() {
		in = new Inclass();
		
	}
	class Inclass{
		int inNUM = 100;
		//static int sInNum=200;
		void inClassprint() {
			System.out.println("Outclass Num="+num+"(외부클래스의 인스턴스변수");
			System.out.println("Outclans sINum="+sNUM+"(외부클래스의 static 변수");
			System.out.println("Incalss inNum="+inNUM+"(내부클래스의 인스턴스 변수");
		}
		
		static void sTest() {
			System.out.println("Outclass sNUM="+sNUM+"(외부클래스의 static 변수)");
			System.out.println("Inclass sInNum="+sInNum+"(내부클래스의 static 변수"); 
			}
//		static void sTest() {} // error
	}
	
	public void usingClass() {
		in.inClassprint(); //내부 클래스 변수를 사용하여 메서드를 호출
	}
	static class InStaticClass{
		int inNum = 1000;
		static int sInNum = 2000;
		
		void inTest() {
			
		}
		

	}
	
	
}