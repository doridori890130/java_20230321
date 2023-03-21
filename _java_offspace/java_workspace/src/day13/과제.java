package day13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/*	단어장 단어:의미 => Hello : 안녕
		 * 
		 * 	5개의 단어를 입력하고, 단어장을 출력하세요
		 * 
		 * */
		Scanner scan = new Scanner(System.in);
		HashMap<String, String> english = new HashMap<>();
		
		//while문을 이용하여 단어와 뜻을 입력받고 map에 저장
		
		int size = 5;
		
		while(english.size() < size) {
			//입력
			System.out.println("단어 :");
			String word = scan.next();
			System.out.println("뜻:");
			String mean = scan.next();
			
			english.put(word, mean); // map.size() 증가
			
			
		}
		
//		english.put("doll", "인형");
//		english.put("door", "문");
//		english.put("key", "열쇠");
//		english.put("car","자동차" );
//		english.put("color", "색");
		Iterator<String> it = english.keySet().iterator();
		while(it.hasNext()) {
			String word = it.next();
			String mean = english.get(word);
			System.out.println("단어:"+word+" 의미:"+mean);
		}
		
		
//		int cnt = 0;
//		for(String tmp : english.keySet()) {
//			cnt++;
//			System.out.print(cnt+".");
//			System.out.println(tmp+":"+english.get(tmp));
//		}
//		
		
	}

}
