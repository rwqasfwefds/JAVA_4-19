package Ex7_10;

public class Tank extends Unit {

	@Override
	void move(int x, int y) {
		System.out.println("Tank[x = " + x + ", y = " + y + "]");
	}
	
	void changeMode() {
		System.out.println("시즈모드로 변경");
	}

}
