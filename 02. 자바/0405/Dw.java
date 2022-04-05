package 상속;

public class Dw {

	String name;  // 학생 이름
	String className;  // 과정 이름
	int studentCount;  // 학생 수
	
	public Dw() {
		// 오버로딩때문에 메소드 이름은 동일해도 됨.
		// 파라미터 값이 달라야, 동일한 메소드 이름으로 사용이 가능.
	}
	
	public Dw(String name, String className, int studentCount) {
		// 생성자 이름은 클래스 이름과 동일해야 됨
		// return type이 없다.
		this.name = name;
		this.className = className;
		this.studentCount = studentCount;
	}
	
	// 1. 생성자에 파라미터 없이 필드 변수 초기화
	// getter, setter 사용

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public int getStudentCount() {
		return studentCount;
	}

	public void setStudentCount(int studentCount) {
		this.studentCount = studentCount;
	}

}
