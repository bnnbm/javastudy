package chap19;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class TTT {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("asd.txt"));
		List<Car> list =br.lines()		
				.map(s->{ //s: 1,2,아반테,3 => 문자열
					String[] str = s.split(",");
					String temp = "";
					try {
						temp = str[4]; //반품사유
					} catch(ArrayIndexOutOfBoundsException e) {
						temp = "";
					}
					return new Car(Integer.parseInt(str[0]), //월
							Integer.parseInt(str[1]),str[2], //상태,자동차이름
							Integer.parseInt(str[3]),temp);  // 수량, temp=반품사유 없으면 null
				}).collect(Collectors.toList());
		list.forEach(System.out::println);
		
	}
}
