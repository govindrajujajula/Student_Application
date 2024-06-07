package services;

import java.sql.Connection;
import java.sql.PreparedStatement;

import models.student;

public class studentservices {
	
	private static Connection conn;

	 public studentservices(Connection conn) {
	        this.conn = conn;
	    }
	public boolean addstudent(student s){
		
		boolean f=false;
		try {
			String sql = "insert into student(Rollnumber,Name,Email,Branch,Section)values(?,?,?,?,?)";
			PreparedStatement pmst = conn.prepareStatement(sql);
			pmst.setString(1, s.getRollnumber());
			pmst.setString(2, s.getName());
			pmst.setString(3, s.getEmail());
			pmst.setString(4, s.getBranch());
			pmst.setString(5, s.getSection());
			int i=pmst.executeUpdate();
			if(i>0) {
				f=true;
			}
			pmst.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}
}
