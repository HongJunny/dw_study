package user;

import java.util.List;

/**
 * @author Junho Hong
 * @date 2022. 4. 20.
 * @comment : 
 */
public interface UserServiceImple {
	public List<UserVO> updateSal(List<UserVO> list, String dname);
	public List<UserVO> updateLv(List<UserVO> list);
	public List<UserVO> deleteUser(List<UserVO> list, int lv);
	public UserVO selectUserByEname(List<UserVO> list, String ename);
}
