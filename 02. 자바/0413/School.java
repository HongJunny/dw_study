package ���2;

class Study {  // �θ� Ŭ������ �����
	
	public void doSleep() {
		System.out.println("������ �ڴ� zZZ");
	}
	
	public void doStudy(String subjects) {
		System.out.println(subjects+"�� �����ϴ�.");
	}
	
}

class StudentA extends Study {  // StudentA�� �θ� �ٲ��ֱ�
								// �ڽ��� �θ�� ������� �޼ҵ���� ����� ����
								// ��� Ŭ������ Object�� �ڽ��̱� ����.
	// ����� ������ �θ�Ŭ������ �ʵ庯���� �޼ҵ带 ��� ����
	// ��, public�� ����!
	// public void doStudy() {
	// 	System.out.println("CSS�� �����ϴ�.");
	// }
	
}

class StudentB extends Study {
	
	@Override
	public void doStudy(String subjects) {
		System.out.println("�����ϱ� �Ⱦ�� !!!!!!!!!!!!");
	}

}

class StudentC extends Study {
	// @ = ������̼�
	@Override  // �θ� Ŭ������ ���� �޼ҵ带 ���� �ϰ� ������ ���
	public void doSleep() {
		System.out.println("���� ���θ� �մϴ�!!");
	}
}

public class School {

	public static void main(String[] args) {
		
		StudentA a = new StudentA();
		StudentB b = new StudentB();
		StudentC c = new StudentC();
			
		//	a.doStudy();
		//	b.doStudy();
		//	c.doStudy();
		
		// ������ : ���� ����� �ϴ� �޼ҵ尡 �ߺ� ��
		// �ذ�å : ����� �̿� �ؼ� �ߺ� �� �޼ҵ带 ����
		a.doStudy("JS");
		b.doStudy("JAVA");
		c.doStudy("CSS");
		c.doSleep();
		
	}
	
}
