package chap6;
/*
 * math.random() �Լ��� �̿��Ͽ� 1���� 10������ ������ ���� �迭�� 10�� �����ϱ�
 * �迭�� ����� ����ŭ *�� ����ϱ�
 * 0<= math.random()<1.0
 */
public class Exam2 {
	public static void main(String[] args) {
		int arr[] = new int[10];
				
		for(int i=0; i<arr.length; i++) {
			int ans = (int)(Math.random() * 10) + 1;
			arr[i] = ans;
			System.out.println();
			System.out.print(arr[i]+":");
			for(int j=0; j<arr[i]; j++) {
				System.out.print("*");
			}

		}
	}
}