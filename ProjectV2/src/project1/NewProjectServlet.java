package project1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class NewProjectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public NewProjectServlet() {
        super();
    }

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		String ProjectName = request.getParameter("ProjectName");
		String ProjectDescription = request.getParameter("ProjectDescription");
		String DateBegin = request.getParameter("DateBegin");
		String DateEnd = request.getParameter("DateEnd");
		String Subject = request.getParameter("Subject");
		
		
		try {
			
			MySQLcon db = new MySQLcon("jdbc:mysql://localhost:3306/project","a","a");
			
			
			if (db.Upd("INSERT INTO `project`.`project` SET Subject='" + Subject + "', Description='" + ProjectDescription + "', DateBegin='" + DateBegin + "', DateEnd='" + DateEnd + "', Name='" + ProjectName + "';")) {
				
				RequestDispatcher rd = request.getRequestDispatcher("PickAssignments.jsp");
				rd.forward(request, response);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
