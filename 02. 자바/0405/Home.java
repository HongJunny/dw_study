package ���;

public class Home {

	public static void main(String[] args) {

		Dw dw = new Dw();
		
		dw.setName("ȫ��ȣ");
		dw.setClassName("������");
		dw.setStudentCount(13);
		
		System.out.println(dw.getName());
		System.out.println(dw.getClassName());
		System.out.println(dw.getStudentCount());
		
		System.out.println(" ");
		
		Dw dw01 = new Dw("ȫ�浿", "����������", 13);
		// �ν��Ͻ�ȭ �ϴ� (������ �ҷ�����)
		System.out.println(dw01.name);
		System.out.println(dw01.className);
		System.out.println(dw01.studentCount);

		// ���� ����ϴ°���. �߿���.
		Dw dw02 = null;
		if(dw02 == null) {
			dw02 = new Dw();
		}
		
	}

}
