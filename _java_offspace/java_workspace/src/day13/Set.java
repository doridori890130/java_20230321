package day13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Set {

	public static void main(String[] args) {
		/*	Set 순서보장x 중복x
		 * 	HashSet
		 * 	index가 없음.
		 * 
		 * */
		
		HashSet<String> set = new HashSet<String>();
		set.add("apple");
		set.add("banana");
		set.add("apple");
		set.add("peach");
		
		System.out.println(set);
		
		for(String tmp : set) {
			System.out.print(tmp+" ");
		}
		
		System.out.println();
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String tmp = it.next();
			System.out.print(tmp+" ");
		}
		
		//set 정렬 : set은 순서가 없어서 정렬이 안됨. => set => list 변환한 후 정렬
		List<String> list= new ArrayList<String>(set);
		Collections.sort(list);
		System.out.println("set---->List");
		System.out.println(list);
		
		list.sort(new Comparator<String>(){

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
			
		});
		System.out.println(list);
		

	}

}
