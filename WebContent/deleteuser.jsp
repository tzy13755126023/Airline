<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>deleteuser.jsp</title>
<link rel="stylesheet" type="text/css" href="1.css">
<script type="text/javascript">
function check(form) {
	if (form.shanchu.value == "") {
		alert("请输入要删除的用户名!!");
		form.shanchu.focus();
		return false;
	}
}
</script>
  </head>
  <body bgcolor="pink">
	  	 <div align="center">
		  	<div class="div1">
		  <div class="top1">删除页面</div>
		  		<div class="bottom">
					<div class="div2">
				  		<ul>
			  			<li><a href="reg.jsp">用户注册</a></li>
			  			<li><a href="login.jsp">用户登录</a></li>
			  			<li><a href="deleteuser.jsp">删除用户</a></li>
			  			<li><a href="finduserServlet">用户查询</a></li>
			  			<li><a href="ExitServlet1">退出用户</a></li>
				  		</ul>
				  	</div>				  	 
				  	<div class="div3"> 
				<form action="./deleteuserServlet" method="post" onsubmit="return check(this);">
						    <table align="center" width="200" border="0" class="tb1">
						    	<br>
						    	   <img src="images/usershanchu.jpg"style="height:120px;width:250px" />
						        <br> 
						        <br>
						    	<tr>
								<td align="left">请输入要删除的用户名:</td>
								</tr>
								<tr>
								<td align="left"><input type="text" name="shanchu"></td>
								<td>  
								      <input type="submit" value="删除">
								</td>
								<td height="30">
								      <input type="reset" value="取消" /></td>
								      </tr>
                      </table>
                      </form>
				   </div>
				</div>
		  	</div>
	  </div>
  </body>
</html>