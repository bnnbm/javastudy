package chap6;
/*
 * 1���� 9���� ���� �� �ߺ����� 3�ڸ� ���ڸ� ���Ƿ� �����ϴ� ���α׷� �ۼ��ϱ�
 */
public class Exam3 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int[] nums = new int[3];
		
		for (int i=0; i<10000; i++) {
			int a = (int)(Math.random()*arr.length);
			int b = (int)(Math.random()*arr.length);
			// arr[a], arr[b] �ٲٱ�.
			int tmp = arr[a]; // tmp�� arr[a] �����س���
			arr[a] = arr[b]; // arr[b] ��  arr[a]�� �ֱ�
			arr[b] = tmp; // tmp�� �ִ� arr[a]�� arr[b] �ڸ��� �־ a <-> b ��ȯ ����
			
		}
		for(int i=0;i<nums.length;i++) {
			nums[i] = arr[i];
		}
		for(int n : nums)
			System.out.print(n+ ",");
		
	}
}