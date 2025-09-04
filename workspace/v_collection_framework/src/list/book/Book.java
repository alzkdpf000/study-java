package list.book;
/*
 * 도서 제목 (String)
저자 (String)
장르 (소설, 과학, 역사, 자기계발 등)
가격 (int)

 */
public class Book {
	private String title;
	private String author;
	private	String genre;
	private int price;
	
	public Book() {;}
	public Book(Book book) {
		this(book.getTitle(),book.getAuthor(),book.getGenre(),book.getPrice());
	}
	public Book(String title, String author, String genre, int price) {
		super();
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", genre=" + genre + ", price=" + price + "]";
	}
}

