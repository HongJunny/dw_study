package service;

public class MainService {

	public void setUser(UserVO vo)
	{
		
	}
	public UserVO getUser(int x)
	{
		if(x>=1 && x<=100)
		{
			UserVO u = new UserVO();
			
			u.setId(x);
			u.getName();
			u.getEmail();
			u.getPhone();
			u.isLogin();
			
			return u;
		}
		return null;
	}

}
