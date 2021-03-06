package 상속3;

import java.util.ArrayList;
import java.util.List;

class UserVO{
	private String name;
	private int sal; //급여
	
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
	
	public List<UserVO> getAllUsers(List<UserVO> list) { //전체 유저 호출
		return list;
	}
	
	public String getUser(List<UserVO> list, String name){ //특정 유저 호출
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
		//위에 MainUtil함수를 이용해서 문제풀 것.
		//1. 전체 유저 호출
		//2. 특정 유저 호출
		//3. 특정 유저 삭제
		//4. 모든 유저 급여 합 구하기
		List<UserVO> list = new ArrayList<UserVO>();
		list.add(new UserVO("SMITH", 100));
		list.add(new UserVO("BRIAN", 300));
		list.add(new UserVO("ALLEN", 600));
		list.add(new UserVO("KING", 2000));
		MainService main = new MainService();
		
		System.out.println("■■■■■ [ 1  번 ] ■■■■■");
		System.out.println("※ 전체 유저 호출");
		for (int i=0; i<list.size(); i++) {
			// 1. 전체 유저 호출
			String name = main.getAllUsers(list).get(i).getName();
			int sal = main.getAllUsers(list).get(i).getSal();
			System.out.println("이름 : "+name+",  급여 : "+sal);
		}
		System.out.println(" ");
		System.out.println(" ");
		
		
		System.out.println("■■■■■ [ 2  번 ] ■■■■■");
		// 2. 특정 유저 호출
		System.out.println("※ 특정 유저 호출");
		String name2 = main.getUser(list, "ALLEN");
		System.out.println(name2);		
		System.out.println(" ");
		System.out.println(" ");
		
		
		System.out.println("■■■■■ [ 3  번 ] ■■■■■");
		// 3. 특정 유저 삭제
		System.out.println("※ 특정 유저 삭제 (호출 한 유저를 삭제 함)");
		list = main.deleteUser(list, 2);
		for (int i=0; i<list.size(); i++) {
			String name = main.getAllUsers(list).get(i).getName();
			int sal = main.getAllUsers(list).get(i).getSal();
			System.out.println(name+", "+sal);
		}
		System.out.println(" ");
		System.out.println(" ");		
		
		
		System.out.println("■■■■■ [ 4  번 ] ■■■■■");
		// 4. 모든 유저 급여 합 구하기
		System.out.println("※ 모든 유저 급여 합 (삭제 된 유저는 제외)");
		int sum = main.getUserTotalSal(list);	
		System.out.println(sum);
		
		
	}
}