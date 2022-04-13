package ���3;

import java.util.ArrayList;
import java.util.List;

class UserVO{
	private String name;
	private int sal; //�޿�
	
	public UserVO(String name, int sal){
		this.name = name;
		this.sal = sal;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}
}

class MainUtil{
	
	public List<UserVO> getAllUsers(List<UserVO> list) { //��ü ���� ȣ��
		return list;
	}
	
	public String getUser(List<UserVO> list, String name){ //Ư�� ���� ȣ��
		for (UserVO vo : list) {
			if (vo.getName().equals(name)) {
				return vo.getName();
			}
		}
		return null;
	}
	
	public List<UserVO> deleteUser(List<UserVO> list, int index){
		list.remove(index);
		return list;
	}
	
	public int getUserTotalSal(List<UserVO> list){
		int sum = 0;
		for (UserVO vo : list) {
			sum += vo.getSal();
		}
		return sum;
	}
	
}
public class MainService extends MainUtil{
	
	public static void main(String[] args) {
		//���� MainUtil�Լ��� �̿��ؼ� ����Ǯ ��.
		//1. ��ü ���� ȣ��
		//2. Ư�� ���� ȣ��
		//3. Ư�� ���� ����
		//4. ��� ���� �޿� �� ���ϱ�
		List<UserVO> list = new ArrayList<UserVO>();
		list.add(new UserVO("SMITH", 100));
		list.add(new UserVO("BRIAN", 300));
		list.add(new UserVO("ALLEN", 600));
		list.add(new UserVO("KING", 2000));
		MainService main = new MainService();
		
		System.out.println("������ [ 1  �� ] ������");
		System.out.println("�� ��ü ���� ȣ��");
		for (int i=0; i<list.size(); i++) {
			// 1. ��ü ���� ȣ��
			String name = main.getAllUsers(list).get(i).getName();
			int sal = main.getAllUsers(list).get(i).getSal();
			System.out.println("�̸� : "+name+",  �޿� : "+sal);
		}
		System.out.println(" ");
		System.out.println(" ");
		
		
		System.out.println("������ [ 2  �� ] ������");
		// 2. Ư�� ���� ȣ��
		System.out.println("�� Ư�� ���� ȣ��");
		String name2 = main.getUser(list, "ALLEN");
		System.out.println(name2);		
		System.out.println(" ");
		System.out.println(" ");
		
		
		System.out.println("������ [ 3  �� ] ������");
		// 3. Ư�� ���� ����
		System.out.println("�� Ư�� ���� ���� (ȣ�� �� ������ ���� ��)");
		list = main.deleteUser(list, 2);
		for (int i=0; i<list.size(); i++) {
			String name = main.getAllUsers(list).get(i).getName();
			int sal = main.getAllUsers(list).get(i).getSal();
			System.out.println(name+", "+sal);
		}
		System.out.println(" ");
		System.out.println(" ");		
		
		
		System.out.println("������ [ 4  �� ] ������");
		// 4. ��� ���� �޿� �� ���ϱ�
		System.out.println("�� ��� ���� �޿� �� (���� �� ������ ����)");
		int sum = main.getUserTotalSal(list);	
		System.out.println(sum);
		
		
	}
}