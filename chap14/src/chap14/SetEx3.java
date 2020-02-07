package chap14;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

/*
 * TreeSet ����
 *    Set > SorteSet ���� Ŭ����.
 *    Set : �ߺ��Ұ�
 *    SorteSet : ���ĵ�.
 *    
 *    => ��������� Ŭ������ �ݵ�� Comparable �������̽��� ������ Ŭ������ TreeSet�� ��ҷ� ���� ����
 *    
 *    ���� ���� �������̽�
 *     - Comparator : �⺻ ���� ����� ������ �� ���.
 *     - Comparable : �⺻ ���� ��� �����Ҷ� ���.
 */
public class SetEx3 {
	public static void main(String[] args) {
		SortedSet<String> set = new TreeSet<>();
		set = new TreeSet<>(new Descending()); // 8.0 ��������
		set = new TreeSet<>(Comparator.reverseOrder()); // 8.0 ���� ����
		String from = "bat";
		String to = "d";
		set.add("abc"); set.add("alien");
		set.add("bat"); set.add("azz");
		set.add("car"); set.add("Car");
		set.add("disc"); set.add("dance");
		set.add("dZZZZ"); set.add("dzzzz");
		set.add("elevator"); set.add("fan");
		set.add("flower");
		System.out.println(set);
//		System.out.println("from:" + from + ",to:" + to);
//		System.out.println(set.subSet(from, to));
//		System.out.println("from:" + from + ",to:" + to + "zzzz");
//		System.out.println(set.subSet(from, to + "zzzz"));
		
	}
}
class Descending implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		Comparable c1 = (Comparable)o1;
		Comparable c2 = (Comparable)o2;
		return c1.compareTo(c2) *-1;
	}
}