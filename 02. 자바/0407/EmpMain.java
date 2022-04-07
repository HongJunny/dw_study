package �÷�����;

import java.util.ArrayList;

public class EmpMain {
	
	public static ArrayList<EmpVO> getEmpList(ArrayList<EmpVO> list) {	
		// EmpVO�� ��� �ִ� ArrayList�� �Ķ���ͷ� �ް� �ִ�.
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).empno);
			System.out.println(list.get(i).ename);
		}
		return list;
	}
	
	public static String getValue(String name) {
		System.out.println("���� �̸���? "+name);
		return name;
	}

	public static void main(String[] args) {
		String name = "������";
		String resule = getValue(name);

		ArrayList<EmpVO> list = new ArrayList<EmpVO>();
		
		list.add(new EmpVO(7369,"SMITH","CLERK","1980-12-17",800,20,0));
		list.add(new EmpVO(7499,"ALLEN","SALESMAN","1981-02-20",1600,30,300));
		list.add(new EmpVO(7521,"WARD","SALESMAN","1981-02-22",1250,30,500));
		list.add(new EmpVO(7566,"JONES","MANAGER","1981-04-02",2975,20,0));
		list.add(new EmpVO(7654,"MARTIN","SALESMAN","1981-09-28",1250,30,1400));
		list.add(new EmpVO(7698,"BLAKE","MANAGER","1981-05-01",2850,30,0));
		list.add(new EmpVO(7782,"CLARK","MANAGER","1981-06-09",2450,10,0));
		list.add(new EmpVO(7788,"SCOTT","ANALYST","1987-06-28",3000,20,0));
		list.add(new EmpVO(7839,"KING","PRESIDENT","1981-11-17",5000,10,0));
		list.add(new EmpVO(7844,"TURNER","SALESMAN","1981-09-08",1500,30,0));
		list.add(new EmpVO(7876,"ADAMS","CLERK","1987-07-13",1100,20,0));
		list.add(new EmpVO(7900,"JAMES","CLERK","1981-12-03",950,30,0));
		list.add(new EmpVO(7902,"FORD","ANALYST","1981-12-03",3000,20,0));
		list.add(new EmpVO(7934,null,"CLERK","1982-01-23",1300,10,0));
		
		
		getEmpList(list);
		
		System.out.println("1�� : �����ȣ, �̸� ���");
		for (int i=0; i<list.size(); i++) {
			// 1. �����ȣ, �̸� ���
			System.out.println(list.get(i).empno);
			System.out.println(list.get(i).ename);
			System.out.println("-----------------");
		}
		
		System.out.println("***********************");
		System.out.println("2�� : �޿��� 1300 �޷� �̻��� �޴� ����� �̸��� ���� ���");
		
		for (int i=0; i<list.size(); i++) {
			// 2. �޿��� 1300 �޷� �̻��� �޴� ����� �̸��� ���� ���
			if (list.get(i).sal >= 1300) {
				System.out.println(list.get(i).ename);
				System.out.println(list.get(i).job);
				System.out.println("-----------------");
			}
		}
		
		System.out.println("***********************");
		System.out.println("3�� : ������ SALESMAN�� ����� �޿��� 1400�޷� �̻��� �޴� ����� ��ȣ�� �̸� ��ȸ");
		
		for (int i=0; i<list.size(); i++) {
			// 3. ������ SALESMAN�� ����� �޿��� 1400�޷� �̻��� �޴� ����� ��ȣ�� �̸� ��ȸ
			if (list.get(i).job.equals("SALESMAN") && list.get(i).sal >= 1400) {
				System.out.println(list.get(i).empno);
				System.out.println(list.get(i).ename);
				System.out.println("-----------------");
			}
		}
		
		System.out.println("***********************");
		System.out.println("4�� : �Ի�⵵�� 1981�⵵�� ����� ��ȣ, �̸� ���");
		
		for (int i=0; i<list.size(); i++) {
			// 4. �Ի�⵵�� 1981�⵵�� ����� ��ȣ, �̸� ���
			String hireYear = list.get(i).hiredate.split("-")[0];
			if (hireYear.equals("1981")) {
				System.out.println(list.get(i).empno);
				System.out.println(list.get(i).ename);
				System.out.println("-----------------");
			}
		}
		
		System.out.println("***********************");
		System.out.println("5�� : ������ MANAGER�� ��� �� ���");
		
		int count = 0;
		for (int i=0; i<list.size(); i++) {
			// 5. ������ MANAGER�� ��� �� ���
			if (list.get(i).job.equals("MANAGER")) {
				++count;
			}
		}
		System.out.println(count);
		
		System.out.println("***********************");
		System.out.println("6�� : ��� �� �޿��� ���� ���� �޴� ����� ��ȣ, �̸�, �Ի�⵵ ���");
		
		int maxSal = 0;
		int index = 0;
		for (int i=0; i<list.size(); i++) {
			// 6. ��� �� �޿��� ���� ���� �޴� ����� ��ȣ, �̸�, �Ի�⵵ ���
			int sal = list.get(i).sal;
			if(maxSal < sal){
				maxSal = sal;
				index = i;
			}
		}
		System.out.println(list.get(index).empno);
		System.out.println(list.get(index).ename);
		System.out.println(list.get(index).hiredate);
		
		System.out.println("***********************");
		System.out.println("7�� : �μ���ȣ�� �� ��� ex) 20 : 2��, 30 : 3��");
		
		int deptnoCount20 = 0;
		int deptnoCount30 = 0;
		for (int i=0; i<list.size(); i++) {
			// 7. �μ���ȣ�� �� ��� ex) 20 : 2��, 30 : 3��
			if (list.get(i).deptno == 20) {
				++deptnoCount20;
			}
			if (list.get(i).deptno == 30) {
				++deptnoCount30;
			}
		}
		System.out.println("�μ���ȣ 20�� : "+deptnoCount20+"��, �μ���ȣ 30�� : "+deptnoCount30+"��");
		
		System.out.println("***********************");
		System.out.println("8�� : �Ի���� 02���� ��� �� ���");
		
		int cnt = 0;
		for (int i=0; i<list.size(); i++) {
			// 8. �Ի���� 02���� ��� �� ���
			String hireMonth = list.get(i).hiredate.split("-")[1];
			if (hireMonth.equals("02")) {
				++cnt;
			}
		}
		System.out.println(cnt);
		
		System.out.println("***********************");
		System.out.println("9�� : comm�� ���� ��� ���� ����,�̸��� ���");
		
		int commCount = 0;
		for (int i=0; i<list.size(); i++) {
			// 9. comm�� ���� ��� ���� ����,�̸��� ���
			if (list.get(i).comm > 0) {
				++commCount;
				System.out.println(list.get(i).job);
				System.out.println(list.get(i).ename);
				System.out.println("-----------------");
			}
			
		}
		System.out.println(commCount);
		
		System.out.println("***********************");
		System.out.println("10�� : emp�� �ִ� �޿� ����� ���");
		
		int sum = 0;
		for (int i=0; i<list.size(); i++) {
			// 10. emp�� �ִ� �޿� ����� ���			
			sum += list.get(i).sal;
		}
		System.out.println(sum / list.size());
		
		System.out.println("***********************");
		System.out.println("11�� : �����ȣ�� 7844, 7876�� ������� comm 200�� ����");
		
		for (int i=0; i<list.size(); i++) {
			// 11. �����ȣ�� 7844, 7876�� ������� comm 200�� ����
			if (list.get(i).empno == 7844 || list.get(i).empno == 7876) {
				list.get(i).setComm(200);
				System.out.println(list.get(i).comm);
			}
		}
		
		System.out.println("***********************");
		System.out.println("12�� : ����̸��� null�� ����̸��� '������ ����' ���� ����");
		
		for (int i=0; i<list.size(); i++) {
			// 12. ����̸��� null�� ����̸��� '������ ����' ���� ����
			// if(x==null) {setName("������ ����")}
			if (list.get(i).ename == null) {
				list.get(i).setEname("������ ����");
				System.out.println(list.get(i).ename);
			}
		}
		
		System.out.println("***********************");
		System.out.println("13�� : 20�� �μ��� ���� ������ ���� �ʽ��ϴ�. 20���μ��� ��� �ذ�(����)");
		
		for (int i=0; i<list.size(); i++) {
			// 13. 20�� �μ��� ���� ������ ���� �ʽ��ϴ�. 20���μ��� ��� �ذ�(����)
			if (list.get(i).deptno == 20) {
				list.remove(i);				
				System.out.println(list.get(i).deptno);
			}
		}
		
		
		
	}

}
