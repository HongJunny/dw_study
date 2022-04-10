package test;

public class 긴급점검 {

	public static void main(String[] args) {

		String name = "홍길동";
		String name2 = "홍길동";
		boolean isTrue = false;		
		// 1) name과 name2가 같으면 isTrue를 true로 대입
		if (name.equals(name2)) {
			isTrue = true;
		}
		
		int x = 10;
		int y = 12;
		// 2) x와 y가 다르면 isTrue를 false로 대입
		if (x != y) {
			isTrue = false;
		}
		
		// 3) x가 y보다 작으면 isTrue를 true로 대입
		if (x < y) {
			isTrue = true;
		}
		
		// 4) isTrue가 true면 x에 12를 대입
		//    x와 y가 같으면 isTrue를 false로 대입
		if (isTrue) {
			x = 12;
			if (x == y) {
				isTrue = false;
			}
		}	
		
		
		
		
		
		
	}

}
