package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 * PreparedStatement 예제
 */
public class JdbcEx4 {
	public static void main(String[] args) throws Exception {
		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn = DriverManager.getConnection
				("jdbc:mariadb://localhost:3306/classdb","scott","1234");
		String sql = "create table login (id varchar(10) primary key, password varchar(10))";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		int result = pstmt.executeUpdate(); // login 테이블 생성
		System.out.println("login 테이블 create :" + result);	
		pstmt.close(); // sql 구문 종료. 안써줘도 되지만 
		sql = "insert into login values(?,?)";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, "hongkd");
		pstmt.setString(2, "홍길동");
		result = pstmt.executeUpdate(); // insert 구문 실행
		System.out.println("홍길동 insert :" + result);
		pstmt.setString(1, "sagatk");
		pstmt.setString(2, "김삿갓");
		result = pstmt.executeUpdate(); // insert 구문 실행
		System.out.println("김삿갓 insert :" + result);
		pstmt.setString(1, "monglee");
		pstmt.setString(2, "이몽룡");
		result = pstmt.executeUpdate(); // insert 구문 실행
		System.out.println("이몽룡 insert :" + result);
		pstmt.close(); // sql 구문 종료.
		sql = "select * from login"; //제대로 들어갔는지 검증
		pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			System.out.printf("아이디:%-12s, 비밀번호:%-12s\n", rs.getString(1), rs.getString(2));
		}
		pstmt.close(); // sql 구문 종료.
		sql = "drop table login"; // 테이블 삭제를 위해 드랍
		pstmt = conn.prepareStatement(sql); 
		result = pstmt.executeUpdate(); // drop table 실행
		System.out.println("login 테이블 drop :" + result);
	}
}
