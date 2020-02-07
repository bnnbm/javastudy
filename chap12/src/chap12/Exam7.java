package chap12;
import java.util.Calendar;
import java.util.Scanner;
/*
 * �⵵�� ���� �Է¹޾� �޷� ����ϱ�
 * 2���� �迭 ���
 */
public class Exam7 {

	public static void main(String[] args) {
		int[][] calendar = new int[7][7];
		Scanner scan = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
	
		while(true) {
			System.out.println("�⵵�� �Է��ϼ���. ����(9999)");
			int year = scan.nextInt();
			if(year==9999) break;
			System.out.println("���� �Է��ϼ���. ����(99)");
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
			System.out.printf("%10d��%3d��\n",year,mon);
			System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n","��,��,ȭ,��,��,��,��".split(","));
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