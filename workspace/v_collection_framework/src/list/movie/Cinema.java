package list.movie;

import java.util.ArrayList;

import list.task.DBConnecter;

public class Cinema {
	private static final String[] MOVIE_GENRE_CONTNET = { "SF", "다큐", "호러", "고어" };

	
//	영화 추가 
	public void insert(Movie movie) {
		boolean flag = false;
		for (String s : MOVIE_GENRE_CONTNET) {
			if (s.equals(movie.getGenre()))
				flag = true;
		}
		if (flag) {
					DBConnecter.movies.add(new Movie(movie));
				}
			}
//	삭제 
	public void remove(String director, String title, String genre) {
		for(Movie m : DBConnecter.movies) {
			if(m.equals(title, director, genre)) {
				DBConnecter.movies.remove(m);
				break;
			}
		}
	}
//	해당 장르 영화 수 
	public int findCntByGenre(String genre) {
		int cnt = 0;
		for (Movie m : DBConnecter.movies) {
			if (m.getGenre().equals(genre)) {
				cnt++;
			}
		}
		return cnt;
	}
//	특정 평점 이상 
	public ArrayList<Movie> findMoviesByMinRating(double rate) {
		ArrayList<Movie> movies = new ArrayList<>();
		for (Movie m : DBConnecter.movies) {
			if (m.getRate() >= rate) {
				movies.add(new Movie(m));
			}
		}
		return movies;

	}
}
