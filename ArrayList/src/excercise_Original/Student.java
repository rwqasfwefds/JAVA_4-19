package excercise_Original;

import java.util.ArrayList;

public class Student {
	private int studentID;
	private String studentName;
	private ArrayList<Subject> subjectList;
	
//	매개변수 2개짜리 생성자 정의
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		this.subjectList = new ArrayList<Subject>();
	}
	
//	과목을 저장 할 메소드
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		
//		과목에 정보를 저장하는 로직이 필요
//		매개변수 name을 과목 객체에 저장
//		매개변수 score를 과목 객체에 저장
		subject.setName(name);
		subject.setScorePoint(score);
		
		this.subjectList.add(subject); // 향상된 배열에 과목 정보 추가
	}
	
	public void showStudentinfo() {
//		향상된 배열을 반복문을 돌려서 정보를 꺼내서 출력
//		1. print 출력 : "학생 " + this.studentName + "의 " + 과목이름 + "과목 성적은 " + 과목 점수 + " 점 입니다."
//		2. 과목의 점수를 다 더해서 총점을 출력
		
// 		총점을 저장 할 변수
		
//		향상된 for문 사용 : 과목 점수를 반복하며 출력한다
	}

}
