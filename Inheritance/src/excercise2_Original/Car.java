package excercise2_Original;

public abstract class Car {
//	�����ϱ� ���� �޼ҵ�
//	���� 1 : �õ� �ѱ� �޼ҵ�
	public void startCar() {
		System.out.println("�õ��� �մϴ�.");
	}

//	���� 2 : �� ���� �޼ҵ�
	public abstract void drive();
//	���� 3 : �� ���� �޼ҵ�
	public abstract void stop();

//	���� 4 : �õ� ���� �޼ҵ�
	public void endCar() {
		System.out.println("�õ��� ���ϴ�.");
	}

//	���ø� �޼ҵ�
//	���� final : ���
//	�޼ҵ� final : �������̵� ���ϰ� ����
	final public void run() {
		startCar(); // ����
		drive(); // �������̵� �޼ҵ�
		stop(); // �������̵� �޼ҵ�
		endCar(); // ����
	}
}