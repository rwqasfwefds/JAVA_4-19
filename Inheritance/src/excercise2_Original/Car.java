package excercise2_Original;

public abstract class Car {
//	운전하기 위한 메소드
//	순서 1 : 시동 켜기 메소드
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}

//	순서 2 : 차 몰기 메소드
	public abstract void drive();
//	순서 3 : 차 정지 메소드
	public abstract void stop();

//	순서 4 : 시동 끄기 메소드
	public void endCar() {
		System.out.println("시동을 끕니다.");
	}

//	템플릿 메소드
//	변수 final : 상수
//	메소드 final : 오버라이딩 못하게 막음
	final public void run() {
		startCar(); // 고정
		drive(); // 오버라이딩 메소드
		stop(); // 오버라이딩 메소드
		endCar(); // 고정
	}
}
