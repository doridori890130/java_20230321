package studentManager;

import java.util.Scanner;


public class ProgramManager implements Program {

	
	// 맴버 변수 student class , stdCount 변수
	
	private Student[] std = new Student[10];
	private int stdCount; // 등록한 학생 카운트
	
	
	
	
	@Override
	public void printStudent() {
		// TODO Auto-generated method stub
		for(int i = 0; i<stdCount ; i++) {
			//std[i].stdPrint();
			printStudentOne(std[i]);
		}
	}

	@Override
	public void insertStudent(Scanner scan) {
		// 1명의 힉생정보 값을 입력받아 객체를 생성한 후 std 배열에 등록(그래야 저장)
		// 학번, 이름, 주민번호, 학부 , 학과
		
		System.out.println("--학생정보 입력--");
		System.out.println("이름>");
		String name = scan.next();
		System.out.println("학번>");
		String sNum = scan.next();
		System.out.println("주민번호>");
		String rNum = scan.next();
		System.out.println("학부>");
		String faculy = scan.next();
		System.out.println("학과>");
		String major = scan.next();
		System.out.println("-----------------");
		
		//입력받은 값으로 객체를 생성
		Student s = new Student(sNum,name,rNum,faculy,major);
		//배열이 다 찼다면 더 큰 배열을 생성 후 배열복사
		if(stdCount == std.length) {
			//new 를 이용 배열생성 (신 배열을 생성)
			 Student[] stdTmp = new Student[std.length+5];
			//arraycopy를 이용한 배열복사
			 
			//system.arraycopy(구배열, 시작번지, 신배열, 시작번지, 총개수)
			System.arraycopy(std, 0, stdTmp, 0, stdCount);
			//새로만든 배열로 연결
			std = stdTmp;
		}
		
		//std 배열에 등록
		std[stdCount]=s;
		stdCount++;
		
		
	}

	@Override
	public void searchStudent(Scanner scan) {
		// 검색할 학생이름을 입력받아 배열에서 탐색 후 있다면
		// 학생정보 +수강정보 출력 => printStudentOne() 호출
		System.out.println("검색할 학생 이름>");
		String name = scan.next();
		int index = -1;
		for(int i = 0 ; i < stdCount; i++) {
			if(std[i].getStdName().equals(name)) {
				printStudentOne(std[i]);
				index = i;
			}
			
		}
		if(index ==-1) {
			System.out.println("학생정보가 없습니다");
			return;
		}
	}

	@Override
	public void registerSubject(Scanner scan) {
		// 수강신청자를 하고자하는 이름 / 학번 입력받기
		// 그 학생의 배열에 위치 체크
		// 학번이 없다면...
		// 신청할  과목의 객체 생성(과목정보 입력받기)
		// 신청메서드 호출 insertSubject(객체)
		
		System.out.println("신청자이름>");
		String registerName = scan.next();
		System.out.println("신청자학번>");
		String registersNum = scan.next();
		
		
		
		int index = -1;
		for(int i = 0 ; i < stdCount ; i++) {
			if(std[i].getStdName().equals(registerName) && std[i].getStdNum().equals(registersNum) ) {
				index = i;
				break;
			}
			
		}
		if(index == -1) {
			System.out.println("신청자의 이름과 학번이 맞지않습니다");
		}
		else {
			System.out.println("수강할 과목을 입력해주세요>");
			String registerSub = scan.next();
			Subject Subj = new Subject(registerSub);
			
			std[index].insertSubject(Subj);
		}
		
		
	}

	@Override
	public void deleteSubject(Scanner scan) {
		// TODO Auto-generated method stub
		int index = -1;
		System.out.println("신청자이름>");
		String deleteName = scan.next();
		System.out.println("신청자학번>");
		String deletesNum = scan.next();
		for(int i = 0 ; i < stdCount ; i++) {
			if(std[i].getStdName().equals(deleteName) && std[i].getStdNum().equals(deletesNum) ) {
					index = i;
					break;
				}
			}
		if(index == -1) {
			System.out.println("신청자의 이름과 학번이 맞지않습니다.");
			return;
		}
		else {
			System.out.println("삭제할 과목을 입력해주세요>");
			String deleteSub = scan.next();
			std[index].deleteSubject(deleteSub);
			System.out.println("과목이삭제되었습니다.");
			}
	}

	// 1명의 학생정보+수강정보를 같이 출력하고 싶을 때
	
	public void printStudentOne(Student s) {
		System.out.println("--- 학생정보 ---");
		s.stdPrint();
		System.out.println("--- 수강정보 ---");
		s.subPrint();
	}
	
	
}
