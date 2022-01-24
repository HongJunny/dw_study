package 생성자;

public class 학원 {

	// 1. 학원이라는 클래스 생성

	// 2. 필드변수 종류
	//    1 - int 학생수
	//    2 - String 교사이름

	// 3. 생성자 2개 생성 ( 생성자 생성 후 필드변수 초기화
	//    1 - 디폴트 생성자
	//    2 - int와 String을 받는 생성자
	
	int 학생수;    // 필드변수는 디폴트로 0을 자동으로 대입해줌
	String 교사이름;  // String은 null로 대입
	
	
	public 학원() {
		
	}
	
	public 학원(int 학생수, String 교사이름) {
		this.학생수 = 학생수;
		this.교사이름 = 교사이름;
	}
	
	
	
	
}
