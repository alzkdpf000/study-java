package list.movie;

import list.task.DBConnecter;

public class PageMovie {
	public static void main(String[] args) {
		Movie movie = new Movie();
		Cinema cinema = new Cinema();
		movie.setDirector("타란티노");
		movie.setGerne("호러");
		movie.setRate(3.0);
		movie.setTitle("데쓰 프루프");
		
		cinema.insert(movie); // 미리 넣어두기 
		
		Movie newMovie = new Movie();
		newMovie.setDirector("jack");
		newMovie.setGerne("SF");
		newMovie.setRate(2.5);
		newMovie.setTitle("영화");
		
		Movie errMovie = new Movie();
		errMovie.setDirector("jack");
		errMovie.setGerne("err");
		errMovie.setRate(3.5);
		errMovie.setTitle("영화");
		
		movie.setDirector("copy test");
		cinema.insert(errMovie);
		cinema.insert(newMovie);
		
		System.out.println(DBConnecter.movies);
		System.out.println(cinema.findCntByGenre("SF"));
		
		System.out.println(cinema.findMoviesByMinRating(3));
		
		cinema.remove("jack", "영화", "SF");
		System.out.println(DBConnecter.movies);
		
		System.out.println(DBConnecter.movies);
	}
}
