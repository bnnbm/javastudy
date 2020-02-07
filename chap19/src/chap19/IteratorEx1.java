package chap19;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class IteratorEx1 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("È«±æµ¿","±è»ñ°«","ÀÌ¸ù·æ","¼ºÃáÇâ","ÀÓ²©Á¤","Çâ´ÜÀÌ");
		System.out.println("¿ÜºÎ ¹Ýº¹ÀÚ ÀÌ¿ë");
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("³»ºÎ ¹Ýº¹ÀÚ ÀÌ¿ë");
//		list.stream().forEach(s->System.out.println(s));
		Stream<String> st = list.stream(); // List °´Ã¼¸¦ Stream °´Ã¼ º¯È¯
		st.forEach(s-> System.out.println(s) );
		System.out.println("´Ù½Ã Ãâ·Â");
		list.stream().forEach(s-> System.out.println(s) );
	}
}