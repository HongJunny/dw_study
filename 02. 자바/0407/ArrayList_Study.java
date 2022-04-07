package 컬렉션즈;

import java.util.ArrayList;

public class ArrayList_Study {

	public static void main(String[] args) {

		// ArrayList<String> list;   // "ctrl + Shift + o" 같이 눌러주기
		ArrayList<String> list = new ArrayList<String>();
		// <> = 제네릭
		// 무한으로 데이터를 추가 할 수 있음
		list.add("시금치 파스타");  // add = 데이터를 리스트에 추가
		list.add("곱창 파스타");
		list.add("곱창 파스타");
		list.add("곱창 파스타");
		list.add("곱창 파스타");
		
		int len = list.size();   // list 길이 호출		
		System.out.println("list 길이는 => "+len);
		
		String value01 = list.get(0);
		System.out.println(value01);
		
		String value02 = list.get(1);
		System.out.println(value02);
		
		int count = 0;
		for (int i=0; i<len; i++) {			
			if(list.get(i).equals("곱창 파스타")) {
				// "==" 대신에 "equals()"를 써야 함. 문자형일때만.
				++count;
			}
		}
		System.out.println("곱창 파스타의 수량 => "+count);
		
		
		
		
		// int를 담는 ArrayList
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(10);
		list2.add(40);
		list2.add(60);
		list2.add(80);
		list2.add(30);
		// list2.remove(1);  // 삭제
		// 삭제 된 자리의 뒤에 있는 배열들이 한칸씩 앞으로 이동 함
		// 처음 배열 : 10, 40, 60, 80, 30
		// 삭제 된 후 배열 : 10, 60, 80, 30
		int sum = 0;
		for (int i=0; i<list2.size(); i++) {
			sum += list2.get(i);
		}
		System.out.println("리스트의 총 합은 => "+sum);
		
		int sum1 = 0;
		for (int i=0; i<list2.size(); i++) {
			if (list2.get(i) != 40) {
				sum1 += list2.get(i);
			}
		}
		System.out.println("1번째 배열을 제외한 리스트의 총 합은 => "+sum1);
		
	}

}
