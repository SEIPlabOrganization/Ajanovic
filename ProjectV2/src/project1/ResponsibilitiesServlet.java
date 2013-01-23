package project1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ResponsibilitiesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
   
    public ResponsibilitiesServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		try {	
			MySQLcon database = new MySQLcon("jdbc:mysql://localhost:3306/mydb", "a", "a");
			
			ResultSet responsibilities = database.Quer("select responsibility.name from Responsibility");

			out.println("<select name='zaduzenja'>");
				
			while(responsibilities.next())
			{
				out.println("<option value='" + responsibilities.getString("responsibility.Name") + "'>" + responsibilities.getString("responsibility.Name") + "</option>");
			}
			
			out.println("</select>");
	
			responsibilities.close();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
