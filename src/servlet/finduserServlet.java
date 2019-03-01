package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.LxsManagerDao;
import dao.UserManagerDao;
import javabean1.Lxs;
import javabean1.User;
@WebServlet("/findprocServlet")
public class finduserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public finduserServlet() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 this.doPost(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<User> list=new UserManagerDao().getAlluser();
		request.setAttribute("AllUser",list);
		List<Lxs> list1=new LxsManagerDao().getAlllxs();
		request.setAttribute("Alllxs",list1);
		request.getRequestDispatcher("/showuser.jsp").forward(request,response);
			
		doGet(request, response);
	}

}
