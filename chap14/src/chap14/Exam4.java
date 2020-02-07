package chap14;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/*
 * 1. 대한민국(서울), 캐나다(오타와),영국(런던),스위스(베른)를 HashMap에 저장하고
 *    화면에서 나라이름을 입력받아, 해당나라의 수도를 출력하는 프로그램 작성하기
 * 2. 등록된 나라가 아닌 경우 "등록된 수도가 없습니다. 등록하시겠습니까?(등록:Y)"
 *    => y,Y인 경우 수도를 등록하기
 * 3. 프로그램 종료 전에 현재 등록된 나라와 수도 목록을 출력하기
 */
public class Exam4 {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		String[] con = {"대한민국","캐나다","영국","스위스"};
		String[] capital = {"서울","오타와","런던" ,"베른"};
		for(int i=0; i<con.length; i++) {
			map.put(con[i], capital[i]);
		}
//		System.out.println(map);
		Scanner scan = new Scanner(System.in);
		while(true) {
		System.out.println("나라이름을 입력하세요(종료:끝)");
		String a=scan.next();
		if(a.equals("끝")) {
			System.out.println(map);
			break;
		}		
		System.out.println(map.get(a));
		if(map.get(a)==null) {
			System.out.println("등록된 수도가 없습니다. 등록하시겠습니까?(등록:Y)");
			String yn = scan.next();
			if(yn.equalsIgnoreCase("y")) {
				System.out.println("해당 나라의 수도를 입력하세요.");
				String b = scan.next();
				map.put(a,b);
			}			
		}
		//KeySet()메서드
		for(String k : map.keySet()) {
			System.out.println(k);
		}
		
		
		
		
		
			
		}
	}
}
