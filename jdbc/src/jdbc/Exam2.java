package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * 교수테이블에서 학과별 교수 목록을 출력하기
 * 1.교수들의 학과 조회하여, 각 학과별 교수의 목록을 출력하기
 * 2.교수들의 학과 조회하여, 학과 인원이 2명 이상인 학과 교수의 목록을 출력하기
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
		pstmt2.setInt(1, rs.getInt("deptno")); // rs 조회된 컬럼 중 첫번째 컬럼
		ResultSet rs2 = pstmt2.executeQuery();
		System.out.println("========"+rs.getInt("deptno")+"학과");
		while(rs2.next()) {
		System.out.printf("번호:%-5s, 이름:%-5s, 직급:%-5s, 월급:%3d, 학과:%3d, 입사일:%s\n",
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
//				System.out.printf("학과:%5s, 이름:%-5s, id:%5s, 번호:%5d, ",
//						rs.getString("m.name"),
//						rs.getString("p.name"),
//						rs.getString("p.id"), 
//						rs.getInt("p.no"));
//          	}
	
		
	}	
}
