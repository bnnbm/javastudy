package chap14;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
//
///*
// * 1 
//  1 ~ 1000번까지의 번호를 가지는 복권이 있다.
//  1등 1장, 2등 2장, 3등 3장 을 추첨하는 프로그램 작성하기
//  단 추첨은 3등부터 추첨하고, 당첨번호는 중복되면 안된다.
//  결과는 난수를 사용하므로 실행시 결과가 달라 진다.
//  LinkedHashSet : 순서유지, 중복불가
//  Random
//  new ArrayList(Set) : Set 객체를 List객체로 생성
//
// [결과]
//3등 복권 추첨합니다.
//945
//123
//6
//2등 복권 추첨합니다.
//611
//404
//1등 복권 추첨합니다.
//797
//
//*** 복권 추첨 결과 ***
//1등:797,
//2등:404,611,
//3등:6,123,945,  
//
// */
public class Test {
	public static void main(String[] args) {
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		List<Integer> list = new ArrayList<Integer>();
		while(set.size() < 6) {
			set.add((int)(Math.random()*1000)+1);
		}
		list.addAll(set);
		System.out.println(list);
		System.out.println("3등 복권 추첨합니다.");
		for(int i = 3;i<6;i++) {
			  System.out.println(list.get(i));
		}
			  System.out.println("2등 복권 추첨합니다.");
	   for(int i = 1;i<3;i++) {
			  System.out.println(list.get(i));
		}
			  System.out.println("1등 복권 추첨합니다.");
	   for(int i = 0;i<1;i++) {
			  System.out.println(list.get(i));
		}		
			  System.out.println("*** 복권 추첨 결과 ***");
			  System.out.println("1등 : "+list.get(0));
			  System.out.println("2등 : "+list.get(1)+","+list.get(2));
			  System.out.println("3등 : "+list.get(3)+","+list.get(4)+","+list.get(5));
	}
}




//package chap14;
//
//import java.util.ArrayList;
//import java.util.LinkedHashSet;
//import java.util.List;

/*
 * 1 
  1 ~ 1000번까지의 번호를 가지는 복권이 있다.
  1등 1장, 2등 2장, 3등 3장 을 추첨하는 프로그램 작성하기
  단 추첨은 3등부터 추첨하고, 당첨번호는 중복되면 안된다.
  결과는 난수를 사용하므로 실행시 결과가 달라 진다.
  LinkedHashSet : 순서유지, 중복불가
  Random
  new ArrayList(Set) : Set 객체를 List객체로 생성

 [결과]
3등 복권 추첨합니다.
945
123
6
2등 복권 추첨합니다.
611
404
1등 복권 추첨합니다.
797

*** 복권 추첨 결과 ***
1등:797,
2등:404,611,
3등:6,123,945,  

 */
//public class Test {
//	public static void main(String[] args) {
//		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
//     	List<Integer> list = new ArrayList<Integer>();
//     	
//     	while(set.size()<6) {
//     		set.add((int)(Math.random()*1000)+1);
//     	}
//     	list.addAll(set);
//		System.out.println(list);
//		List<Integer> list2 = new ArrayList<Integer>(list.subList(0, 1));
//		List<Integer> list3 = new ArrayList<Integer>(list.subList(1, 3));
//		List<Integer> list4 = new ArrayList<Integer>(list.subList(3, 6));
//		
//		System.out.println("3등 복권 추첨합니다.");
//		for(Integer i4 : list4) {
//			System.out.println(i4);
//		}
//		System.out.println("2등 복권 추첨합니다.");
//		for(Integer i3 : list3) {
//			System.out.println(i3);
//		}
//		System.out.println("1등 복권 추첨합니다.");
//		for(Integer i2 : list2) {
//			System.out.println(i2);
//		}
//		System.out.println();
//		System.out.println("*** 복권 추첨 결과 ***");
//		System.out.print("1등 : ");
//		for(Integer i2 : list2) {
//			System.out.print(i2);
//		}
//		System.out.println();
//		System.out.print("2등 : ");
//		for(Integer i3 : list3) {
//			System.out.print(i3 + ",");
//		}
//		System.out.println();
//		System.out.print("3등 : ");
//		for(Integer i4 : list4) {
//			System.out.print(i4 + ",");
//		}
//		
//	}
//}
	