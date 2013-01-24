package project1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MoreMembersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MoreMembersServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		String responsibility = request.getParameter("zaduzenja");
		String JMBAGMember = request.getParameter("JMBAGMember");
		String TeamName = request.getParameter("TeamName");
		String TeamId = "1";
		String responsibId = "1";
		
		try {
			
			MySQLcon db = new MySQLcon("jdbc:mysql://localhost:3306/project","a","a");
			
			ResultSet res1 = db.Quer("SELECT team.idteam FROM team WHERE team.name='" + TeamName + "';");
			
			while (res1.next()) {
				TeamId = res1.getString(1);
			}
			
			ResultSet res2 = db.Quer("SELECT idResponsibility FROM responsibility WHERE Name='" + responsibility + "';");
			
			while (res2.next()) {
				responsibId = res2.getString(1);
			}
			
			
			if (db.Upd("INSERT INTO users_team SET Users_idUsers='" + JMBAGMember + "', Responsibility_idResponsibility='" + responsibId + "', Team_idTeam='" + TeamId + "';")) {
				
				RequestDispatcher rd = request.getRequestDispatcher("SuccessNewMember.jsp");
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
