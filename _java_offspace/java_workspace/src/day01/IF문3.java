package day01;

import java.util.Scanner;

public class IF문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner 클래스 사용	
		//값을 입력받을 때 사용하는 클래스
		Scanner scan = new Scanner(System.in);
		//입력 유도 안내문자
		System.out.println("점수를 입력해주세요.(0~100) : 국어, 영어, 수학 순으로");
		
		int kor = scan.nextInt();
		int eng = scan.nextInt();
		int math = scan.nextInt();
		
		if(kor < 0 || kor >100) {
			System.out.println("국어점수 오류");
		}
		
		if(eng < 0 || eng >100) {
			System.out.println("영어점수 오류");
		}
		
		if(math < 0 || math > 100) {
			System.out.println("수학점수 오류");
		}
		
		int sum = kor+eng+math;
		double avg = sum / 3.0;
		//합, 평균 미출력

		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+avg);
		
		
		char ch = 'F';
		// 초기값을 설정안하면 오류 지역변수는 무조건 초기화가 되어야함.
		if(avg > 100 || avg < 0) {
			System.out.println("평균점수 오류");
		}
		else if(avg >= 90) {
			ch='A';
		}
		else if(avg >= 80) {
			ch='B';
		}
		else if(avg >= 70) {
			ch='C';
		}
		else if(avg >= 60) {
			ch='D';
		}
		else {
			ch='f';
		}
		
		System.out.println("등급 :  "+ch);	
		scan.close();
		
			}

}
