package ����Ǯ�̿�;

public class Pizzaȣ�� {

	// ����� ��
	// p2 ���� ���� ġ������
	// p2 ���� ���� 20
	// p3 ���� ���� �Ұ������
	// p3 ���� ���� 100
	
	public static Pizza getPizza(Pizza p){
	    //..�ҽ� �ڵ� �ۼ�
		p.�������� = "ġ������";
		p.�������� = 20;	
		
	    return p;
	}

	public static Pizza getPizza(){
	     //..�ҽ� �ڵ� �ۼ�
		Pizza p = new Pizza();
		p.�������� = "�Ұ������";
		p.�������� = 100;
		
	    return p;
	}
		
		
	public static void main(String[] args) {

	        //getPizza���� �޼ҵ� 2���� �̿�����.
	        Pizza p = new Pizza();
	        //p2, p3�� Pizza ������ �ޱ�
	        Pizza p2 = getPizza(p); 
	        Pizza p3 = getPizza();

	        System.out.println("p2 ���� ���� "+p2.��������);
	        System.out.println("p2 ���� ���� "+p2.��������);
	        System.out.println("p3 ���� ���� "+p3.��������);
	        System.out.println("p3 ���� ���� "+p3.��������);
	 

		}
	
}
