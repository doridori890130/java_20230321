package day14;

import java.util.Set;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;


public class SetEx01 {

	TreeSet<Integer> set = new TreeSet<>();
	public static void main(String[] args) {
		// 로또번호 출력
		// random으로 생성 1~45까지 총 6개
		
		//math 클래스에서 제공하는 random메서드 사용ㅇ
		
		//Random 클래스 사용하는 방법
//		int b = new Random().nextInt(45)+1;
		
		
//		Iterator<Integer> it = set.iterator();
//		while(it.hasNext()) {
//			int tmp = it.next();
//			System.out.print(tmp+" ");
//		}
//		System.out.println();
//		System.out.println("로또번호 : ");
//		for(int tmp : set) {
//			System.out.print(tmp+" ");
//		}
		
		
	}
	
	int size = 6;
	public void random() {
	while(set.size() <size) {
		int b = new Random().nextInt(45)+1;
		set.add(b);
	}
	System.out.println("로또번호 : ");
	
	System.out.println(set);
	System.out.println(set.last());
	}
}
