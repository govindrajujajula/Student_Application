package library;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class registerservlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String confirmpassword = req.getParameter("confirmpassword");
        PrintWriter pw = resp.getWriter();
        
        
        try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/register","root","rootGovind@014");
			
			String sql ="insert into employee(Name,Email,Password,Confirmpassword) values(?,?,?,?)";
					
			PreparedStatement pmst = conn.prepareStatement(sql);
			
            pmst.setString(1, name);
            pmst.setString(2, email);
            pmst.setString(3, password);
            pmst.setString(4, confirmpassword);
            
            int i = pmst.executeUpdate();
            if(i>0) {
            	pw.println("Successfully inserted");
            }
            else
            {
            	pw.println("error");
            }
            conn.close();
            pmst.close();
		   } catch (Exception e) {
			e.printStackTrace();
		}
	}
}

