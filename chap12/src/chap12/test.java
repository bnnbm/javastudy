package chap12;
//2. ���� ����� �������� ���α׷��� �ϼ��Ͻÿ�
//[���]
//fullPath:c:/jdk12/work/Test.java
//path:c:/jdk12/work
//fileName:Test.java
//


 public class test {
    public static void main(String[] args) {
      String fullPath = "c:/jdk12/work/Test.java";
      String path="";
      String fileName = "";
      
      path = fullPath.substring(0,fullPath.lastIndexOf("/"));
      fileName = fullPath.substring(fullPath.lastIndexOf("/")+1);
      
      System.out.println("fullPath:" + fullPath);
      System.out.println("path:" + path);
      System.out.println("fileName:" + fileName);
   }
}


//1. ���� Ŭ������ ���� ������ ���� ����� �������� Card Ŭ������ �ϼ��Ͻÿ�.
//[���]
//c1�� c2�� �ٸ� ��ü�Դϴ�.
//c1�� c2�� ���� ������ ī�� �Դϴ�.
//c1 ī�� :(Spade,1)
//c2 ī�� :(Spade,1)

//class Card {
// String kind;
// int num;
//}
//public class Test0918_1 {
// public static void main(String[] args) {
//  Card c1 = new Card("Spade",1);
//  Card c2 = new Card();
//  if(c1==c2) {
//   System.out.println("c1�� c2�� ���� ��ü�Դϴ�.");
//  } else {
//   System.out.println("c1�� c2�� �ٸ� ��ü�Դϴ�.");
//  }
//  if(c1.equals(c2)) {
//   System.out.println("c1�� c2�� ���� ������ ī�� �Դϴ�.");
//  } else {
//   System.out.println("c1�� c2�� �ٸ� ������ ī�� �Դϴ�.");
//  }
//  System.out.println("c1 ī�� :" + c1);
//  System.out.println("c2 ī�� :" + c2);
// }
//}
// �� �� �� �� �� �� �Ѥ� �� �� �� �� �� �� �� ��  ��  �� �� �� �� �� �� �� �� �� ��
//package chap12;
//class Card {
//	String kind;
//	int num;
//	public Card(String kind, int num) {
//		this.kind = kind;
//		this.num = num;
//	}
//	public Card() {
//		this.kind = "Spade";
//		this.num = 1;
//	}
////	equals : Object Ŭ���� ���, ��� Ŭ������ ��ü���� ���� ����.
////	         ������ ���Ҷ� ���. ������ Ŭ�������� �������̵� �ʿ�
////	toString : Object Ŭ���� ���.
////	           ��ü�� ���ڿ� ǥ�ø� ���� �޼���.
//	@Override
//	public boolean equals(Object o) {
//		if(o instanceof Card) {
//			Card e = (Card)o;
//			return kind==e.kind && num==e.num;
//		} else return false;
//	}
//	@Override
//	public String toString() {
//		return "(" + kind + "," + num + ")";
//	}
//	
//  }
//public class test {
//
//	public static void main(String[] args) {
//		Card c1 = new Card("Spade",1);
//	    Card c2 = new Card();
//	    if(c1==c2) {
//	     System.out.println("c1�� c2�� ���� ��ü�Դϴ�.");
//	    } else {
//	     System.out.println("c1�� c2�� �ٸ� ��ü�Դϴ�.");
//	    }
//	    if(c1.equals(c2)) {
//	     System.out.println("c1�� c2�� ���� ������ ī�� �Դϴ�.");
//	    } else {
//	     System.out.println("c1�� c2�� �ٸ� ������ ī�� �Դϴ�.");
//	    }
//	    System.out.println("c1 ī�� :" + c1);
//	    System.out.println("c2 ī�� :" + c2);
//	   }
//	  }

//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
//2. ���� ����� �������� ���α׷��� �ϼ��Ͻÿ�
//[���]
//fullPath:c:/jdk12/work/Test.java
//path:c:/jdk12/work
//fileName:Test.java
//
//public class Test0918_2 {
// public static void main(String[] args) {
//  String fullPath = "c:/jdk12/work/Test.java";
//  String path="";
//  String fileName = "";
//
//  System.out.println("fullPath:" + fullPath);
//  System.out.println("path:" + path);
//  System.out.println("fileName:" + fileName);
// }
//}
