package day10;

public class EzenComputermain {

	public static void main(String[] args) {
		EzenComputer ec = new EzenComputer("홍길동", "990101", "20", "01011111111", "인천");
		
		ec.addSubjectInfomation("java", "2개월");
		
		ec.academyInformationPrint();
		ec.basicInfomationPrint();
		
		
		ec.addSubjectInfomation("db", "3개월");
		ec.subJectInfomationPrint();
		
		/*	배열로 5명의 학생을 등록 후
		 *  - 학생 이름으로 검색 -> 개인정보 출력
		 *  - 지점명으로 검색 -> 
		 * */
		EzenComputer[] std = new EzenComputer[5];
		std[0] = new EzenComputer("홍길동", "01045679874", "인천");
		std[1] = new EzenComputer("홍길순", "01023239874", "서울");
		std[2] = new EzenComputer("강감찬", "0102342339874", "인천");
		std[3] = new EzenComputer("유관순", "01023423439874", "인천");
		std[4] = new EzenComputer("홍길동", "010232123455", "서울");
		
		String serchName = "홍길동"; // 홍길동이 상담받은 지점정보 출력/ 개인정보 출력
		System.out.println();
	System.out.println("홍길동 검색결과---------");
		for(int i = 0; i < std.length ; i++) {
			if(std[i].getName().equals(serchName)) {
				std[i].basicInfomationPrint();
				std[i].academyInformationPrint();
			}
		}
		System.out.println("인천 지점 검색결과----------");
		String serchBranch = "인천"; // 지점정보/ 개인정보 출력
		for(int i = 0; i < std.length ; i++) {
			if(std[i].getGigum().equals(serchBranch) ) {
				std[i].basicInfomationPrint();
				std[i].academyInformationPrint();
			}
		}	

	}

}
