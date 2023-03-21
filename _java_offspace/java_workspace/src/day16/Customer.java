package day16;

import day15.Word;

public class Customer implements Comparable<Customer> {
	
	private String nameCustomer;
	private int ageCustomer;
	private int costCustomer;

	public Customer(String name , int age) {
		this.ageCustomer = age;
		this.nameCustomer = name;
	}

	public String getNameCustomer() {
		return nameCustomer;
	}

	public void setNameCustomer(String nameCustomer) {
		this.nameCustomer = nameCustomer;
	}

	public int getAgeCustomer() {
		return ageCustomer;
	}

	public void setAgeCustomer(int ageCustomer) {
		this.ageCustomer = ageCustomer;
	}
	

	public int getCostCustomer() {
		if(ageCustomer > 15) {
			costCustomer = 100;
		}
		else if(ageCustomer <15 && ageCustomer > 0) {
			costCustomer = 50;
		}
		else {return 0;}
		return costCustomer;
	}

	public void setCostCustomer(int costCustomer) {
		this.costCustomer = costCustomer;
	}


	@Override
	public int compareTo(Customer o) {
		
		// TODO Auto-generated method stub
		return this.nameCustomer.compareTo(o.nameCustomer);
	}
}
