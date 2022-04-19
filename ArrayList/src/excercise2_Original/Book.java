package excercise2_Original;


public class Book {
	private String bookName;
	private String author;
	
//	출력 메소드
	public void showInfo() {
		System.out.println("저자 = " + this.author + ", 제목 = " + this.bookName);
	}

//	기본 생성자
	public Book() {
	}

//	매개변수 2개짜리 생성자
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}

//	GetterSetter
	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}
