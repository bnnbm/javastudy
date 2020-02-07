package test;
//7. 작성된 프로그램을 통해 출력되는 a와 x값 구하기.
public class Test7 {
	public static void main(String[] args) {
		int a=3;
		int x = (a++)*(2+a);
		System.out.println("a="+a);
		System.out.println("x="+x);
	}
}