package chap4;
/*
 * ���� ������ ���� 2 : ���������ڿ� �ٸ������ڸ� ���� ����ϴ� ���
 * */

public class OpEx2 {

	public static void main(String[] args) {
		int x=5,y=5;
		y = x++;
		System.out.println("x="+x+",y="+y);
		y = ++x;
		System.out.println("x="+x+",y="+y);
		System.out.println("x="+ x++);
		System.out.println("x="+ ++x);
		x= y--;
		System.out.println("x="+x+",y="+y);
	}

}
