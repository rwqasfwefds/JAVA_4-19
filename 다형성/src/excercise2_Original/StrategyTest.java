package excercise2_Original;

public class StrategyTest {

	public static void main(String[] args) {
		Strategy strategy = null;
		Soldier rambo = new Soldier();
		
//		디자인 패턴 : 전략(Strategy)패턴
//		1. GoF 디자인 패턴 중 하나 : Spring에서도 사용 됨
//		2. 간단히 말해서 객체가 할 수 있는 행위들 각각을 전략으로 만들어 놓고,
//		동적으로 행위의 수정이 필요한 경우 전략을 바꾸는 것만으로 행위의 수정
//		3. 직접 행위를 수정하지 않고 매개변수로 전달하므로 기존 코드 수정이 없음
		
		
//		총을 람보에게 전달해서 전투를 수행하게 만드는 부분
		strategy = new StrategyGun(); // 출력 : "탕, 타당, 타다당"
		rambo.runContext(strategy);
		
		System.out.println("------------------");
		
//		검을 람보에게 전달해서 전투를 수행하게 만드는 부분
		strategy = new StrategySword(); // 출력 : "챙, 채챙, 채채챙"
		rambo.runContext(strategy);
		
		System.out.println("------------------");
		
//		활을 람보에게 전달해서 전투를 수행하게 만드는 부분
		strategy = new StrategyBow(); // 출력 : "슉, 슈슉, 슈슈슉"
		rambo.runContext(strategy);
	}

}
