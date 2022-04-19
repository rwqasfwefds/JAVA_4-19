package excercise;

public class ComputerTest {

	public static void main(String[] args) {
		Computer c1 = new DeskTop();
		Computer c2 = new NoteBook();
		Computer c3 = new WorkStation();
		
//		DeskTop 출력
		c1.display(); // 출력 : "DeskTop Computer"
		c1.typeing(); // 출력 : "DeskTop Typing"
		
		System.out.println("------------");
		
//		NoteBook 출력
		c2.display(); // 출력 : "NoteBook Computer"
		c2.typeing(); // 출력 : "NoteBook Typing"
		
		System.out.println("------------");
		
		c3.display(); // 출력 : "WorkStation Computer"
		c3.typeing(); // 출력 : "WorkStation Typing"
		
		System.out.println("------------");
	}

}
