package �÷�����;

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

		Student s1 = new Student("ȫ�浿", 26, "�λ�");
		System.out.println(s1.name);
		
		// �ǹ����� ���� ����ϴ� ���
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(s1);  // Student Ŭ���� �߰�
		list.get(0);   // Student Ŭ���� ȣ��
		String name = list.get(0).name;
		int age = list.get(0).age;
		String addr = list.get(0).addr;
		System.out.println(name);
		System.out.println(age);
		System.out.println(addr);
		
		int age1 = list.get(0).getAge();  // Student Ŭ������ �޼ҵ� ȣ��
		System.out.println(age1);
		list.get(0).setAge(33);
		age1 = list.get(0).getAge();
		System.out.println(age1);
		
	}

}
