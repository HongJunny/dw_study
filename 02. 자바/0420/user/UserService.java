package user;

import java.util.List;

public class UserService implements UserServiceImple {

	@Override
	public List<UserVO> updateSal(List<UserVO> list, String dname) {
		//1. �μ��̸��� DEVELOP�� ��� �޿��� 2�� �λ��Ͻÿ�.
		for (int i=0; i<list.size(); i++) {
			if (list.get(i).getDname().equals(dname)) {
				System.out.println("��� �̸� : "+list.get(i).getEname()+", �μ� �̸� : "+list.get(i).getDname()+", �޿� : "+list.get(i).getSal()*2+", ���� : "+list.get(i).getLv());
			}
		}
		return list;
	}

	@Override
	public List<UserVO> updateLv(List<UserVO> list) {
		//2. �޿��� 0 ~ 100 : 1 ����, 101 ~ 1000 : 2 ����, 1001 �̻���ʹ� 3 ������ �����Ͻÿ�.
		for (int i=0; i<list.size(); i++) {
			if (list.get(i).getSal() >= 0 && list.get(i).getSal() <= 100) {
				list.get(i).setLv(1);
				System.out.println("��� �̸� : "+list.get(i).getEname()+", �μ� �̸� : "+list.get(i).getDname()+", �޿� : "+list.get(i).getSal()+", ���� : "+list.get(i).getLv());
			}
			if (list.get(i).getSal() >= 101 && list.get(i).getSal() <= 1000) {
				list.get(i).setLv(2);
				System.out.println("��� �̸� : "+list.get(i).getEname()+", �μ� �̸� : "+list.get(i).getDname()+", �޿� : "+list.get(i).getSal()+", ���� : "+list.get(i).getLv());
			}
			if (list.get(i).getSal() >= 1001) {
				list.get(i).setLv(3);
				System.out.println("��� �̸� : "+list.get(i).getEname()+", �μ� �̸� : "+list.get(i).getDname()+", �޿� : "+list.get(i).getSal()+", ���� : "+list.get(i).getLv());
			}
		}
		return list;
	}

	@Override
	public List<UserVO> deleteUser(List<UserVO> list, int lv) {
		//3. ���� 3�̻� ������ ��� �ذ��Ͻÿ�.
		for (int i=0; i<list.size(); i++) {
			if (list.get(i).getLv() >= lv) {
				list.remove(i);
			}
			System.out.println("��� �̸� : "+list.get(i).getEname()+", �μ� �̸� : "+list.get(i).getDname()+", �޿� : "+list.get(i).getSal()+", ���� : "+list.get(i).getLv());
		}
		return list;
	}

	@Override
	public UserVO selectUserByEname(List<UserVO> list, String ename) {
		//4. �̸��� King�� ������ ��� ���� ��ȸ.
		for (int i=0; i<list.size(); i++) {
			if (list.get(i).getEname().equals(ename)) {
				System.out.println("��� �̸� : "+list.get(i).getEname()+", �μ� �̸� : "+list.get(i).getDname()+", �޿� : "+list.get(i).getSal()+", ���� : "+list.get(i).getLv());
			}
		}
		return null;
	}

    

}
