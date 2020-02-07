package chap12;
//2. 다음 결과가 나오도록 프로그램을 완성하시오
//[결과]
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


//1. 구동 클래스를 실행 했을때 다음 결과가 나오도록 Card 클래스를 완성하시오.
//[결과]
//c1과 c2는 다른 객체입니다.
//c1과 c2는 같은 내용의 카드 입니다.
//c1 카드 :(Spade,1)
//c2 카드 :(Spade,1)

//class Card {
// String kind;
// int num;
//}
//public class Test0918_1 {
// public static void main(String[] args) {
//  Card c1 = new Card("Spade",1);
//  Card c2 = new Card();
//  if(c1==c2) {
//   System.out.println("c1과 c2는 같은 객체입니다.");
//  } else {
//   System.out.println("c1과 c2는 다른 객체입니다.");
//  }
//  if(c1.equals(c2)) {
//   System.out.println("c1과 c2는 같은 내용의 카드 입니다.");
//  } else {
//   System.out.println("c1과 c2는 다른 내용의 카드 입니다.");
//  }
//  System.out.println("c1 카드 :" + c1);
//  System.out.println("c2 카드 :" + c2);
// }
//}
// ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ  ㅡ  ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ ㅡ
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
////	equals : Object 클래스 멤버, 모든 클래스의 객체에서 접근 가능.
////	         내용을 비교할때 사용. 각각의 클래스에서 오버라이딩 필요
////	toString : Object 클래스 멤버.
////	           객체의 문자열 표시를 위한 메서드.
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
//	     System.out.println("c1과 c2는 같은 객체입니다.");
//	    } else {
//	     System.out.println("c1과 c2는 다른 객체입니다.");
//	    }
//	    if(c1.equals(c2)) {
//	     System.out.println("c1과 c2는 같은 내용의 카드 입니다.");
//	    } else {
//	     System.out.println("c1과 c2는 다른 내용의 카드 입니다.");
//	    }
//	    System.out.println("c1 카드 :" + c1);
//	    System.out.println("c2 카드 :" + c2);
//	   }
//	  }

//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//2. 다음 결과가 나오도록 프로그램을 완성하시오
//[결과]
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
