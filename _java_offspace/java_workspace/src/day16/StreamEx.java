package day16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamEx {

	public static void main(String[] args) {
		/*	문자열(이름)을 담는 리스트 생성후, 스트립으로 생성
		 * 	정렬하여 출력
		 * */
		
		ArrayList<String> list = new ArrayList<>();
		list.add("꽁꽁이");
		list.add("메롱");
		list.add("애쉬");
		list.add("킨드레드1");
		
		
		Stream<String> sList = list.stream();
		sList.sorted().forEach(n->System.out.println(n));
		
		//글자수가 5글자 이상인 이름만 출력
		
		list.stream().filter(b->b.length() >= 5).forEach(b->System.out.println(b));
		
		//각자 이름의 글자수를 출력
		
		list.stream().map(b->b.length()).forEach(System.out::println);
		
		
		
	}

}
