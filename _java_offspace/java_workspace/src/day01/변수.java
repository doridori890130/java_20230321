package day01;

public class 변수 {

	public static void main(String[] args) {
		// 변수명, 클래스명 한글사용 가능
		System.out.println("method 내부");
		int num, num2, num3, num4; //선언만( 같은 자료형일 경우 여러 ㅕㄴ수를 동시에 선언  )
		
		num=123; // 값 지정
		
		int num1 =123; // 선언 후 값 지정
		
		byte num5;
		char ch1;
		float f11;
		boolean bool;
		//노란 밑줄 : 경고, 한번도 사용되지 않은 경우
		//빨간 밑줄 :
		
		int appleCount ; // 변수는 의미 있기 지정ㅇ'
		 // 데서믄지 그븐힘/ 딜,ㄴ 뱐스
		
		System.out.println("num1의 값 : "+num1);
		
		//a 라는 int 변수를 선언 후 값을 지정하고, a 변수의 값을 출력
		
		int a = 12345;
		System.out.println("a변수의 값 :" +a);
		
		//num1과 a변수의 값을 하나의 구문으로 출력
		System.out.println("num1 : " +num1 + " , " + "a : " + a);
		
		//문자
		char ch = 'a'; // ""문자열 , 1그잘의 문자 ''
		//char ch2 = 'abc';
		System.out.println("ch : "+ch);
		
		//일반적인 class는 객체를 만들어서 객체로 사용 string은 워낙 자주 사용하다보니,
		//자료형처럼 사용이 가능
		String str = "abc"; //문자열		
		System.out.println("str : "+str);
		
		char ch2 ='/';
		System.out.println("ch1 : "+ch2);
		// 역슬래시 하고 '표기
		
		int b = 10;  // 10진수의 수 10을 저장
		int c = 010; // 8진수의 수 10을 저장
		int d = 0x10; // 16진수의 수 10을 저장
		
		//int e = 1234674543347898; // int 영역의 범위를 넘어섰을 경우 error.
		//long 으로 변수선언
		// long 형은 접미사 L을 필수로 써야함. 대소문자 구분없음
		long e = 1234674543347898L;
		// 기본 실수형은 double로 인식
		// float형의 실수값은 접미사 f F 를 반드시 써야함.
		float f = 1.234f;
		
		
		bool = true;
		boolean bool2 = false;
		
		// = 의 의미는 대입 오른쪽의 값(값을 가지고 있는 값, 변수)을 왼쪽(반드시 변수)에 담아라
		
		int g = 10, h=20, y=50;
		int k, z = 10;
		
	}	
}
	