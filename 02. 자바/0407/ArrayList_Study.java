package �÷�����;

import java.util.ArrayList;

public class ArrayList_Study {

	public static void main(String[] args) {

		// ArrayList<String> list;   // "ctrl + Shift + o" ���� �����ֱ�
		ArrayList<String> list = new ArrayList<String>();
		// <> = ���׸�
		// �������� �����͸� �߰� �� �� ����
		list.add("�ñ�ġ �Ľ�Ÿ");  // add = �����͸� ����Ʈ�� �߰�
		list.add("��â �Ľ�Ÿ");
		list.add("��â �Ľ�Ÿ");
		list.add("��â �Ľ�Ÿ");
		list.add("��â �Ľ�Ÿ");
		
		int len = list.size();   // list ���� ȣ��		
		System.out.println("list ���̴� => "+len);
		
		String value01 = list.get(0);
		System.out.println(value01);
		
		String value02 = list.get(1);
		System.out.println(value02);
		
		int count = 0;
		for (int i=0; i<len; i++) {			
			if(list.get(i).equals("��â �Ľ�Ÿ")) {
				// "==" ��ſ� "equals()"�� ��� ��. �������϶���.
				++count;
			}
		}
		System.out.println("��â �Ľ�Ÿ�� ���� => "+count);
		
		
		
		
		// int�� ��� ArrayList
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(10);
		list2.add(40);
		list2.add(60);
		list2.add(80);
		list2.add(30);
		// list2.remove(1);  // ����
		// ���� �� �ڸ��� �ڿ� �ִ� �迭���� ��ĭ�� ������ �̵� ��
		// ó�� �迭 : 10, 40, 60, 80, 30
		// ���� �� �� �迭 : 10, 60, 80, 30
		int sum = 0;
		for (int i=0; i<list2.size(); i++) {
			sum += list2.get(i);
		}
		System.out.println("����Ʈ�� �� ���� => "+sum);
		
		int sum1 = 0;
		for (int i=0; i<list2.size(); i++) {
			if (list2.get(i) != 40) {
				sum1 += list2.get(i);
			}
		}
		System.out.println("1��° �迭�� ������ ����Ʈ�� �� ���� => "+sum1);
		
	}

}
