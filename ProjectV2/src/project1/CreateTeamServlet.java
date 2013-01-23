package project1;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.ResultSetMetaData;

public class CreateTeamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public CreateTeamServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String TeamName = request.getParameter("TeamName");
		String JMBAGTeamLeader = request.getParameter("JMBAGTeamLeader");
		String JMBAGMember = request.getParameter("JMBAGMember");
		String ProjectName = request.getParameter("ProjectName");
		String zaduzenja = request.getParameter("zaduzenja");
		String TeamId = "50";
		String responsib = "nes";
		
		try {
		
			MySQLcon db = new MySQLcon("jdbc:mysql://localhost:3306/mydb","a","a");
			
			db.Upd("INSERT INTO team SET name='" + TeamName + "';");
			
			ResultSet res1 = db.Quer("SELECT team.idteam FROM team WHERE team.name='" + TeamName + "';");
			
			while (res1.next()) {
				TeamId = res1.getString(1);
			}
			
			ResultSet res2 = db.Quer("SELECT responsibility.idResponsibility FROM Responsibility WHERE name='" + zaduzenja + "';");
			
			while (res2.next()) {
				responsib = res2.getString(1);
			}
			
			if (db.Upd("INSERT INTO users_team SET Team_idTeam='" + TeamId + "', Users_idUsers='" + JMBAGTeamLeader + "', Responsibility_idResponsibility='1';") && db.Upd("INSERT INTO users_team SET Team_idTeam='" + TeamId + "', Users_idUsers='" + JMBAGMember + "', Responsibility_idResponsibility='" + responsib + "';")) {
				
				RequestDispatcher rd = request.getRequestDispatcher("SuccessNewProjectAssignements.jsp");
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
