package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.lxsDao;
import javabean1.Lxs;

public class reg2servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public reg2servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//��ȡ���������
		String lxsID=request.getParameter("lxsID");
		//��ȡ��������е�����
		String lxsname=request.getParameter("lxsname");
		//��ȡ����������
		String lxspassword=request.getParameter("lxspassword");
		//��ȡ������ͼƬ�ſ�
		String photo=request.getParameter("photo");
		//��ȡ��������ϵ�绰
		String lxstel=request.getParameter("lxstel");
		//��ȡ������칫��ַ
		String lxsaddress=request.getParameter("lxsaddress");
		//ʵ����һ��lsxDao����
		System.out.println(photo);
		lxsDao lxsDao=new lxsDao();
		if(lxsname!=null&&!lxsname.isEmpty()) {
			if(lxsDao.LxsIsExist(lxsname)) {
				// ʵ����һ��Lxs����
				Lxs lxs = new Lxs();		
				// ���û������е����Ը�ֵ
				lxs.setLxsID(lxsID);	
				lxs.setLxsname(lxsname);
			    lxs.setLxspassword(lxspassword);
				lxs.setLxsphoto(photo);
				lxs.setLxstel(lxstel);
				lxs.setLxsaddress(lxsaddress);
				// ����������ע����Ϣ
				lxsDao.savaLxs(lxs);	
				request.setAttribute("info", "<br><br>��ϲ��ע��ɹ���<br>");
			}else{
				request.setAttribute("info", "���󣺴����������Ѵ��ڣ�");
			}
		}
		// ת����message.jspҳ��
		request.getRequestDispatcher("message2.jsp").forward(request, response);
	}

}
