package chap8;
import java.util.Date;

class Employee{ 
	String name, address, dept, type;
	Employee(String type, String name, String address, String dept) {
		  this.type = type;
		  this.name = name;
		  this.address = address;
		  this.dept = dept;		  
		 }
		 public String toString() {
		  return type + ", �̸�=" + name + ", �ּ�=" + address + ", �μ�=" + dept;
		 }
}
class FormalEmployee extends Employee {	
	int salary;
	String position, empNo;
	public FormalEmployee(String name, String address, String dept,String empNo, String position, int salary) {
		 super("������",name,address,dept);
		 this.empNo = empNo;
	     this.position = position;
	     this.salary = salary;
	}
	int getPay(){
		return (int)(salary/12);
	}
	public String toString() {
		return super.toString()+", ������ȣ="+empNo+", ����="+position+", ����="+salary;
	}
}
class InformalEmployee extends Employee {
	Date expireDate;
	int primaryPay;
	public InformalEmployee(String name, String address, String dept, Date expireDate, int primaryPay) {
		super("��������",name,address,dept);
		this.expireDate = expireDate;
		this.primaryPay = primaryPay;
	}
	int getPay(){
		return (primaryPay);
	}
	public String toString() {
		return super.toString()+", ��ุ����="+expireDate+ ", �⺻�ӱ�=" +primaryPay;
	}
}
public class test1 {
	public static void main(String[] args) {
		  //�������� ��ü ����
		  FormalEmployee fe = new FormalEmployee("������", "����� ��걸","�ѹ���", "1", "����", 5000);
		  System.out.println(fe);
		  System.out.println(fe.name + "�� �޿� : " +   fe.getPay());

		  //���������� ��ü ����
		  Date expireDate = new Date();
		  expireDate.setTime(expireDate.getTime() +1000L * 60 * 60 * 24 * 365 * 2);
		  InformalEmployee ie = new InformalEmployee("�̺���", "����� ���α�", "������", expireDate, 1000);
		  System.out.println(ie);
		  System.out.println(ie.name + "�� �޿� : " +  ie.getPay());
	 }
}