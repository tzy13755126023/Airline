package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.dingdanDao;


public class ddshanchuservlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public ddshanchuservlet1() {
        super();
      
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		this.doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String hangbanhao = request.getParameter("hangbanhao");
  		dingdanDao d =new dingdanDao();
  		d.deletedingdan(hangbanhao);
  		request.getRequestDispatcher("/dingdanshanchusuccess.jsp").forward(request,response);
	}

}
