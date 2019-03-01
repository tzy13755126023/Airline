<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>旅行社登陆页面</title>
    <link rel="stylesheet" type="text/css" href="1.css">
    <script type="text/javascript">
    	function login2(form){
        	if(form.username2.value == ""){
        		alert("用户不能为空！");
        		return false;
        	}
        	if(form.password2.value == ""){
        		alert("密码不能为空！");
        		return false;
        	}
    	}
    </script>
  </head>
  <body bgcolor="pink">
	  	 <div align="center">
		  	<div class="div1">
		  <div class="top1">登陆注册</div>
		  		<div class="bottom">
					<div class="div2">
				  		<ul>
				  			<li><a href="reg.jsp">用户注册</a></li>
				  			<li><a href="login.jsp">用户登录</a></li>
				  			<li><a href="yonghuxuzhi.jsp">用户须知</a></li>
				  			<li><a href="weidenglu.jsp">退出用户</a></li>
				  		</ul>
				  	</div>				  	 
				  	<div class="div3"> 
					    <form action="./login2servlet" method="post" onSubmit="return login2(this);">
						    <table align="center" width="300" border="0" class="tb1">
						    	<tr>
						    	   <img src="images/tzy2.jpg"style="height:140px;width:250px" /> 
						    		<td align="right">用户名：</td>
						    		<td>
						    			<input type="text" name="lxsname">
						    		</td>
						    	</tr>
						    	<tr>
						    		<td align="right">密 码：</td>
						    		<td>
						    			<input type="password" name="lxspassword">
						    		</td>
						    	</tr>
						    	<tr>
						    		<td colspan="2" align="center" height="50">
						    			<input type="submit" value="登 录">
						    			<input type="reset" value="重 置">
						    		</td>
						    	</tr>
						    </table>
						</form>
				  	 </div>
				</div>
		  	</div>
	  </div>
  </body>
</html>