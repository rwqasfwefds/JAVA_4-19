package excercise2_Original;

public class CarTest {

	public static void main(String[] args) {
		System.out.println("==== ���� ���� �ϴ� �ڵ��� ====");
//		drive() �޼ҵ�
//		��� 1 : "���� ���� �մϴ�."
//		��� 2 : "�ڵ����� ������ ������ ��ȯ�մϴ�."
//		stop() �޼ҵ�
//		��� : "������ ����ϴ�."
		Car car = new AICar();
		car.run();
		
		System.out.println();
		System.out.println("==== ����� �����ϴ� �ڵ��� =====");
//		drive() �޼ҵ�
//		��� 1 : "����� ���� �մϴ�."
//		��� 2 : "����� �ڵ��� �����մϴ�"
//		stop() �޼ҵ�
//		��� : "�극��ũ�� ����ϴ�."
		Car car2 = new ManualCar();
		car2.run();
	}

}