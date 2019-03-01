package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.dingdanDao;
import javabean1.dingdan;


public class ddcxservlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ddcxservlet1() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

   		List<dingdan> list=new dingdanDao().getAlldingdan();
   		request.setAttribute("Alldingdan",list);
   		request.getRequestDispatcher("/showdingdan.jsp").forward(request,response);
	}

}
