package jdbc;
/*
 * Java �� DBMS(Mariadb ���) �����ϱ�
 * 1. ����̹� ����(mariadb-java-client-2.4.2.jar) classpath ����. ��뵵�� ����
 * 2. JDBC ���� ��Ű�� : java.sql.* (java.sql ��Ű���� ��� Ŭ������ ���)
 * 3. ����̹� Ŭ������ �ε��ϱ�
 * 4. db�� Java�� �����ϴ� ��ü �����ϱ�
 * 5. SQL ��ɹ��� db�� �����ϱ� ���� ��ü �����ϱ�
 * 6. Statement ��ü�� �̿��Ͽ� sql ���� ����. ������
 * 7. �����ȸ
 */
//import java.sql.*; // java.sql ��Ű���� ��� Ŭ������ ���
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class JdbcEx1 {
	public static void main(String[] args) throws Exception{ // ����ó���ϴ°���
		// 3. ����̹� Ŭ������ �ε��ϱ�
		// ���ڿ��� ������ Ŭ������ �޸𸮿� �ε�.
		Class.forName("org.mariadb.jdbc.Driver");
		// 4. db�� Java�� �����ϴ� ��ü�� �����ϱ�
		Connection conn = DriverManager.getConnection
				("jdbc:mariadb://localhost:3306/classdb","scott","1234");
		// 5. SQL ��ɹ��� db�� �����ϱ� ���� ��ü �����ϱ�
		Statement stmt = conn.createStatement();
		// 6. Statement ��ü�� �̿��Ͽ� sql ���� ����. ������
		ResultSet rs = stmt.executeQuery("select * from student");
		// 7. ��� ��ȸ
		while(rs.next()) { // �Ѱ��� ���ڵ徿 ��ȸ.
			System.out.print("�й�:"+rs.getString("studno"));
			System.out.print(",�̸�:"+rs.getString("name"));
			System.out.print(",�г�:"+rs.getString("grade"));
			System.out.print(",Ű:"+rs.getString("height"));
			System.out.print(",������:"+rs.getString("weight"));
			System.out.println(",�а��ڵ�:"+rs.getString("major1"));
		}
		
		// ���� : �������̺��� ������ ��ȣ, �̸�, id, �Ի���, �޿�, ���ʽ�, �а��ڵ� ����ϱ�
		
		ResultSet rs1 = stmt.executeQuery("select * from professor");
		while(rs.next()) {
			System.out.print("��ȣ:"+rs1.getString("no"));
			System.out.print(", �̸�:"+rs1.getString("name"));
			System.out.print(", id:"+rs1.getString("id"));
			System.out.print(", �Ի���:"+rs1.getString("hiredate"));
			System.out.print(", �޿�:"+rs1.getString("salary"));
			System.out.print(", ���ʽ�:"+rs1.getString("bonus"));
			System.out.println(", �а��ڵ�:"+rs1.getString("deptno"));	
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}