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
		// 获取用户名
		String username = request.getParameter("username");
		// 获取密码
		String password = request.getParameter("password");
		// 获取性别
		String sex = request.getParameter("sex");
		// 获取头像
		String photo = request.getParameter("photo");
		// 获取联系电话
		String tel = request.getParameter("tel");
		// 获取电子邮箱
		String idcard = request.getParameter("idcard");
		// 实例化UserDao对象
		UserDao userDao = new UserDao();
		if(username != null && !username.isEmpty()){
			if(userDao.userIsExist(username)){
				// 实例化一个User对象
				User user = new User();		
				// 对用户对象中的属性赋值
				user.setUsername(username);	
				user.setPassword(password);
				user.setSex(sex);
				user.setPhoto(photo);
				user.setTel(tel);
				user.setIdcard(idcard);
				// 保存用户注册信息
				userDao.saveUser(user);	
			response.setContentType("text/html;charset=gb2312");
			PrintWriter out=response.getWriter();
			out.print("<br>");
			out.print("<br>");
				request.setAttribute("info", "恭喜，注册成功！<br>");
			}else{
				request.setAttribute("info", "错误：此用户名已存在！");
			}
		}
		// 转发到message.jsp页面
		request.getRequestDispatcher("message1.jsp").forward(request, response);
	}

}