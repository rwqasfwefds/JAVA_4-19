package excercise2;

import java.util.ArrayList;

public class BookTest {

	public static void main(String[] args) {
//		���� �迭 : ArrayList, ���� for�� �ڵ� ����
//		�迭�� ���� : ������ ����
//		Book[] book = new Book[5];
		ArrayList<Book> book = new ArrayList<Book>();
		
//		book[0] = new Book("�¹���", "������");
//		book[1] = new Book("���̾�", "�츣�� ��");
//		book[2] = new Book("��� �� ���ΰ�", "���ù�");
//		book[3] = new Book("����", "�ڰ渮");
//		book[4] = new Book("� ����", "�� �� �㺣��");
		
//		ArrayList �� ����
		book.add(new Book("�¹���", "������"));
		book.add(new Book("���̾�", "�츣�� ��"));
		book.add(new Book("��� �� ���ΰ�", "���ù�"));
		book.add(new Book("����", "�ڰ渮"));
		book.add(new Book("� ����", "�� �� �㺣��"));
		
//		�Ϲ� for ��
//		for(int i = 0; i < book.size(); i++) {
//			Book b = book.get(i);
//			b.showInfo();
//		}
		
//		��� �� for ��
		for(Book b : book) {
			b.showInfo();
		}
	}

}
