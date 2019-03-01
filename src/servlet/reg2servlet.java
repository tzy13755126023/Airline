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
		//获取旅行社代号
		String lxsID=request.getParameter("lxsID");
		//获取旅行社表单中的名称
		String lxsname=request.getParameter("lxsname");
		//获取旅行社密码
		String lxspassword=request.getParameter("lxspassword");
		//获取旅行社图片概况
		String photo=request.getParameter("photo");
		//获取旅行社联系电话
		String lxstel=request.getParameter("lxstel");
		//获取旅行社办公地址
		String lxsaddress=request.getParameter("lxsaddress");
		//实例化一个lsxDao对象
		System.out.println(photo);
		lxsDao lxsDao=new lxsDao();
		if(lxsname!=null&&!lxsname.isEmpty()) {
			if(lxsDao.LxsIsExist(lxsname)) {
				// 实例化一个Lxs对象
				Lxs lxs = new Lxs();		
				// 对用户对象中的属性赋值
				lxs.setLxsID(lxsID);	
				lxs.setLxsname(lxsname);
			    lxs.setLxspassword(lxspassword);
				lxs.setLxsphoto(photo);
				lxs.setLxstel(lxstel);
				lxs.setLxsaddress(lxsaddress);
				// 保存旅行社注册信息
				lxsDao.savaLxs(lxs);	
				request.setAttribute("info", "<br><br>恭喜，注册成功！<br>");
			}else{
				request.setAttribute("info", "错误：此旅行社名已存在！");
			}
		}
		// 转发到message.jsp页面
		request.getRequestDispatcher("message2.jsp").forward(request, response);
	}

}
