package chap14;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/*
 * 1. ���ѹα�(����), ĳ����(��Ÿ��),����(����),������(����)�� HashMap�� �����ϰ�
 *    ȭ�鿡�� �����̸��� �Է¹޾�, �ش糪���� ������ ����ϴ� ���α׷� �ۼ��ϱ�
 * 2. ��ϵ� ���� �ƴ� ��� "��ϵ� ������ �����ϴ�. ����Ͻðڽ��ϱ�?(���:Y)"
 *    => y,Y�� ��� ������ ����ϱ�
 * 3. ���α׷� ���� ���� ���� ��ϵ� ����� ���� ����� ����ϱ�
 */
public class Exam4 {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		String[] con = {"���ѹα�","ĳ����","����","������"};
		String[] capital = {"����","��Ÿ��","����" ,"����"};
		for(int i=0; i<con.length; i++) {
			map.put(con[i], capital[i]);
		}
//		System.out.println(map);
		Scanner scan = new Scanner(System.in);
		while(true) {
		System.out.println("�����̸��� �Է��ϼ���(����:��)");
		String a=scan.next();
		if(a.equals("��")) {
			System.out.println(map);
			break;
		}		
		System.out.println(map.get(a));
		if(map.get(a)==null) {
			System.out.println("��ϵ� ������ �����ϴ�. ����Ͻðڽ��ϱ�?(���:Y)");
			String yn = scan.next();
			if(yn.equalsIgnoreCase("y")) {
				System.out.println("�ش� ������ ������ �Է��ϼ���.");
				String b = scan.next();
				map.put(a,b);
			}			
		}
		//KeySet()�޼���
		for(String k : map.keySet()) {
			System.out.println(k);
		}
		
		
		
		
		
			
		}
	}
}
