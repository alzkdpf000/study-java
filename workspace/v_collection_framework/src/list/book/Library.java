package list.book;

import java.util.ArrayList;

import list.task.DBConnecter;

/*
 * 
 *  클래스: Library
도서 추가
제목으로 장르 조회
작가가 쓴 책 제목 조회 
장르 수정 후 가격 5% 할인
장르별 도서 개수 조회
 */
public class Library {

	private static final String[] BOOK_GENRE_CONTENT = { "소설", "과학", "역사", "자기계발" };
	
	
//	이거는 질문 
	public static ArrayList<String> getBookGenreContent() {
		ArrayList<String> bookGenres = new ArrayList<String>(); 
		for(String s : BOOK_GENRE_CONTENT) {
		
			bookGenres.add(new String(s));
		}
	    return bookGenres; // 복사본 반환
	} 
	
//	책 추가하기
	public void insert(Book book) {
		boolean flag = false;
		for (String s : BOOK_GENRE_CONTENT) {
			if (s.equals(book.getGenre()))
				flag = true;
		}
		if (flag) {
					DBConnecter.books.add(new Book(book));
			}
	}

//	제목으로 장르찾기
	public ArrayList<Book> findGenreByTitle(String title) {
		ArrayList<Book> books = new ArrayList<>();
		for (Book b : DBConnecter.books) {
			if (b.getTitle().equals(title)) {
				books.add(new Book(b));
			}
		}
		return books;
	}
//	저자가 쓴 책 제목들 찾기 
	public ArrayList<String> findTitleByAuthor(String author) {
		ArrayList<String> titles = new ArrayList<>();

		for (Book b : DBConnecter.books) {
			if (b.getAuthor().equals(author)) {
				titles.add(b.getTitle());
			}
		}
		return titles;
	}
//	장르를 업데이트 후 가격 할인 
	public void updateGenre(String title, String genre) {
		for (Book b : DBConnecter.books) {
			if (b.getTitle().equals(title)) {
				b.setPrice((int) (b.getPrice() * 0.95));
				b.setGenre(genre);
			}
		}
	}
//	장르별 책의 권 수를 찾기 
	public int[] findCntByGenre() {
		int[] arCnt = new int[BOOK_GENRE_CONTENT.length];
//		for(String s : BOOK_GENRE_CONTNET) {
//			for (Book b : DBConnecter.books) {
//				if(s.equals(b.getGenre())) {
//					int[]
//				}
//			}
//		}

		for (int i = 0; i < BOOK_GENRE_CONTENT.length; i++) {
			for (int j = 0; j < DBConnecter.books.size(); j++) {
				if (BOOK_GENRE_CONTENT[i].equals(DBConnecter.books.get(j).getGenre())) {
					arCnt[i] += 1;
				}
			}
		}

		return arCnt;
	}
}
