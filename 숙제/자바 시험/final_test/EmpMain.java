package final_test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class EmpMain {

	public static void main(String[] args) {
		List<EmpVO> list = new ArrayList<EmpVO>();
		list.add(new EmpVO(100, "ALLEN", 100));
		list.add(new EmpVO(110, "SMITH", 100));
		list.add(new EmpVO(120, "WILLSON", 200));
		list.add(new EmpVO(130, "SANGWON", 50));
		list.add(new EmpVO(140, "BRIAN", 600));
		list.add(new EmpVO(150, "KING", 3000));

		EmpServiceImpl service = new EmpService();
		//1��. ��ü ��� 200�޷� �޿� �λ��ϰ� ��� ����Ʈ�� ���� �Ͻÿ�. 
		System.out.println("��������������������������  1  ��  ��������������������������");
		service.getEmpList(list);
		System.out.println();
		System.out.println();
		
		//2��. �޿��� ���� ���� ����� ���� �Ͻÿ�. (��, �޿� �ߺ��� ���ٰ� ����)
		System.out.println("��������������������������  2  ��  ��������������������������");
		service.getEmp(list);
		System.out.println();
		System.out.println();
		
		//3��. ��� �� �޿��� 300���Ϸ� �ް� �ִ� ��� ���� ���Ͻÿ�.
		System.out.println("��������������������������  3  ��  ��������������������������");
		service.getCount(list, 300);
		System.out.println();
		System.out.println();
		
		//4��. Ư�� ����� �μ���ȣ 10, �μ��̸� SALES �μ��� �߰��ϰ� ����� �����Ͻÿ�.
		System.out.println("��������������������������  4  ��  ��������������������������");
		list.addAll((Collection<? extends EmpVO>) new DeptVO(10,"SALES"));
		
		
	}
}