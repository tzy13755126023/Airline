<%@ page language="java" import="java.util.*,javabean1.*,dao.*" contentType="text/html; "
    pageEncoding="UTF-8"%>
    <%
    String path=request.getContextPath();
    String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" >
<html>
<head>
<base href="<%=basePath %>">
<title>所有用户查询</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="this is my page">
</head>
<body bgcolor="pink">
<center>
<h1>旅客列表</h1>
<table cellspacing="1" cellpadding="0" width="40%" border="0">
<tbody>
<tr bgcolor="#fba661"  height="20">
<td><div align="center">旅客姓名</div></td>
<td><div align="center">密码</div></td>
<td><div align="center">性别</div></td>
<td><div align="center">头像</div></td>
<td><div align="center">电话</div></td>
<td><div align="center">身份证</div></td>
</tr>
<%
List<User> list=(List<User>) request.getAttribute("AllUser");
Iterator<User>it=list.iterator();
User u=null;
while(it.hasNext()){
	u=it.next();
%>
<tr bgcolor="#f3f3f3" height="25">
<td width="10%">
<div align="center"><%=u.getUsername() %></div>
</td>
<td width="12%">
<div align="center"><%=u.getPassword() %></div>
</td>
<td width="13%"> 
<div align="center"><%=u.getSex() %> </div>
</td>
<td width="13%">
<div align="center"><img height="40" hspace="0" src="<%=u.getPhoto() %>" width="83" border="0"/></div>
</td>
<td width="10%">
<div align="center"><%=u.getTel() %></div>
</td>
<td width="10%">
<div align="center"><%=u.getIdcard() %> </div>
</td>
<%session.setAttribute("username", u.getUsername()); %>
<%session.setAttribute("sex", u.getSex()); %>
<%session.setAttribute("tel",u.getTel()); %>
<%session.setAttribute("idcard",u.getIdcard()); %>
</tr>
<%} %>
</tbody>
</table>

<h1>旅行社列表</h1>
<table cellspacing="1" cellpadding="0" width="40%" border="0">
<tbody>
<tr bgcolor="#fba661"  height="20">
<td><div align="center">旅行社代号</div></td>
<td><div align="center">旅行社名称</div></td>
<td><div align="center">旅行社密码</div></td>
<td><div align="center">旅行社照片</div></td>
<td><div align="center">旅行社电话</div></td>
<td><div align="center">办公地址</div></td>
</tr>
<%
List<Lxs> list1=(List<Lxs>) request.getAttribute("Alllxs");
Iterator<Lxs>it1=list1.iterator();
Lxs l=null;
while(it1.hasNext()){
	l=it1.next();
%>
<tr bgcolor="#f3f3f3" height="25">
<td width="10%">
<div align="center"><%=l.getLxsID() %></div>
</td>
<td width="12%">
<div align="center"><%=l.getLxsname() %></div>
</td>
<td width="12%">
<div align="center"><%=l.getLxspassword() %></div>
</td>
<td width="13%">
<div align="center"><img height="40" hspace="0" src="<%=l.getLxsphoto() %>" width="83" border="0"/></div>
</td>
<td width="10%">
<div align="center"><%=l.getLxstel() %></div>
</td>
<td width="10%">
<div align="center"><%=l.getLxsaddress() %> </div>
</td>
</tr>
<%} %>
</tbody>
</table>
<br>
<a href="login.jsp">返回主菜单</a>
</center>
</body>
</html>