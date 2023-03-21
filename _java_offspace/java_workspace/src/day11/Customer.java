package day11;



public class Customer {
	

	/*	일반고객 / Gold 고객 / VIP 고객
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 	 고객 ID : int customerID
	 * 	 고객이름 : String customerName
	 * 	 고객등급 : String customerGrade
	 * 	 보너스포인트 : int bounusPoint
	 * 	 보너스포인트적립비율 : double bonusRatio
	 * 
	 * 	- Customer 객체생성시
	 * 	기본 customerGrade = Silver
	 * 	기본 bonusRatio = 0.01
	 * gold 등급 10%할인 / 2프로적립
	 * vip 10프로할인 / 5프로적립
	 * 
	 * 
	 * 	- 메서드
	 * 
	 * 	- 보너스 적립 계산 메서드(메서드명 : clacPrice(int price))
	 *   => 보너스를 적립하고, 할인여부를 체크하여 구매 price를 리턴
	 *  - 구매금액을 주고, 적립보너스를 계산 bonusPoin에 누적
	 *  
	 *  - 출력메서드(메서드명 : customerInfo())
	 *  - 홍길동님의 등급은 vip이며, 보너스 포인트는 1000 입니다.	
	 * 
	 * */
	//맴버변수
	int customerID;			//고객 id
	String customerName;	//고객 명
	String customerGrade;	//고객 등급
	int bonusPoint;			//고객 포인트
	double bonusRatio;		//적립비율
	
	public Customer() {}		// 

	public Customer(int id , String name) {
	    customerID= id;
		customerName = name;
		initCustomer();
	}
	
	public void initCustomer() {
		customerGrade = "Silver";
		bonusRatio = 0.01;
	}
	
	//가격을 매개변수로 받아 포인트를 적립
	public int calcPrice(int price) {
		bonusPoint =  bonusPoint + (int)(price*bonusRatio);
		return price;
	}
	
	public void customerInfo() {
		System.out.println(customerName+"의 등급은 "+customerGrade+"이며 보너스 포인트는 "+bonusPoint+"입니다.");
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public double getBonusRatio() {
		return bonusRatio;
	}

	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
	
	
	
		
	
}
