package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class studentdb {

	private static String Driver ="com.mysql.cj.jdbc.Driver";
	private static String url ="jdbc:mysql://localhost:3306/students";
	private static String username ="root";
	private static String password ="rootGovind@014";
	private static Connection conn =null;
	
	public static Connection getconn(){
		
		try {
			Class.forName(Driver);
			conn =DriverManager.getConnection(url,username,password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

}