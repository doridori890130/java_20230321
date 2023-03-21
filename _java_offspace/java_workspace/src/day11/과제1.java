package day11;

import java.util.Scanner;

public class 과제1 {

	public static void main(String[] args) {
		/*	5개의 문자열 배열을 생성한 후, 5개의 파일명을 입력받는 코드를 작성
		 * 	입력받은 파일 중에 이미지 파일을 검색하여 출력하는 코드 작성
		 * 	이미지 파일 형식은 (jpg,png,gif,jpeg)
		 * 	String[] fileName = {"java.txt", "String.jpg", "method.png","spring.pdf"
		 * 						"java.pdf"} 
		 * 
		 * 
		 * ---이미지 파일--
		 * String.jpg
		 * method.png
		 * */
		Scanner scan = new Scanner(System.in);
		String[] fileName = new String[5];
		System.out.println("파일명 5개를 입력해주세요");
		
		for(int i= 0 ; i<fileName.length;i++) {
			fileName[i]= scan.next();
			
			
		}
//		String[] fileName = {"java.txt", "String.jpg", "method.png","spring.pdf"
//				  						,"java.pdf"};
//		
		//파일명에서 확자자만 분리
//		String search = fileName[0].substring(fileName[0].indexOf(".")+1);
//		System.out.println(search);
		String[] img = {"jpg" , "png", "gif","jpeg"};
		
		for(String tmpFile: fileName) {
			String search = tmpFile.substring(tmpFile.indexOf(".")+1);
			if(isContains(img, search)) {
				System.out.println(tmpFile);
			}
		}
		
	}
	
//iscontains(string arr[], string search)
	public static boolean isContains(String arr[], String search) {
		//배열이 없는경우
		if(arr==null || arr.length==0) {
			return false;
		}
		//검색어가 없는경우
		if(search == null) {
			return false;
		}
		
		for(String tmp : arr) {
			if(tmp.equals(search)) {
				return true;
			}
		}
		return false;
		
	}

}
