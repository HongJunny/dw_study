package 메소드2일차;

public class 메소드2일차 {

	public static int getResult(String word) {
		//1.콤마로 배열생성
		//2.느낌표 제거할 것
	  	//3.문자를 숫자로 변환 ex)int x = Integer.parseInt("100")
		//4.1000 미만 숫자 중 가장 큰 수 구하기
		//5.최종 결과값에서 곱하기 2를 해서 리턴 하기
		
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
