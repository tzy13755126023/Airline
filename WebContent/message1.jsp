  <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ page language="java" contentType="text/html" pageEncoding="GBK"%>
<%@ page import="javabean1.User" %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>提示信息</title>
		<link rel="stylesheet" type="text/css" href="1.css">
	</head>

	<body bgcolor="pink">
		<div align="center">
		  	<div class="div1">
		  		<div class="top1">提示信息</div>
		  		<div class="bottom">
					<div class="div2">
					<br>
				  		<ul>
				  			<li><a href="reg.jsp">用户注册</a></li>
				  			<li><a href="login.jsp">用户登录</a></li>
				  			<li><a href="yonghuxuzhi.jsp">用户须知</a></li>
				  			<li><a href="ExitServlet1">退出用户</a></li>
				  		</ul>
				  	</div>
				  	 <div class="div3"> 
                     <br>
					 <%
		               	// 获取提示信息
		  					String info = (String)request.getAttribute("info");
		  			    	// 如果提示信息不为空，则输出提示信息
		  					if(info != null){

		  						out.println(info);
		  					}
		  			    	// 获取登录的用户信息
		  					User user = (User)session.getAttribute("user");
		  			    	// 判断用户是否登录
		  					if(user !=null){
 					  %>
						<table align="center" width="350" border="1" height="200" bordercolor="white">
							<tr>
					    		<td align="center" colspan="2">
					    			<span style="font-weight: bold;font-size: 12px;"></span>
					    			您已登录成功！
					    		</td>
					    	</tr>
			              <tr>
			              <td align="center"><a href="index1.html">欢迎进入旅客首页</a></td>
			              </tr>
						</table>
						<br><br>
						<%								
							}
							else{
							    out.println("<br><br>对不起，您还没有登录！");}
						%>
						
				  	 </div>
				</div>
		  	</div>
	  </div>
	</body>
</html>