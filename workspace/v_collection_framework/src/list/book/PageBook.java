package list.book;

import java.util.ArrayList;

import list.task.DBConnecter;

public class PageBook {
	public static void main(String[] args) {

		Book book = new Book(); // 기존에 존재하는 메소드
		Library library = new Library();
		book.setTitle("데미안");
		book.setAuthor("헤르만 헤세");
		book.setGenre("소설");
		book.setPrice(12000);
		
		library.insert(book); // 미리넣기 

		Book newBook = new Book();
		newBook.setTitle("title");
		newBook.setAuthor("author");
		newBook.setGenre("소설");
		newBook.setPrice(100000);

		Book newBook1 = new Book();
		newBook1.setTitle("title");
		newBook1.setAuthor("author");
		newBook1.setGenre("에러");
		newBook1.setPrice(100000);

		book.setAuthor("asdasd"); // 얕은 복사로 바뀌지 않음
		library.insert(newBook); // 이거는 추가됨
		library.insert(newBook1); // 이거는 추가 안됨 장르가 포함되지 않아서

		System.out.println(DBConnecter.books);

		System.out.println(library.findGenreByTitle("title"));
		System.out.println(library.findTitleByAuthor("author"));

		library.updateGenre("title", "과학");
		System.out.println(library.findGenreByTitle("title"));

		ArrayList<String> genres = Library.getBookGenreContent();
		int[] arCnt = library.findCntByGenre();
		for (int i = 0; i < genres.size(); i++) {
			System.out.println(genres.get(i) + " : " + arCnt[i]+"개");  
		}

	}
}
