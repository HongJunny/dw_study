package service;

public class MainController {
	

	public static void main(String[] args) {

		UserVO u = new UserVO();
		MainService m = new MainService();
		
		u = m.getUser(30);
		u.name = "Çö»ó¿ø";
		
		System.out.println("id : "+u.id);
		System.out.println("name : "+u.name);
		
	}

}
