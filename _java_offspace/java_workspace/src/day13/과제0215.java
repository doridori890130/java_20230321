package day13;



public class 과제0215 {

	public static void main(String[] args) {
		/*	TV의 채널은 1~10까지 있음.
		 * 	VOL 0~20까지 있음. 0이되면 음소거 라고 출력
		 * 	VOL 0이하로 내려가지 않음. 20이상 올라가지않음.
		 * 	
		 * */
		Tv2 t2 = new Tv2();
		t2.ch = 19;
		t2.powerOn();
		t2.channelUp();
		t2.channelUp();
		t2.channelUp();
		t2.channelUp();
		t2.channelDown();
		t2.channelDown();
		t2.vol = 19;
		t2.volUp();
		t2.volUp();
		t2.vol=1;
		t2.volDown();
		t2.volDown();
	}

}
interface remocon{
	void powerOn();
	void powerOff();
	void channelUp();
	void channelDown();
	void volUp();
	void volDown();
}

class Tv2 implements remocon{
	boolean power = false;
	int ch = 0;
	int vol = 0 ;
	@Override
	public void powerOn() {
		System.out.println("전원이켜졌습니다");
		power = true;
		
	}
	@Override
	public void powerOff() {
		System.out.println("전원이꺼졌습니다");
		power = false;
		
	}
	@Override
	public void channelUp() {
		if(power) {
			ch++;
			if(ch>10) {
				ch=0;
				System.out.println("channer:"+ch);
			}
		}else {
			System.out.println("전원을 켜주세요");
		}
		
	}
	@Override
	public void channelDown() {
		if(power) {
			ch--;
			if(ch<10) {
				ch=10;
			}
			System.out.println("channer:"+ch);
		}else {
			System.out.println("전원을 켜주세요");
		}
		
	}
	@Override
	public void volUp() {
		if(power) {
			vol++;
			if(ch>20) {
				ch=20;
			}
			System.out.println("vol:"+vol);
		}else {
			System.out.println("전원을 켜주세요");
		}
		
	}
	@Override
	public void volDown() {
		if(power) {
			vol--;
			if(ch<20) {
				ch=0;
				System.out.println("음소거");
			}
			else {
				System.out.println("vol:"+vol);
			}
		}else {
			System.out.println("전원을 켜주세요");
		}
		
		
	}
}