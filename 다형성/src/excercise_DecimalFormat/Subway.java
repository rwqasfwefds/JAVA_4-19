package excercise_DecimalFormat;

import java.text.DecimalFormat;

public class Subway {
	DecimalFormat formatter = new DecimalFormat("###,###");
//	�ɹ� ���� : ����ö �뼱��ȣ, �°���, ����ö ����
	private int number;
	private int passenger;
	private int money;
	

//	�Ű����� 1��¥�� ������ : �Ű������� ����ö �뼱��ȣ �����Ա�
	public Subway() {
	}

	public Subway(int number) {
		this.number = number;
	}

//	take() �޼ҵ� �߰� : ����ö ������ �Ű������� ������
//	�޼ҵ� ���� : ���� ����, �°��� ����
	public void take(int money) {
		this.money += money;
		this.passenger++;
	}

//	showInfo()�޼ҵ�� ����ϼ� : ����ö �뼱 ��ȣ + "�� �°��� " + �°� �� + "�� �̰�, ������ " + ���� + "�� �Դϴ�"
	public void showInfo() {
		System.out.println(this.number + "ȣ���� �°��� " + this.passenger + "�� �̰�, ������ " + formatter.format(this.money) + "�� �Դϴ�");
	}
}
