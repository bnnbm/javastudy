package chap18;

public class Exam2 {
	static int[] arr = {1,2,3,4,5,6,7,8,9,10};
	public static void main(String[] args) {		
		System.out.println("(5,2)두수의 합 :" + calc((x,y)->x+y,5,2));
		System.out.println("(5,2)두수의 곱 :" + calc((x,y)->x*y,5,2));
		
		
		System.out.println("arr 배열 중 가장 큰 수 :" + calc((x,y)->(x>y)?x:y));
		System.out.println("arr 배열 중 가장 작은 수 :" + calc((x,y)->(x<y)?x:y));
	}
	static int calc(LambdaInterface4 f,int x, int y) {
		return f.method(x, y);
	}
	static int calc(LambdaInterface4 f) {
		int result = arr[0];
		for(int i : arr) {
			result = f.method(result, i);
		}
		return result;
	}
}
