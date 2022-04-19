package Ex7_10;

import java.util.ArrayList;

public class Ex7_10 {

	public static void main(String[] args) {
		
//		Unit[] group = {new Marine(), new Tank(), new Dropship()};
		
//		for(int i = 0; i < group.length; i++) {
//			group[i].move(100, 200);
//		}
		
		ArrayList<Unit> unit = new ArrayList<Unit>();
		
		unit.add(new Marine());
		unit.add(new Tank());
		unit.add(new Dropship());
		
		for(Unit u : unit) {
			u.move(100, 200);
		}
		
	}

}
