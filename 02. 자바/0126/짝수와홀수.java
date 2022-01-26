package 알고리즘;

public class 짝수와홀수 {

	
	// 문제 설명
	// 정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수(메소드), 
	// solution을 완성해주세요.
			
			
	// 제한 조건
	// 1. 정수 num을 받는 파라미터가 있어야 함.
	// 2. return 타입은 String.
	// 3. 메소드 이름은 solution.
			
			
	// 입출력 예
	// num : 3, return : "Odd"
	// num : 4, return : "Even"
	
	
	public static String solution(int num)
	{
		String 리턴 = "";
		
		if((num%2)==0)
		{
			리턴 = "Even";
		}
		else
		{
			리턴 = "Odd";
		}
		
		return 리턴;
	}
	
	
	public static void main(String[] args) {

		짝수와홀수 s = new 짝수와홀수();
		System.out.println("num : 3, return : "+s.solution(3));
		System.out.println("num : 4, return : "+s.solution(4));
		
	}

}
