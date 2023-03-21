package day05;

public class ArrayEx01 {

	public static void main(String[] args) {
		/* 5개 값을 가지는 배열을 생성후
		 * 1~50사이의 랜덤값을 저장 후 출력
		 */
		
		int size = 5;
		
		//1.배열의 정의
		int arr[] = new int[size];
		int random = 0;
		System.out.print("랜덤 수 : ");
		//2. for 배열의 index 탐색
		for (int i = 0; i < arr.length ; i++) {
			random = (int)(Math.random()*50)+1;
			arr[i] = random;

			System.out.printf("%d ",arr[i]);

		}
		for(int i = 0 ; i < arr.length  ; i++) {
			for(int j = i+1 ; j <arr.length ; j++) {
				if(arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		System.out.println();
		System.out.print("오름차순 정렬 : ");
		for(int i = 0; i < arr.length ; i++) {
			System.out.printf("%d ",arr[i]);
		}
		System.out.println(); // 줄바꿈		

		System.out.print("향상된 for문 : ");
		//향상된 for문
		for(int tmp : arr) {
			System.out.print(tmp+" ");
		}
		

	}

}
