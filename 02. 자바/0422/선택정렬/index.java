package ��������;

public class index {

	public static void main(String[] args) {

		int array[] = {9, 6, 7, 3, 5};
		boolean isChange = false;   // ��ȯ ���� �Ǵ�
		// 4ȸ��
		
		// 1ȸ�� : �迭���� 4�� üũ (�ּڰ� ã��)		
		for (int i=0; i<(array.length-1); i++) {
			System.out.println(array[i]);
		}
		System.out.println("----");
		
		// �ּڰ� ���غ���
		int min = array[0];  // �迭 ù��° ���� �ְ� ��
		for (int i=1; i<array.length; i++) {
			if (min > array[i]) {
				min = array[i];
			}
		}
		System.out.println(min);
		System.out.println("----");
		
		// ������ '4ȸ���� �ּڰ�'�� ���Ѱ��� ������ ��ġ��
		for (int i=0; i<(array.length-1); i++) {
			// step 1. �ּڰ� ���� ������ ���� �ϱ�
			int arrayMin = array[i];   // 0��° ���� �ʱⰪ���� ����
			int index = 0;   // �ּڰ� ��ġ
			// step 2. 
			for (int j=i+1; j<array.length; j++) {
				if (arrayMin > array[j]) {
					arrayMin = array[j];
					index = j;
					isChange = true;   // �ּڰ��� ����
				}
			}
			if (isChange) {
				int temp = array[i];
				array[i] = arrayMin;
				array[index] = temp;
			}
			if (!isChange) {
				break;   // �ּڰ��� ���ٰ� �Ǵ� ���� ��, break�� for�� �ߴ�
			}
			System.out.print(array[i]+" ");
		}
		
	}

}




