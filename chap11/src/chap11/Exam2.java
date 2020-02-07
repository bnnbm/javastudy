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
 * 1. jdbc�� exam3.java �ҽ� ����
 * 2. select ������ Ʋ�Ƚ��ϴ� Ȯ���ϼ���. �޼��� ����ϰ�, ���� select ���� �Է¹ޱ�
 */
public class Exam2 {

	public static void main(String[] args) throws Exception{
		Scanner scan = new Scanner(System.in);
		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn = DriverManager.getConnection
				("jdbc:mariadb://localhost:3306/classdb","scott","1234");

		while (true) {
			System.out.println("select ������ �Է��ϼ���(����:exit)");			
			String sql = scan.nextLine();
			if(sql.equals("exit")) break;
		    PreparedStatement pstmt = conn.prepareStatement(sql);
		    ResultSet rs = null;
		    try {
		    	rs =pstmt.executeQuery();
		    } catch(SQLException e) {
		    	System.out.println("select ������ Ʋ�Ƚ��ϴ� Ȯ���ϼ���");
		    	continue;
		    }
		    ResultSetMetaData rsmt = rs.getMetaData();
		    PreparedStatement pstmt2 = conn.prepareStatement("Select count(*) from (" + sql + ") a");
		    ResultSet rs2 = pstmt2.executeQuery();
		    rs2.next();
		    System.out.println("====================================");
		    System.out.println("��ȸ�� �÷���:" + rsmt.getColumnCount());
		    System.out.println("��ȸ�� ���ڵ� ����:" + rs2.getInt(1));
		    System.out.println("====================================");
		    System.out.printf("%-10s%-15s%-10s\n", "�÷���","�÷�Ÿ��","NULL ���");
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
		System.out.println("���α׷� ����");
		
		
		
	}
}
				