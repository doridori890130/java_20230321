package day16;

import java.util.Arrays;

public class StreamEx02 {

	public static void main(String[] args) {
		/*	배열에서 짝수만 출력(정렬)
		 * 	중복되는 값은 삭제
		 * */
		
		int[] arr = {5,6,1,3,5,1,7,8,6,4,2,8,4};
		
		Arrays.stream(arr)
		.distinct()
		.sorted()
		.filter(b->(b%2)==0)
		.forEach(b->{System.out.print(b+" ");});
		
		//짝수배열
		int[] result =Arrays.stream(arr)
		.distinct()
		.sorted()
		.filter(b->(b%2)==0).toArray();
		System.out.println();
		System.out.println("============");
		for(int tmp : result) {
		System.out.print(tmp+" ");
		}
	}

}

