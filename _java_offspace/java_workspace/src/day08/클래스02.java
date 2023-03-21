package day08;

public class 클래스02 {

	public static void main(String[] args) {
		/* 자동차 클래스 생성
		 * 맴버변수 : color, power, speed
		 * 메서드 : poweron, poweroff, speedUp +10, speedDown -10
		 * 맴버변수 : private
		 * 맴버변수를 확인/수정 => getter/setter 필요
		 * power = > true , false
		 * 
		 */
		Car c = new Car();
		System.out.println(c.getColor());
		System.out.println(c.getSpeed());
		System.out.println(c.isPower());
		c.setColor("노랑");
		System.out.println(c.getColor());
		c.powerOn();
		c.speedUp();
		c.poweroff();
		c.speedUp();
		c.powerOn();
		c.speedDown();
		Car c2 = new Car();
		c2.getColor();
		System.out.println(c2.getColor());
		c2.powerOn();
		System.out.println(c2.getSpeed());
		c2.setColor("초록");
		System.out.println(c2.getColor());
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		
		c.powerOn();

	}

}

class Car{
	
	//멤버변수 선언
	private String color= "검정";  // null
	private int door;
	private boolean power;		//false
	private int speed;			// 0
	
	// 생성자 : 없으면 기본생성자가 자동 추가된다.
	// 생성자 위치(생성자의 접근제한자는 public)
	public Car(String color,int door) {
		this.color=color;
		this.door=door;
	}
	
	public Car() {} // 기본생성자
					// 생성자 오버로딩
	
	
	//맴버 메서드
	public void powerOn() {
		System.out.println("전원이 켜졌습니다.");
		power = true;
	}
	
	public void poweroff() {
		System.out.println("전원이 꺼졌습니다");
		power = false;
		speed = 0;
	}
	
	public void speedUp() {
		if(power==true) {
			speed = speed +10;
			System.out.println("속도 : "+speed);
			}
		else if(power==false) {
			System.out.println("시동을 켜주세요");
		}
	}
	
	public void speedDown(){
		if(speed > 0) {
			speed = speed -10;
			System.out.println("속도 : "+speed);
		}
		else {
			System.out.println("차가멈춰있습니다");
			speed=0;
		}
	}
	
	//getter // setter
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
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
	
	public int getDoor() {
		return door;
	}
	public void setDoor(int door) {
		this.door = door;
	}
}