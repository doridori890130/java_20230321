package day17;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEX01 {

	public static void main(String[] args) throws IOException {
		/*	문자 기반 스트림
		 * */
		FileWriter fw = new FileWriter("test.txt");
		
		for(int i = 1 ; i<=10 ; i++) {
			String data = i+"test \r\n";  // \r\n
			fw.write(data);
		}
		
		fw.close();
		
		//파일을 추가모드로 열어라("파일명", true)
		FileWriter fw1 = new FileWriter("test.txt", true);
		for(int i= 11 ; i<=20 ; i++) {
			String data = i+"test.txt append1\r\n";
			fw1.write(data);
		}
		
		fw1.close();
	}

}
