package day12;

public class 익명내부클래스 {
	/*	내부클래스란 : 클래스 내부에 선언한 클래스
	 * 	- 내부클래스를 포함한 외부클래스와 밀접한 연관이 있고, 다른외부에서
	 * 		내부클래스를 사용할일이 없을경우 사용
	 * 
	 * 	- 중첩클래스라고도 함
	 *  - 인스턴스 내부클래스, 정적(static) 내부 클래스 , 지역(local)
	 *  	,익명(anonymous) 내부클래스(가장많이씀) -> 익명클래스를 사용하기 위해 내부 클래스를 사용*/
	public static void main(String[] args) {
		
		Outer out = new Outer();
		Runnable runner = out.getRunnable(10);
		runner.run();
	}

}

class Outer{
	
	int outNum = 10;
	static int sNum = 20;
	//예전에는 매개변수와 지역변수는 final 아니면 선언 불가능했지만, 지금은
	//컴파일에서 자동으로 해줌.
	Runnable getRunnable(int i) {
		//매개변수와 지역변수는 값이 들어올때 final로 변경되서 들어옴
		int num=100;
		class MyRunnable implements Runnable{
			int localNum = 1000;
			
			@Override
			public void run() {
				System.out.println("매개변수="+i);
				System.out.println("메서드 안 num="+num);
				System.out.println("in 클래스안 localNum="+localNum);
				
				System.out.println("out클래스 outNum="+outNum);
				System.out.println("out클래스 static sNum="+sNum);
				
			}
	}
		return new MyRunnable();
		
	}
}