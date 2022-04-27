package test;

import java.util.ArrayList;
import java.util.List;

class MemberVO {
	
	private String memberNo;  // ��� ��ȣ
	private int sal;  // �޿�

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public String getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(String memberNo) {
		this.memberNo = memberNo;
	}
	
}

class MemberCode {
	public static final double BONUS = 0.1;   // ���ʽ�
	public static final int MAX_VALUE = 300;
}

class MemberService implements MemberServiceImpl{

	// 5. MemberService �ȿ� �ִ� �޼ҵ� 2����
	//    MemberServiceImpl �̶�� Interface�� ������ �Ŀ�
	//    �������̵����� ����
	@Override
	public List<MemberVO> getMemberList(List<MemberVO> list) {
		for (int i=0; i<list.size(); i++) {
			if (list.get(i).getMemberNo().equals("200")) {
				int sal = list.get(i).getSal();
				sal = (int) (list.get(i).getSal() * (1+MemberCode.BONUS));
				list.get(i).setSal(sal);
			}
		}
		return list;
	}

	@Override
	public String getMemberNo(List<MemberVO> list) {
		for (int i=0; i<list.size(); i++) {
			if (list.get(i).getSal() >= 300) {
				return list.get(i).getMemberNo();
			}
		}
		return null;
	}
	
	
//  �Ʒ��� �������̵� �Ϸ��� �ּ�ó�� ��
	
//	public List<MemberVO> getMemberList(List<MemberVO> list) {
//		for (int i=0; i<list.size(); i++) {
//			if (list.get(i).getMemberNo().equals("200")) {
//				int sal = list.get(i).getSal();
//				sal = (int) (list.get(i).getSal() * (1+MemberCode.BONUS));
//				list.get(i).setSal(sal);
//			}
//		}
//		return list;
//	}
//	public String getMemberNo(List<MemberVO> list) {
//		for (int i=0; i<list.size(); i++) {
//			if (list.get(i).getSal() >= 300) {
//				return list.get(i).getMemberNo();
//			}
//		}
//		return null;
//	}
}

public class �������9 {	
	
	public static void main(String[] args) {
		
		List<MemberVO> list = new ArrayList<MemberVO>();
		
		// 1. member ��ȣ "100, 200, 300" �߰�
		//    �޿��� ���� "100, 200, 300"
		MemberVO member1 = new MemberVO();
		member1.setMemberNo("100");
		member1.setSal(100);
		list.add(member1);
		
		MemberVO member2 = new MemberVO();
		member2.setMemberNo("200");
		member2.setSal(200);
		list.add(member2);
		
		MemberVO member3 = new MemberVO();
		member3.setMemberNo("300");
		member3.setSal(300);
		list.add(member3);
		
		
		
		// 2. member ��ȣ�� 200�� ����� �޿���
		//    10% �λ� ���Ѽ� list�� �����ϴ� ���� ����
		MemberService service = new MemberService();
		service.getMemberList(list);
		
	
		
		// 3. member "100, 200, 300" ��ȣ�� �޿� ���
		for (MemberVO member : list) {
			System.out.println("��ȣ : "+member.getMemberNo()+", �޿� : "+member.getSal());
		}
		
		
		
		// 4. �޿��� 300 �̻��� ����� ��ȣ�� ����
		//    getMemberNo�� �̿��ؼ�.
		service.getMemberNo(list);
		

		
	}
}