package 생성자;

	// 실무에서 필드변수 데이터를 대입하는 방법
	// 
public class 일식당 {

	private String porkCutlet;  // 돈까스
	private String price; // 가격
	
	// set 함수 - void를 이용해서 필드변수 초기화.
	public void setPorkCutlet(String porkCutlet)  
	{
		this.porkCutlet = porkCutlet;
	}
	
	// get 함수 
	public String getPorkCutlet()
	{
		return this.porkCutlet;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
	public String getPrice() {
		return price;
	}
	
	
	
	
	
}
