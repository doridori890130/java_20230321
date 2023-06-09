package day06;

public class 정리 {

	public static void main(String[] args) {
		/* 정리~!!
		 * 
		 * 1. 변수
		 * - 일반변수(지역변수, 기본형변수) : 값을 저장하는 기분 메모리공간
		 *  - 정수형 : int, byte, short, long(접미사 L(l))
		 *  - 실수형 : double, float (접미사 f(F))
		 *  - 문자형 : char(정수형으로 분류하기도 함. 유니코드표에 코드로 저장) : 1글자
		 *  - 불리연 : boolean(true / false)
		 * - 참조 변수 : 객체의 주소를 저장하는 변수(객체명) : new 키워드를 통해 객체가 생성
		 * - 자료형 변환 : 변수, 상수, 리터럴 값들을 일시적으로 다른 자료형으로 변환
		 *  - 자동형변환 : 정수 -> 실수 , 작은바이트 -> 큰바이트
		 *  - 명시적형변환 : 자동으로 형변환이 되지 않는 경우 (자료형)변수명
		 *  
		 * 2. 연산자
		 *  - 대입연산자(=)
		 *    - 오른쪽에 있는 값을 왼쪽 변수에 저장
		 *    - 왼쪽에는 반드시 저장가능한 변수/객체가 와야함.
		 *    - 왼쪽과 오른쪽의 자료형은 반드시 같아야함.
		 *  - 산술연산자(+, - , /, %)
		 *    - 정수/ 정수 = 정수
		 *    - / 0으로 나누면 에러 발생, 0으로 나눌수 없음
		 *  - 비교연산자(>= , <=, >, ,<, ==, !=)
		 *   - 항상 결과가 true / false 로 표현
		 *  - 논리 연산자( && || !)
		 *   - && : and 여러개의 조건이 모두 맞아야 true ~이고 , ~면서
		 *   - || : or 여러개의 조건 중 하나만 맞아도 true ~이거나, ~또는
		 *   - ! : not 현재 조건의 반대
		 *  - 증감연산자(++ --)
		 *   - 1씩 증가, 1씩 감소 위치에 따라 증가되고, 감소되는 순서가 결정됨.
		 *   - i++ i--
		 *  - 조건선택연산자( 조건식? true : false)
		 *   - 조건식이 참이면 true 아니면 false 선택
		 *   
		 * 3. 조건문 : 조건식이 참이면 실행문을 실행
		 *  - if , switch
		 *  - if: 조건식이 반드시 true / false로 구분되야함.
		 *  - switch : 값이 나오는 식, 변수 
		 *    - 반드시 하나의 case가 끝나면 break 문을 달아줘야함.
		 *    - break 를 생략하면 하위 모든 case가 실행됨.
		 *    
		 * 4. 반복문 : 규칙성 반복
		 *  - for, while , do~while문
		 *  - for(초기화; 조건식; 증감식){
		 *  	실행문;
		 *  }
		 *  - while(조건식){
		 *  	실행문;
		 *  	- 실행문에 반드신 조건식이 false가 될수있는 구문을 포함.
		 *  }
		 *  - do{		// 무조건 1번은 실행되어야하는 반복문에서 사용
		 * 		실행문;
		 *  }while(조건식)
		 *  
		 *  
		 * 5. break, continue문
		 *   - break : 반복문을 빠져나가기 위한 구문 / if문을 같이 동반하게 됨.
		 *     switch문에서 case를 바져나가기 위한 구문
		 *   - continue : pass하는 역할
		 *     조건이 맞을 때 실행하지 않고, 다음 증감으로 이동
		 *     while문에서는 증감식 찾을 수 없기 때문에 바로 조건식으로 이동.
		 *     
		 * 6. 배열
		 *   - 동일한 자료형을 가진 데이터를 모아놓은 형태
		 *   - 배열 선언 및 초기화
		 *    자료형 배열명[] = new 자료형[개수]; 선언하고 배열 생성
		 *   - 배열의 index는 0부터 시작~ 배열.length-1
		 *   - 배열.length : 배열의 총길이
		 *   - 배열[index] = 값; // 배열의 index 번지에 값을 저장
		 *   - 변수 = 배열[index] ; // 배열의 index 번지의 값을 변수로 추출
		 */

	}

}
