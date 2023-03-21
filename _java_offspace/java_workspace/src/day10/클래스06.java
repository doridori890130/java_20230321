package day10;

public class 클래스06 {

	public static void main(String[] args) {
		/*	final 은 클래스, 변수, 메서ㅡ에 붙일수 있음.
		 * 	final : 수정 할 수 없다.
		 * 	final 맴버 변수 : 상수
		 * 	final 맴버 메서드 : 오버라이딩 할 수 없다.
		 * 	final 클래스 : 상속 할 수 없다. 부모 클래스가 될 수 없다.
		 * 
		 * 	1.명시적 초기화 : 맴버변수 선언과 동시에 초기값 지정
		 * 	2.초기화 블럭: {} 맴버변수 초기화
		 * 	3. 생성자 : 객체를 생성할 때 초기화 해서 생성
		 * 	4. 기본값 > 명시적초기값 > 초기화블럭
		 * */
		EzenStudent es = new EzenStudent("인천점", "김우춘", "빅데이터", "01098765432");
		es.studentPrint();
	}

}

// 맴버변수 : 지점, 이름, 반, 전화번호
// 메서드 : 출력(pirnt) 메서드, tostring가능
//


class EzenStudent{
	//맴버 변수
	private String branch = "인천점";
	private String name = "홍준석";
	private String group = "JAVA";
	private String phoneNumber = "01012345678";
	//생성자
	
	public EzenStudent() {
		
	}
	public EzenStudent(String branch ,String name, String group, String phoneNumber) {
		this.branch = branch;
		this.name = name;
		this.group = group;
		this.phoneNumber = phoneNumber;
	}
	
	public void studentPrint() {
		System.out.println("지   점 : "+branch);
		System.out.println("이   름 : "+name);
		System.out.println("   반   : " +group);
		System.out.println("전화번호 : "+phoneNumber);
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setGroup(String group) {
		this.group = group;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
}