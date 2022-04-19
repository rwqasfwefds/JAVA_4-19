package excercise2;

public class Student {
//	맴버 변수 : 학생 이름, 학년, 학생이 가지고 있는 돈
	private String name;
	private String grade;
	private int money;
	
//	생성자 : 이름과 돈을 초기화
	public Student(String name, int money){
		this.name = name;
		this.money = money;
	}
	
//	메소드(버스타기) : takeBus(Bus bus)
	public void takeBus(Bus bus) {
		bus.take(1000); // 버스 요금 1000원 소비
//		학생 돈 감소
		this.money -= 1000;
	}
	
//	public void takeSubway(Subway subway) {
//		subway.take(1500); // 지하철 요금 1500원 소비
////		학생 돈 감소
//		this.money -= 1500;
//	}
	
	public void showInfor() {
//		잔액 출력 : 학생이름 + "님의 남은 돈은 " + 학생돈 + "입니다"
		System.out.println(this.name + "님의 남은 돈은 " + this.money + "원 입니다.");
	}
}
