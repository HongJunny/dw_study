package test;

import java.util.ArrayList;
import java.util.List;

class Food {
	private String foodName;

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	
}


public class �������4 {	
	public static void main(String[] args) {
		
		// ���� �̸��� : ī��
		// ���� �̸��� : Į����
		// ���� �̸��� : ��
		
		// ����Ʈ�� ���� �־��ַ��� Food�� ȣ�� �ؾ� ��
		// step 1. list �ȿ� ������ Ÿ�� Ȯ��
		//         List<Food> list = new ArrayList<Food>();
		// step 2. Ŭ���� Ÿ���̸� Ŭ������ ȣ��
		//         Food f = new Food();
		// step 3. ȣ�� �� Ŭ������ list�� ��´�
		//         list.add(f);
		List<Food> list = new ArrayList<Food>();
		
		Food f = new Food();
		f.setFoodName("ī��");
		list.add(f);
		
		Food f2 = new Food();
		f2.setFoodName("Į����");
		list.add(f2);
		
		Food f3 = new Food();
		f3.setFoodName("��");
		list.add(f3);
		
		for (int i=0; i<list.size(); i++) {
			System.out.println("���� �̸���(1) : "+list.get(i).getFoodName());
		}
		
		// for each�� ��� �ϸ�, ���° �ε����� � ���� �ִ��� ã�� �����
		// ã�� �������� ������ ���� �ؼ� !
		int j = 0;
		for (Food food : list) {  // Food food = list.get(0) �� ��������
			++j;
			System.out.println("���� �̸���(2) : "+food.getFoodName());
		}
		
	}
}