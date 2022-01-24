package 메소드3일차;

public class 클래스호출 {

	
	public static School getSchool(School sch)
	{
		sch.grade = 20;
		sch.등교하다();
		sch.수업듣다();
		return sch;
	}
	
	public static void main(String[] args) {

		School s = new School();
		// new School();
		// new를 이용해서 파일을 불러오면
		// 해당 파일 (School)에 정의된
		// 메소드와 필드변수를 사용할 수 있다.
		
		//s.grade = 10;  // 필드는 호출이 가능함.
		s = getSchool(s);
		System.out.println(s.grade);
		
		
	}

}
