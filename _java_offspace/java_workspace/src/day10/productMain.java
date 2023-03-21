package day10;

import java.util.Scanner;

public class productMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cnt = 0;
		product p = new product();
		product[] productList = new product[10]; // 배열생성
		char progress;
		while(cnt < 10){
			System.out.println("상품을 등록하시겠습니까?(y/n)");
			progress = scan.next().charAt(0);
			if(progress == 'y') {
			 
			 System.out.println("상품명 :");
			 String name = scan.next();
			 System.out.println("가격 :");
			 String price = scan.next();
			 p.insertProduct(name, price);
			 productList[cnt]=new product(p.getName(),p.getPrice());
			 cnt ++;
			}
			else if(progress=='n') {
				break;
			}
			
		
	}
		
		for(int i = 0 ; i < cnt ; i++ ) {
			productList[i].productPrint();
		}
		
		scan.close();
}
}