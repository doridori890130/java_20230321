package day15;

public class StringBufferEx {

	public static void main(String[] args) {
		/*	String 객체 : 문자열을 표현
		 *  StringBuffer : 문자열을 추가하거나, 변경할때 주로 사용하는 객체
		 *  append : 문자열 추가 끝에추가
		 *  insert : 특정 위치에 문자열 추가
		 *  substring : 문자열 추출
		 *  
		 * 
		 * */

		StringBuffer sb = new StringBuffer();	//
		sb.append("hellow");
		sb.append(" ");
		sb.append("java");
		
		sb.insert(0, "hi");
		System.out.println(sb.toString());
		String result = sb.toString();
		System.out.println(result);
		
		sb.subSequence(0, 4);
		
		String str = " ";
		str+= "hellow";
		str+= " ";
		str+= "java";
		System.out.println(str);
		
		StringBuilder sb1 = new StringBuilder();
		sb1.append("hello");
		sb1.append(" ");
		sb1.append("js");
		System.out.println(sb1.toString());
			
		
	}

}
