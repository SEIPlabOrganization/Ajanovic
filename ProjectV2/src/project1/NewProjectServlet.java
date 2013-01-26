package project1;

import java.io.IOException;

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
			
		//HttpSession session = request.getSession(true);
		//String JMBAGTeamLeader = session.getAttribute("userid").toString();
		//String TeamId = session.getAttribute("teamid").toString();
		
		String ProjectName = request.getParameter("ProjectName");
		String ProjectDescription = request.getParameter("ProjectDescription");
		String DateBegin = request.getParameter("DateBegin");
		String DateEnd = request.getParameter("DateEnd");
		String Subject = request.getParameter("Subject");
		String AcadYear = "2000/2001";
		
		String[] token = DateBegin.split("-");
		int a = Integer.parseInt(token[1]);
		int godina = Integer.parseInt(token[0]);
		
		String TeamId = "1";//Replaced with session data
		
		
		try {
			
			MySQLcon db = new MySQLcon("jdbc:mysql://localhost:3306/project","a","a");
			
			
			if (a <= 9) {
				AcadYear = (godina-1) + "/" + godina;
			} else {
				AcadYear = godina + "/" + (godina+1);
			}
			
			
			if (db.Upd("INSERT INTO `project`.`project` SET Subject='" + Subject + "', Description='" + ProjectDescription + "', DateBegin='" + DateBegin + "', DateEnd='" + DateEnd + "', Name='" + ProjectName + "', Team_idTeam='" + TeamId + "', Acad_year='" + AcadYear + "';")) {
				
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
