package 클래스;

public class 이태원클라스 {

	// 총 이태원클라스는 필드(전역)변수 2개와 메소드 1개가 구성됨.
	// 필드변수가 2개
	// 실무에서는 필드변수를 private으로 함.
	String 주인공;
	String 동료;
	// 메소드가 1개
	public void 학교를때려치다(String name)
	{
		this.주인공 = name;  // 필드변수를 불러와서 쓸때는
		                   // 앞에 'this.'를 써야 함.
		                   // this가 붙은 변수는 필드변수라서
		                   // 코드가 길어졌을때 쉽게 찾을 수 있음.
		System.out.println(name+"(이)가 학교를 나갔습니다..");
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
