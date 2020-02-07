package chap15;

import java.io.File;

/*
 * c:\windows 폴더를 지정하여 폴더의 하위 폴더 갯수와 파일의 갯수, 파일의 총 크기를 출력하기
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
				System.out.printf("%s : 디렉토리%n",f);
			    cnt++;
			}
			else if(f2.isFile()) {
				System.out.printf("%s : 파일(%,dbyte)%n",f,f2.length());
				sum += f2.length();
			    cnt2++;
			}
		}
		System.out.println();
		System.out.println("폴더의 갯수 :" + cnt);
		System.out.println("파일의 갯수 :" + cnt2);
		System.out.printf("파일의 총 크기 :%,dbyte",sum);
	}
}
