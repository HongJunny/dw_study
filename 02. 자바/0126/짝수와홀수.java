package �˰���;

public class ¦����Ȧ�� {

	
	// ���� ����
	// ���� num�� ¦���� ��� "Even"�� ��ȯ�ϰ� Ȧ���� ��� "Odd"�� ��ȯ�ϴ� �Լ�(�޼ҵ�), 
	// solution�� �ϼ����ּ���.
			
			
	// ���� ����
	// 1. ���� num�� �޴� �Ķ���Ͱ� �־�� ��.
	// 2. return Ÿ���� String.
	// 3. �޼ҵ� �̸��� solution.
			
			
	// ����� ��
	// num : 3, return : "Odd"
	// num : 4, return : "Even"
	
	
	public static String solution(int num)
	{
		String ���� = "";
		
		if((num%2)==0)
		{
			���� = "Even";
		}
		else
		{
			���� = "Odd";
		}
		
		return ����;
	}
	
	
	public static void main(String[] args) {

		¦����Ȧ�� s = new ¦����Ȧ��();
		System.out.println("num : 3, return : "+s.solution(3));
		System.out.println("num : 4, return : "+s.solution(4));
		
	}

}
