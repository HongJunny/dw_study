package 컬렉션즈;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


class OneSoju {
	
}


public class Hash_Study {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();	
		// List<String> list2 = new ArrayList<String>();   // 실무에서 쓰는 방법
		// list2 = new LinkedList<String>();
		
		HashMap<String,Object> map = new HashMap<String,Object>(); 
		// Map<String,Object> map2 = new HashMap<String,Object>();   // 실무에서 쓰는 방법
		// value 자리에 object를 쓰면, 문자형과 숫자형을 다 적을 수 있음
		
		map.put("1", "참이슬");  // hashmap에 데이터 넣기
		map.put("2", "처음처럼");
		map.put("a", "한라산");
		map.put("b", 13);

		System.out.println(map.get("1"));   // key 이름으로 value 접근
		System.out.println(map.get("a"));
		
		OneSoju one = new OneSoju();
		map.put("c", one);
		System.out.println(map.get("c"));
		
	}

}
