package day13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class List01 {

	public static void main(String[] args) {
		/*	하루 일과를 저장하는 list 생성
		 * 	
		 * */
		ArrayList<String> list = new ArrayList<String>();
	
	
		list.add("07:00 기상");
		list.add("09:00 오전수업시작");
		list.add("12:50 점심시간");
		list.add("14:00 오후수업시작");
		list.add("17:50 수업종료");
		list.add("19:00 저녁식사");
		list.add("23:00 개인시간");
		list.add("00:00 취침");
	
		
		System.out.println(list);
		System.out.println(list.get(3));
		
		for(int i=0; i< list.size() ; i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("---------------------");
		for(String tmp : list) {
			System.out.println(tmp);
		}
		
		System.out.println("------------------------");
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String tmp = it.next();
			System.out.println(tmp);
		}
		
		Collections.sort(list);
		System.out.println(list);
		
		list.sort(null);
	}

}

class Test implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		//compareTO 메서드 활용
		return o2.compareTo(o1);
	}
	
}