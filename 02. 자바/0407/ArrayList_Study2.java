package 컬렉션즈;

import java.util.ArrayList;

class Student {
	String name;
	int age;
	String addr;
	
	public Student() {
		
	}
	
	public Student(String name, int age, String addr) {
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
}

public class ArrayList_Study2 {

	public static void main(String[] args) {

		Student s1 = new Student("홍길동", 26, "부산");
		System.out.println(s1.name);
		
		// 실무에서 자주 사용하는 방법
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(s1);  // Student 클래스 추가
		list.get(0);   // Student 클래스 호출
		String name = list.get(0).name;
		int age = list.get(0).age;
		String addr = list.get(0).addr;
		System.out.println(name);
		System.out.println(age);
		System.out.println(addr);
		
		int age1 = list.get(0).getAge();  // Student 클래스의 메소드 호출
		System.out.println(age1);
		list.get(0).setAge(33);
		age1 = list.get(0).getAge();
		System.out.println(age1);
		
	}

}
