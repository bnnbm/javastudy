package chap12;

public class StringBufferEx2 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("abc").append(123).append('A').append(false);
		System.out.println(sb);
		sb.delete(2,4); //2�������� 3�������� ����
		System.out.println(sb);
		sb.deleteCharAt(4); //4���� ����
		System.out.println(sb);
		sb.insert(5, "=="); //5���� �տ� == ����
		System.out.println(sb);
		sb = new StringBuffer("ABCDEFG");
		sb.replace(0, 3, "abc"); // 0�������� 3�������� abc�� ġȯ
		System.out.println(sb);
		sb.reverse(); // �Ųٷ�
		System.out.println(sb);
	}
}
