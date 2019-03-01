package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import javabean1.User;



/**
 * �û���¼Servlet��
 */
public class login1servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// ��ȡ�û���
		String username = request.getParameter("username");
		//System.out.println(username);
		// ��ȡ����
		String password = request.getParameter("password");
		// ʵ����UserDao����
		UserDao userDao = new UserDao();	
		// �����û������ѯ�û�
		User user = userDao.login(username, password);
		// �ж�user�Ƿ�Ϊ��
		if(user != null){
			// ���û��������session��
			request.getSession().setAttribute("user", user);
			// ת����result.jspҳ��
			request.getRequestDispatcher("message1.jsp").forward(request, response);
		}else{
			// ��¼ʧ��
			request.setAttribute("info", "�����û������������");
			request.getRequestDispatcher("message1.jsp").forward(request, response);
		}
	
      }
}

