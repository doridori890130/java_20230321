package day11;

public class product {
	
	private String name;
	private int price;
	
	public product() {
		
	}
	
	public product(String name, int price) {
		this.name=name;
		this.price=price;
	}
	
	
	public void insertProduct(String name, int price) {
		this.name=name;
		this.price=price;
	}
	
	
	

	@Override
	public String toString() {
		return "product [name=" + name + ", price=" + price + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}


	
	

}
