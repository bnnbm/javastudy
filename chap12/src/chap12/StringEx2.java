package chap12;
/*
 * String Ŭ������ �ֿ� �޼���
 */
public class StringEx2 {
	public static void main(String[] args) {
		String s = new String("ABCDEFGH");
		System.out.println(s.charAt(4)); //E, 5��° ���� ����
		//���İ��� �޼���. "ABCDEFGH" - "abc" => A-a = 65-97 = -32
		System.out.println(s.compareTo("abc")); //-32
		//IgnoreCase : ��ҹ��� ���о���
		System.out.println(s.compareToIgnoreCase("abcdefgh")); //0 ��ҹ��� ���о��� ���ؼ� Ʋ����
		System.out.println(s.concat("abc")); //ABCDEFGHabc // concat() : ���ڿ� ����. s = s+"abc"
		System.out.println(s.endsWith("GH")); //s ���ڿ��� ���� GH�� ������ true
		System.out.println(s.startsWith("AB")); //s ���ڿ� ������ AB�� �����ϳ� true
		System.out.println(s.equalsIgnoreCase("abcdefgh")); //��ҹ��� ���о��� ���� ���ڿ��ΰ�?
		
		s = new String("This is a String"); // ��üȭ
		//indexOf : ���ڳ� ���ڿ��� ��ġ ����
		System.out.println(s.indexOf('i')); //2, index���̶� 0���������� 2���
		System.out.println(s.indexOf('i',5)); //5, 5�� �ε��� ���Ŀ� ���ڳ� ���ڿ��� ��ġ ����, 5���� i���־  5���
		System.out.println(s.indexOf('i',15)); //-1, 15�� �ε��� ���� i�� �����Ƿ� -1���(���ھ�����)
		System.out.println(s.indexOf("is")); //2, 2���ε����� is �����Ƿ� 
		System.out.println(s.indexOf("is",5)); //5, 3���ε��� ���Ĵ� 5�������
		//lastIndexOf : ���ʺ��� �˻��Ͽ� ���ڳ� ���ڿ��� ��ġ ����
		System.out.println(s.lastIndexOf("is")); //5, 
		System.out.println(s.length()); //16, ���ڿ��� ����
		System.out.println(s.replace("is", "QR")); //is�� QR�� �ٲٱ�
		//substring : �κ� ���ڿ� ����
		//5�� �ε��� ���ĸ� �κй��ڿ��� ����
		System.out.println(s.substring(5)); //5��° �ε��� ���� ������ ���
		System.out.println(s.substring(5,13)); //5��° �ε��� ���� 13��° ��(12���ε���)���� ���
		System.out.println(s.toLowerCase()); //�ҹ������
		System.out.println(s.toUpperCase()); //�빮�����
		//trim() : ���� ���� ����
		System.out.println("   ���ڿ� trim �޼���   ".trim());
	}
}