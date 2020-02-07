package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
/*
 * ResultSetMetaData ����
 */
public class JdbcEx5 {
	public static void main(String[] args) throws Exception {
		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn = DriverManager.getConnection
				("jdbc:mariadb://localhost:3306/classdb","scott","1234");
		PreparedStatement pstmt = conn.prepareStatement("select studno,name,grade from student");
		ResultSet rs = pstmt.executeQuery();
		// ResultSetMetaData : ��ȸ�� ������ ���� ���� ��ü
		ResultSetMetaData rsmt = rs.getMetaData();
		//rsmt.getColumnCount() : ��ȸ�� �÷��� ����
		for(int i=1;i<=rsmt.getColumnCount();i++) {
			// getColumnName(i) : i = ��ȸ�� �÷��� ������ �´� �÷��� ����
			System.out.print(rsmt.getColumnName(i)+"\t");
		}
		System.out.println();
		while(rs.next()) {
			for(int i=1;i<=rsmt.getColumnCount();i++) {
			System.out.print(rs.getString(i)+"\t");
			}
			System.out.println();
		}
	}
}
