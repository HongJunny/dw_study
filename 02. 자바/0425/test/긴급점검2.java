package test;

class Dw {
	String className;
	String studentName;
	public Dw (String className, String studentName) {
		this.className = className;
		this.studentName = studentName;
	}
}


public class �������2 {
	
	public static int getNumber() {
		return 20;
	}
	
	public static Dw printStudent() {
		Dw dw = new Dw("����Ʈ��&�۰���", "ȫ�浿");
		return dw;
	}
	
	public static void main(String[] args) {

		// ��� 1
		Dw dw = printStudent();
		System.out.println(dw.className+", "+dw.studentName);	
		
		// ��� 2
		System.out.println(printStudent().className+", "+printStudent().studentName);
		
		
		System.out.println(getNumber());
		
				
	}

}
