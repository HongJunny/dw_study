package 상속2;

class Study {  // 부모 클래스를 만들기
	
	public void doSleep() {
		System.out.println("꿀잠을 자다 zZZ");
	}
	
	public void doStudy(String subjects) {
		System.out.println(subjects+"를 공부하다.");
	}
	
}

class StudentA extends Study {  // StudentA의 부모를 바꿔주기
								// 자식은 부모와 조상들의 메소드까지 사용이 가능
								// 모든 클래스는 Object의 자식이기 때문.
	// 상속을 받으면 부모클래스의 필드변수와 메소드를 사용 가능
	// 단, public일 때만!
	// public void doStudy() {
	// 	System.out.println("CSS를 공부하다.");
	// }
	
}

class StudentB extends Study {
	
	@Override
	public void doStudy(String subjects) {
		System.out.println("공부하기 싫어요 !!!!!!!!!!!!");
	}

}

class StudentC extends Study {
	// @ = 어노테이션
	@Override  // 부모 클래스에 적힌 메소드를 수정 하고 싶을때 사용
	public void doSleep() {
		System.out.println("저는 공부를 합니다!!");
	}
}

public class School {

	public static void main(String[] args) {
		
		StudentA a = new StudentA();
		StudentB b = new StudentB();
		StudentC c = new StudentC();
			
		//	a.doStudy();
		//	b.doStudy();
		//	c.doStudy();
		
		// 문제점 : 같은 기능을 하는 메소드가 중복 됨
		// 해결책 : 상속을 이용 해서 중복 된 메소드를 제거
		a.doStudy("JS");
		b.doStudy("JAVA");
		c.doStudy("CSS");
		c.doSleep();
		
	}
	
}
