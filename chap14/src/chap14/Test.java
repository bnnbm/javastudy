package chap14;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
//
///*
// * 1 
//  1 ~ 1000�������� ��ȣ�� ������ ������ �ִ�.
//  1�� 1��, 2�� 2��, 3�� 3�� �� ��÷�ϴ� ���α׷� �ۼ��ϱ�
//  �� ��÷�� 3����� ��÷�ϰ�, ��÷��ȣ�� �ߺ��Ǹ� �ȵȴ�.
//  ����� ������ ����ϹǷ� ����� ����� �޶� ����.
//  LinkedHashSet : ��������, �ߺ��Ұ�
//  Random
//  new ArrayList(Set) : Set ��ü�� List��ü�� ����
//
// [���]
//3�� ���� ��÷�մϴ�.
//945
//123
//6
//2�� ���� ��÷�մϴ�.
//611
//404
//1�� ���� ��÷�մϴ�.
//797
//
//*** ���� ��÷ ��� ***
//1��:797,
//2��:404,611,
//3��:6,123,945,  
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
		System.out.println("3�� ���� ��÷�մϴ�.");
		for(int i = 3;i<6;i++) {
			  System.out.println(list.get(i));
		}
			  System.out.println("2�� ���� ��÷�մϴ�.");
	   for(int i = 1;i<3;i++) {
			  System.out.println(list.get(i));
		}
			  System.out.println("1�� ���� ��÷�մϴ�.");
	   for(int i = 0;i<1;i++) {
			  System.out.println(list.get(i));
		}		
			  System.out.println("*** ���� ��÷ ��� ***");
			  System.out.println("1�� : "+list.get(0));
			  System.out.println("2�� : "+list.get(1)+","+list.get(2));
			  System.out.println("3�� : "+list.get(3)+","+list.get(4)+","+list.get(5));
	}
}




//package chap14;
//
//import java.util.ArrayList;
//import java.util.LinkedHashSet;
//import java.util.List;

/*
 * 1 
  1 ~ 1000�������� ��ȣ�� ������ ������ �ִ�.
  1�� 1��, 2�� 2��, 3�� 3�� �� ��÷�ϴ� ���α׷� �ۼ��ϱ�
  �� ��÷�� 3����� ��÷�ϰ�, ��÷��ȣ�� �ߺ��Ǹ� �ȵȴ�.
  ����� ������ ����ϹǷ� ����� ����� �޶� ����.
  LinkedHashSet : ��������, �ߺ��Ұ�
  Random
  new ArrayList(Set) : Set ��ü�� List��ü�� ����

 [���]
3�� ���� ��÷�մϴ�.
945
123
6
2�� ���� ��÷�մϴ�.
611
404
1�� ���� ��÷�մϴ�.
797

*** ���� ��÷ ��� ***
1��:797,
2��:404,611,
3��:6,123,945,  

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
//		System.out.println("3�� ���� ��÷�մϴ�.");
//		for(Integer i4 : list4) {
//			System.out.println(i4);
//		}
//		System.out.println("2�� ���� ��÷�մϴ�.");
//		for(Integer i3 : list3) {
//			System.out.println(i3);
//		}
//		System.out.println("1�� ���� ��÷�մϴ�.");
//		for(Integer i2 : list2) {
//			System.out.println(i2);
//		}
//		System.out.println();
//		System.out.println("*** ���� ��÷ ��� ***");
//		System.out.print("1�� : ");
//		for(Integer i2 : list2) {
//			System.out.print(i2);
//		}
//		System.out.println();
//		System.out.print("2�� : ");
//		for(Integer i3 : list3) {
//			System.out.print(i3 + ",");
//		}
//		System.out.println();
//		System.out.print("3�� : ");
//		for(Integer i4 : list4) {
//			System.out.print(i4 + ",");
//		}
//		
//	}
//}
	