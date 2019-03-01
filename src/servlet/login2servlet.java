package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.lxsDao;
import javabean1.Lxs;

public class login2servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 获取用户名
		String lxsname = request.getParameter("lxsname");
		//System.out.println(lxsname);
		// 获取密码
		String lxspassword = request.getParameter("lxspassword");
		// 实例化UserDao对象
		lxsDao lxsdao = new lxsDao();	
		// 根据用户密码查询用户
		Lxs lxs = lxsdao.login(lxsname, lxspassword);
		// 判断user是否为空
		if(lxs != null){
			// 将用户对象放入session中
			request.getSession().setAttribute("lxs", lxs);
			// 转发到result.jsp页面
			request.getRequestDispatcher("message2.jsp").forward(request, response);
		}else{
			// 登录失败
			request.setAttribute("info", "错误：用户名或密码错误！");
			request.getRequestDispatcher("message2.jsp").forward(request, response);
		}
	
      }
}
