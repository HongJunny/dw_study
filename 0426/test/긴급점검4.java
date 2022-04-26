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


public class 긴급점검4 {	
	public static void main(String[] args) {
		
		// 음식 이름은 : 카레
		// 음식 이름은 : 칼국수
		// 음식 이름은 : 전
		
		// 리스트에 값을 넣어주려면 Food를 호출 해야 함
		// step 1. list 안에 데이터 타입 확인
		//         List<Food> list = new ArrayList<Food>();
		// step 2. 클래스 타입이면 클래스를 호출
		//         Food f = new Food();
		// step 3. 호출 한 클래스를 list에 담는다
		//         list.add(f);
		List<Food> list = new ArrayList<Food>();
		
		Food f = new Food();
		f.setFoodName("카레");
		list.add(f);
		
		Food f2 = new Food();
		f2.setFoodName("칼국수");
		list.add(f2);
		
		Food f3 = new Food();
		f3.setFoodName("전");
		list.add(f3);
		
		for (int i=0; i<list.size(); i++) {
			System.out.println("음식 이름은(1) : "+list.get(i).getFoodName());
		}
		
		// for each를 사용 하면, 몇번째 인덱스에 어떤 값이 있는지 찾기 어려움
		// 찾고 싶을때는 변수를 선언 해서 !
		int j = 0;
		for (Food food : list) {  // Food food = list.get(0) 과 같은것임
			++j;
			System.out.println("음식 이름은(2) : "+food.getFoodName());
		}
		
	}
}