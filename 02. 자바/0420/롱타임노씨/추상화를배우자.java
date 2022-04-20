package 롱타임노씨;

abstract class Chef {  // abstract가 붙으면 'Chef'는 추상 클래스로 변함
					   // '추상메소드 or 일반메소드'를 정의 할 수 있음
	public void 요리를하다() {  // 일반메소드
		
	}
	abstract public void 비법을전수하다();   // 추상메소드
		// 추상메소드는 중괄호가 없음. 목적은 로직구현이 아님
		// 정의만 해 놓고 자식클래스에서 오버라이딩 하는 것이 목적임
	
}

class Food extends Chef {
	// Food가 오버라이딩을 하면, Food 클래스는 인스턴스화(new 호출)를 할 수 있다
	@Override
	public void 비법을전수하다() {  // 이 공간에서 로직구현을 하면 됨
		
	}
	
}

public class 추상화를배우자 {

	public static void main(String[] args) {

		Food f = new Food();
		
	}

}
