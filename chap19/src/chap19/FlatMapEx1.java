package chap19;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FlatMapEx1 {
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("자바 8 버전에","추가된 스트림을","열심히 공부하자");
		list1.stream().flatMap(data->Arrays.stream(data.split(" "))).forEach(word->System.out.println(word));
		System.out.println();
		List<String> list2 = Arrays.asList("10,20,30","40,50,60");
		//flatMapToInt : Instream 으로 리턴(정수형으로바꿔줌)
		IntStream isr = list2.stream().flatMapToInt(data->{
			String[] strArr = data.split(",");
			int[] intArr = new int[strArr.length];
			for(int i=0; i<strArr.length; i++) {
				intArr[i] = Integer.parseInt(strArr[i].trim());
			}
			return Arrays.stream(intArr);
		});
		isr.forEach(n->System.out.println(n));
//		System.out.println(isr.count());
//		System.out.println(isr.sum());
//		System.out.println(isr.average().getAsDouble());
	}
}
