package test;

import java.util.ArrayList;
import java.util.List;

class FruitVO {
	
	private String fruitName;

	public String getFruitName() {
		return fruitName;
	}

	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}	
}

class FruitService {
	public FruitVO getFruit(List<FruitVO> list, String fruitName) {
		
		for (int i=0; i<list.size(); i++) {
			if(list.get(i).getFruitName().equals(fruitName)) {
				return list.get(i);
			}
		}
		
		return null;
	}
}

public class 긴급점검8 {	
	
	public static void main(String[] args) {
		
		// list에 포도, 수박, 참외 추가
		// getFruit를 이용해서 수박 출력
		
		List<FruitVO> list = new ArrayList<FruitVO>();
		
		FruitVO 포도 = new FruitVO();
		포도.setFruitName("포도");
		list.add(포도);
		
		FruitVO 수박 = new FruitVO();
		수박.setFruitName("수박");
		list.add(수박);
		
		FruitVO 참외 = new FruitVO();
		참외.setFruitName("참외");
		list.add(참외);
		
		FruitService service = new FruitService();
		FruitVO result = service.getFruit(list, "수박");
		System.out.println(result.getFruitName());
		
	}
}