package ex2;

public class BookTest {

	public static void main(String[] args) {
//		배열의 선언 : 공간만 생성
		Book[] book = new Book[5];
		
		book[0] = new Book("태백산맥", "조정래");
		book[1] = new Book("데미안", "헤르만 헷세");
		book[2] = new Book("어떻게 살 것인가", "유시민");
		book[3] = new Book("토지", "박경리");
		book[4] = new Book("어린 왕자", "생 텍 쥐베리");
		
		for(int i = 0; i < book.length; i++) {
			System.out.println("저자 = " + book[i].getAuthor() + ", 제목 = " + book[i].getBookName());
		}
	}

}
