package chap12;
import java.util.Calendar;
import java.util.Scanner;
/*
 * 년도와 월을 입력받아 달력 출력하기
 * 2차원 배열 사용
 */
public class Exam7 {

	public static void main(String[] args) {
		int[][] calendar = new int[7][7];
		Scanner scan = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
	
		while(true) {
			System.out.println("년도를 입력하세요. 종료(9999)");
			int year = scan.nextInt();
			if(year==9999) break;
			System.out.println("월을 입력하세요. 종료(99)");
			int mon = scan.nextInt();
			if(mon==99) break;
			cal.set(year,(mon-1),1);
			int end = cal.getActualMaximum(Calendar.DATE);
			for(int i=1; i<=end; i++) {
				cal.set(year,(mon-1),i);
				int week = cal.get(Calendar.DAY_OF_WEEK);
				int weekcnt = cal.get(Calendar.WEEK_OF_MONTH);
				calendar[weekcnt-1][week-1] = i;
			}
			System.out.printf("%10d년%3d월\n",year,mon);
			System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n","일,월,화,수,목,금,토".split(","));
			for(int i=0; i<calendar.length; i++) {
				for(int j=0; j<calendar[i].length; j++) {
				if(calendar[i][j]==0)
					System.out.printf("%3s"," ");
				else
					System.out.printf("%3d",calendar[i][j]);
				}
				System.out.println();
			}			
		}
	}

}
