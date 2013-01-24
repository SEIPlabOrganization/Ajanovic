package project1;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AsignProjectAssignmentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AsignProjectAssignmentServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int ProjectID = Integer.parseInt(request.getParameter("ProjectID"));
		int ProjectAssignmentId = Integer.parseInt(request.getParameter("ProjectAssignmentId"));
		
		
		try {
			
			MySQLcon db = new MySQLcon("jdbc:mysql://localhost:3306/project","a","a");
			
			if (db.Upd("UPDATE project_assignements SET Project_idProject='" + ProjectID + "' WHERE id_as='" + ProjectAssignmentId + "';")) {
				
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
