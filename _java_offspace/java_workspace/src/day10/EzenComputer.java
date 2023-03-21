package day10;

public class EzenComputer {
	/* - 학생기본정보 : 이름, 생년월일, 나이, 전화번호
	 * - 학원정보 : 학원이름 ="EZEN" , 지점
	 * - 수강정보 : 수강과목, 기간
	 * 
	 * 홍길동, 990101 , 20 , 010-1111-1111
	 * EZEN, 인천
	 * 자바(6개월), DB(1개월), html(2개월)
	 * - 한명의 학생은 여러과목을 수강할 수 있음.
	 * 과목, 기간 => 배열로 처리 = 5
	 * 
	 * 기능
	 * 학생의 기본정보 출력
	 * 학생의 학원정보 출력
	 * 학생의 수강정보 출력
	 * -학생의 수강정보를 추가하는 기능
	 * */

	private String name;
	private String birth;
	private String age;
	private String phoneNumber; 		//학생수강정보
	
	private static String brand = "EZEN";
	private String gigum;				//학원정보
	
			//수강정보
	
	private String subject[] = new String[5];
	private String period[] = new String[5];	
//	private int cnt; // 수강과목, 수강기간의 index 처리
	//맴버변수
	
	public EzenComputer() {
		
	}
	
	public EzenComputer(String name, String birth,String age,String phoneNumber,String gigum) {
		this.name = name;
		this.birth = birth;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.gigum = gigum;
	}
		
	public EzenComputer(String name, String phoneNumber, String gigum) {
		this.name= name;	
		this.phoneNumber = phoneNumber;
		this.gigum = gigum;
	}
										//생성자
	
	
	public void basicInfomationPrint() {
		System.out.println("학생정보 >");
		System.out.println("이   름 :  "+name);
		System.out.println("생년월일 : "+birth);
		System.out.println("나   이 : "+age);
		System.out.println("전화번호 : "+phoneNumber);
		System.out.println("------------------------");
	}
	

	public void academyInformationPrint() {
		System.out.println("이   름 : "+name);
		System.out.println("학   원 : "+brand);
		System.out.println("지   점 :  "+gigum);
		System.out.println("--------------------");
	}
	
	public void subJectInfomationPrint() {
		System.out.print("과 목 : ");
			for(int i = 0 ; i < this.subject.length ; i++) {  //cnt -> 추가되지 않은 값은 출력 x
				if(subject[i] != null) {
					System.out.print(subject[i]);
					System.out.print("("+period[i]+"), ");
			}else {
				break;
			}
		}
//public void printCourse() {
//	if(course.length == 0 || cnt == 0) {
//		System.out.println("수강이력이 없습니다");
//		return;
//	}
//	for(int i = 0 ; i <cnt ; i++) {
//		System.out.print("과정:"+course[i]+"("+period[i]+")");
//	}
//}
//		public void insertCourse(String course , String period) {
//			this.course[cnt]=course;
//			this.period[cnt]=period;
//			cnt ++;
//		}
		
	}
	
	public void addSubjectInfomation(String subject,String period) {
		for(int i = 0 ; i < this.subject.length; i++) {
			if(this.subject[i] == null) {
				this.subject[i] = subject;
				this.period[i] = period;
				break;
			}
		}
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public static String getBrand() {
		return brand;
	}

	public static void setBrand(String brand) {
		EzenComputer.brand = brand;
	}

	public String getGigum() {
		return gigum;
	}

	public void setGigum(String gigum) {
		this.gigum = gigum;
	}

	public String[] getSubject() {
		return subject;
	}

	public void setSubject(String[] subject) {
		this.subject = subject;
	}

	public String[] getPeriod() {
		return period;
	}

	public void setPeriod(String[] period) {
		this.period = period;
	}
	
			//getter/setter
	
	
}
