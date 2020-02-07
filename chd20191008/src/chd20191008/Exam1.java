package chd20191008;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class CHDEmp implements Comparable<CHDEmp> {
	   private String name;  //�̸�
	   private String work;  //����
	   private String position; //����
	   private int age;     //����
	public CHDEmp(String name, String work, String position, int age) {
		super();
		this.name = name;
		this.work = work;
		this.position = position;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public String getWork() {
		return work;
	}
	public String getPosition() {
		return position;
	}
	public int getAge() {
		return age;
	}
	@Override
	public String toString() {
		return "������ =" + name + ", ����=" + work + ", ����=" + position + ", ����=" + age;
	}
	@Override
	public int compareTo(CHDEmp e) {
		return name.compareTo(e.name);
	}
}
public class Exam1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("emp.txt"));
		List<CHDEmp> list = br.lines().map(s-> {
			String[] str = s.split(",");
			return new CHDEmp(str[0],str[1],str[2],Integer.parseInt(str[3]));
		}).collect(Collectors.toList());			

		System.out.println("========���� ��� ����(�̸���)=========");
		list.stream().sorted().forEach(System.out::println);
		System.out.println("=========���� ��� ����(���̼�)==========");
		list.stream().sorted((s1,s2)->s1.getAge()-s2.getAge()).forEach(System.out::println);
		System.out.print("������ ������ ������ ��� ���� :");
		double avg = list.stream().filter(s->s.getPosition().equals("����")).mapToInt(CHDEmp::getAge).average().getAsDouble();
		System.out.println(avg);
	}
}
