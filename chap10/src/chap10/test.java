package chap10;
class Outer32 {
	 int value = 10;

	 class Inner {
	  int value = 20;

	  void method1() {
	   int value = 30;
	   System.out.println(value);
	   System.out.println(this.value);
	   System.out.println(Outer32.this.value);
	  }
	 }
}
public class test{
	public static void main(String[] args)  {
		  Outer32.Inner i = new Outer32().new Inner();
		  i.method1();
	}
}


//1.
//다음 소스는 컴파일 오류가 발생한다. 결과가 "Tested" 가 출력되도록 프로그램을 수정하고
//수정한 이유를 설명하기.
//   interface Beta {}
//   class Alpha implements Beta {
//   String testIt() {
//   return "Tested";
//   }
//  }
//    public class T_0917_01 {
//     static Beta getIt() {
//      return new Alpha();  // Beta 인터페이스를 구현한 구현클래스의 객체	
//    }
//       public static void main(String[] args) {
//          Beta b = getIt();
//          System.out.println(((Alpha) b).testIt());
//            //객체를 Beta로 선언하여서 부모클래스인 Alpha를 사용하려면 형변환 필요하다
//       }
//     }
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//		2.  Outer클래스의 내부 클래스 Inner의 멤버변수 iv의 값 출력
//		class Outer1 {
//		 class Inner {
//		  int iv = 100;
//		 }
//		}
//		public class Test0917_2 {
//		 public static void main(String[] args) {
//          Outer1.Inner ii = new Outer1().new Inner();
//          System.out.println(ii.iv);
//		 }
//		}
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//		3. Outer클래스의 내부 클래스 Inner의 멤버변수 iv의 값 출력
//		 class Outer2 {
//		 static class Inner { 
//		  int iv = 200;
//		 }
//		}
//		public class Test0917_3 {
//		 public static void main(String[] args) {
//           Outer2.Inner oi = new Outer2.Inner();  //자료형: 외부클래스.내부클래스 
//           System.out.println(oi.iv);
//		 }
//		}
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//		4. 
//		 main 메서드에서 method1() 메서드를 호출하고, method1 메서드에서 value 값을 출력하여 다음의 결과가 나오도록 프로그램 수정하기
//		 [결과]
//		 30
//		 20
//		 10
//		class Outer3 {
//		 int value = 10;
//		 class Inner {
//		  int value = 20;
//		  void method1() {
//		   int value = 30;
//		  }
//		 }
//		}
//		public class Test0917_4 {
//		 public static void main(String[] args) {
//		 }
//		}
//
//========>
//
//package chap10;
//class Outer32 {
//	 int value = 10;
//
//	 class Inner {
//	  int value = 20;
//
//	  void method1() {
//	   int value = 30;
//	   System.out.println(value);
//	   System.out.println(this.value);
//	   System.out.println(Outer32.this.value);
//	  }
//	 }'
//}
//public class test{
//	public static void main(String[] args)  {
//		  Outer32.Inner i = new Outer32().new Inner();
//		  i.method1();
//	}
//}
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//		5. 1부터 100까지 중 임의의 숫자를 컴퓨터가 저장하고, 값을 입력받아 저장된 값을 맞추는 프로그램을 작성하기
//		   단 1 부터 100까지의 숫자가 아닌 경우에는 1 과 100사이의 숫자만 입력하세요를 출력하고 
//		   숫자가 입력이 안된 경우는 숫자만 입력하세요 를 출력하고 계속 입력을 받는다.
//		   몇번의 입력만에 숫자를 맞추었는지 출력하기.
//		   단 입력 오류된 입력도 입력 건수에 포함된다.
//package chap10;
//import java.util.InputMismatchException;
//import java.util.Scanner;
//
//public class test{
//	public static void main(String[] args) throws Exception {
//				int ans = (int)(Math.random() * 100) + 1;
//				Scanner scan = new Scanner(System.in);
//				int i =0;
//				int input = 0;
//				do {
//					i++;
//					System.out.println("1~100 사이의 숫자를 입력하세요");	
//					try {
//					input = scan.nextInt();
//					if(input < 1 || input > 100 ) {
//						throw new Exception("1부터 100까지의 숫자만 입력하세요");
//					}			
//					if(ans > input) {
//						System.out.println("더 큰수입니다.");
//					}else if (ans < input) {
//						System.out.println("더 작은 수입니다.");
//					}else {
//						System.out.println("정답입니다.");
//					}
//					} catch (InputMismatchException e) {
//						System.out.println("숫자만 입력하세요");
//						scan = new Scanner(System.in);
//						continue;
//					} catch (Exception e) {
//				    	System.out.println(e.getMessage());
//				    }
//				}while(ans!=input);
//				System.out.println(i+"번만의 정답입니다.");
//				
//	}
//}
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ