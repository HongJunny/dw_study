package ������;

public class Movie�������� {

	public static void main(String[] args) {
		
		Movie m = new Movie();
		// new : Ŭ���� ȣ��
		// Ŭ�����̸� () : Ŭ���� ������ ȣ��
		m.count = 10;
		System.out.println(m.count);
		System.out.println();
		
		// �����ڰ� �ִ� ���� ȣ��
		Movie m2 = new Movie("���� ����ƿ﷿ �ް��ڽ�");
		System.out.println(m2.location);
		System.out.println(m2.count);
		System.out.println();

	}

}
