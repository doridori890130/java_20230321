package day14;

import java.util.Calendar;
import java.util.Date;

public class Date01 {

	public static void main(String[] args) {
		/*	날짜시간클래스
		 * 	Calendar 클래스 사용 => 추상클래스
		 * 	직접 객체를 생성 할수 없음.
		 * 	new 연산자를 통해 객체 구현 x
		 * 	getInstance()을 이요하여 구현한 클래스를 통해 인스턴스를 얻어 옴.
		 * 
		 * 	month : 0월 ~ 11월 => month +1
		 * 	week : 1 = 일, 2 = 월
		 * 	am_pm : am = 0, pm = 1
		 * 	
		 * 
		 * */
//		Date d = new Date();
//		d.getDate(); // depercated : 비권장
//		System.out.println(d.getDate());
		
		Calendar now = Calendar.getInstance();
		
//		int year = now.get(Calendar.YEAR);
//		System.out.println(year);
//		int month = now.get(Calendar.MONTH)+1;
//		System.out.println(month);
//		int day = now.get(Calendar.DAY_OF_MONTH);
//		System.out.println(day);
//		int week = now.get(Calendar.DAY_OF_WEEK);
//		System.out.println(week);
//		
//		System.out.println(year+"-"+month+"-"+day);
//		
//		// hour, minute, second
//		int hour = now.get(Calendar.HOUR);
//		int minute = now.get(Calendar.MINUTE);
//		int second = now.get(Calendar.SECOND);
//		int ampm = now.get(Calendar.AM_PM);
//		if (ampm==0) {
//			System.out.print("Am ");
//		}
//		else if(ampm==1) {
//			System.out.print("PM ");
//		}
//		
//		
//		System.out.println(+hour+"시"+minute+"분"+second+"초");
//		
		//2023-02-17(금)
		//오후 2:42
	int year = now.get(Calendar.YEAR);
	int month = now.get(Calendar.MONTH)+1;
	int day = now.get(Calendar.DAY_OF_MONTH);
	int week = now.get(Calendar.DAY_OF_WEEK);
	int hour = now.get(Calendar.HOUR);
	int minute = now.get(Calendar.MINUTE);
	int second = now.get(Calendar.SECOND);
	int ampm = now.get(Calendar.AM_PM);
	
//	System.out.print(year+"-"+month+"-"+day);
	System.out.printf("%d-%02d-%02d",year,month,day);
	switch(week){
	case 1: System.out.println("(일)");
	break;
	case 2: System.out.println("(월)");
	break;
	case 3: System.out.println("(화)");
	break;
	case 4: System.out.println("(수)");
	break;
	case 5: System.out.println("(목)");
	break;
	case 6: System.out.println("(금)");
	break;
	case 7: System.out.println("(토)");
	break;
	}
	String Ampm = null;
	switch(ampm) {
	case 0 : Ampm = "오전";break;
	case 1 : Ampm = "오후";break;
	}
	
	System.out.printf("%s %02d:%02d:%02d",Ampm,hour,minute,second);
	
	
	}

}
