package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import javabean1.User;


public class reg1servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// ��ȡ�û���
		String username = request.getParameter("username");
		// ��ȡ����
		String password = request.getParameter("password");
		// ��ȡ�Ա�
		String sex = request.getParameter("sex");
		// ��ȡͷ��
		String photo = request.getParameter("photo");
		// ��ȡ��ϵ�绰
		String tel = request.getParameter("tel");
		// ��ȡ��������
		String idcard = request.getParameter("idcard");
		// ʵ����UserDao����
		UserDao userDao = new UserDao();
		if(username != null && !username.isEmpty()){
			if(userDao.userIsExist(username)){
				// ʵ����һ��User����
				User user = new User();		
				// ���û������е����Ը�ֵ
				user.setUsername(username);	
				user.setPassword(password);
				user.setSex(sex);
				user.setPhoto(photo);
				user.setTel(tel);
				user.setIdcard(idcard);
				// �����û�ע����Ϣ
				userDao.saveUser(user);	
			response.setContentType("text/html;charset=gb2312");
			PrintWriter out=response.getWriter();
			out.print("<br>");
			out.print("<br>");
				request.setAttribute("info", "��ϲ��ע��ɹ���<br>");
			}else{
				request.setAttribute("info", "���󣺴��û����Ѵ��ڣ�");
			}
		}
		// ת����message.jspҳ��
		request.getRequestDispatcher("message1.jsp").forward(request, response);
	}

}