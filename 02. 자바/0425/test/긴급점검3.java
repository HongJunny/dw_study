package test;

import java.util.ArrayList;
import java.util.List;

class Singer{
	public String SingerName; //���� �̸�
	public Singer(String singerName) {
		this.SingerName = singerName;
	}
}


public class �������3 {
	
	public static List<Singer> getListSinger(){
		List<Singer> list = new ArrayList<Singer>();
		list.add(new Singer("������"));
		list.add(new Singer("���α�"));
		list.add(new Singer("��뱹"));
		for (int i=0; i<list.size(); i++) {
			System.out.print(list.get(i).SingerName+" ");
		}
		return list;
	}
	
	public static Singer getSinger(){
		Singer singer = new Singer("������");
		return singer;
	}
	
	public static void main(String[] args) {
		//1. getListSinger()�̿��ؼ� ������, ���α�, ��뱹 list ���!
		System.out.println(getListSinger());
		
		//2. getSinger()�̿��ؼ� �������� ���!
		System.out.println(getSinger().SingerName);
		
	}
}