package ����Ǯ�̿�;

public class �輭�� {

	// ���� ����
	// String�� �迭 seoul�� element�� "Kim"�� ��ġ x�� ã��,
	// "�輭���� x�� �ִ�"�� String�� ��ȯ�ϴ� �Լ�, solution�� �ϼ��ϼ���.
	// seoul�� "Kim"�� ���� �� ���� ��Ÿ���� �߸��� ���� �ԷµǴ� ���� �����ϴ�.
	
	
	// ���� ����
	// seoul�� ���� 1 �̻�, 1000 ������ �迭�Դϴ�.
	// seoul�� ���Ҵ� ���� 1 �̻�, 20 ������ ���ڿ��Դϴ�.
	// ���ڿ��� ���� ��ȯ �޼ҵ�� Integer.toString()�� ����մϴ�.
	// ���ڿ� ���ڸ� ���� ���� equals()�� ����մϴ�.
	
	
	// ����� ��
	// "�輭���� 1�� �ִ�"
	
	
	public static String solution(String[] seoul) {
        String answer = "";
        String searchWord = "Kim";
        		
        for(int i=0; i<seoul.length; ++i)
        {
        	if(seoul.length>=1 && seoul.length<=1000)
        	{
        		if(seoul[i].length()>=1 && seoul[i].length()<=20)
        		{
        			if(seoul[i].equals(searchWord))
        			{
        				answer = Integer.toString(i);
        			}
        		}
        	}
        }
        return "�輭���� "+answer+"�� �ִ�";
    }

    public static void main(String[] args) {
        String array[] = {"Jane", "Kim"};
        String result = solution(array);
        System.out.println(result);
    }
	
	
}
