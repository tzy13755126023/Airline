package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserManagerDao;

public class deleteuserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public deleteuserServlet() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
     	 this.doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
  		String shanchu = request.getParameter("shanchu");
  		UserManagerDao u =new UserManagerDao();
  		u.deleteuser(shanchu);
  		request.getRequestDispatcher("/shanchusuccess.jsp").forward(request,response);
	}

}
