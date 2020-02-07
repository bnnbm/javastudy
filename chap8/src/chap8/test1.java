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
		  return type + ", 이름=" + name + ", 주소=" + address + ", 부서=" + dept;
		 }
}
class FormalEmployee extends Employee {	
	int salary;
	String position, empNo;
	public FormalEmployee(String name, String address, String dept,String empNo, String position, int salary) {
		 super("정규직",name,address,dept);
		 this.empNo = empNo;
	     this.position = position;
	     this.salary = salary;
	}
	int getPay(){
		return (int)(salary/12);
	}
	public String toString() {
		return super.toString()+", 직원번호="+empNo+", 직급="+position+", 연봉="+salary;
	}
}
class InformalEmployee extends Employee {
	Date expireDate;
	int primaryPay;
	public InformalEmployee(String name, String address, String dept, Date expireDate, int primaryPay) {
		super("비정규직",name,address,dept);
		this.expireDate = expireDate;
		this.primaryPay = primaryPay;
	}
	int getPay(){
		return (primaryPay);
	}
	public String toString() {
		return super.toString()+", 계약만료일="+expireDate+ ", 기본임금=" +primaryPay;
	}
}
public class test1 {
	public static void main(String[] args) {
		  //정규직원 객체 생성
		  FormalEmployee fe = new FormalEmployee("김정규", "서울시 용산구","총무부", "1", "과장", 5000);
		  System.out.println(fe);
		  System.out.println(fe.name + "의 급여 : " +   fe.getPay());

		  //비정규직원 객체 생성
		  Date expireDate = new Date();
		  expireDate.setTime(expireDate.getTime() +1000L * 60 * 60 * 24 * 365 * 2);
		  InformalEmployee ie = new InformalEmployee("이비정", "서울시 구로구", "영업부", expireDate, 1000);
		  System.out.println(ie);
		  System.out.println(ie.name + "의 급여 : " +  ie.getPay());
	 }
}