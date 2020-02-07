package family;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class test {
	static Connection conn;
	static {
		try {
		Class.forName("org.mariadb.jdbc.Driver");
		conn = DriverManager.getConnection
				("jdbc:mariadb://localhost:3306/classdb","scott","1234");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws SQLException {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("\n========== �޴� ���� ==========");
			System.out.println("   1 : ����ȸ�� �߰�");
			System.out.println("   2 : ����ȸ�� ����");
			System.out.println("   3 : ����ȸ�� Ż��");
			System.out.println("   4 : ����ȸ����� ��ȸ");
			System.out.println("   9 : ���α׷� ����");
			System.out.println("============================");
			int num = scan.nextInt();
			if(num == 9) break;
			switch(num) {
			case 1 : insert(); break;
			case 2 : update(); break;
			case 3 : delete(); break;
			case 4 : select(); break;
			}
		}
		System.out.println("���α׷� ����");
	}
	private static void delete() throws SQLException {
		select();
		System.out.println("Ż���� ���� ȸ���� ��ȣ�� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int no = scan.nextInt();
		PreparedStatement pstmt = conn.prepareStatement("delete from chdfamily where no = ?");
		pstmt.setInt(1, no);
		pstmt.executeUpdate();
		System.out.println(no + "����ȸ�� Ż�� �Ϸ�");
	}
	private static void select() throws SQLException {
		PreparedStatement pstmt = conn.prepareStatement("select * from chdfamily");
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			chdfamily s = new chdfamily(rs.getInt("no"), rs.getString("name"), rs.getInt("age"), rs.getString("job"), rs.getInt("gender"));
			System.out.println(s);
		}
	}
	private static void update() throws SQLException {
		Scanner scan = new Scanner(System.in);
		System.out.print("������ ���� ��ȣ�� �Է��ϼ���:");
		int no = scan.nextInt();
		PreparedStatement pstmt = conn.prepareStatement("select * from chdfamily where no = ?");
		pstmt.setInt(1, no);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {

			chdfamily s = new chdfamily
			(rs.getInt("no"), rs.getString("name"), rs.getInt("age"), rs.getString("job"), rs.getInt("gender"));
			System.out.println(s);

			System.out.println("���� �̸� :" + s.getName() + " �����Ͻðڽ��ϱ�(y/n)?");
			String yn = scan.next();
			if(yn.equalsIgnoreCase("y")) {
				System.out.print("������ �̸��� �Է��ϼ���:");
				String name = scan.next();
				s.setName(name);
			}
			
			System.out.println("���� ����:" + s.getAge() + " �����Ͻðڽ��ϱ�(y/n)?");
			yn = scan.next();
			if(yn.equalsIgnoreCase("y")) {
				System.out.print("������ ���̸� �Է��ϼ���:");
				int age = scan.nextInt();
				s.setAge(age);
			}
			
			System.out.println("���� ����:" + s.getJob() + " �����Ͻðڽ��ϱ�(y/n)?");
			yn = scan.next();
			if(yn.equalsIgnoreCase("y")) {
				System.out.print("������ ������ �Է��ϼ���:");
				String Job = scan.next();
				s.setJob(Job);
			}
			
			System.out.println("���� ����(1:����,2:����):" + s.getGender() + " �����Ͻðڽ��ϱ�(y/n)?");
			yn = scan.next();
			if(yn.equalsIgnoreCase("y")) {
				System.out.print("������ ������ �Է��ϼ���:");
				int gender = scan.nextInt();
				s.setGender(gender);
			}
			
			pstmt.close();
			pstmt = conn.prepareStatement("update chdfamily set name=?,age=?,job=?,gender=? where no=?");
			pstmt.setString(1, s.getName());
			pstmt.setInt(2, s.getAge());
			pstmt.setString(3, s.getJob());
			pstmt.setInt(4, s.getGender());
			pstmt.setInt(5, s.getNo());
			pstmt.executeUpdate();
			System.out.println(s);
			System.out.println("���� �Ϸ�");
		}
	}
	private static void insert() throws SQLException {
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �̸�:");
		String name = scan.next();
		System.out.print("���� ����:");
		int age = scan.nextInt();
		System.out.print("���� ����:");
		String job = scan.next();
		System.out.print("���� ����(1:����,2:����):");
		int gender = scan.nextInt();
		PreparedStatement pstmt = conn.prepareStatement("insert into chdfamily (name,age,job,gender) values(?,?,?,?)");
		pstmt.setString(1, name);
		pstmt.setInt(2, age);
		pstmt.setString(3, job);
		pstmt.setInt(4, gender);
		pstmt.executeUpdate();
		System.out.println("���� �߰� �Ϸ�");
	}
}