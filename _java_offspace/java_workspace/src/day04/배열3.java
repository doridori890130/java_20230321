package day04;

import java.util.Scanner;

public class 배열3 {

	public static void main(String[] args) {
		/* 5명의 점수를 입력받아서 배열에 저장하고,
		 * 정수의 합계와 평균을 출력
		 * 합계 :
		 * 평균 :
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		int size = 5; 
		int arr[] = new int[size];
		int sum = 0;
		double avg = 0;
		int num = 0;
		int max= 0;
		int min= 101;
		
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print("점수를 입력해주세요 : ");
			num = scan.nextInt();
			arr[i] = num;
			sum = sum + num;
			/*if(max < arr[i]) {
				max= arr[i];
			}*/
			max=Math.max(max, arr[i]);
			min=Math.min(min, arr[i]);
		}
		avg = sum /(double)arr.length;
		System.out.printf("합계 : %d", sum);
		System.out.println(" 평균 :  "+avg);
		System.out.printf("최고점수 :  %d ", max);
		System.out.printf("최저점수 :  %d ", min);
		scan.close();
	}
	

}
