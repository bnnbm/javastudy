package chap6;
import java.util.Scanner;

/*
 * test3
 */

public class test3 {
	public static void main(String[] args) {
/*
		char[][] star = { 
				    { '*', '*', ' ', ' ', ' ' },
				    { '*', '*', ' ', ' ', ' ' },
				    { '*', '*', '*', '*', '*' },
				    { '*', '*', '*', '*', '*' } };
		  // 4행 5열 >> 5행 4열로 변경
		  char[][] result = new char[star[0].length][star.length];
		  for(int i=0;i<star.length;i++) {
		      for(int j = 0;j<star[i].length;j++) {
		    	  result[j][star.length-1-i]=star[i][j];
		         System.out.print(star[i][j]);
		      }
		      System.out.println();
		  }
*/	
/*		   char[][] star = { 
				    { '*', '*', ' ', ' ', ' ' },
				    { '*', '*', ' ', ' ', ' ' },
				    { '*', '*', '*', '*', '*' },
				    { '*', '*', '*', '*', '*' } };
		    // 4행 5열 >> 5행 4열로 변경
		   char [][] star2 = new char[star.length+1][star.length];		 
		    for(int i =0; i<star2.length; i++) {
		            for(int j=0; j<star2[i].length; j++) {
		               star2[i][j] = star[3-j][i]; // 4행 5열 >>>ㅣ 5행 4열로 바뀌고 0,0 > 0,3 / 1,0 > 0,2 / 2,0 > 0,1 즉 3-j
		            }		       
		         }		         
		          for(char[] s : star2) {		             
		             System.out.println(s);
		          }
		
*/		
/*		
		char[] abcCode = 
			   { '`', '~', '!', '@', '#', '$', '%', '^', '&', '*','(', ')', '-', '_', '+', '=', '|',
				'[', ']', '{', '}', ';', ':', ',', '.', '/'};
			  // 0 1 2 3 4 5 6 7 8 9
			  char[] numCode = { 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p' };
			  System.out.println("소문자영 숫자로 이루어진 문자열을 입력하세요");
			  Scanner scan = new Scanner(System.in);
			  String src = scan.next();			  
			  String result = "";
			  for(int i =0; i<src.length();i++) {
				    char n = (char)src.charAt(i);
				    int num = 0;
				    if('a'<=n&&n<='z') {
				        num =n-97;
				        result += abcCode[num];
				    }
				    if('0'<=n&&n<='9') {
				        num = n-48;
				        result +=numCode[num];
		
				    }
			  }
			  System.out.println("src:" + src);
			  System.out.println("result:" + result);
*/		
 
			  char[] abcCode = 
		         { '`', '~', '!', '@', '#', '$', '%', '^', '&', '*','(', ')', '-', '_', 
		           '+', '=', '|', '[', ']', '{', '}', ';', ':', ',', '.', '/'};
		      char[] numCode = { 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p' };
		       System.out.println("소문자영 숫자로 이루어진 문자열을 입력하세요");
		       Scanner scan = new Scanner(System.in);
		       String src = scan.next();
		       String result = "";		       
		       for(int i = 0;i<src.length();i++) {
		        char ch = src.charAt(i);
		        if(ch >= 'a' && ch <= 'z') {
		         result = result +abcCode[ch-'a'];
		        }
		        else if(ch >= '0' && ch <= '9') {
		         result = result + numCode[ch-'0'];
		        }
		        
		       }
		       System.out.println();
		       
		       System.out.println("src:" + src);
		       System.out.println("result:" + result);
		       System.out.println("복호화:");
		       String src2;
		       
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
