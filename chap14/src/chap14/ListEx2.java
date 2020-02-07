package chap14;

import java.util.Vector;

/*
 * Vector ���� : Collection ������ ��ũ ������ ���Ǵ� Ŭ����
 */
public class ListEx2 {
	public static void main(String[] args) {
		Vector<Double> list = new Vector<Double>();
		list.add(0.3);
		list.add(Math.PI);
		list.addElement(5.0); // Vector�� �߰���� �޼���. add�� ���� ���
		for(Double o : list) {
			System.out.println(o);
		}
		double num = 5.0;
		int index = list.indexOf(num);
		if(index >= 0) System.out.println(num + "�� ��ġ:" + index);
		else System.out.println(num + "�� list�� �����ϴ�.");
		num = 0.3;
		System.out.println(list.indexOf(num)); // 0
		System.out.println(list.indexOf(5.0)); // 2
		if(list.contains(num)) { // list�� ����� 0.3 �� ������ ����??
			list.removeElement(num); // ����
			System.out.println(num + "������.");
		}
		System.out.println(list.indexOf(num)); //-1 ���ٴ¸���
		System.out.println(list);
	}
}
