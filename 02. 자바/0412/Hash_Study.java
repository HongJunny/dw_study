package �÷�����;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


class OneSoju {
	
}


public class Hash_Study {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();	
		// List<String> list2 = new ArrayList<String>();   // �ǹ����� ���� ���
		// list2 = new LinkedList<String>();
		
		HashMap<String,Object> map = new HashMap<String,Object>(); 
		// Map<String,Object> map2 = new HashMap<String,Object>();   // �ǹ����� ���� ���
		// value �ڸ��� object�� ����, �������� �������� �� ���� �� ����
		
		map.put("1", "���̽�");  // hashmap�� ������ �ֱ�
		map.put("2", "ó��ó��");
		map.put("a", "�Ѷ��");
		map.put("b", 13);

		System.out.println(map.get("1"));   // key �̸����� value ����
		System.out.println(map.get("a"));
		
		OneSoju one = new OneSoju();
		map.put("c", one);
		System.out.println(map.get("c"));
		
	}

}
