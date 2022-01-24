package 생성자;

public class Movie가져오기 {

	public static void main(String[] args) {
		
		Movie m = new Movie();
		// new : 클래스 호출
		// 클래스이름 () : 클래스 생성자 호출
		m.count = 10;
		System.out.println(m.count);
		System.out.println();
		
		// 생성자가 있는 것을 호출
		Movie m2 = new Movie("대전 현대아울렛 메가박스");
		System.out.println(m2.location);
		System.out.println(m2.count);
		System.out.println();

	}

}
