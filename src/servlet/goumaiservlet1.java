package servlet;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;

import dao.dingdanDao;
import javabean1.User;
import jdbc.jdbc;


public class goumaiservlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public goumaiservlet1() {
        super();
       
    }

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	this.doPost(request,response);
	}

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
/*	response.setContentType("text/html");
	HttpSession session = request.getSession();
	
	String  hbnames   =(String)session.getAttribute("hhbnames"); 
	String  hbtype   =(String)session.getAttribute("hhbtype"); 
	String  hbcompany  =(String)session.getAttribute("hhbcompany");
	String  hbgotime  =(String)session.getAttribute("hhbgotime"); 
	String  hbtotime  =(String)session.getAttribute("hhbtotime"); 
	String  hbgocity  =(String)session.getAttribute("hhbgocity"); 
	String  hbtocity  =(String)session.getAttribute("hhbtocity"); 
	String  hbprice   =(String)session.getAttribute("hhbprice"); 
*/
	String    username   =request.getParameter("uname");
	String    idcard     =request.getParameter("uidcard");
	String      tel      =request.getParameter("uiphone");
	String    hbid1      = request.getParameter("hhid");
	String    hbnames1   = request.getParameter("hhnames");
	String    hbtype1    = request.getParameter("hhtype");
	String    hbcompany1 = request.getParameter("hhcompany");
	String    hbgotime1  = request.getParameter("hhgotime");
	String    hbtotime1  = request.getParameter("hhtotime");
	String    hbgocity1  = request.getParameter("hhgocity");
	String    hbtocity1  = request.getParameter("hhtocity");
	String    hbprice1   = request.getParameter("hhprice");
/*	System.out.println(uname);
	System.out.println(uidcard);
	System.out.println(uiphone);
	System.out.println(hbid1);
	System.out.println(hbnames1);
	System.out.println(hbtype1);
	System.out.println(hbcompany1);
	System.out.println(hbgotime1);
	System.out.println(hbtotime1);
	System.out.println(hbgocity1);
	System.out.println(hbtocity1);
	System.out.println(hbprice1);
*/
	// 实例化dingdanDao对象
	dingdanDao dingdandao=new dingdanDao();
	User user = dingdandao.jiaoyan(username, idcard, tel);
	// 判断user是否为空
if(user != null){
    //获取数据库莉链接对象
	Connection conn = jdbc.getConnection();
	//String sql = "insert into dingdan(hbid,hbnames,hbtype,hbcompany,hbgotime,hbtotime,hbgocity,hbtocity,hbprice ) values(?,?,?,?,?,?,?,?,?)";
	String sql = "insert into dingdan(uname,uidcard,uiphone,hbid,hbnames,hbtype,hbcompany,hbgotime,hbtotime,hbgocity,hbtocity,hbprice ) values(?,?,?,?,?,?,?,?,?,?,?,?)";
	try {
		// 获取PreparedStatement对象
	PreparedStatement ps = conn.prepareStatement(sql);
		// 对SQL语句的占位符参数进行动态赋值	
		ps.setString(1,username);
		ps.setString(2,idcard);
		ps.setString(3,tel);
		ps.setString(4,hbid1);
		ps.setString(5,hbnames1);
		ps.setString(6,hbtype1);
		ps.setString(7,hbcompany1);
		ps.setString(8,hbgotime1);
		ps.setString(9,hbtotime1);
		ps.setString(10,hbgocity1);
		ps.setString(11,hbtocity1);
		ps.setString(12,hbprice1);
		//ps.setString(1,hbid);
	//	ps.setString(2,hbnames);
		/*ps.setString(3,hbtype);
		ps.setString(4,hbcompany);
		ps.setString(5,hbgotime);
		ps.setString(6,hbtotime);
		ps.setString(7,hbgocity);
		ps.setString(8,hbtocity);
		ps.setString(9,hbprice);	*/
		// 执行更新操作
		ps.executeUpdate();
		// 释放此 PreparedStatement 对象的数据库和 JDBC 资源
		ps.close();
	}

		catch (Exception e) {
			e.printStackTrace();
		}finally{
			// 关闭数据库连接
			jdbc.closeConnection(conn);
		}
		request.getRequestDispatcher("gmsuccess.jsp").forward(request,response);
	
  }
      else {
    	  request.getRequestDispatcher("gmfailed.jsp").forward(request,response);
     }
   } 
}
