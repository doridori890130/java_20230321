package day10;

public class product {
	
	private String name;
	private String price;
	int cnt = 0;
							//맴버변수
	public product(){
		
	}						//생성자
	
	public product(String name, String price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "product [name=" + name + ", price=" + price + "]";
	}
	
	public void productPrint() {
		System.out.print("이름 : "+name);
		System.out.println(" 가격 : "+price);
	}

	
	public void insertProduct(String name, String price) {
		this.name = name;
		this.price = price;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public int getCnt() {
		return cnt;
	}



}
