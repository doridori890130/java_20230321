package day10;

public class 상속01 {

	public static void main(String[] args) {
		/*	 상속: 부모의 것을 자식에게 물려주는 것
		 * 	클래스 상속: 부모 클래스의 맴버 변수/맴버 메서드를 물려주는 것
		 * 	상속을 하는 이유 : 재사용을 해서 중복 코드를 줄이는 것.
		 * 	class A(부모클래스) / class B(자식클래스)
		 * 
		 *  class b extends a{
		 *  
		 *  }
		 *  
		 *  상속 키워드 extends
		 *  
		 *  상속을 받으면 부모의 맴버변수와 메서드를 사용할 수 있다.
		 *  접근제한자 private 은 자식 클래스에서 접근 불가능
		 *  접근제한자 pritected : 상속받는 자식에게 허용하는 제어자
		 * */

		
		
		A a = new A();
		a.setA(10);
		a.print();
		System.out.println("--------------");
		
		B b = new B();
		b.setB(20);
		System.out.println(b.getB());
		b.print();
		b.num=100; // 제어자가 protected이기 때문에 직접 접근 가능
		b.print();
		
	}

}

class A{ //부모 클래스
	private  int a, b, c;
	protected int num; //상속 가능
	
	
	public void print() {
		System.out.println("a:"+a+" b:"+b+" c:"+c);
		System.out.println("num:"+num);
	}
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	
}

class B extends A{			//a,b,c,num,d,e,f 사용가능
	private int d,e,f;

	

//	public void print(){
//		super.print(); // super : 부모의 값을 가져올떄
//		System.out.println("d:"+d+" e:"+e+" f:"+f);
//	}

	@Override
	public void print() {
		
		super.print();
		System.out.println("d:"+d+" e:"+e+" f:"+f);
		
	}

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}

	public int getE() {
		return e;
	}

	public void setE(int e) {
		this.e = e;
	}

	public int getF() {
		return f;
	}

	public void setF(int f) {
		this.f = f;
	}
	
}
