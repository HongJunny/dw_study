package ���;


class StoreSub {
	int money;
	
	// �ʵ庯���� �޼ҵ带 Ȱ���ؼ� �����ؾ� �Ѵ�.
	public int sumMoney (int money) {
		int sum = this.money += money;
		return sum;
	}
	
}

public class Store {

	public static void main(String[] args) {

		// �ǹ������� �ʵ庯���� ���� �������� ����.
		StoreSub s = new StoreSub();
		int result = s.sumMoney(100);
		result = s.sumMoney(100);
		System.out.println(result);
		
	}

}
