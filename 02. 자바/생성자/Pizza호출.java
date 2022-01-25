package 생성자2일차;

public class Pizza호출 {

	
	public static void test(Pizza p)
	{
		
	}
	
	
	
	public static void main(String[] args) {

		// 클래스를 호출하는 3가지 방법
		
		// 1. 클래스를 호출해서 변수에 넣는다.
		Pizza p = new Pizza();
		test(p);  // 실행시키려면 main 안에 작성해야 한다.
		
		// 2. 클래스를 변수에 넣지 않고, 다이렉트로 넣는다.
		test(new Pizza());  // 디버깅을 할 수 없어서 잘 사용 하지 않음.
		
		// 3. null 데이터 넣어주기.
		Pizza p1 = null;   // 파일을 조금 나중에 호출하고 싶을 때 쓰는 방법.
		p1 = new Pizza();  
		
		
	}

}
