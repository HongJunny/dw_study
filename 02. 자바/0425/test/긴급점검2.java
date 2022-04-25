package test;

class Dw {
	String className;
	String studentName;
	public Dw (String className, String studentName) {
		this.className = className;
		this.studentName = studentName;
	}
}


public class 긴급점검2 {
	
	public static int getNumber() {
		return 20;
	}
	
	public static Dw printStudent() {
		Dw dw = new Dw("스마트웹&앱과정", "홍길동");
		return dw;
	}
	
	public static void main(String[] args) {

		// 방법 1
		Dw dw = printStudent();
		System.out.println(dw.className+", "+dw.studentName);	
		
		// 방법 2
		System.out.println(printStudent().className+", "+printStudent().studentName);
		
		
		System.out.println(getNumber());
		
				
	}

}
