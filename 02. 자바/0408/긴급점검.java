package test;

public class ������� {

	public static void main(String[] args) {

		String name = "ȫ�浿";
		String name2 = "ȫ�浿";
		boolean isTrue = false;		
		// 1) name�� name2�� ������ isTrue�� true�� ����
		if (name.equals(name2)) {
			isTrue = true;
		}
		
		int x = 10;
		int y = 12;
		// 2) x�� y�� �ٸ��� isTrue�� false�� ����
		if (x != y) {
			isTrue = false;
		}
		
		// 3) x�� y���� ������ isTrue�� true�� ����
		if (x < y) {
			isTrue = true;
		}
		
		// 4) isTrue�� true�� x�� 12�� ����
		//    x�� y�� ������ isTrue�� false�� ����
		if (isTrue) {
			x = 12;
			if (x == y) {
				isTrue = false;
			}
		}	
		
		
		
		
		
		
	}

}
