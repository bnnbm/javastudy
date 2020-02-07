package chap11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;
/*
 * 1. jdbc의 exam3.java 소스 복사
 * 2. select 구문이 틀렸습니다 확인하세요. 메세지 출력하고, 다음 select 구문 입력받기
 */
public class Exam2 {

	public static void main(String[] args) throws Exception{
		Scanner scan = new Scanner(System.in);
		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn = DriverManager.getConnection
				("jdbc:mariadb://localhost:3306/classdb","scott","1234");

		while (true) {
			System.out.println("select 구문을 입력하세요(종료:exit)");			
			String sql = scan.nextLine();
			if(sql.equals("exit")) break;
		    PreparedStatement pstmt = conn.prepareStatement(sql);
		    ResultSet rs = null;
		    try {
		    	rs =pstmt.executeQuery();
		    } catch(SQLException e) {
		    	System.out.println("select 구문이 틀렸습니다 확인하세요");
		    	continue;
		    }
		    ResultSetMetaData rsmt = rs.getMetaData();
		    PreparedStatement pstmt2 = conn.prepareStatement("Select count(*) from (" + sql + ") a");
		    ResultSet rs2 = pstmt2.executeQuery();
		    rs2.next();
		    System.out.println("====================================");
		    System.out.println("조회된 컬럼수:" + rsmt.getColumnCount());
		    System.out.println("조회된 레코드 갯수:" + rs2.getInt(1));
		    System.out.println("====================================");
		    System.out.printf("%-10s%-15s%-10s\n", "컬럼명","컬럼타입","NULL 허용");
		    for(int i=1;i<=rsmt.getColumnCount();i++) {
		    System.out.printf("%-10s %-10s(%3d) %-10s\n",
		    		           rsmt.getColumnName(i),
		    		           rsmt.getColumnTypeName(i),
		    		           rsmt.getColumnDisplaySize(i),
		    		           (rsmt.isNullable(i)==0?"NOT NULL":"NULL"));
		    }
		    System.out.println("====================================");
		    for(int i=1;i<=rsmt.getColumnCount();i++) {
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
		System.out.println("프로그램 종료");
		
		
		
	}
}
				