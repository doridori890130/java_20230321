package day01;

public class 연산자 {

	public static void main(String[] args) {
		/* 대입연산자 : = 을 기준으로 오른쪽에 있는 값을 왼쪽으로 저장한다
		 * a = b 
		 * b의 값을 a에 저장(대입)해라. / 덮어쓰기
		 * a는 반드시 변수여야 한다.
		 */
		
		int a = 10;
		int b = 20;
		a = 30; // 기존 a의 값은 사라짐
		b = b + 10; // 연산 후 결과를 대입
		System.out.println("a : "+a+ ", b : "+b);
		//b+30 = a; 에러 발생.
		
		//산술연산 :  +-*/ % : (나머지 연산자)
		System.out.println(4+3);
		System.out.println(4-3);
		System.out.println(4*3);
		
		System.out.println(1.2+3.4);
		System.out.println(1.2-3.4);
		System.out.println(1.2*3.4);
		
		/* 나누기 /
		 * 정수 / 정수 = 정수(소수점을 버림)
		 * 정수 / 실수 = 실수
		 */
		System.out.println(6/2);
		System.out.println(3/2.0);
		System.out.println(3.0/2.0);
		System.out.println(3.0/2);
		
		// 자료형 정수 -> 실수로 변환 형변환
		
		int num1 = 3 ; 
		int num2 = 2 ;
		
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/(double)num2);
		
		// 나머지연산자 %
		System.out.println(4 % 2);
		System.out.println(44 % 7);
		
		/*문제 국어 70점 , 영ㅇ어 35점, 수학 97점일때
		 * 국어, 영어, 수학 세과목의 합과 평균을 구하여 콘솔에 표시하시오
		 * */
		
		int kor = 100;
		int eng = 90;
		int mat = 97;
		
		int sum = kor + eng + mat;
		double avg = sum /3.0; // 값 / 0 나누면 예외발생
		
		System.out.println("합계 :  " +sum);
		System.out.println("평균 :  " +avg);
		
		//논리연산자 / 논리 연산자 if 문에서 체크
		//비교 연산자 (결과가 TRUE / FALSE 로 출력)
		
		System.out.println(4 > 5);
		
		// 상황연산자 (조건식)? A : B
		// 평균이 80이상이면 합격, 아니면 탈락을 표시 
		
		System.out.println((avg >= 80) ? "합격" : "탈락");

	}

}
