package day12;

public class Exception01 {

	public static void main(String[] args) {
		/*	Exception : 예외처리
		 * 
		 *	실행시 발생할 수 있는 예외를 처리하여 정상처리로 유지시키는 기능.
		 *	try~ catch ~finally
		 *
		 *	try : 예외가 발생할 가능성이 있는 구문 작성
		 *	catch : try 구문에서 예외가 발생했을 때 예외처리
		 *	finally : try 구문외 반드시 실행되어야하는 구문이 있을경 사용 (없으면 사용x)
		 * */
		
		double res = 0;
		
		int num = 10;
		int num1 = 0;
		int sum = num1 + num;
		System.out.println(sum);
		
		
//		res = num /num1;			//error 지점
//		System.out.println(res);
		
		
		try {
			res = num /num1;
			System.out.println(res);
	}catch(Exception e) {
		System.out.println("0으로 나누었습니다. exception 발생~!!");
	}finally {
		System.out.println("꼭처리해야 하는 구문");
	}
		System.out.println("종료");

}
}