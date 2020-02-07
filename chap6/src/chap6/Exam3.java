package chap6;
/*
 * 1부터 9까지 숫자 중 중복없이 3자리 숫자를 임의로 생성하는 프로그램 작성하기
 */
public class Exam3 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int[] nums = new int[3];
		
		for (int i=0; i<10000; i++) {
			int a = (int)(Math.random()*arr.length);
			int b = (int)(Math.random()*arr.length);
			// arr[a], arr[b] 바꾸기.
			int tmp = arr[a]; // tmp에 arr[a] 저장해놓고
			arr[a] = arr[b]; // arr[b] 를  arr[a]에 넣기
			arr[b] = tmp; // tmp에 있는 arr[a]를 arr[b] 자리에 넣어서 a <-> b 교환 성공
			
		}
		for(int i=0;i<nums.length;i++) {
			nums[i] = arr[i];
		}
		for(int n : nums)
			System.out.print(n+ ",");
		
	}
}