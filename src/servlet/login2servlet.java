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
		// ��ȡ�û���
		String lxsname = request.getParameter("lxsname");
		//System.out.println(lxsname);
		// ��ȡ����
		String lxspassword = request.getParameter("lxspassword");
		// ʵ����UserDao����
		lxsDao lxsdao = new lxsDao();	
		// �����û������ѯ�û�
		Lxs lxs = lxsdao.login(lxsname, lxspassword);
		// �ж�user�Ƿ�Ϊ��
		if(lxs != null){
			// ���û��������session��
			request.getSession().setAttribute("lxs", lxs);
			// ת����result.jspҳ��
			request.getRequestDispatcher("message2.jsp").forward(request, response);
		}else{
			// ��¼ʧ��
			request.setAttribute("info", "�����û������������");
			request.getRequestDispatcher("message2.jsp").forward(request, response);
		}
	
      }
}
