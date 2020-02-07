package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 * PreparedStatement ����
 */
public class JdbcEx4 {
	public static void main(String[] args) throws Exception {
		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn = DriverManager.getConnection
				("jdbc:mariadb://localhost:3306/classdb","scott","1234");
		String sql = "create table login (id varchar(10) primary key, password varchar(10))";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		int result = pstmt.executeUpdate(); // login ���̺� ����
		System.out.println("login ���̺� create :" + result);	
		pstmt.close(); // sql ���� ����. �Ƚ��൵ ������ 
		sql = "insert into login values(?,?)";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, "hongkd");
		pstmt.setString(2, "ȫ�浿");
		result = pstmt.executeUpdate(); // insert ���� ����
		System.out.println("ȫ�浿 insert :" + result);
		pstmt.setString(1, "sagatk");
		pstmt.setString(2, "���");
		result = pstmt.executeUpdate(); // insert ���� ����
		System.out.println("��� insert :" + result);
		pstmt.setString(1, "monglee");
		pstmt.setString(2, "�̸���");
		result = pstmt.executeUpdate(); // insert ���� ����
		System.out.println("�̸��� insert :" + result);
		pstmt.close(); // sql ���� ����.
		sql = "select * from login"; //����� ������ ����
		pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			System.out.printf("���̵�:%-12s, ��й�ȣ:%-12s\n", rs.getString(1), rs.getString(2));
		}
		pstmt.close(); // sql ���� ����.
		sql = "drop table login"; // ���̺� ������ ���� ���
		pstmt = conn.prepareStatement(sql); 
		result = pstmt.executeUpdate(); // drop table ����
		System.out.println("login ���̺� drop :" + result);
	}
}
