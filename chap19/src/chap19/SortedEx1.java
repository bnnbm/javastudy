package chap19;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
/*
 * Stream �����ϱ� .sorted() 
 */
public class SortedEx1 {
	public static void main(String[] args) {
		//(String ...a) : ���� �Ű� ����, ���������� String[] ���� ����
		List<String> list = Arrays.asList("ȫ�浿","���","�̸���","�Ӳ���");
		System.out.println("�⺻����");
		list.stream().sorted().forEach(System.out::println);
		System.out.println("�⺻�� ���� ����");
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}
}
