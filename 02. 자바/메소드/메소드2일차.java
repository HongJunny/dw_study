package �޼ҵ�2����;

public class �޼ҵ�2���� {

	public static int getResult(String word) {
		//1.�޸��� �迭����
		//2.����ǥ ������ ��
	  	//3.���ڸ� ���ڷ� ��ȯ ex)int x = Integer.parseInt("100")
		//4.1000 �̸� ���� �� ���� ū �� ���ϱ�
		//5.���� ��������� ���ϱ� 2�� �ؼ� ���� �ϱ�
		
		String array[] = word.split(",");
		int max = 0;
		
		for(int i=0; i<array.length; i++)
		{
			String replaceStr = array[i].replace("!", "");
			int temp = Integer.parseInt(replaceStr);
			if(temp < 1000)
			{
				if(max < temp)
				{
					max = temp;
				}
			}
		}
		System.out.println(max);
		return max*2;
	}
	
		
	public static void main(String[] args) {
		String word = "101,1,10,1000,!100!,2000";
		getResult(word);
	}
	
}
