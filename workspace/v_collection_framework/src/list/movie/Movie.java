package list.movie;

public class Movie {
	private String title;
	private String director;
	private String genre;
	private double rate;
	
	
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Movie(Movie movie) {
		this(movie.getTitle(),movie.getDirector(), movie.getGenre(),movie.getRate());
	}
	public Movie(String title, String director, String gerne, double rate) {
		super();
		this.title = title;
		this.director = director;
		this.genre = gerne;
		this.rate = rate;
	}


	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getGenre() {
		return genre;
	}
	public void setGerne(String gerne) {
		this.genre = gerne;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	@Override
	public String toString() {
		return "Movie [title=" + title + ", director=" + director + ", gerne=" + genre + ", rate=" + rate + "]";
	}
	
	public boolean equals(String title,String director, String genre) {
		return this.title.equals(title) && this.director.equals(director) && this.genre.equals(genre);
	}
	
}
