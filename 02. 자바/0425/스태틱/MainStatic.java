package ����ƽ;

public class MainStatic {

	public static void main(String[] args) {

		StaticStudy s = new StaticStudy();
		s.count++;
		System.out.println(s.count);
		
		StaticStudy s2 = new StaticStudy();
		System.out.println(s2.count);
		
		// ����ƽ���� ���� �� ������ �޼ҵ�� �ν��Ͻ�ȭ�� ���� �ʰ� ����� ������
		System.out.println(StaticStudy.GAMGI);  // GAMGIó�� ���Ÿ�ü�� �� ���¸� ����ƽ.
		
		// Chef.getInstance();  // �ν��Ͻ�ȭ�� �� �޼ҵ带 ����ƽ���� ���� ��.
		Chef c = Chef.getInstance();
		c.printHello();
		
	}

}
