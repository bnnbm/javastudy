package chap18;
import java.util.function.IntBinaryOperator;

/*
 * IntBinaryOperator �������̽��� �̿��Ͽ� �迭�� ����� �ִ� ���ڿ� �ּ� ���ڸ� ����ϱ�
 * 10���� �������� 1���� 100���� �� ������ ���� ä�� �� �� ���� ū ���� ���� ���� ���� ����ϱ�
 */
public class Exam3 {
	private static int[] arr = new int[10];
	public static void main(String[] args) {
		int i = 0;
		for(int a : arr) {
			a = (int)((Math.random()*100)+1);			
			arr[i] = a;
			i++;	
			System.out.print(a+",");
		}
		
		System.out.println();
		System.out.println("�ִ밪:" + maxOrMin((a,b) ->(a>=b)?a:b));
		System.out.println("�ּҰ�:" + maxOrMin((a,b) ->(a<=b)?a:b));
	}
	private static int maxOrMin(IntBinaryOperator op) {
		int result = arr[0];
		for(int a : arr) {
			result = op.applyAsInt(result, a);
		}
		return result;
	}
}
