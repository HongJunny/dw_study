package test;

import java.util.ArrayList;
import java.util.List;

class Lunch {
	
	private String foodName;

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	
}

class Lunch1 {
	
	private List<String> foodName;

	public List<String> getFoodName() {
		return foodName;
	}

	public void setFoodName(List<String> foodName) {
		this.foodName = foodName;
	}
	
}

public class �������5 {	
	public static void main(String[] args) {
		
		List<Lunch> list = new ArrayList<Lunch>();
		
		// "Į����, ���ٶ�ö��" ��� - (for each ���)		
		Lunch l = new Lunch();
		l.setFoodName("Į����");
		list.add(l);
		
		Lunch l2 = new Lunch();
		l2.setFoodName("���ٶ�ö��");
		list.add(l2);
		
		for (Lunch lunch : list) {
			System.out.print(lunch.getFoodName()+" ");
		}
		System.out.println(" ");
		
		
		
		// "���ٶ�ö��, �쵿" ���
		// set�� list�� �Ѱ���� ��
		List<String> list1 = new ArrayList<String>();
		list1.add("���ٶ�ö��");
		list1.add("�쵿");
		
		Lunch1 lunch1 = new Lunch1();
		lunch1.setFoodName(list1);
		
		for (String foodName : lunch1.getFoodName()) {
			System.out.print(foodName+" ");
		}
		
		
	}
}