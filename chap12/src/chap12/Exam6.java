package chap12;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*
 * �⵵�� ���� �Է¹޾� �޷� ����ϱ�
 * �⵵�� �Է��ϼ���
 * 2019
 * ���� �Է��ϼ���
 * 9
 */
public class Exam6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�⵵�� �Է��ϼ���");
		int y = scan.nextInt();
		System.out.println("���� �Է��ϼ���");
		int m = scan.nextInt();
		System.out.println();
		System.out.println("\t" + y + "��"+ m + "��");
		System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n","��,��,ȭ,��,��,��,��,��".split(","));
		Calendar cal = Calendar.getInstance();
		cal.set(y,(m-1),1); //������ ���� 1�� ����		
		int fw = cal.get(Calendar.DAY_OF_WEEK); //������ �� 1���� ����
		int lastday = cal.getActualMaximum(Calendar.DATE); //�ش���� ������ ����
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
//      System.out.println("�⵵�� �Է��ϼ���");
//      int year = scan.nextInt();
//      System.out.println("���� �Է��ϼ���");
//      int month = scan.nextInt();
//      System.out.println("   " + year + "��" + month + "��");
//      String week = null;
//      Calendar cal = Calendar.getInstance();
//      int day = 1;
//      cal.set(year,(month-1), 1);
//      for(int i=1; i<=7; i++) {
//         switch(i){
//         case 1 : week="��";break;
//         case 2 : week="��";break;
//         case 3 : week="ȭ";break;
//         case 4 : week="��";break;
//         case 5 : week="��";break;
//         case 6 : week="��";break;
//         case 7 : week="��";break;
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

