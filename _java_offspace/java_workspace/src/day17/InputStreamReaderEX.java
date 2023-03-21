package day17;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.print.DocFlavor.INPUT_STREAM;

public class InputStreamReaderEX {

	public static void main(String[] args) {
		// 한글 여러글자를 읽고 출력
		
		System.out.println("한글로 입력해주세요.(ENTER)");
		
		int i ;
		
		//InputStreamREADER
		
		InputStreamReader isr = new InputStreamReader(System.in); 
		try {
			while((i=isr.read()) != '\n') {
				System.out.println((char)i);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
