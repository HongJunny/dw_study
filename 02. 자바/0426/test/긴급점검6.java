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

public class �������6 {	
	
	public static List<Movie> getMovieList() {
		
		List<Movie> list = new ArrayList<Movie>();
		
		Movie m = new Movie();
		m.setMovieName("�ν�Ʈ��Ƽ");
		list.add(m);
		
		Movie m2 = new Movie();
		m2.setMovieName("�������");
		list.add(m2);
		
		for (Movie movie : list) {
			System.out.print(movie.getMovieName()+" ");
		}
		
		return list;
	}
	
	public static void main(String[] args) {
		
		// getMovieList()�� �̿��ؼ�
		// "�ν�Ʈ��Ƽ, �������"
		
		// 1. List ������ Ÿ�� Ȯ��
		// 2. ��ü ����
		// 3. add
		// 4. for each
		getMovieList();		
		
	}
}