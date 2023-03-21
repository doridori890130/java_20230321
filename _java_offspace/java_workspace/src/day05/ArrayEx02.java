package day05;

public class ArrayEx02 {

	public static void main(String[] args) {
		/* 1~10까지 담고있는 배열 arr를 생성 후 출력
		 * 
		 */
		int size = 10;
		int arr[] = new int[size];
		System.out.print("arr 출력 : ");
		for(int i =0; i<arr.length;i++) {
			arr[i]= i+1;
			System.out.printf("%d ", arr[i]);
		}
		System.out.println();
		
		//배열을 섞는 코드 random을 활용하여
		//int a= 10;
		//int b= 20;
		//int c = a;
		//a = b;
		//b = c;

		
		// 방법 : 랜덤한 번지(0~arr.length)를 선택해서 다른 번지와 교환
		//(int)(math.random()*개수)+시작값
		int min =0; // 시작 번지
		int max = arr.length;
		
		//int random = (int)(Math.random()*max)+min; // 0~10개

		//배열섞기
		for(int i =0; i <arr.length ; i++) {
			int random = (int)(Math.random()*max)+min; 
			int tmp = arr[i] ;//0번지의 값 tmp 이동
			arr[i]= arr[random];
			arr[random] = tmp;
			
		}
		System.out.println("---섞은후---");
		for(int i=0; i< arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		//오름차순 정렬 : 작은수부터 앞으로 오게 정렬
		//내림차순 정렬 : 큰 수부터 앞으로 오게 정렬
		// 3 2 7 8 1 5 4 9 10 6 
		
		for(int i = 0; i < arr.length ; i++) {
			for(int j = i+1 ; j<arr.length;j++) {
				if(arr[i]> arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
			
		}
		System.out.println("--오름차순정렬 후--");
		for(int i =0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i = 0; i < arr.length ; i++) {
			for(int j = i+1 ; j<arr.length;j++) {
				if(arr[i]< arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
			
		}
		System.out.println("--내림차순정렬 후--");

		for(int i =0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
