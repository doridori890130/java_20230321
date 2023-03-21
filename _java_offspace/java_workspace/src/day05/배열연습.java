package day05;

import java.util.Scanner;

public class 배열연습 {

	public static void main(String[] args) {
		/* 5명의 점수를 입력받아 배열에 저장하고,
		 * 점수의 합계, 평균, 최대, 최소값 출력
		 * 
		 */


		
		

		//1. 스캐너열기		
		Scanner scan = new Scanner(System.in);
		//2. 배열 선언, 변수선언
		
		int size = 5;
		int arr1[] = new int[size];
		int sum=0;
		int max=0;
		int min=100;
		
		double avg = 0;
		
		//3. for문을 사용하여 배열안을 탐색 index 번지에 값을 저장
		System.out.print("점수를 입력해주세요 (5명의점수) ");
		for(int i= 0;  i<arr1.length ; i++ ) {
			//4. 합계 평균, 최대, 최소의 값을 구하기.
			arr1[i] = scan.nextInt();
			sum = sum + arr1[i];
		/*	if(arr1[i]> max) {
				max=arr1[i];
			}
			if(arr1[i]<min]) {
				min=arr1[i];
			}
			*/
			max = Math.max(max, arr1[i]);
			min = Math.min(min, arr1[i]);
		}
		avg = (double) sum / arr1.length;
		//5. 출력
		System.out.printf("합계 : %d\n",sum);
		System.out.printf("평균 : %f\n",avg);
		System.out.printf("최대값 : %d\n",max);
		System.out.printf("최소값 : %d\n",min);
		
		scan.close();
	}

}
