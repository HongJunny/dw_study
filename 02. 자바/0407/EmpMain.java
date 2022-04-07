package 컬렉션즈;

import java.util.ArrayList;

public class EmpMain {
	
	public static ArrayList<EmpVO> getEmpList(ArrayList<EmpVO> list) {	
		// EmpVO를 담고 있는 ArrayList를 파라미터로 받고 있다.
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).empno);
			System.out.println(list.get(i).ename);
		}
		return list;
	}
	
	public static String getValue(String name) {
		System.out.println("너의 이름은? "+name);
		return name;
	}

	public static void main(String[] args) {
		String name = "아이유";
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
		
		System.out.println("1번 : 사원번호, 이름 출력");
		for (int i=0; i<list.size(); i++) {
			// 1. 사원번호, 이름 출력
			System.out.println(list.get(i).empno);
			System.out.println(list.get(i).ename);
			System.out.println("-----------------");
		}
		
		System.out.println("***********************");
		System.out.println("2번 : 급여가 1300 달러 이상을 받는 사원의 이름과 직업 출력");
		
		for (int i=0; i<list.size(); i++) {
			// 2. 급여가 1300 달러 이상을 받는 사원의 이름과 직업 출력
			if (list.get(i).sal >= 1300) {
				System.out.println(list.get(i).ename);
				System.out.println(list.get(i).job);
				System.out.println("-----------------");
			}
		}
		
		System.out.println("***********************");
		System.out.println("3번 : 직업이 SALESMAN인 사원중 급여가 1400달러 이상을 받는 사원의 번호와 이름 조회");
		
		for (int i=0; i<list.size(); i++) {
			// 3. 직업이 SALESMAN인 사원중 급여가 1400달러 이상을 받는 사원의 번호와 이름 조회
			if (list.get(i).job.equals("SALESMAN") && list.get(i).sal >= 1400) {
				System.out.println(list.get(i).empno);
				System.out.println(list.get(i).ename);
				System.out.println("-----------------");
			}
		}
		
		System.out.println("***********************");
		System.out.println("4번 : 입사년도가 1981년도인 사원의 번호, 이름 출력");
		
		for (int i=0; i<list.size(); i++) {
			// 4. 입사년도가 1981년도인 사원의 번호, 이름 출력
			String hireYear = list.get(i).hiredate.split("-")[0];
			if (hireYear.equals("1981")) {
				System.out.println(list.get(i).empno);
				System.out.println(list.get(i).ename);
				System.out.println("-----------------");
			}
		}
		
		System.out.println("***********************");
		System.out.println("5번 : 직업이 MANAGER인 사원 수 출력");
		
		int count = 0;
		for (int i=0; i<list.size(); i++) {
			// 5. 직업이 MANAGER인 사원 수 출력
			if (list.get(i).job.equals("MANAGER")) {
				++count;
			}
		}
		System.out.println(count);
		
		System.out.println("***********************");
		System.out.println("6번 : 사원 중 급여를 가장 많이 받는 사원의 번호, 이름, 입사년도 출력");
		
		int maxSal = 0;
		int index = 0;
		for (int i=0; i<list.size(); i++) {
			// 6. 사원 중 급여를 가장 많이 받는 사원의 번호, 이름, 입사년도 출력
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
		System.out.println("7번 : 부서번호별 수 출력 ex) 20 : 2명, 30 : 3명");
		
		int deptnoCount20 = 0;
		int deptnoCount30 = 0;
		for (int i=0; i<list.size(); i++) {
			// 7. 부서번호별 수 출력 ex) 20 : 2명, 30 : 3명
			if (list.get(i).deptno == 20) {
				++deptnoCount20;
			}
			if (list.get(i).deptno == 30) {
				++deptnoCount30;
			}
		}
		System.out.println("부서번호 20번 : "+deptnoCount20+"명, 부서번호 30번 : "+deptnoCount30+"명");
		
		System.out.println("***********************");
		System.out.println("8번 : 입사월이 02월인 사원 수 출력");
		
		int cnt = 0;
		for (int i=0; i<list.size(); i++) {
			// 8. 입사월이 02월인 사원 수 출력
			String hireMonth = list.get(i).hiredate.split("-")[1];
			if (hireMonth.equals("02")) {
				++cnt;
			}
		}
		System.out.println(cnt);
		
		System.out.println("***********************");
		System.out.println("9번 : comm을 받은 사원 수와 직업,이름을 출력");
		
		int commCount = 0;
		for (int i=0; i<list.size(); i++) {
			// 9. comm을 받은 사원 수와 직업,이름을 출력
			if (list.get(i).comm > 0) {
				++commCount;
				System.out.println(list.get(i).job);
				System.out.println(list.get(i).ename);
				System.out.println("-----------------");
			}
			
		}
		System.out.println(commCount);
		
		System.out.println("***********************");
		System.out.println("10번 : emp에 있는 급여 평균을 출력");
		
		int sum = 0;
		for (int i=0; i<list.size(); i++) {
			// 10. emp에 있는 급여 평균을 출력			
			sum += list.get(i).sal;
		}
		System.out.println(sum / list.size());
		
		System.out.println("***********************");
		System.out.println("11번 : 사원번호가 7844, 7876인 사원에게 comm 200을 지급");
		
		for (int i=0; i<list.size(); i++) {
			// 11. 사원번호가 7844, 7876인 사원에게 comm 200을 지급
			if (list.get(i).empno == 7844 || list.get(i).empno == 7876) {
				list.get(i).setComm(200);
				System.out.println(list.get(i).comm);
			}
		}
		
		System.out.println("***********************");
		System.out.println("12번 : 사원이름이 null인 사원이름에 '데이터 없음' 으로 수정");
		
		for (int i=0; i<list.size(); i++) {
			// 12. 사원이름이 null인 사원이름에 '데이터 없음' 으로 수정
			// if(x==null) {setName("데이터 없음")}
			if (list.get(i).ename == null) {
				list.get(i).setEname("데이터 없음");
				System.out.println(list.get(i).ename);
			}
		}
		
		System.out.println("***********************");
		System.out.println("13번 : 20번 부서가 올해 실적이 좋지 않습니다. 20번부서를 모두 해고(제거)");
		
		for (int i=0; i<list.size(); i++) {
			// 13. 20번 부서가 올해 실적이 좋지 않습니다. 20번부서를 모두 해고(제거)
			if (list.get(i).deptno == 20) {
				list.remove(i);				
				System.out.println(list.get(i).deptno);
			}
		}
		
		
		
	}

}
