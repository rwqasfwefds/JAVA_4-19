package Ex7_10;

public class Marine extends Unit {

	@Override
	void move(int x, int y) {
		System.out.println("Marine[x = " + x + ", y = " + y + "]");
	}
	
	void stimPack() {
		System.out.println("???̾?~");
	}

}
