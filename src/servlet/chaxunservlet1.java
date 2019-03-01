package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.hangbandDao;
import javabean1.hangban;

public class chaxunservlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public chaxunservlet1() {
        super();
        
    }

   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      	 this.doPost(request, response);
      	}
      	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      		String chaxun = request.getParameter("chaxun");
      		List<hangban> list=new hangbandDao().getchaxun(chaxun);
      		request.setAttribute("ALLHB",list);
      		request.getRequestDispatcher("/showhangban.jsp").forward(request,response);
      		}

   }
