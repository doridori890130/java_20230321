package day02;

public class Mathclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 수학적 기능을 하기위한 클래스
		 * 반올림, 올림, 버림, max,min,random
		 */
		
		
		double num1 = 5.123456;
		//반올림 = math.round
		
		System.out.println(Math.round(num1));//반올림만 정수형으로
		//math.cei1 : 올림 math floor : 버림
		System.out.println(Math.ceil(num1));
		System.out.println(Math.floor(num1));
		
		//math.max : 최대값, math min : 최소값
		System.out.println(Math.max(5, 3));
		System.out.println(Math.min(5, 3));
		
		//math.abs 절대값
		System.out.println(Math.abs(-5));
		
		//math.pow:제곱, math.sqrt:제곱근, math.random:랜덤값
		
		System.out.println(Math.pow(2, 3));
		System.out.println(Math.sqrt(25));
		System.out.println(Math.random());
		
		
		//1~10까지의 랜덤값 추출
		//(int)(math.random()*n)+start
		//(int)(math.random()*10)+1 //1~10까지의 랜던값 추출
		int random = (int)(Math.random()*10)+1; //1~10까지의 정수
		System.out.println(random);
		
		
		

	}

}
