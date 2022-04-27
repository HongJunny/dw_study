package test;

import java.util.ArrayList;
import java.util.List;

class MemberVO {
	
	private String memberNo;  // 멤버 번호
	private int sal;  // 급여

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
	public static final double BONUS = 0.1;   // 보너스
	public static final int MAX_VALUE = 300;
}

class MemberService implements MemberServiceImpl{

	// 5. MemberService 안에 있는 메소드 2개를
	//    MemberServiceImpl 이라는 Interface를 생성한 후에
	//    오버라이딩으로 수정
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
	
	
//  아래는 오버라이딩 하려고 주석처리 함
	
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

public class 긴급점검9 {	
	
	public static void main(String[] args) {
		
		List<MemberVO> list = new ArrayList<MemberVO>();
		
		// 1. member 번호 "100, 200, 300" 추가
		//    급여도 같이 "100, 200, 300"
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
		
		
		
		// 2. member 번호가 200인 사람의 급여를
		//    10% 인상 시켜서 list에 리턴하는 로직 구현
		MemberService service = new MemberService();
		service.getMemberList(list);
		
	
		
		// 3. member "100, 200, 300" 번호와 급여 출력
		for (MemberVO member : list) {
			System.out.println("번호 : "+member.getMemberNo()+", 급여 : "+member.getSal());
		}
		
		
		
		// 4. 급여가 300 이상인 멤버의 번호를 리턴
		//    getMemberNo를 이용해서.
		service.getMemberNo(list);
		

		
	}
}