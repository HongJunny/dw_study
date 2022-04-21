package ����_user;

import java.util.ArrayList;
import java.util.List;

public class MainController{
    public static void main(String args[]){
        
        List<UserVO> list = new ArrayList<UserVO>();
        list.add(new UserVO("Alex","DEVELOP",200));
        list.add(new UserVO("Max","DEVELOP",80));
        list.add(new UserVO("Brian","DEVELOP",100));
        list.add(new UserVO("mr.Hyun","MANAGER",300));
        list.add(new UserVO("Allen","DEVELOP",110));
        list.add(new UserVO("Katter","DEVELOP",220));
        list.add(new UserVO("Hooker","MANAGER",1500));
        list.add(new UserVO("King","MASTER",0));

        //���⼭ ���� Ǯ ��
        UserService us = new UserService();
        
        
        // 1. �μ��̸��� DEVELOP�� ��� �޿��� 2�� �λ��Ͻÿ�.
        us.updateSal(list, "DEVELOP");
        
        System.out.println(" ");
        System.out.println("-------------------------------------------------------");
        System.out.println(" ");
        
        
        // 2. �޿��� 0 ~ 100 : 1 ����, 101 ~ 1000 : 2 ����, 1001 �̻���ʹ� 3 ������ �����Ͻÿ�.
        us.updateLv(list);
        
        System.out.println(" ");
        System.out.println("-------------------------------------------------------");
        System.out.println(" ");
        
        
        // 3. ���� 3�̻� ������ ��� �ذ��Ͻÿ�.
        us.deleteUser(list, 3);
        
        System.out.println(" ");
        System.out.println("-------------------------------------------------------");
        System.out.println(" ");
        
        
        // 4. �̸��� King�� ������ ��� ���� ��ȸ.
        us.selectUserByEname(list, "King");
        

    }
}
