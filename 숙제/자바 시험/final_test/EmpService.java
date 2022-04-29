package final_test;

import java.util.List;

public class EmpService implements EmpServiceImpl{

	@Override
	public List<EmpVO> getEmpList(List<EmpVO> list) {
		// 1번. 전체 사원 200달러 급여 인상하고 사원 리스트를 리턴 하시오. 
		for (EmpVO e : list) {
			int bonusSal = e.getSal() + EmpCode.SPECIAL_BONUS;
			System.out.println("사원번호 : "+e.getEmpno()+", 사원이름 : "+e.getEname()+", 사원급여 : "+bonusSal+", 사원부서 : "+e.getList());
		}
		return list;
	}

	@Override
	public EmpVO getEmp(List<EmpVO> list) {
		// 2번. 급여가 가장 높은 사원을 리턴 하시오. (단, 급여 중복이 없다고 가정)
		int maxSal = 0;
		int index = 0;
		for (int i=0; i<list.size(); i++) {
			int sal = list.get(i).getSal();
			if(maxSal < sal){
				maxSal = sal;
				index = i;
			}
		}
		System.out.println("사원번호 : "+list.get(index).getEmpno()+", 사원이름 : "+list.get(index).getEname()+", 사원급여 : "+list.get(index).getSal()+", 사원부서 : "+list.get(index).getList());
		return null;
	}

	@Override
	public int getCount(List<EmpVO> list, int sal) {
		// 3번. 사원 중 급여를 300이하로 받고 있는 사원 수를 구하시오.
		int count = 0;
		for (int i=0; i<list.size(); i++) {
			if (list.get(i).getSal() <= sal) {
				++count;
			}
		}
		System.out.println("급여를 "+sal+" 이하로 받고 있는 사원 수 : "+count+"명");
		return count;
	}

	@Override
	public EmpVO setDept(EmpVO empVO) {
		// 4번. 특정 사원에 부서번호 10, 부서이름 SALES 부서를 추가하고 사원을 리턴하시오.
		empVO.setList(null);
		return null;
	}

}