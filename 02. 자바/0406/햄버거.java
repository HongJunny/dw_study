package 상속;


class 햄버거공장 {
	String pattyname;
	int money;
	
	public 햄버거공장() {
		
	}
	
}


public class 햄버거 {

	public static void main(String[] args) {
		
		햄버거공장 새우버거 = new 햄버거공장();
		새우버거.pattyname = "새우";
		새우버거.money = 3000;
		System.out.println(새우버거.pattyname);
		System.out.println(새우버거.money);
		
		햄버거공장 불고기버거 = new 햄버거공장();
		불고기버거.pattyname = "불고기";
		불고기버거.money = 2500;
		System.out.println(불고기버거.pattyname);
		System.out.println(불고기버거.money);
		
		햄버거공장 치킨버거 = new 햄버거공장();
		치킨버거.pattyname = "치킨";
		치킨버거.money = 4000;
		System.out.println(치킨버거.pattyname);
		System.out.println(치킨버거.money);
		
		햄버거공장 치즈버거 = new 햄버거공장();
		치즈버거.pattyname = "치즈";
		치즈버거.money = 3000;
		System.out.println(치즈버거.pattyname);
		System.out.println(치즈버거.money);
		
	}

}
