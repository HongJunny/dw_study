package 상속;

public class 햄버거02 {

	public static void main(String[] args) {

		햄버거01 새우버거 = new 햄버거01("새우", 3000);
		System.out.println(새우버거.pattyname+", "+새우버거.money);
		
		햄버거01 불고기버거 = new 햄버거01("불고기", 2500);
		System.out.println(불고기버거.pattyname+", "+불고기버거.money);
		
		햄버거01 치킨버거 = new 햄버거01("치킨", 4000);
		System.out.println(치킨버거.pattyname+", "+치킨버거.money);
		
		햄버거01 치즈버거 = new 햄버거01("치즈", 3000);
		System.out.println(치즈버거.pattyname+", "+치즈버거.money);
		
	}

}
