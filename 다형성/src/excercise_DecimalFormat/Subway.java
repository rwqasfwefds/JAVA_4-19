package excercise_DecimalFormat;

import java.text.DecimalFormat;

public class Subway {
	DecimalFormat formatter = new DecimalFormat("###,###");
//	맴버 변수 : 지하철 노선번호, 승객수, 지하철 수입
	private int number;
	private int passenger;
	private int money;
	

//	매개변수 1개짜리 생성자 : 매개변수로 지하철 노선번호 들어오게금
	public Subway() {
	}

	public Subway(int number) {
		this.number = number;
	}

//	take() 메소드 추가 : 지하철 수입을 매개변수로 넣으셈
//	메소드 내용 : 수입 증가, 승객수 증가
	public void take(int money) {
		this.money += money;
		this.passenger++;
	}

//	showInfo()메소드로 출력하셈 : 지하철 노선 번호 + "의 승객은 " + 승객 수 + "명 이고, 수입은 " + 수입 + "원 입니다"
	public void showInfo() {
		System.out.println(this.number + "호선의 승객은 " + this.passenger + "명 이고, 수입은 " + formatter.format(this.money) + "원 입니다");
	}
}
