package day16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class LambdaEX02 {

	public static void main(String[] args) {
		/*	Stream(스트림) : 자료의 대상과 관계없이 동일한 연산을 수행할 수 있도록 해주는 반복자
		 * 
		 * 	요소가 하나씩 올라가는 형태로 처리
		 * 	재사용 불가 -> 다른 연산을 하려면 스트림을 다시 생성해야 됨.
		 * 	스트림 연산은 기존 자룔르 변경하지 않음.
		 * 	중간연산 : filter(조건에 맞는 요소 추출), distinct(중복제거), sorted(정렬), map(추출)
		 * 	최종연산 : sum(), forEach(), reduce()
		 * 
		 * 	
		 * */
		Stream<Integer> integerStream1 = Stream.of(1,2,3,4,5,6,7);
		
		int[] arr = {1,2,3,4,5,6};
		long count = Arrays.stream(arr).count();
		System.out.println(count);
		
		int sum= Arrays.stream(arr).sum();
		System.out.println(sum);
		
		OptionalDouble avg = Arrays.stream(arr).average();
		System.out.println(avg);
		
		// 성적배열 70점이상인 점수만 합계
		int totalsum = 0;
		int[] a = { 50,78,89,68,54,76,81};
		for(int i = 0 ; i < a.length ; i++) {
			if(a[i] >= 70) {
				totalsum = totalsum+a[i];
			}
		}
		System.out.println(totalsum);
		
		int total = Arrays.stream(a).filter(b->b >=70).sum();
		System.out.println(total);
		
		
		//리스트로 성적리스트를 생성하고, 스트림을 생성한 후 70이상점수만 합계
		ArrayList<Integer> numExam = new ArrayList<>();
		for(int i = 0 ; i < a.length ; i++) {
			numExam.add(a[i]);
		}
		
		
		Stream<Integer> st = numExam.stream();
		int totalnumExam = st.mapToInt(n->n.intValue()).filter(b->b<=70).sum();
		System.out.println(totalnumExam);
	}

}
