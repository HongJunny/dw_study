package test;

import java.util.ArrayList;
import java.util.List;

class Chef {
	private int chefAge;

	public int getChefAge() {
		return chefAge;
	}

	public void setChefAge(int chefAge) {
		this.chefAge = chefAge;
	}
	
}

public class �������7 {	
	
	public static List<Chef> getChefList() {
		
		List<Chef> list = new ArrayList<Chef>();
		
		Chef c = new Chef();
		c.setChefAge(30);
		list.add(c);
		
		Chef c1 = new Chef();
		c1.setChefAge(40);
		list.add(c1);
		
		Chef c2 = new Chef();
		c2.setChefAge(50);
		list.add(c2);
		
		Chef c3 = new Chef();
		c3.setChefAge(60);
		list.add(c3);
		
		return list;
	}
	
	public static int getChefListCount(List<Chef> list) {
		
		list = getChefList();
		int chefCount = 0;
		
		for (int i=0; i<list.size(); i++) {
			int age = list.get(i).getChefAge();
			if (age >= 50) {
				++chefCount;
			}
		}
		System.out.println("���̰� 50 �̻��� �丮�� �� : "+chefCount+"��");
		
		return chefCount;
	}
	
	public static void main(String[] args) {
		
		// 1. getChefList�� �̿��ؼ�
		//    30, 40, 50, 60 �߰�
		// 2. getChefListCount�� �̿��ؼ� 
		//    ���̰� 50 �̻��� �丮�� �� ���ϱ�
		
		getChefListCount(getChefList());
		
	}
}