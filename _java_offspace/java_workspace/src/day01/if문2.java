package day01;

public class if문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 국어, 영어, 수학 점수의 합계와 평균을 출력
		 * 평균이 80이상이라면 합격, 아니면 불합격
		 * 출력 : 합계, 평균, 평가
		 */

		int kor = 80;
		int eng = 80;
		int mat = 0;
		
		int sum = kor + eng + mat;
		double avg = sum /3 ;
		
		
		System.out.println("합계 :  "+sum);
		System.out.println("평균 :  "+avg);
		
		if(avg >= 80) {
			System.out.println("합격");
		}
		else {
			System.out.println("불합격");
		}
		
		// 평가를 A(평균>=90) , B(평균>=80), C(평균>=70) , D(평균>=60) , E(평균>=50)
		
		if(avg >= 90) {
			System.out.println("평가 : A ");
		}
		else if (avg >= 80) {
			System.out.println("평가 : B ");
		}
		else if (avg >= 70) {
			System.out.println("평가 : C ");
		}
		else if (avg >= 60) {
			System.out.println("평가 : D ");
		}
		else if (avg < 60) {
			System.out.println("평가 : F ");
		}
	}

}
