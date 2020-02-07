package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * 1. dept 테이블을 이용하여 서울 지역의 레코드만 dept_seoul 테이블로 생성하기
 * 2. dept_seoul 테이블에
 *    deptno : 60, dname : 특수영업부, loc : 서울 레코드 추가하기
 * 3. dept_seoul 테이블에
 *    deptno : 60 레코드의  dname : 특수영업1부 수정하기
 * 4. dept_seoul 테이블의 모든 컬럼의 내용을 화면에 출력하기    
 */
public class Exam1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn = DriverManager.getConnection
				("jdbc:mariadb://localhost:3306/classdb","scott","1234");
		Statement stmt = conn.createStatement();
		
		String sql = "create table dept_seoul as select * from dept where loc='서울'";
		int result = stmt.executeUpdate(sql);  // 위의 문자열을 가지고 와서 실제로 만들어줌
		
		sql = "insert into dept_seoul (deptno,dname,loc) values(60,'특수영업부','서울')";
		result = stmt.executeUpdate(sql); // 위의 문자열을 sql을 통해 넣으면 실행됨
		
		sql = "update dept_seoul set dname='특수영업1부' where deptno=60";
		result = stmt.executeUpdate(sql);

		ResultSet rs = stmt.executeQuery("select * from dept_seoul");
		while(rs.next()) { 
			System.out.print("deptno:"+rs.getString("deptno"));
			System.out.print(",dname:"+rs.getString("dname"));
			System.out.println(",loc:"+rs.getString("loc"));
		}
	}
}
