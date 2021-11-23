package egovframework.sample.service.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCUtil {
	public static Connection getConnection() {
		//드라이버 로딩
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mariadb://localhost:3307/javadb", "root", "123456");
		}
		catch(Exception e){ e.printStackTrace(); }
		return null;
	}
	public static void close(Statement stmt, Connection conn) {
		try {
			if(stmt!=null)
				stmt.close();
		}
		catch(Exception e){ e.printStackTrace(); }
		finally { stmt=null; }

		try {
			if(!conn.isClosed()||conn!=null)
				conn.close();
		}
		catch(Exception e){ e.printStackTrace(); }
		finally { conn=null; }
	}
	public static void close(ResultSet rs, Statement stmt, Connection conn) {
		try {
			if(rs!=null)
				rs.close();
		}
		catch(Exception e){ e.printStackTrace(); }
		finally { rs=null; }
		
		try {
			if(stmt!=null)
				stmt.close();
		}
		catch(Exception e){ e.printStackTrace(); }
		finally { stmt=null; }
		
		try {
			if(!conn.isClosed()||conn!=null)
				conn.close();
		}
		catch(Exception e){ e.printStackTrace(); }
		finally { conn=null; }
	}
}
