package test;

import java.util.List;

public interface MemberServiceImpl {
	List<MemberVO> getMemberList(List<MemberVO> list);
	String getMemberNo(List<MemberVO> list);
}
