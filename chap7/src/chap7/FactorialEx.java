package chap7;
//call stack 영역
// 재귀메서드
public class FactorialEx {
	public static void main(String[] args) {
		System.out.println("4! =" + factorial(4));
	}
	private static int factorial(int i) {
		return (i==1)?1:i*factorial(i-1);
	}
}
