package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
/*
 * ResultSetMetaData 예제
 */
public class JdbcEx5 {
	public static void main(String[] args) throws Exception {
		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn = DriverManager.getConnection
				("jdbc:mariadb://localhost:3306/classdb","scott","1234");
		PreparedStatement pstmt = conn.prepareStatement("select studno,name,grade from student");
		ResultSet rs = pstmt.executeQuery();
		// ResultSetMetaData : 조회된 내용의 정보 전달 객체
		ResultSetMetaData rsmt = rs.getMetaData();
		//rsmt.getColumnCount() : 조회된 컬럼의 갯수
		for(int i=1;i<=rsmt.getColumnCount();i++) {
			// getColumnName(i) : i = 조회된 컬럼의 순서에 맞는 컬럼명 전달
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
