package day11;

public class CustomerMain {

	public static void main(String[] args) {
		
		
		
		
		//다운 캐스팅 => 반드시 형변환 해야함
		//instanceof : 원래 인스턴스의 형이 맞는 여부를 체크하는 명령어 맞은 true/false
		Customer[] customerList = new Customer[10];
		Customer cLee = new Customer(10001,"홍길동");
		Customer gHong = new GoldCustomer(10002, "홍길순");
		Customer vJang = new VipCustomer(10003,"장욱",1111);
		if(vJang instanceof VipCustomer) {
			VipCustomer vCustomer = (VipCustomer)vJang;
			vCustomer.getAgentID();
		}else if (vJang instanceof GoldCustomer) {
			GoldCustomer vCustomer = (GoldCustomer) vJang;
			System.out.println(vCustomer.getSaleRatio());
		}else {
			System.out.println("error");
		}
		
		
		
		
		int cnt=0;
		customerList[cnt]=cLee;
		cnt++;
		customerList[cnt]=gHong;
		cnt++;
		customerList[cnt]=vJang;
		cnt++;
		System.out.println("---고객정보 출력----");
		for(int i = 0; i < cnt ; i++) {
			customerList[i].customerInfo();
		}
		System.out.println("=== 할인율과 포인트 계산===");
		int price = 100000;
		for(int i = 0 ; i < cnt ; i++) {
			System.out.println(customerList[i].getCustomerName()+"님이 지불하실 금액은"
					+customerList[i].calcPrice(price)+"원입니다.");
			System.out.println(customerList[i].getCustomerName()+"님의 현재 보너스 포인트는"
					+customerList[i].bonusPoint+"점 입니다.");
		}
		
		
		
//		cLee.calcPrice(1000000);
//		cLee.customerInfo();
//		cLee.calcPrice(1000000);
//		cLee.customerInfo();
//		
//		vJang.customerInfo();
//		
//		
//		
//		int cost = cLee.calcPrice(price);
//		System.out.println(cLee.getCustomerName()+"님이 지불하실 금액은"+cost+"원입니다");
//		System.out.println(cLee.getCustomerName()+"님의 현재 포인트는 "+cLee.getBonusPoint()+"입니다.");
//		int cost1 = gHong.calcPrice(price);
//		System.out.println(gHong.getCustomerName()+"님이 지불하실 금액은"+cost1+"원입니다");
//		System.out.println(gHong.getCustomerName()+"님의 현재 포인트는 "+gHong.getBonusPoint()+"입니다.");
//		int cost2 = vJang.calcPrice(price);
//		System.out.println(vJang.getCustomerName()+"님이 지불하실 금액은"+cost2+"원입니다");
//		System.out.println(vJang.getCustomerName()+"님의 현재 포인트는 "+vJang.getBonusPoint()+"입니다.");

	}

}
