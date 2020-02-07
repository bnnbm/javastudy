/*
package chap7;
class Animal{
	String name;
	int age;
	void eat() {
		System.out.println("¸ÀÀÖ°Ô ¾ä¾ä");
	}		
}
public class test1 {
	public static void main(String[] args) {
		Animal ani = new Animal();
		ani.name = "¿ø¼şÀÌ";
		ani.age = 20;
		System.out.println("ÀÌ¸§(name) : " + ani.name);
		System.out.println("³ªÀÌ(age) : " + ani.age);
		ani.eat();
		
	}
}
*/
/*
package chap7;
import java.util.Scanner;
public class test1 {
	public static void main(String[] args) {

 		int arr[] = {50,7,5,8,1,33,16,2,28,25,29,17,44,15,13,9,31}; 
		for(int i =0; i<arr.length; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j] < arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		int[][] matrix = new int[5][5];
		int a = 0;
		for(int i=0;i<=2;i++) {
			for(int j=i;j<5-i;j++) {
				matrix[i][j] = arr[a++];
			}
		}
		for(int i=3;i<5;i++) {
			for(int j=5-i-1;j<=i;j++) {
				matrix[i][j]= arr[a++];
			}
		}
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[i].length; j++) {
				if(matrix[i][j]==0)
					System.out.print("\t");
				else
				System.out.print(matrix[i][j]+ "\t");
			}
			System.out.println();
		  }
		  
	}
}
*/

package chap7;
class Coin{
	static int side;
	int serialNo;
	static int sno;
	void flip() {
	   side = (int)(Math.random()*2);
	}
}		
public class test1 {
	public static void main(String[] args) {
		
		  Coin[] c = new Coin[10];
		  int front = 0;
		  int back = 0;		  
		  for(int i = 0;i<c.length;i++) {
		   c[i]  = new Coin();
		   c[i].serialNo = ++Coin.sno;
		   c[i].flip();
		   if(c[i].side ==0) {
		    System.out.println(Coin.sno+"¹øµ¿Àü : ¾Õ¸é");
		    front++;
		   }else {
		    System.out.println(Coin.sno+"¹øµ¿Àü : µŞ¸é");
		    back++;
		   }
		   
		  }
		  
		  System.out.println("ÀüÃ¼ ¾Õ¸éÀÇ °¹¼ö : " + front + "\n" + "ÀüÃ¼ µŞ¸éÀÇ °¹¼ö : " + back);
		  
		  
	
		
		
		
	}
}
