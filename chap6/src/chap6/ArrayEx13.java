package chap6;
/*
 * �迭�� ���� : System.arraycopy �޼��带 �̿��ϴ� ���
 */
public class ArrayEx13 {
	public static void main(String[] args) {
		int score[] = {90,80,70};
		int score2[] = new int[5];
		System.arraycopy(score, 0, score2, 0, score.length); // (�����迭, �����ε���, �����ҹ迭, �����ε���, ������?)
		for(int s : score2) {
			System.out.println(s);
		}
		
		
	}
}
