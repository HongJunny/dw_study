package final_test;

import java.util.List;

public class EmpService implements EmpServiceImpl{

	@Override
	public List<EmpVO> getEmpList(List<EmpVO> list) {
		// 1��. ��ü ��� 200�޷� �޿� �λ��ϰ� ��� ����Ʈ�� ���� �Ͻÿ�. 
		for (EmpVO e : list) {
			int bonusSal = e.getSal() + EmpCode.SPECIAL_BONUS;
			System.out.println("�����ȣ : "+e.getEmpno()+", ����̸� : "+e.getEname()+", ����޿� : "+bonusSal+", ����μ� : "+e.getList());
		}
		return list;
	}

	@Override
	public EmpVO getEmp(List<EmpVO> list) {
		// 2��. �޿��� ���� ���� ����� ���� �Ͻÿ�. (��, �޿� �ߺ��� ���ٰ� ����)
		int maxSal = 0;
		int index = 0;
		for (int i=0; i<list.size(); i++) {
			int sal = list.get(i).getSal();
			if(maxSal < sal){
				maxSal = sal;
				index = i;
			}
		}
		System.out.println("�����ȣ : "+list.get(index).getEmpno()+", ����̸� : "+list.get(index).getEname()+", ����޿� : "+list.get(index).getSal()+", ����μ� : "+list.get(index).getList());
		return null;
	}

	@Override
	public int getCount(List<EmpVO> list, int sal) {
		// 3��. ��� �� �޿��� 300���Ϸ� �ް� �ִ� ��� ���� ���Ͻÿ�.
		int count = 0;
		for (int i=0; i<list.size(); i++) {
			if (list.get(i).getSal() <= sal) {
				++count;
			}
		}
		System.out.println("�޿��� "+sal+" ���Ϸ� �ް� �ִ� ��� �� : "+count+"��");
		return count;
	}

	@Override
	public EmpVO setDept(EmpVO empVO) {
		// 4��. Ư�� ����� �μ���ȣ 10, �μ��̸� SALES �μ��� �߰��ϰ� ����� �����Ͻÿ�.
		empVO.setList(null);
		return null;
	}

}