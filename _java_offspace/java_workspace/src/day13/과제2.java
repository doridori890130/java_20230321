package day13;

import java.awt.GraphicsDevice;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class 과제2 {

	public static void main(String[] args) {
		/*	과목과 점수를 입력받아 출력, 합계, 평균 출력
		 * 
		 * 	종료 키워드가 나올때까지 반복(0)
		 * 	과목과 점수를 입력해주세요
		 * 	국어:87
		 * 	수학:97
		 * 	0 : 종료
		 * 	Map 출력
		 * 	합계: 평균:
		 * */
		
		
		HashMap<String, Integer> gradecard = new HashMap<>();
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int quitNum=1;
		int cnt=0;
		System.out.println("---성적입력기---");
		while(quitNum != 0) {
			System.out.printf("과목을 입력해주세요 : ");
			String subject = scan.next();
			cnt++;
			System.out.printf("점수를 입력해주세요 : ");
			int score = scan.nextInt();
			sum = sum+ score;
			gradecard.put(subject, score);
			for(String tmp : gradecard.keySet() ) {
				System.out.println(tmp+":"+gradecard.get(tmp));
			}
			System.out.println("==종료 => 0 / 진행 => 1==");
			quitNum = scan.nextInt();
			
		}
		
//		int sum = 0;
//		Iterator<String> it = gradecard.keySet().iterator();
//		while(it.hasNext()) {
//			String subject = it.next();
//			int score = gradecard.get(subject);
//			sum+=score;
//			System.out.println(subject+":"+score);
		}
		System.out.println("합게: "+sum);
		System.out.println("평균: "+(double)sum/cnt);
		scan.close();
	}

	
	
	
}
