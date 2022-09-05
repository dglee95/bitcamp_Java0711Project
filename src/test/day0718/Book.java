package test.day0718;

public class Book {
	private String bookName;
	private String author;
	
	public Book() {} // 디폴트 생성자
	
	public Book(String bookName, String author) {
		this.bookName=bookName;
		this.author=author;
	}
	
	public String getBookName() { //getter 메서드 변경을 위함
		return bookName;
	}
	
	public String getAuthor() { //getter 메서드 변경을 위함
		return author;
	}
	
	public void setBookName(String bookName) { //setter 메서드 
		this.bookName=bookName;
	}
	
	public void setAuthor(String author) {
		this.author=author;
	}
	
	public void showBookIntfo() {
		System.out.println(bookName+","+author);
	}
	
	
	
	
}
