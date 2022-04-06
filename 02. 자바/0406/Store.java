package 상속;


class StoreSub {
	int money;
	
	// 필드변수는 메소드를 활용해서 접근해야 한다.
	public int sumMoney (int money) {
		int sum = this.money += money;
		return sum;
	}
	
}

public class Store {

	public static void main(String[] args) {

		// 실무에서는 필드변수를 직접 접근하지 않음.
		StoreSub s = new StoreSub();
		int result = s.sumMoney(100);
		result = s.sumMoney(100);
		System.out.println(result);
		
	}

}
