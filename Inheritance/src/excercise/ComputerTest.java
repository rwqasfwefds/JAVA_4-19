package excercise;

public class ComputerTest {

	public static void main(String[] args) {
		Computer c1 = new DeskTop();
		Computer c2 = new NoteBook();
		Computer c3 = new WorkStation();
		
//		DeskTop ���
		c1.display(); // ��� : "DeskTop Computer"
		c1.typeing(); // ��� : "DeskTop Typing"
		
		System.out.println("------------");
		
//		NoteBook ���
		c2.display(); // ��� : "NoteBook Computer"
		c2.typeing(); // ��� : "NoteBook Typing"
		
		System.out.println("------------");
		
		c3.display(); // ��� : "WorkStation Computer"
		c3.typeing(); // ��� : "WorkStation Typing"
		
		System.out.println("------------");
	}

}