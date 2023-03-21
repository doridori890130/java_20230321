package day07;

import java.util.Scanner;

public class Mathod08 {

	public static void main(String[] args) {
		/* 배열이 주어졌을 때 
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		
		int arr[] = new int[] {1,3,4,9,7,8,2,11,16,15};
		
		printArray(arr);
		System.out.println("=====정렬후=====");
		sortArray(arr);
		printArray(arr);
		
		int getSize = 0;
		System.out.printf("배열의 크기를 정해주세요 : ");
		getSize = scan.nextInt();
		
		
		int[] arr2 = randomArray(getSize);
		printArray(arr2);
		scan.close();
	}
	
	/* 기   능 : 주어진 정수 배열을 콘솔에 출력하는 메서드
	 * 매개변수 : int[]
	 * 리턴타입 : void
	 * 메서드명 : printArray
	 * 옆으로 출력 / 5개씩 한줄에
	 */
	
	public static void printArray(int arr[]) {
		int count = 0;
		for(int i=0 ; i < arr.length ; i++ ) {
			System.out.printf("%2d ", arr[i]);
			count++;
			if(count ==5) {
				System.out.println();
				count = 0;
			}
		}
	}
	
	/* 기   능 : 주어진 정수 배열을 정렬하는 기능
	 * 매개변수 : int[]
	 * 리턴타입 : int[]
	 * 메서드명 : sortArray
	 */

	public static void sortArray(int arr[]) {
		int tmp = 0;
		for(int i=0; i < arr.length ; i++)
			for(int j =i+1; j < arr.length; j++ ) {
				if(arr[i]> arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		
	}
	
	/* 기   능 : 새로운 배열을 만들어서 랜덤수를 채워 리턴하는 메서드
	 * 랜덤수 범위 (1~100)
	 * 매개변수 : 사이즈를 매개변수로 받아서
	 * 리턴타입 : 배열
	 * 메서드명 : randomArray
	 */
	
	public static int[] randomArray(int size) {
		
		int[] randomArray = new int[size];
		for(int i = 0 ; i < randomArray.length ; i++) {
			randomArray[i] = (int)(Math.random()*100)+1;
		}
	return randomArray;
	}
}
