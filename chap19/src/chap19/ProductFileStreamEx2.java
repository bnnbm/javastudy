package chap19;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProductFileStreamEx2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("product.txt"));
		List<Car> list =br.lines()		
				.map(s->{ //s: 1,2,�ƹ���,3 => ���ڿ�
					String[] str = s.split(",");
					String temp = "";
					try {
						temp = str[4]; //��ǰ����
					} catch(ArrayIndexOutOfBoundsException e) {
						temp = "";
					}
					return new Car(Integer.parseInt(str[0]), //��
							Integer.parseInt(str[1]),str[2], //����,�ڵ����̸�
							Integer.parseInt(str[3]),temp);  // ����, temp=��ǰ���� ������ null
				}).collect(Collectors.toList());
		list.stream().forEach(System.out::println);		
	}
}