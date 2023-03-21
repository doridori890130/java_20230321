package day17;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class BufferedReaderEX02 {

	public static void main(String[] args) throws IOException {
		/*	BufferedReader, PrintWriter
		 * 
		 * 	파일을 읽어들여 복사하여 객체생성
		 * 	out.txt 에서 파일을 읽어서 => out2.txt로 쓰기
		 * */
		
//		BufferedReader br = null;
//		PrintWriter pw = null;
//		
//		final String path_out = "out2.txt";
//		
//		br= new BufferedReader(new FileReader("out.txt"));
//		pw=
		
		
		
		BufferedReader br = 
				new BufferedReader(new FileReader("D:\\_java_offspace\\java_workspace\\out.txt"));
//		PrintWriter pw = 
//				new PrintWriter(new FileWriter("out2.txt",true));
		PrintWriter pw = 
				new PrintWriter(new FileWriter("out2.txt",true));
		
		while(true) {
			String line = br.readLine();
			if(line == null) {
				break;
			}
			System.out.println(line);
			pw.println(line);
		}
		if(br!=null) {
			br.close();
		}
		if(pw!=null) {
			pw.close();
		}
	}

}