package ������;

public class Movie {

	// 1. ��ȭ�� Ŭ���� ����
	//    Ŭ���� �̸��� Movie

	// 2. Movie Ŭ�������� 3���� �ʵ庯�� ����
	//    2-1. String name; //��ȭ�� �̸�
	//    2-2. String location; //��ȭ�� ��ġ
	//    2-3. int count; //���� �� 

	// 3. Movie Ŭ�������� 3���� ������ ���� (�ʱ�ȭ ���� ��)
	//    3-1. ����Ʈ ������
	//    3-2. �Ķ���Ϳ� ��ȭ�� ��ġ�� �ִ� ������
	//    3-3. �Ķ���Ϳ� ��� �ʵ庯���� ���� ������

	// 4. �Ϲ� �޼ҵ� 1�� ����
	//    4-1. ���������ڰ� public ����Ÿ���� int �޼ҵ� �̸��� getMovie
	//    �Ķ���ʹ� ����.
	
	
	String name; //��ȭ�� �̸�
	String location; //��ȭ�� ��ġ
	int count; //���� �� 
	
	public Movie()
	{
		// ����Ʈ �����ڸ� �����ϰ� �Ķ���Ͱ� �ִ� �����ڸ� �����
		// ����Ʈ �����ڴ� �����.
		// ����Ʈ �����ڸ� ����ϰ� ������, �̷��� ������ ��.
	}
	
	public Movie(String location)
	{
		this.location = location;
	}
	
	public Movie(String name, String location, int count)
	{
		this.name = name;
		this.location = location;
		this.count = count;
	}
	
	public static int getMovie()
	{
		return 0;
	}

}
