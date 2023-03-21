package day12;

public class Exception03 {

	public static void main(String[] args) {
		/*	자주 발생하는 예외 코드들
		 * */

		
		//AritmeticException : 0 으로 나누었을때 생성
//		double a = 1/0;
//		System.out.println(a);
		
		//ArrayIndexoutofboundsException : 배열의 index가 범위를 벗어났을때
//		int arr[] = new int[5];
//		for(int i = 0 ; i<= arr.length ; i++) {
//			System.out.println(arr[i]);
//		}
		
//		P p = new P();
//		
//		//ClassCastException : 클래스의 다운 캐스팅이 잘못되었을때
//		C c = (C)p;
		
		// NullPointerException : 객체가 생성되지 않은경우
		C c = null;
		c.print();
		
		
	}

}
class P{
	int num = 10;
}
class C extends P{
	int num1 = 100;
	void print() {
		System.out.println(num1);
	}
}