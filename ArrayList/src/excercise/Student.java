package excercise;

import java.util.ArrayList;

public class Student {
	private int studentID;
	private String studentName;
	private ArrayList<Subject> subjectList;
	
//	�Ű����� 2��¥�� ������ ����
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		this.subjectList = new ArrayList<Subject>();
	}
	
//	������ ���� �� �޼ҵ�
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		
//		���� ������ �����ϴ� ������ �ʿ�
//		�Ű����� name�� ���� ��ü�� ����
//		�Ű����� score�� ���� ��ü�� ����
		subject.setName(name);
		subject.setScorePoint(score);
		
		this.subjectList.add(subject); // ���� �迭�� ���� ���� �߰�
	}
	
	public void showStudentinfo() {
//		���� �迭�� �ݺ����� ������ ������ ������ ���
//		1. print ��� : "�л� " + this.studentName + "�� " + �����̸� + "���� ������ " + ���� ���� + " �� �Դϴ�."
//		2. ������ ������ �� ���ؼ� ������ ���
		
//		����
		int total = 0; // ������ ���� �� ����
		
//		���� for�� ��� : ���� ������ �ݺ��ϸ� ����Ѵ�
		for(Subject s : subjectList) {
			System.out.println("�л� " + this.studentName + "�� " + s.getName() + "���� ������ " + s.getScorePoint() + " �� �Դϴ�.");
			
			total += s.getScorePoint();
		}
		System.out.println("�л� " + this.studentName + "�� ������ " + total + "�� �Դϴ�.");
	}

}