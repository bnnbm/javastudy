package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/*
 * PreparedStatement ����
 * statement �� ���� �������̽���
 */
public class JdbcEx3 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn = DriverManager.getConnection
				("jdbc:mariadb://localhost:3306/classdb","scott","1234");
		PreparedStatement pstmt = conn.prepareStatement("select * from student where grade=?");
		//pstmt.setInt(1,1) : 1=>ù��°?
		//                    1=> ��
		for(int i=1;i<=4;i++) {
		pstmt.setInt(1, i); // ù��° ? �� ������ �� i �Է��� (ù?�� ���ڿ��̸� setString)
		System.out.println("--------"+i+"�г�--------");
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			/*
			 * %7s = %s : ���ڿ� ���. 7�ڸ� Ȯ��
			 * %-5s = - : ��������. 5�ڸ��� Ȯ���ؼ� ���ʺ��� ä���־�
			 * %3d = 10���� ���, 3�ڸ�Ȯ��
			 * %5.2f = %f : �ε��Ҽ���, �Ǽ����
			 *          5 : 5�ڸ� Ȯ��
			 *         .2 : �Ҽ��� ���� 2�ڸ������� ���, 3��° �ڸ����� �ݿø�
			 */
			System.out.printf("�й�:%7s, �̸�:%-5s, �г�:%3d, Ű:%5.2f, ������:%5.2f, �а��ڵ�:%-5s\n", 
					rs.getString("studno"), // studno �÷��� String Ÿ������ ����
					rs.getString("name"),
					rs.getInt("grade"), // grade �÷��� int Ÿ������ ����
					rs.getDouble("height"), // height �÷��� duble Ÿ������ ����
					rs.getDouble("weight"),
					rs.getString("major1"));
		}
	}
	}
}
