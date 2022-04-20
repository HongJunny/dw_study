package user;

import java.util.List;

public class UserService implements UserServiceImple {

	@Override
	public List<UserVO> updateSal(List<UserVO> list, String dname) {
		//1. 부서이름이 DEVELOP인 사원 급여를 2배 인상하시오.
		for (int i=0; i<list.size(); i++) {
			if (list.get(i).getDname().equals(dname)) {
				System.out.println("사원 이름 : "+list.get(i).getEname()+", 부서 이름 : "+list.get(i).getDname()+", 급여 : "+list.get(i).getSal()*2+", 레벨 : "+list.get(i).getLv());
			}
		}
		return list;
	}

	@Override
	public List<UserVO> updateLv(List<UserVO> list) {
		//2. 급여가 0 ~ 100 : 1 레벨, 101 ~ 1000 : 2 레벨, 1001 이상부터는 3 레벨로 수정하시오.
		for (int i=0; i<list.size(); i++) {
			if (list.get(i).getSal() >= 0 && list.get(i).getSal() <= 100) {
				list.get(i).setLv(1);
				System.out.println("사원 이름 : "+list.get(i).getEname()+", 부서 이름 : "+list.get(i).getDname()+", 급여 : "+list.get(i).getSal()+", 레벨 : "+list.get(i).getLv());
			}
			if (list.get(i).getSal() >= 101 && list.get(i).getSal() <= 1000) {
				list.get(i).setLv(2);
				System.out.println("사원 이름 : "+list.get(i).getEname()+", 부서 이름 : "+list.get(i).getDname()+", 급여 : "+list.get(i).getSal()+", 레벨 : "+list.get(i).getLv());
			}
			if (list.get(i).getSal() >= 1001) {
				list.get(i).setLv(3);
				System.out.println("사원 이름 : "+list.get(i).getEname()+", 부서 이름 : "+list.get(i).getDname()+", 급여 : "+list.get(i).getSal()+", 레벨 : "+list.get(i).getLv());
			}
		}
		return list;
	}

	@Override
	public List<UserVO> deleteUser(List<UserVO> list, int lv) {
		//3. 레벨 3이상 직원을 모두 해고하시오.
		for (int i=0; i<list.size(); i++) {
			if (list.get(i).getLv() >= lv) {
				list.remove(i);
			}
			System.out.println("사원 이름 : "+list.get(i).getEname()+", 부서 이름 : "+list.get(i).getDname()+", 급여 : "+list.get(i).getSal()+", 레벨 : "+list.get(i).getLv());
		}
		return list;
	}

	@Override
	public UserVO selectUserByEname(List<UserVO> list, String ename) {
		//4. 이름이 King인 직원의 모든 정보 조회.
		for (int i=0; i<list.size(); i++) {
			if (list.get(i).getEname().equals(ename)) {
				System.out.println("사원 이름 : "+list.get(i).getEname()+", 부서 이름 : "+list.get(i).getDname()+", 급여 : "+list.get(i).getSal()+", 레벨 : "+list.get(i).getLv());
			}
		}
		return null;
	}

    

}
