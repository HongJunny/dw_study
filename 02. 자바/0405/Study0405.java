package 상속;

class Pizza {   // 클래스 파일을 만들면 디폴트 생성자가 생성 됨
	
	int money;  // 필드변수는 디폴트로 값이 초기화 된 상태
				// int는 0, String은 null
	
	// 자바에서는 호출 할 때, 초기화가 시작 됨.
	
	public int getMoney() {
		
		return 0;
	}
	
	public Pizza() {  //  = 생성자
	//  '생성자'와 '일반함수(메소드)'의 차이 - 면접 질문에 나올수도 있음
	//     생성자는 리턴타입을 정의 하지 않아도 됨
	//     생성자는 리턴이 목적이 아니고, 초기화가 목적임
		
		this.money = 10;   // 전역변수를 불러올때는 앞에 this를 붙임
		
	}
	
}

public class Study0405 {

	public static void main(String[] args) {
		
		Pizza p = new Pizza();   // 객체지향언어 특징
		// 클래스도 데이터 타입
		// () = 생성자(메소드) 호출
		
		// 여기서 쓰는 this는 "Study0405"
		// 자기 자신의 클래스를 의미 함
		
	}

}
