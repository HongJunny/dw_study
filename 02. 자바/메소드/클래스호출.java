package �޼ҵ�3����;

public class Ŭ����ȣ�� {

	
	public static School getSchool(School sch)
	{
		sch.grade = 20;
		sch.��ϴ�();
		sch.�������();
		return sch;
	}
	
	public static void main(String[] args) {

		School s = new School();
		// new School();
		// new�� �̿��ؼ� ������ �ҷ�����
		// �ش� ���� (School)�� ���ǵ�
		// �޼ҵ�� �ʵ庯���� ����� �� �ִ�.
		
		//s.grade = 10;  // �ʵ�� ȣ���� ������.
		s = getSchool(s);
		System.out.println(s.grade);
		
		
	}

}
