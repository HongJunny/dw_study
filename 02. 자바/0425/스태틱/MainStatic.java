package 스태틱;

public class MainStatic {

	public static void main(String[] args) {

		StaticStudy s = new StaticStudy();
		s.count++;
		System.out.println(s.count);
		
		StaticStudy s2 = new StaticStudy();
		System.out.println(s2.count);
		
		// 스태틱으로 선언 된 변수와 메소드는 인스턴스화를 하지 않고도 사용이 가능함
		System.out.println(StaticStudy.GAMGI);  // GAMGI처럼 이탤릭체로 된 상태면 스태틱.
		
		// Chef.getInstance();  // 인스턴스화가 된 메소드를 스태틱으로 공유 함.
		Chef c = Chef.getInstance();
		c.printHello();
		
	}

}
