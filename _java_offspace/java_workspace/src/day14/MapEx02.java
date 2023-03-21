package day14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class MapEx02 {

	private HashMap<String, Integer> map = new HashMap<>(); //1번형태
	Scanner scan = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		/*	map에 상품명과 가격을  입력받고, 출력
		 * 	입력->메서드로, 출력 -> 메서드로 구현
		 * 	상품에 대한 총지불가격 출력
		 * 
		 * */
		MapEx02 ex = new MapEx02();
//		HashMap<String, Integer> map = new HashMap<>();
		
		
		
		
		int quitNum = 1;
		while(quitNum != 0) {
		ex.insertGoods();
		System.out.println("종료 = 0 // 진행 = 1");
		quitNum = ex.scan.nextInt();
		}
		ex.printGoods();

	}

	public void insertGoods() {
		
		System.out.println("상품명을 입력해주세요 :");
		String goods = scan.next();
		System.out.println("가격을 입력해주세요 : ");
		int price = scan.nextInt();
		
		map.put(goods, price);	 //1번형태
	}
//	public void insertGoods(HashMap<String, Integer> map) {
//		
//		System.out.println("상품명을 입력해주세요 :");
//		String goods = scan.next();
//		System.out.println("가격을 입력해주세요 : ");
//		int price = scan.nextInt();
//		
//		map.put(goods, price);
//	}
	
	public void printGoods() {
		int sum= 0;
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String goods = it.next();
			int price = map.get(goods);
			System.out.println("상품 :"+goods+" 가격:"+price);
			sum = sum + price;
			
		}
		System.out.println("총 지불가격 : "+sum);
	}
//		1번형태
//	public void printGoods() {
//		int sum = 0 ;
//		Iterator<E>
//	}
	
	
}
