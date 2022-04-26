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

public class �������8 {	
	
	public static void main(String[] args) {
		
		// list�� ����, ����, ���� �߰�
		// getFruit�� �̿��ؼ� ���� ���
		
		List<FruitVO> list = new ArrayList<FruitVO>();
		
		FruitVO ���� = new FruitVO();
		����.setFruitName("����");
		list.add(����);
		
		FruitVO ���� = new FruitVO();
		����.setFruitName("����");
		list.add(����);
		
		FruitVO ���� = new FruitVO();
		����.setFruitName("����");
		list.add(����);
		
		FruitService service = new FruitService();
		FruitVO result = service.getFruit(list, "����");
		System.out.println(result.getFruitName());
		
	}
}