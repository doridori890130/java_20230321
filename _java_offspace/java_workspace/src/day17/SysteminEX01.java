package day17;

import java.io.IOException;

public class SysteminEX01 {

	public static void main(String[] args) {
		/*	알파벳 하나를 쓰고 Enter를 누르면 알파뱃을 콘솔에 출력
		 * 
		 * */
		
		System.out.println("알파벳 여러개를 쓰고 Enter : ");
		int i;
		try {
			while((i = System.in.read())!='\n') {
			
			System.out.println((char)i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
