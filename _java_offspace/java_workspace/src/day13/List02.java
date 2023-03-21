package day13;

import java.util.ArrayList;
import java.util.Scanner;

public class List02 {

	public static void main(String[] args) {
		/*	--메뉴판--
		 * 1.햄버거:7000
		 * 2.피자:15000
		 * 3.음료:2000
		 * 4.과자:2000
		 * 5.사탕:500
		 * 6.프로그램 종료
		 * 
		 * 메뉴를 선택해주세요 1, 수량을 선택해주세요.2		 
		 * => 1번메뉴 햄버거 2개주문
		 * 주문을 끝내시려면 0을 눌러주세요
		 * 메뉴를 선택해주세요 3, 수량을 선택해주세요.2
		 * =>3번메뉴 음료2개주문
		 * 주문을 끝내시려면 0을 눌러주세요. 0
		 * 
		 * --선택한 메뉴
		 * 햄버거2개, 음료2개 선택 총금액 : ?
		 *  */
		Scanner scan = new Scanner(System.in);
		FoodManager fm = new FoodManager();
		ArrayList<String> orderfood = new ArrayList<>();
		ArrayList<Integer> orderCount = new ArrayList<>();
		ArrayList<Integer> ordersum = new ArrayList<>();
		fm.basicMenu();
		fm.printMenu();
		while(fm.menu!=0) {
			System.out.println("메뉴를 선택해주세요(1~5) : ");
			fm.menu = scan.nextInt();
			if(fm.menu == 0) {
				System.out.println("프로그램 종료");
				break;
				
			}
			if(fm.menu !=0) {
				if(fm.menu < fm.food.size()) {
					System.out.println("수량을 선택해주세요 :");
					fm.count = scan.nextInt();
					fm.sale(fm.menu, fm.count);
					orderfood.add(fm.food.get(fm.menu-1));
					orderCount.add(fm.count);
					ordersum.add(fm.sum);
					System.out.println("주문 종료 => 0번");
					fm.printMenu();
				}
				else {
					System.out.println("잘못된 메뉴입니다");
					fm.printMenu();

				}
			}
		}
		
		System.out.println("--주문확인---");
		for(int i = 0 ; i < orderfood.size();i++) {
			System.out.print(orderfood.get(i)+" ");
			System.out.print(orderCount.get(i)+"개 ");
			System.out.println(" "+ordersum.get(i)+"원");
			
		}
		System.out.println("총 금액 : "+fm.total+"원");
		scan.close();
	}

}

class FoodManager{
	//맴버변수 ArrayList 가격, 메뉴
	
	//메서드 정의
	//void printmenu(), 추가 메서드 void add(): 리스트의 메뉴판 채우기
	//sale(int menu , int count)
	
	ArrayList<String> food = new ArrayList<String>();			//음식 배열 선언
	ArrayList<Integer> price = new ArrayList<Integer>();		//각겨 배열 선언
	int menu = 0;
	int sum=0;
	int count=0;
	int total=0;
	
	public void printMenu() {
		System.out.println("---메뉴판---");
		for(int i = 0 ; i < food.size(); i++) {
			menu = i+1;
			System.out.print(menu+". ");
			System.out.print(food.get(i)+": ");
			System.out.println(price.get(i)+"원");
		}
		
	}
	public void basicMenu() {
		add("햄버거", 7000);
		add("피자", 15000);
		add("음료", 2000);
		add("과자", 2000);
		add("사탕", 500);
	}
	
	public void add(String addfood , int addprice) {
		food.add(addfood);
		price.add(addprice);
	}
	
	public void sale(int menu, int count) {
		sum = price.get(menu-1) * count;
		total = total + sum;
		System.out.println("-----------------");
		System.out.printf("주문하신 메뉴는 "+food.get(menu-1));
		System.out.println(count+" 개");
		System.out.println("---------------");
		System.out.println("총합 :" +sum);
	}
}