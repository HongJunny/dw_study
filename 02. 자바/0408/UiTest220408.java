package test;

class User{
	//�ʵ庯��
	String userId;
	String password;
	String rePassword;
	boolean isLogin;
	//������
	public User(String userId, String password, String rePassword, boolean isLogin){
		this.userId = userId;
		this.password = password;
		this.rePassword = rePassword;
		this.isLogin = isLogin;
	}
}

public class UiTest220408 {

	public static void main(String[] args) {
		String userId = "hong";
		String password = "abcd1234";
		String rePassword = "abcd1234";
		boolean isLogin = false;
		//1.userId�� ���̵� ������ ���� (���̵�� 20���� ����)
		if (userId.length() > 20) {
			System.out.println("���̵�� 20���� ���Ϸ� ����� �մϴ�.");
		}
		
		//2.��й�ȣ�� ���й�ȣ ������ ���� (��й�ȣ ���ڴ� 15���� ����)
		if (password.length() > 15  && rePassword.length() > 15) {
			System.out.println("��й�ȣ�� 15���� ���Ϸ� ����� �մϴ�.");
		}		
		else {
			//3.��й�ȣ�� ���й�ȣ ��ġ �ϸ� isLogin�� true ����
			if (password.equals(rePassword)) {
				isLogin = true;
			}
			//4.1~3�� �����ϸ� UserŬ���� ȣ��, ������ �Ķ���Ϳ� �� ����.
			if (isLogin) {
				User userLogin = new User(userId, password, rePassword, isLogin);
				System.out.println(userLogin.userId);
				System.out.println(userLogin.password);
				System.out.println(userLogin.rePassword);
			}
		}
		

		
		
		
	}

}
