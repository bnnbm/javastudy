package chap14;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
/*
 * 1.  Student 클래스 구현하기
    멤버변수 : 이름,국어점수, 영어점수, 수학점수
    멤버메서드 
         String toString() : 각멤버변수값,총점,평균 출력
         int getTotal() : 점수의 합 리턴
         int compareTo() : 이름 오름차순으로 정렬되도록 구현
2. makeTreeSet 메서드 완성하기

 public class Test0924_1{
 public static void main(String[] args) {
  List<Student> list = new ArrayList<Student>();
  list.add(new Student("홍길동",90,80,70));
  list.add(new Student("김삿갓",95,85,75));
  list.add(new Student("이몽룡",80,95,95));
  list.add(new Student("임꺽정",60,75,100));

  System.out.println("기본정렬방식");
  TreeSet<Student> set1 = makeTreeSet(list,null);  
  System.out.println(set1);
  System.out.println("총점기준 내림차순 정렬");
  TreeSet<Student> set2 = makeTreeSet(list,Comparator...)
  System.out.println(set2);
  System.out.println("국어 점수내림차순 정렬");
  TreeSet<Student> set3 = makeTreeSet(list,Comparator...)
  System.out.println(set3);
  System.out.println("영어 점수내림차순 정렬");
  TreeSet<Student> set4 = makeTreeSet(list,Comparator...)
  System.out.println(set4);
  System.out.println("수학 점수내림차순 정렬");
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
		return "[이름:"+name+",국어:"+kor+",영어:"+eng+",수학:"+math+",총점:"+getTotal()+",평균:"+getTotal()/3+"]";
	}
}
public class Test2{
		 public static void main(String[] args) {
		  List<Student> list = new ArrayList<Student>();
		  list.add(new Student("홍길동",90,80,70));
		  list.add(new Student("김삿갓",95,85,75));
		  list.add(new Student("이몽룡",80,95,95));
		  list.add(new Student("임꺽정",60,75,100));

		  System.out.println("기본정렬방식");
		  TreeSet<Student> set1 = makeTreeSet(list,null);  
		  System.out.println(set1);
		  
		  System.out.println("총점기준 내림차순 정렬");		  
		  TreeSet<Student> set2 = makeTreeSet(list,new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				return (s1.getTotal()-s2.getTotal())*-1;
			}
		  });
		  System.out.println(set2);
		  
		  System.out.println("국어 점수내림차순 정렬");
		  TreeSet<Student> set3 = makeTreeSet(list,new Comparator<Student>() {
				@Override
				public int compare(Student s1, Student s2) {
					return (s1.kor-s2.kor)*-1;
				}
			  });
		  System.out.println(set3);
		  
		  System.out.println("영어 점수내림차순 정렬");
		  TreeSet<Student> set4 = makeTreeSet(list,new Comparator<Student>() {
				@Override
				public int compare(Student s1, Student s2) {
					return (s1.eng-s2.eng)*-1;
				}
			  });
		  System.out.println(set4);
		  
		  System.out.println("수학 점수내림차순 정렬");
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

