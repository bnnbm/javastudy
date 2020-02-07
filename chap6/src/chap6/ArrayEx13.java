package chap6;
/*
 * 배열의 복사 : System.arraycopy 메서드를 이용하는 방법
 */
public class ArrayEx13 {
	public static void main(String[] args) {
		int score[] = {90,80,70};
		int score2[] = new int[5];
		System.arraycopy(score, 0, score2, 0, score.length); // (원본배열, 시작인덱스, 복사할배열, 시작인덱스, 어디까지?)
		for(int s : score2) {
			System.out.println(s);
		}
		
		
	}
}
