package ��Ÿ�ӳ뾾;

abstract class Chef {  // abstract�� ������ 'Chef'�� �߻� Ŭ������ ����
					   // '�߻�޼ҵ� or �Ϲݸ޼ҵ�'�� ���� �� �� ����
	public void �丮���ϴ�() {  // �Ϲݸ޼ҵ�
		
	}
	abstract public void ����������ϴ�();   // �߻�޼ҵ�
		// �߻�޼ҵ�� �߰�ȣ�� ����. ������ ���������� �ƴ�
		// ���Ǹ� �� ���� �ڽ�Ŭ�������� �������̵� �ϴ� ���� ������
	
}

class Food extends Chef {
	// Food�� �������̵��� �ϸ�, Food Ŭ������ �ν��Ͻ�ȭ(new ȣ��)�� �� �� �ִ�
	@Override
	public void ����������ϴ�() {  // �� �������� ���������� �ϸ� ��
		
	}
	
}

public class �߻�ȭ������� {

	public static void main(String[] args) {

		Food f = new Food();
		
	}

}
