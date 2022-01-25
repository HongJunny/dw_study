package 문제풀이용;

public class Pizza호출 {

	// 입출력 예
	// p2 피자 종류 치즈피자
	// p2 피자 조각 20
	// p3 피자 종류 불고기피자
	// p3 피자 조각 100
	
	public static Pizza getPizza(Pizza p){
	    //..소스 코드 작성
		p.피자종류 = "치즈피자";
		p.피자조각 = 20;	
		
	    return p;
	}

	public static Pizza getPizza(){
	     //..소스 코드 작성
		Pizza p = new Pizza();
		p.피자종류 = "불고기피자";
		p.피자조각 = 100;
		
	    return p;
	}
		
		
	public static void main(String[] args) {

	        //getPizza피자 메소드 2개를 이용하자.
	        Pizza p = new Pizza();
	        //p2, p3로 Pizza 데이터 받기
	        Pizza p2 = getPizza(p); 
	        Pizza p3 = getPizza();

	        System.out.println("p2 피자 종류 "+p2.피자종류);
	        System.out.println("p2 피자 조각 "+p2.피자조각);
	        System.out.println("p3 피자 종류 "+p3.피자종류);
	        System.out.println("p3 피자 조각 "+p3.피자조각);
	 

		}
	
}
