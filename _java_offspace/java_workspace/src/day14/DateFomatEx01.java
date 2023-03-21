package day14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFomatEx01 {

	public static void main(String[] args) throws ParseException {
		/*	날짜를 문자열로 format 설정
		 * 
		 * */
		
		//날짜를 문자열로
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd(E) hh:mm:ss");
		System.out.println(date);
		String dateString = sdf.format(date);
		System.out.println(dateString);
		
		//문자열을 날짜로
		String dateStr = "1989-01-30 08:30:50";
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		Date date2 = sdf2.parse(dateStr);
		System.out.println(date2);
	}

}
