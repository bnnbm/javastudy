package chap11;
class MyException2 extends Exception{}
class MyException3 extends MyException2{}
public class Exam5 {
	public static void main(String[] args) {
		try {
			throw new MyException3();
		}catch (MyException2 e) {
			System.out.println("MyException2 예외처리");
		}catch (Exception e) {
			System.out.println("Exception 예외처리");
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
