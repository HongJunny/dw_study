package ������2����;

public class Pizzaȣ�� {

	
	public static void test(Pizza p)
	{
		
	}
	
	
	
	public static void main(String[] args) {

		// Ŭ������ ȣ���ϴ� 3���� ���
		
		// 1. Ŭ������ ȣ���ؼ� ������ �ִ´�.
		Pizza p = new Pizza();
		test(p);  // �����Ű���� main �ȿ� �ۼ��ؾ� �Ѵ�.
		
		// 2. Ŭ������ ������ ���� �ʰ�, ���̷�Ʈ�� �ִ´�.
		test(new Pizza());  // ������� �� �� ��� �� ��� ���� ����.
		
		// 3. null ������ �־��ֱ�.
		Pizza p1 = null;   // ������ ���� ���߿� ȣ���ϰ� ���� �� ���� ���.
		p1 = new Pizza();  
		
		
	}

}
