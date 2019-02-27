package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//DB와 연결하는 클래스
public class MemberDAO {
	
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	Statement stmt;
	
	public void getConn() {
		
		try {
			//DB 이름 찾기
			 Class.forName("oracle.jdbc.driver.OracleDriver");
			 //db 연결 할때 사용한 url id pwd 넣기(db 속성)
			 conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","testdb","testdb");
//			 stmt = conn.createStatement();
//			 System.out.println("conn success");
			 /*
			Context initctx = new InitialContext();
			Context envctx = (Context)initctx.lookup("java:comp/env");
			DataSource ds = (DataSource) envctx.lookup("jdbc/pool");*/
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}
	
	public void insertMember(MemberBean bean) {
		
		getConn();
		String sql = "insert into members(name,pwd,address,email,phone) values(?,?,?,?,?)";
		try {
			//연결에 필요한 쿼리
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, bean.getId());
			pstmt.setString(2, bean.getPwd());
			pstmt.setString(3, bean.getAddress());
			pstmt.setString(4, bean.getEmail());
			pstmt.setString(5, bean.getPhone());
			
			//db에 업데이트
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
}
