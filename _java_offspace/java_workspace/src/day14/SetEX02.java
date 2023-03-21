package day14;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class SetEX02 {

	public static void main(String[] args) {
		// 정수들 중 가장 큰점수와 가장 작은점수 출력
		int[] score = {80,98,75,48,95,62,57,80};
		
		TreeSet<Integer> set = new TreeSet<>();
		for(int i = 0 ; i<score.length ; i++) {
			set.add(score[i]);
		}
		
		System.out.println(set);
		//가장 작은값 : 가장 앞에 있는값
		System.out.println("꼴찌:"+set.first());
		
		//가장 큰값 : 가장 뒤에 있는값
		System.out.println("1등:"+set.last());

		
		System.out.println("---------------------");
		
		//headset : 지정된 객체보다 작은 값 출력 , tailset : 지정된 객체보다 큰값 출력

		System.out.println(set.tailSet(80));	//80보다 큰객체
		System.out.println(set.headSet(80));	//80보다 작은객체
		
		//범위검색(70은 포함, 뒷쪽 값은 미포함)
		System.out.println(set.subSet(70, 90));	//70~90 사이의값
		
		NavigableSet<Integer> desSet = set.descendingSet();
		
		System.out.println(desSet);
		
		
		
		
	}

}
