package studentManager;

public class Subject {
	
	/*
	 * - 과목코드, 과목명, 학점 , 시수, 교수명, 학기, 분류(전공,교양), 수업시간표, 강의실
	 * - 멤버변수 선언, 생성자, getter/setter, 그외 필요한 tostring(print 메서드)
	 * */
	//맴버변수
	private String subCode; // 기본값이 null로들어감
	private String subName;
	private double subCredite;
	private int subTime;
	private String subProfessor;
	private String subSemester;
	private String subCategory;
	private String subScheduler;
	
	//생성자 : 객체를 생성할 때 기본으로 settin 하고자는 하는 값을 미리 입력받아서 객체를 생성
	//생성자는 기본 아무것도 없는 값을 가지고 있음 => 생성자를 추가하지 않는다면 자동 생성
	// 추가 생성자를 만든다면 기본 생성자는 사라짐,(자동생성 하지않음 => 직접 만들어야함)
	public Subject() {}
	
	//과목명만 받는 생성자
	public Subject(String subName) {
		this.subName = subName;
	}
	
	public Subject(String subCode, String subName, double subCreedite) {
		this.subCode = subCode;
		this.subName = subName;
		this.subCredite = subCreedite;
	}

	public Subject(String subCode, String subName, double subCredite, int subTime, String subProfessor,
			String subSemester, String subCategory, String subScheduler) {
		super();
		this.subCode = subCode;
		this.subName = subName;
		this.subCredite = subCredite;
		this.subTime = subTime;
		this.subProfessor = subProfessor;
		this.subSemester = subSemester;
		this.subCategory = subCategory;
		this.subScheduler = subScheduler;
	}

	public String getSubCode() {
		return subCode;
	}

	public void setSubCode(String subCode) {
		this.subCode = subCode;
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	public double getSubCredite() {
		return subCredite;
	}

	public void setSubCredite(double subCredite) {
		this.subCredite = subCredite;
	}

	public int getSubTime() {
		return subTime;
	}

	public void setSubTime(int subTime) {
		this.subTime = subTime;
	}

	public String getSubProfessor() {
		return subProfessor;
	}

	public void setSubProfessor(String subProfessor) {
		this.subProfessor = subProfessor;
	}

	public String getSubSemester() {
		return subSemester;
	}

	public void setSubSemester(String subSemester) {
		this.subSemester = subSemester;
	}

	public String getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}

	public String getSubScheduler() {
		return subScheduler;
	}

	public void setSubScheduler(String subScheduler) {
		this.subScheduler = subScheduler;
	}

	@Override
	public String toString() {
		return "Subject [subCode=" + subCode + ", subName=" + subName + ", subCredite=" + subCredite + ", subTime="
				+ subTime + ", subProfessor=" + subProfessor + ", subSemester=" + subSemester + ", subCategory="
				+ subCategory + ", subScheduler=" + subScheduler + "]";
	}
	
	
	
}
