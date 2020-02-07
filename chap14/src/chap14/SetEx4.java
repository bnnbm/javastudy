package chap14;

import java.util.Comparator;
import java.util.TreeSet;
/*
 * 정렬 관련 인터페이스
 * ComParable 인터페이스 : 추상메서드 compareTo(Object)
 *                      클래스의 기본 정렬 방식 지정
 * Comparator 인터페이스 : 추상메서드 compare(Object o1, Object o)
 *                      기본 정렬 방식대로 정렬하지 않고 정렬방식을 지정
 */
class Phone implements Comparable<Phone> {
	String name;
	int number;
	public Phone(String name, int number) {
		super();
		this.name = name;
		this.number = number;
	}
	public String toString() {
		return "(" + name + "," + number + ")";
	}
	@Override
	public int compareTo(Phone p) {
		return name.compareTo(p.name);
	}
}
public class SetEx4 {
	public static void main(String[] args) {
//		TreeSet<Phone> set = new TreeSet<>(new Comparator<Phone>() {
//			@Override
//			public int compare(Phone p1, Phone p2) {
//				return p1.name.compareTo(p2.name);
//			}
//		});
		TreeSet<Phone> set = new TreeSet<>();
		set.add(new Phone("홍길동",1234));
		set.add(new Phone("김삿갓",3456));
		set.add(new Phone("이몽룡",5678));
		System.out.println(set);
		
		System.out.println("전화번호순으로 출력");
		set = new TreeSet<>(new Comparator<Phone>() {
			@Override
			public int compare(Phone p1, Phone p2) {
				return p1.number-p2.number;
			}
		});
		set.add(new Phone("홍길동",1234));
		set.add(new Phone("김삿갓",3456));
		set.add(new Phone("이몽룡",5678));
		System.out.println(set);
		
		System.out.println("이름의 역순으로 출력");
		set = new TreeSet<>(Comparator.reverseOrder());
		set.add(new Phone("홍길동",1234));
		set.add(new Phone("김삿갓",3456));
		set.add(new Phone("이몽룡",5678));
		System.out.println(set);
		
		System.out.println("전화번호의 역순으로 출력");
		System.out.println("이름의 역순으로 출력");
		set = new TreeSet<>(new Comparator<Phone>() {
			@Override
			public int compare(Phone p1, Phone p2) {
				return p2.number-p1.number;
			}
		});
		set.add(new Phone("홍길동",1234));
		set.add(new Phone("김삿갓",3456));
		set.add(new Phone("이몽룡",5678));
		System.out.println(set);
		
	}
}
