package Ex7_10;

public class Dropship extends Unit {

	@Override
	void move(int x, int y) {
		System.out.println("Dropship[x = " + x + ", y = " + y + "]");
	}
	
	void load() {
		System.out.println("���õ� ����� �¿�");
	}
	
	void unload() {
		System.out.println("���õ� ����� ����");
	}

}