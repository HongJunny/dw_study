package 생성자;

public class KoreaVO {

	// 1. KoreaVO 클래스 생성

	// 2. 필드 변수
	//    1) private String location;  // 지역 이름
	//    2) private String addr;  // 주소
	//    3) private String name;  // 지역 대표자
	//    4) private int count;  // 지역 수

	// 3. 모든 필드변수 get, set 함수 만들기
	
	
	private String location;  // 지역 이름
	private String addr;  // 주소
	private String name;  // 지역 대표자
	private int count;  // 지역 수
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	
}
