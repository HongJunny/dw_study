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

public class 긴급점검5 {	
	public static void main(String[] args) {
		
		List<Lunch> list = new ArrayList<Lunch>();
		
		// "칼국수, 스바라시라멘" 출력 - (for each 사용)		
		Lunch l = new Lunch();
		l.setFoodName("칼국수");
		list.add(l);
		
		Lunch l2 = new Lunch();
		l2.setFoodName("스바라시라멘");
		list.add(l2);
		
		for (Lunch lunch : list) {
			System.out.print(lunch.getFoodName()+" ");
		}
		System.out.println(" ");
		
		
		
		// "스바라시라멘, 우동" 출력
		// set에 list를 넘겨줘야 됨
		List<String> list1 = new ArrayList<String>();
		list1.add("스바라시라멘");
		list1.add("우동");
		
		Lunch1 lunch1 = new Lunch1();
		lunch1.setFoodName(list1);
		
		for (String foodName : lunch1.getFoodName()) {
			System.out.print(foodName+" ");
		}
		
		
	}
}