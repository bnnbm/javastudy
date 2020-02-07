package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/*
 * PreparedStatement 예제
 * statement 의 하위 인터페이스임
 */
public class JdbcEx3 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn = DriverManager.getConnection
				("jdbc:mariadb://localhost:3306/classdb","scott","1234");
		PreparedStatement pstmt = conn.prepareStatement("select * from student where grade=?");
		//pstmt.setInt(1,1) : 1=>첫번째?
		//                    1=> 값
		for(int i=1;i<=4;i++) {
		pstmt.setInt(1, i); // 첫번째 ? 는 정수형 값 i 입력해 (첫?가 문자열이면 setString)
		System.out.println("--------"+i+"학년--------");
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			/*
			 * %7s = %s : 문자열 출력. 7자리 확보
			 * %-5s = - : 좌측정렬. 5자리를 확보해서 왼쪽부터 채워넣어
			 * %3d = 10진수 출력, 3자리확보
			 * %5.2f = %f : 부동소숫점, 실수출력
			 *          5 : 5자리 확보
			 *         .2 : 소숫점 이하 2자리까지만 출력, 3번째 자리에서 반올림
			 */
			System.out.printf("학번:%7s, 이름:%-5s, 학년:%3d, 키:%5.2f, 몸무게:%5.2f, 학과코드:%-5s\n", 
					rs.getString("studno"), // studno 컬럼을 String 타입으로 리턴
					rs.getString("name"),
					rs.getInt("grade"), // grade 컬럼을 int 타입으로 리턴
					rs.getDouble("height"), // height 컬럼을 duble 타입으로 리턴
					rs.getDouble("weight"),
					rs.getString("major1"));
		}
	}
	}
}
