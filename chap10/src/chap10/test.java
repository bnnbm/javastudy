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
//���� �ҽ��� ������ ������ �߻��Ѵ�. ����� "Tested" �� ��µǵ��� ���α׷��� �����ϰ�
//������ ������ �����ϱ�.
//   interface Beta {}
//   class Alpha implements Beta {
//   String testIt() {
//   return "Tested";
//   }
//  }
//    public class T_0917_01 {
//     static Beta getIt() {
//      return new Alpha();  // Beta �������̽��� ������ ����Ŭ������ ��ü	
//    }
//       public static void main(String[] args) {
//          Beta b = getIt();
//          System.out.println(((Alpha) b).testIt());
//            //��ü�� Beta�� �����Ͽ��� �θ�Ŭ������ Alpha�� ����Ϸ��� ����ȯ �ʿ��ϴ�
//       }
//     }
//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
//		2.  OuterŬ������ ���� Ŭ���� Inner�� ������� iv�� �� ���
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
//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
//		3. OuterŬ������ ���� Ŭ���� Inner�� ������� iv�� �� ���
//		 class Outer2 {
//		 static class Inner { 
//		  int iv = 200;
//		 }
//		}
//		public class Test0917_3 {
//		 public static void main(String[] args) {
//           Outer2.Inner oi = new Outer2.Inner();  //�ڷ���: �ܺ�Ŭ����.����Ŭ���� 
//           System.out.println(oi.iv);
//		 }
//		}
//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
//		4. 
//		 main �޼��忡�� method1() �޼��带 ȣ���ϰ�, method1 �޼��忡�� value ���� ����Ͽ� ������ ����� �������� ���α׷� �����ϱ�
//		 [���]
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
//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
//		5. 1���� 100���� �� ������ ���ڸ� ��ǻ�Ͱ� �����ϰ�, ���� �Է¹޾� ����� ���� ���ߴ� ���α׷��� �ۼ��ϱ�
//		   �� 1 ���� 100������ ���ڰ� �ƴ� ��쿡�� 1 �� 100������ ���ڸ� �Է��ϼ��並 ����ϰ� 
//		   ���ڰ� �Է��� �ȵ� ���� ���ڸ� �Է��ϼ��� �� ����ϰ� ��� �Է��� �޴´�.
//		   ����� �Է¸��� ���ڸ� ���߾����� ����ϱ�.
//		   �� �Է� ������ �Էµ� �Է� �Ǽ��� ���Եȴ�.
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
//					System.out.println("1~100 ������ ���ڸ� �Է��ϼ���");	
//					try {
//					input = scan.nextInt();
//					if(input < 1 || input > 100 ) {
//						throw new Exception("1���� 100������ ���ڸ� �Է��ϼ���");
//					}			
//					if(ans > input) {
//						System.out.println("�� ū���Դϴ�.");
//					}else if (ans < input) {
//						System.out.println("�� ���� ���Դϴ�.");
//					}else {
//						System.out.println("�����Դϴ�.");
//					}
//					} catch (InputMismatchException e) {
//						System.out.println("���ڸ� �Է��ϼ���");
//						scan = new Scanner(System.in);
//						continue;
//					} catch (Exception e) {
//				    	System.out.println(e.getMessage());
//				    }
//				}while(ans!=input);
//				System.out.println(i+"������ �����Դϴ�.");
//				
//	}
//}
//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�