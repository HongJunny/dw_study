package ���2;

class Manager{
	public Manager() {
		System.out.println("Hello, World");
	}
	
	public int �޿����ִ�(int ����){
		return ����;
	}
	public String �丮���ϴ�(String ������){
		return ������;
	}
}
class Chef extends Manager{
	public Chef() {
		super();  // super��� �޼ҵ尡 ����Ʈ�� ����
	}
	
	@Override
	public int �޿����ִ�(int ����){
		return ����*3;
	}
	public String �丮���ϴ�(String ������){
		return ������;
	}
	public String �丮���ϴ�(String ������, String ��мҽ�){
		return ������+��мҽ�;
	}
}
public class Restaurant {
	public static void main(String[] args) {
		Chef chef = new Chef();
		
		
	}
}
