package excercise_DecimalFormat;

import java.text.DecimalFormat;

public class Bus {
	DecimalFormat formatter = new DecimalFormat("###,###");
//	��� ���� : ���� ��ȣ, �°� ��, ���� ����
	private int number;
	private int passenger;
	private int money;
	
//	�Ű����� 1��¥�� ������ : ������ȣ
	public Bus(int number) {
		this.number = number;
	}
	
//	�°��� �� ���� �޴� �޼ҵ�
	public void take(int money) {
//		���� �� ����
		this.money += money;
//		�°� �� ����
		++this.passenger;
	}
	
//	������ �°����� ���� �ܾ��� ���
	public void showInfo() {
//		��� : "���� " + ������ȣ + "���� �°���" + �°��� + "���̰�, ������ " + �������� + "�� �Դϴ�."
		System.out.println("����" + this.number + "���� �°��� " + this.passenger + "���̰�, ������ " + formatter.format(this.money) + "�� �Դϴ�.");
	}
}
