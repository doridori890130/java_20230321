package day12;

public class 과제 {

	public static void main(String[] args) {
		/*	TV의 채널은 1~10까지 있음.
		 * 	VOL 0~20까지 있음. 0이되면 음소거 라고 출력
		 * 	VOL 0이하로 내려가지 않음. 20이상 올라가지않음.
		 * 	
		 * */
			Tv1 t = new Tv1();
			t.ch = 19;
			t.powerOn();
			t.channelUp();
			t.channelUp();
			t.channelUp();
			t.channelUp();
			t.channelDown();
			t.channelDown();
			t.vol = 19;
			t.volUp();
			t.volUp();
			t.vol=1;
			t.volDown();
			t.volDown();
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

class Tv1 implements remocon{
	boolean power = false;
	int ch = 0;
	int vol = 0 ;
	
	@Override
	public void powerOn() {
		System.out.println("전원이 켜졌습니다");
		power = true;
		
	}

	@Override
	public void powerOff() {
		System.out.println("전원이 꺼졌습니다.");
		power = false;
	}

	@Override
	public void channelUp() {
		if(power) {
			if(ch>=0 && ch<10) {
				ch++;
				System.out.println("채널 : "+ch);
			}
			else if(ch >=10){
				ch = 0;
				System.out.println("채널 : "+ch);
			}
		}
		else {System.out.println("전원이 꺼져있습니다");}
	}

	@Override
	public void channelDown() {
		if(power) {
			if(ch>0 && ch<=10) {
				ch--;
				System.out.println("채널 : "+ch);
			}
			else if(ch<=0){
				ch = 10;
				System.out.println("채널 : "+ch);
			}
		}
		else {System.out.println("전원이 꺼져있습니다");}
		
	}

	@Override
	public void volUp() {
		if(power) {
			if(vol>=0 && vol<20) {
				vol++;
				System.out.println("소리 : "+vol);
			}
			else if(vol>=20){
				vol = 20;
				System.out.println("크기를 더이상 키울수 없습니다");
			}
		}
		else {System.out.println("전원이 꺼져있습니다");}
		
	}

	@Override
	public void volDown() {
		if(power) {
			if(vol>0 && vol<=20) {
				vol--;
				if(vol<=0) {
					System.out.println("음소거");
				}
				else {System.out.println("소리 : "+vol);}
			}
			else if(vol<=0){
				vol = 0;
				System.out.println("음소거");
			}
		}
		else {System.out.println("전원이 꺼져있습니다");}
		
	}
	
}