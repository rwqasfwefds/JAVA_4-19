package excercise2;

//	Strategy를 사용하는 클래스
public class Soldier {
//	다형성 형태
	void runContext(Strategy strategy) {
		System.out.println("전투 시작");
		strategy.runStrategy();
		System.out.println("전투 종료");
	}
}
