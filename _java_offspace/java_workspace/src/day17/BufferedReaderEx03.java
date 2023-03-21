package day17;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class BufferedReaderEx03 {

	public static void main(String[] args) throws IOException {
		/*	out.txt파일을 읽어들여 map에 저장 후
		 * 	이름 : 함수
		 * 	총 합계 총인원 출력
		 * */
		
		BufferedReader br = new BufferedReader(new FileReader("out.txt"));
		HashMap<String,Integer> map = new HashMap<>();
		int sum=0;
		
		
		while(true) {
			String line = br.readLine();
			if(line == null) {
				break;
			}
			String name = line.substring(0, line.indexOf(" "));
			int score = Integer.parseInt(line.substring(line.lastIndexOf(' ')+1));
			map.put(name, score);
			}
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String name = it.next();
			int score = map.get(name);
			System.out.println("이름:"+name+" 점수:"+score);
			sum=sum+score;
			
			
			
		}
		System.out.println("총합 : "+sum);
		System.out.println("인원 : "+map.size());
		if(br!=null) {
			br.close();
		}
	}

}
