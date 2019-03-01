package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import javabean1.User;


public class ExitServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ExitServlet1() {
        super();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 获取session
				HttpSession session = request.getSession();
				// 获取用户对象
				User user = (User)session.getAttribute("user");
				// 判断用户是否有效
				if(user != null){
					// 将用户对象逐出session
					session.removeAttribute("user");
					// 设置提示信息
					request.setAttribute("info", user.getUsername() + " 已成功退出！");
				}
				// 转发到message.jsp页面
				request.getRequestDispatcher("message1.jsp").forward(request, response);
			}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
