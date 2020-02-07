package chap14;

import java.util.Vector;

/*
 * Vector 예제 : Collection 프레임 워크 이전에 사용되던 클래스
 */
public class ListEx2 {
	public static void main(String[] args) {
		Vector<Double> list = new Vector<Double>();
		list.add(0.3);
		list.add(Math.PI);
		list.addElement(5.0); // Vector의 추가기능 메서드. add와 같은 기능
		for(Double o : list) {
			System.out.println(o);
		}
		double num = 5.0;
		int index = list.indexOf(num);
		if(index >= 0) System.out.println(num + "의 위치:" + index);
		else System.out.println(num + "은 list에 없습니다.");
		num = 0.3;
		System.out.println(list.indexOf(num)); // 0
		System.out.println(list.indexOf(5.0)); // 2
		if(list.contains(num)) { // list의 요소중 0.3 인 데이터 존재??
			list.removeElement(num); // 삭제
			System.out.println(num + "삭제됨.");
		}
		System.out.println(list.indexOf(num)); //-1 없다는말임
		System.out.println(list);
	}
}
