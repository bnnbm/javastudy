package chap15;

import java.io.File;

/*
 * c:\windows ������ �����Ͽ� ������ ���� ���� ������ ������ ����, ������ �� ũ�⸦ ����ϱ�
 */
public class Exam4 {
	public static void main(String[] args) {
		String filePath = "c:\\windows";
		int cnt=0;
		int cnt2=0;
		long sum=0;
		File f1 = new File(filePath); 
		String files[] = f1.list(); 
		for(String f : files) {
			File f2 = new File(filePath,f);
			if(f2.isDirectory()) {
				System.out.printf("%s : ���丮%n",f);
			    cnt++;
			}
			else if(f2.isFile()) {
				System.out.printf("%s : ����(%,dbyte)%n",f,f2.length());
				sum += f2.length();
			    cnt2++;
			}
		}
		System.out.println();
		System.out.println("������ ���� :" + cnt);
		System.out.println("������ ���� :" + cnt2);
		System.out.printf("������ �� ũ�� :%,dbyte",sum);
	}
}
