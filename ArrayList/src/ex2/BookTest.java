package ex2;

public class BookTest {

	public static void main(String[] args) {
//		�迭�� ���� : ������ ����
		Book[] book = new Book[5];
		
		book[0] = new Book("�¹���", "������");
		book[1] = new Book("���̾�", "�츣�� ��");
		book[2] = new Book("��� �� ���ΰ�", "���ù�");
		book[3] = new Book("����", "�ڰ渮");
		book[4] = new Book("� ����", "�� �� �㺣��");
		
		for(int i = 0; i < book.length; i++) {
			System.out.println("���� = " + book[i].getAuthor() + ", ���� = " + book[i].getBookName());
		}
	}

}