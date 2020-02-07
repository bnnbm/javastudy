package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * �������̺��� �а��� ���� ����� ����ϱ�
 * 1.�������� �а� ��ȸ�Ͽ�, �� �а��� ������ ����� ����ϱ�
 * 2.�������� �а� ��ȸ�Ͽ�, �а� �ο��� 2�� �̻��� �а� ������ ����� ����ϱ�
 */
public class Exam2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn = DriverManager.getConnection
				("jdbc:mariadb://localhost:3306/classdb","scott","1234");
		PreparedStatement pstmt1 = conn.prepareStatement
				//1.
				// ("select distinct deptno from professor where deptno is not null");
				//2.
				("select deptno from professor group by deptno having count(*) >=2");
		ResultSet rs = pstmt1.executeQuery();
		while(rs.next()) {
		PreparedStatement pstmt2 = conn.prepareStatement("select * from professor where deptno=?");
		pstmt2.setInt(1, rs.getInt("deptno")); // rs ��ȸ�� �÷� �� ù��° �÷�
		ResultSet rs2 = pstmt2.executeQuery();
		System.out.println("========"+rs.getInt("deptno")+"�а�");
		while(rs2.next()) {
		System.out.printf("��ȣ:%-5s, �̸�:%-5s, ����:%-5s, ����:%3d, �а�:%3d, �Ի���:%s\n",
				rs2.getString("no"),
				rs2.getString("name"),
				rs2.getString("position"),
				rs2.getInt("salary"),
				rs2.getInt("deptno"),
				rs2.getString("hiredate"));	
		    }
		}	
//		PreparedStatement pstmt = conn.prepareStatement("select * from professor ORDER BY deptno");		
//			ResultSet rs = pstmt.executeQuery();
//			while(rs.next()) {
//				System.out.print(rs.getString("deptno"));
//				System.out.println(rs.getString("name"));
//				
//				System.out.printf("�а�:%5s, �̸�:%-5s, id:%5s, ��ȣ:%5d, ",
//						rs.getString("m.name"),
//						rs.getString("p.name"),
//						rs.getString("p.id"), 
//						rs.getInt("p.no"));
//          	}
	
		
	}	
}
