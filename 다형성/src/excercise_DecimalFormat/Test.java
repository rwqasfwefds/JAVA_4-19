package excercise_DecimalFormat;


public class Test {

	public static void main(String[] args) {
		Student james = new Student("james", 5400000);
		Student tomas = new Student("tomas", 50000);
		
		Bus bus100 = new Bus(100); // 100�� ���� ����.
		james.takeBus(bus100); // ���ӽ��� 100�� ������ ž�ϴ�
		tomas.takeBus(bus100); // �丶���� 100�� ������ ž�ϴ�
		
//		�л� ���� ���
		james.showInfor();
		tomas.showInfor();
//		���� ���� ���
		bus100.showInfo();
		
		System.out.println("--------------------------");
		
		Subway subway = new Subway(2);
		james.takeSubway(subway);
		tomas.takeSubway(subway);
		
//		�л� ���� ���
		james.showInfor();
		tomas.showInfor();
//		����ö ���� ���
		subway.showInfo();
	}

}
