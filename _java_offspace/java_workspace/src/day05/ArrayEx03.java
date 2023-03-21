package day05;

import java.util.Scanner;

public class ArrayEx03 {

	public static void main(String[] args) {
		/* 5자리 숫자를 입력받아서 입력받은 숫자를 거꾸로 출력
		 * 각 자리수 합계 출력
		 * ex) 11456 => 65411 => 6+5+4+1+1
		 */
		/*
		Scanner scan = new Scanner(System.in);  // 스캐너
		int num = 0;
		int sum = 0;
		int arr[] = new int [5]; // 배열 정의
		System.out.print("5자리숫자를입력해주세요 : ");
		num = scan.nextInt();
		arr[0]= (num / 10000)% 10;
		arr[1]= (num/ 1000)% 10;
		arr[2]= (num / 100)% 10;
		arr[3]= (num / 10)% 10;
		arr[4]= num % 10;
		
		for(int i = 0 ; i < arr.length ; i++) {
		System.out.printf("%d", arr[i]);
		sum = sum+arr[i];
		
		}
		System.out.println();
		
		
		int arrback[] = new int[5];
		
		for(int i= 0 ; i<arrback.length ; i++)
		{
			arrback[i]= arr[4-i];
			System.out.printf("%d",arrback[i]);
		}
		
		System.out.println();
		System.out.printf("합계 : %d ",sum);
			
		}
*/
		//1. 스캐너 열기
		Scanner scan = new Scanner(System.in);
		
		//2. 입력받기
		System.out.print("5자리 정수를 입력하세요 : ");
		int num = scan.nextInt();
		//3. 배열 선언, 변수를 선언
		int arr[] = new int[5];
		int sum=0, i=0;
		
		//4. 반복문을 이용하여 마지막자리가 없어질 때가지 배열에 저장 / 합계
		// % while 문을 이용
		while(num>0) { //입력받은 num 가 0이 되기전까지 반복
			int b= num % 10; //마지막자리
			
			arr[i] = b;
			sum = sum+b;
			num = num / 10; //몫 저장 => 소수점은 버려짐
			System.out.print(arr[i]);
			i++;
		}
		System.out.println();
		System.out.println("sum : " +sum);
	
		
		scan.close();
		

	}
}


