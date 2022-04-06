package 상속;
 
class Student_A {
	public void 공부하다() {	
		System.out.println("JAVA 공부중");
	}
}

class Student_B {
public void 공부하다() {	
		System.out.println("SQL 공부중");
	}
}

class Student_C {
public void 공부하다() {
	System.out.println("HTML 공부중");
	}
}

public class School {
	
	public static void main(String[] args) {
		
		Student_A A = new Student_A();
		Student_B B = new Student_B();
		Student_C C = new Student_C();
		
		A.공부하다();
		B.공부하다();
		C.공부하다();
		
		
	}

}
