package excercise2;


public class Book {
	private String bookName;
	private String author;
	
//	��� �޼ҵ�
	public void showInfo() {
		System.out.println("���� = " + this.author + ", ���� = " + this.bookName);
	}

//	�⺻ ������
	public Book() {
	}

//	�Ű����� 2��¥�� ������
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