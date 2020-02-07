package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * 1. dept ���̺��� �̿��Ͽ� ���� ������ ���ڵ常 dept_seoul ���̺�� �����ϱ�
 * 2. dept_seoul ���̺�
 *    deptno : 60, dname : Ư��������, loc : ���� ���ڵ� �߰��ϱ�
 * 3. dept_seoul ���̺�
 *    deptno : 60 ���ڵ���  dname : Ư������1�� �����ϱ�
 * 4. dept_seoul ���̺��� ��� �÷��� ������ ȭ�鿡 ����ϱ�    
 */
public class Exam1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn = DriverManager.getConnection
				("jdbc:mariadb://localhost:3306/classdb","scott","1234");
		Statement stmt = conn.createStatement();
		
		String sql = "create table dept_seoul as select * from dept where loc='����'";
		int result = stmt.executeUpdate(sql);  // ���� ���ڿ��� ������ �ͼ� ������ �������
		
		sql = "insert into dept_seoul (deptno,dname,loc) values(60,'Ư��������','����')";
		result = stmt.executeUpdate(sql); // ���� ���ڿ��� sql�� ���� ������ �����
		
		sql = "update dept_seoul set dname='Ư������1��' where deptno=60";
		result = stmt.executeUpdate(sql);

		ResultSet rs = stmt.executeQuery("select * from dept_seoul");
		while(rs.next()) { 
			System.out.print("deptno:"+rs.getString("deptno"));
			System.out.print(",dname:"+rs.getString("dname"));
			System.out.println(",loc:"+rs.getString("loc"));
		}
	}
}
