//
//package chap7;
//class Student{
//	int studno,kor,eng,math;
//	String name;
//	static int no;
//	Student(String a, int b){
//		name = a;
//		studno = b;			
//	}
//	Student(String a, int b, int c, int d, int e){
//		name = a;
//		studno = b;
//		kor = c;
//		eng = d;
//		math = e;
//	}
//	int getTotal() {
//		return kor+eng+math;
//	}
//	float getAverage() {
//		return (kor+eng+math)/3;
//	}
//	void info() {
//		  System.out.println(
//				    "�й�:"+studno+"\n"+"�̸�:"+name+"\n"+"����:"+kor+"\n"+"����:"+eng+"\n"+"����:"+math+"\n"+
//				    "����:"+getTotal()+"\n"+"���:"+getAverage()+"\n"+"===================");
//				 }
//}
//public class test2 {
//	public static void main(String[] args) {
//			  Student s = new Student("ȫ�浿",1);
//			  s.info();
//			  Student s2 = new Student("���",2,80,90,70);
//			  s2.info();
//	}
//}


package chap7;
class Animal3{
	String name;
	int age;
	Animal3(String a, int b){
		name = a;
		age = b;
	}
	Animal3(String a){
		name = a;
		age = 1;
	}
	Animal3(int a){
		age = a;
		name = "���";
	}
	void info() {
		System.out.println(name+":"+age+"��");
	}
}
public class test2 {
	public static void main(String[] args) {
		
		Animal3 a1 = new Animal3("������",26);
		  Animal3 a2 = new Animal3("����");
		  Animal3 a3 = new Animal3(100);
		  a1.info(); 
		  a2.info(); 
		  a3.info();  
	}
}

/*
package chap7;
class  SutdaCard{
	int number;
	boolean isKwang = true;
	SutdaCard(){
		number = 1;
	}
	SutdaCard(int a, boolean b){
		number = a;
		isKwang = b;
	}
	public String toString() {
		return number + ((isKwang)?"K":"");
	}
}
public class test2 {
	public static void main(String[] args) {
			  SutdaCard card1 = new SutdaCard(3,false);
			  SutdaCard card2 = new SutdaCard();
			  System.out.println(card1);//3
			  System.out.println(card2);//1K
	}
}
*/
