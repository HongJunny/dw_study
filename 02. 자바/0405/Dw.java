package ���;

public class Dw {

	String name;  // �л� �̸�
	String className;  // ���� �̸�
	int studentCount;  // �л� ��
	
	public Dw() {
		// �����ε������� �޼ҵ� �̸��� �����ص� ��.
		// �Ķ���� ���� �޶��, ������ �޼ҵ� �̸����� ����� ����.
	}
	
	public Dw(String name, String className, int studentCount) {
		// ������ �̸��� Ŭ���� �̸��� �����ؾ� ��
		// return type�� ����.
		this.name = name;
		this.className = className;
		this.studentCount = studentCount;
	}
	
	// 1. �����ڿ� �Ķ���� ���� �ʵ� ���� �ʱ�ȭ
	// getter, setter ���

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
