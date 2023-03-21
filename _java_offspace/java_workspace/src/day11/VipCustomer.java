package day11;

public class VipCustomer extends Customer {
	
	
	double saleRatio;
	int agentID;
	
	public VipCustomer() {}
	public VipCustomer(int id , String name, int agentid) {
		super(id, name);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentid;
	}
	@Override
	public int calcPrice(int price) {
		bonusPoint += (int)(price * bonusRatio);
		return price - (int)(price*saleRatio);
	}
	@Override
	public void customerInfo() {
		
	super.customerInfo();
	System.out.println("담당 전화 상담사는 "+agentID+"입니다");
		
	}
	public int getAgentID() {
		return agentID;
	}

	

}
