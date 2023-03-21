package day11;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* product 클래스 : 상품을 등록하는 클래스
		 * 상품명, 가격
		 * 등록 메서드 = insertProduct
		 * 출력메서드 (tostring)
		 * 
		 * 
		 * productMain
		 * product 배열 생성 => 10개
		 * 
		 * 상품등록 후 리스트 출력
		 * 스캐너를 통해서 상품등록
		 * 상품을 등록하시겠습니까?(y/n)
		 * y일떄 상품등록 / n -> 그만
		 * 상품이름과 가격을 등록받아 상품배열에 등록
		 * n=> 등록된 제품 리스트 출력
		 * 
		 * 
		 * */
		
		product[] p = new product[10];
		Scanner scan = new Scanner(System.in);
		
		char menu = 'y';
		
		int cnt = 0;			//p 객체의 index 핸들링하기위한 변수
		int sum = 0;
		
		while(menu !='n') {
			System.out.println("상품을 등록하시겠습니까(y/n)");
			menu = scan.next().charAt(0);
			
			if(menu=='y') {
				System.out.println("상품명 > ");
				String name = scan.next();
				
				System.out.println("가격 > ");
				int price = scan.nextInt();
//				product tmp = new product(name,price);
//				p[cnt] = tmp;
				// sum = sum + price;
				
				
				//insertProduct 메서드를 활용하여 객체 생성 후 등록
				p[cnt]=new product();
				p[cnt].insertProduct(name, price);
				cnt++;
			}
			else {
				if(menu=='n') {
					System.out.println("상품등록 종료!!");
				}
				else {
				System.out.println("y/n만 입력 가능합니다");
				}
			}
		}
		
		System.out.println("--등록된 제품 리스트 --");
		for(int i = 0 ; i<cnt ; i++) {
			//tostring 사용한경우
			System.out.println((i+1)+"번쨰 상품 : "+p[i]);
			sum = sum + p[i].getPrice();	
			//메서드를 사용한경우
//			p[i].출력메서드명
		}
		
		System.out.println("상품의 총합계는 "+sum+" 원입니다");
		
		
		scan.close();
		

	}

}
