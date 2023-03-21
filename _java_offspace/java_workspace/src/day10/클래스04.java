package day10;

public class 클래스04 {

	public static void main(String[] args) {
		// 생성자를 이용하여 객체 생성
		Car c = new Car();
		c.setColor("빨강이");
		c.setAirback(true);
		c.setDoor(4);
		c.carPrint();
		System.out.println(c);
		
		Car c2 = new Car("노랑", 2, false);
		c2.carPrint();
		
	}

}


class Car{
	//맴버변수 : color, door, airback, power, speed
	private String color = "검정";
	private int door=4;;
	private boolean airback=true;
	private boolean power;
	private int speed;
	
	
	//생성자 : 빈생성자 , color(color,door), (color, door, airback) , 전체 생성자
	
	public Car() {
										//빈생성자
	}
	
	public Car(String color) {
		this.color=color;
	}
	
	public Car(String color, int door) {
		//this 맴버변수를 의미
		//맴버변수와 매개변수의 이름이 같을 경우 맴버변수라는 것을 표시하기위해 사용
		this.color = color;
		this.door = door;
	}							//색, 문 생성자
	
	public Car(String color, int door, boolean airback) {
		//생성자 호출
		this(color, door);
		this.airback = airback;
	}							//색, 문, 에어백 생성자
	
	public Car(String color, int door, boolean airback, boolean power, int speed) {
		this.color = color;
		this.door = door;
		this.airback = airback;
		this.power = power;
		this.speed = speed;
	}						//전체 생성자
		
	
	
	//method : print, poweron, poweroff, speedUp, speedDown
	public void carPrint() {
		//맴버변수는 내 클래스에서 모든 메서드에서 공유되는 변수
		//맴버변수를 매개변수로 받을 필요가 없음
		System.out.println("--Mycar--");
		System.out.println("자동차 색 : "+color);
		System.out.println("문의 갯수 : "+door);
		System.out.println("자동차의 현재 속도 : "+speed);
		System.out.println("에어백 유무 : "+airback);
		System.out.println("-------------------------");
	}					// 	Car의 변수들을 보여주는메서드
	
	
	@Override
	public String toString() {
		return "Car [color=" + color + ", door=" + door + ", airback=" + airback + "]";
	}

	public void powerOn() {
		System.out.println("자동차의 전원이 켜졌습니다");
		power=true;
	}
	
	public void powerOff() {
		System.out.println("자동차의 전원 꺼졌습니다");
		power = false;
		speed = 0;
	}
	
	public void speedUP() {
		if(power == true) {
			this.speed = speed + 10; // 자동차의 속도를 10km 증가
			System.out.println("속도 : "+speed);
		}
		else if(power == false) {
			System.out.println("자동차의 시동이 꺼져있습니다.");
		}
	}
	
	public void speedDown() {
		if(speed > 0) {
			this.speed = speed - 10; // 자동차의 속도를 10km 감소
			System.out.println("속도 : "+speed);
		}
		else {
			System.out.println("자동차의 시동이 꺼져있습니다.");
			speed = 0;
		}
	}
	//getter /setter

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getDoor() {
		return door;
	}

	public void setDoor(int door) {
		this.door = door;
	}

	public boolean isAirback() {
		return airback;
	}

	public void setAirback(boolean airback) {
		this.airback = airback;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	
	
	
}