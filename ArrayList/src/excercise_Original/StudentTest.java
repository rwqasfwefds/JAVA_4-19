package excercise_Original;

public class StudentTest {

	public static void main(String[] args) {
		Student lee = new Student(1001, "Lee");
		Student kim = new Student(1002, "Kim");
		
//		Lee�� ���� ������ �߰� : ���� �迭�� ��
		lee.addSubject("����", 100);
		lee.addSubject("����", 50);
		
//		Kim�� ���� ������ �߰� : ���� �迭�� ��
		kim.addSubject("����", 70);
		kim.addSubject("����", 85);
		kim.addSubject("����", 100);
		
//		�� �л��� ���� ������ ������ ���
		lee.showStudentinfo();
		System.out.println("----------------");
		kim.showStudentinfo();
	}

}
