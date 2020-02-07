package chap14;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
/*
 * 1.  Student Ŭ���� �����ϱ�
    ������� : �̸�,��������, ��������, ��������
    ����޼��� 
         String toString() : �����������,����,��� ���
         int getTotal() : ������ �� ����
         int compareTo() : �̸� ������������ ���ĵǵ��� ����
2. makeTreeSet �޼��� �ϼ��ϱ�

 public class Test0924_1{
 public static void main(String[] args) {
  List<Student> list = new ArrayList<Student>();
  list.add(new Student("ȫ�浿",90,80,70));
  list.add(new Student("���",95,85,75));
  list.add(new Student("�̸���",80,95,95));
  list.add(new Student("�Ӳ���",60,75,100));

  System.out.println("�⺻���Ĺ��");
  TreeSet<Student> set1 = makeTreeSet(list,null);  
  System.out.println(set1);
  System.out.println("�������� �������� ����");
  TreeSet<Student> set2 = makeTreeSet(list,Comparator...)
  System.out.println(set2);
  System.out.println("���� ������������ ����");
  TreeSet<Student> set3 = makeTreeSet(list,Comparator...)
  System.out.println(set3);
  System.out.println("���� ������������ ����");
  TreeSet<Student> set4 = makeTreeSet(list,Comparator...)
  System.out.println(set4);
  System.out.println("���� ������������ ����");
  TreeSet<Student> set5 = makeTreeSet(list,Comparator...)
  System.out.println(set5);
 }
 private static TreeSet<Student> makeTreeSet(List<Student> list, Comparator<Student> c) {
 }
}

 */
class Student implements Comparable<Student> {
	String name;
	int kor,eng,math;
	int sum=0;
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	int getTotal() {
		sum = kor+eng+math;
		return sum;		
	}
	@Override
	public int compareTo(Student s) {
		return name.compareTo(s.name);
	}
	public String toString() {
		return "[�̸�:"+name+",����:"+kor+",����:"+eng+",����:"+math+",����:"+getTotal()+",���:"+getTotal()/3+"]";
	}
}
public class Test2{
		 public static void main(String[] args) {
		  List<Student> list = new ArrayList<Student>();
		  list.add(new Student("ȫ�浿",90,80,70));
		  list.add(new Student("���",95,85,75));
		  list.add(new Student("�̸���",80,95,95));
		  list.add(new Student("�Ӳ���",60,75,100));

		  System.out.println("�⺻���Ĺ��");
		  TreeSet<Student> set1 = makeTreeSet(list,null);  
		  System.out.println(set1);
		  
		  System.out.println("�������� �������� ����");		  
		  TreeSet<Student> set2 = makeTreeSet(list,new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				return (s1.getTotal()-s2.getTotal())*-1;
			}
		  });
		  System.out.println(set2);
		  
		  System.out.println("���� ������������ ����");
		  TreeSet<Student> set3 = makeTreeSet(list,new Comparator<Student>() {
				@Override
				public int compare(Student s1, Student s2) {
					return (s1.kor-s2.kor)*-1;
				}
			  });
		  System.out.println(set3);
		  
		  System.out.println("���� ������������ ����");
		  TreeSet<Student> set4 = makeTreeSet(list,new Comparator<Student>() {
				@Override
				public int compare(Student s1, Student s2) {
					return (s1.eng-s2.eng)*-1;
				}
			  });
		  System.out.println(set4);
		  
		  System.out.println("���� ������������ ����");
		  TreeSet<Student> set5 = makeTreeSet(list,new Comparator<Student>() {
				@Override
				public int compare(Student s1, Student s2) {
					return (s1.math-s2.math)*-1;
				}
			  });
		  System.out.println(set5);
		 }
		 private static TreeSet<Student> makeTreeSet(List<Student> list, Comparator<Student> c) {
			 TreeSet<Student> set = new TreeSet<>(c);
			    set.addAll(list);
		        return set;
		 }
		}

