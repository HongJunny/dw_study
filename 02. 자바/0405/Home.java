package 상속;

public class Home {

	public static void main(String[] args) {

		Dw dw = new Dw();
		
		dw.setName("홍준호");
		dw.setClassName("웹개발");
		dw.setStudentCount(13);
		
		System.out.println(dw.getName());
		System.out.println(dw.getClassName());
		System.out.println(dw.getStudentCount());
		
		System.out.println(" ");
		
		Dw dw01 = new Dw("홍길동", "반응형개발", 13);
		// 인스턴스화 하다 (파일을 불러오다)
		System.out.println(dw01.name);
		System.out.println(dw01.className);
		System.out.println(dw01.studentCount);

		// 자주 사용하는것임. 중요함.
		Dw dw02 = null;
		if(dw02 == null) {
			dw02 = new Dw();
		}
		
	}

}
