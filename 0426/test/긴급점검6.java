package test;

import java.util.ArrayList;
import java.util.List;

class Movie {
	private String movieName;

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	
}

public class 긴급점검6 {	
	
	public static List<Movie> getMovieList() {
		
		List<Movie> list = new ArrayList<Movie>();
		
		Movie m = new Movie();
		m.setMovieName("로스트시티");
		list.add(m);
		
		Movie m2 = new Movie();
		m2.setMovieName("공기살인");
		list.add(m2);
		
		for (Movie movie : list) {
			System.out.print(movie.getMovieName()+" ");
		}
		
		return list;
	}
	
	public static void main(String[] args) {
		
		// getMovieList()를 이용해서
		// "로스트시티, 공기살인"
		
		// 1. List 데이터 타입 확인
		// 2. 객체 생성
		// 3. add
		// 4. for each
		getMovieList();		
		
	}
}