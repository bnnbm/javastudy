package chap12;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*
 * 년도와 월을 입력받아 달력 출력하기
 * 년도를 입력하세요
 * 2019
 * 월을 입력하세요
 * 9
 */
public class Exam6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("년도를 입력하세요");
		int y = scan.nextInt();
		System.out.println("월을 입력하세요");
		int m = scan.nextInt();
		System.out.println();
		System.out.println("\t" + y + "년"+ m + "월");
		System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n","일,월,화,수,목,금,토,일".split(","));
		Calendar cal = Calendar.getInstance();
		cal.set(y,(m-1),1); //선택한 월의 1일 설정		
		int fw = cal.get(Calendar.DAY_OF_WEEK); //선택한 월 1일의 요일
		int lastday = cal.getActualMaximum(Calendar.DATE); //해당월의 마지막 일자
		int day = 1;
		
		for(int i=1; i<=7; i++) {
			for(int j=1; j<=7; j++) {
				if(i==1 && j < fw)
					System.out.printf("%3s"," ");
				else {
					System.out.printf("%3d",day++);
					if(day>lastday)break;
				}				
			}
			if(day>lastday)break;
		      System.out.println();			
		}
		
		
		
		
		
//		for(int i=1,day=1; day<=lastday; i++) {
//			if(i<fw) System.out.printf("%3s"," ");
//			else System.out.printf("%3d",day++);
//			if(i%7==0)System.out.println();
//		}
		

		
		
	}
}
      
//      Scanner scan = new Scanner(System.in);
//      System.out.println("년도를 입력하세요");
//      int year = scan.nextInt();
//      System.out.println("월을 입력하세요");
//      int month = scan.nextInt();
//      System.out.println("   " + year + "년" + month + "월");
//      String week = null;
//      Calendar cal = Calendar.getInstance();
//      int day = 1;
//      cal.set(year,(month-1), 1);
//      for(int i=1; i<=7; i++) {
//         switch(i){
//         case 1 : week="일";break;
//         case 2 : week="월";break;
//         case 3 : week="화";break;
//         case 4 : week="수";break;
//         case 5 : week="목";break;
//         case 6 : week="금";break;
//         case 7 : week="토";break;
//          }
//         System.out.print(week + "   ");
//      }
//      int fw = cal.get(Calendar.DAY_OF_WEEK);
//      System.out.println();
//      for(int i=1; i<=7; i++) { 
//         for(int j=1; j<=7; j++) {
//            if(i == 1 && j < fw) {
//               System.out.print("\t");
//            }else {
//               System.out.print(day+"   ");
//               if(day== cal.getActualMaximum(Calendar.DATE))break;
//               day++;
//            }
//      }
//      if(day == cal.getActualMaximum(Calendar.DATE))break;
//      System.out.println();
//   }
//  }
//}

