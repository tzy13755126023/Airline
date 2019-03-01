<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>旅客注册</title>
<style type="text/css">
@import url(1.css);
</style>
<script type="text/javascript">
  	function reg1(form){
      	if(form.username.value == ""){
      		alert("用户不能为空！");
      		form.username.focus();
      		return false;
      	}
      	if(form.password.value == ""){
      		alert("密码不能为空！");
      		form.password.focus();
      		return false;
      	}
      	if(form.repassword.value == ""){
      		alert("确认密码不能为空！");
      		form.repassword.focus();
      		return false;
      	}
      	if(form.password.value != form.repassword.value){
      		alert("两次密码输入不一致！");
      		return false;
      	}
      	if(form.tel.value == ""){
      		alert("联系电话不能为空！");
      		form.tel.focus();
      		return false;
      	}
      	if(form.idcard.value == ""){
      		alert("身份证不能为空！");
      		form.email.focus();
      		return false;
      	}
  	}
  	function change(){
	var photo = document.getElementById("photo");
	var photoImg = document.getElementById("photoImg");
	photoImg.src = photo.value;
  	}
</script>
</head>
<body  bgcolor="pink">
  	 <div align="center">
		  	<div class="div1">
		  		<div class="top1">旅客注册页面</div>
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
					    <form action="./reg1servlet" method="post" onsubmit="return reg1(this);">
						    <table align="center" width="450" border="0">
						    	<tr>
						    		<td align="right">旅客姓名：</td>
						    		<td>
						    			<input type="text" name="username">
						    		</td>
						    	</tr>
						    	<tr>
						    		<td align="right">密 码：</td>
						    		<td>
						    			<input type="password" name="password">
						    		</td>
						    	</tr>
						    	<tr>
						    		<td align="right">确认密码：</td>
						    		<td>
						    			<input type="password" name="repassword">
						    		</td>
						    	</tr>
						    	<tr>
						    		<td align="right">性 别：</td>
						    		<td>
						    			<input type="radio" name="sex" value="man" checked="checked">男
						    			<input type="radio" name="sex" value="woman">女
						    		</td>
						    	</tr>
						    	<tr>
						    		<td align="right">头 像：</td>
						    		<td>
						    			<select name="photo" id="photo" onchange="change();">
						    				<option value="images/nan.gif"selected="selected">boy</option>
						    				<option value="images/nv.jpg">girl</option>
						    			</select>
						    			<img id="photoImg" src="images/nan.gif">
						    		</td>
						    	</tr>
					    	<tr>
						    		<td align="right">联系电话：</td>
						    		<td>
						    			<input type="text" name="tel">
						    		</td>
						    	</tr>
						    	<tr>
						    		<td align="right">身份证：</td>
						    		<td>
						    			<input type="text" name="idcard">
						    		</td>
						    	</tr>
						    	<tr>
						    		<td colspan="2" align="center">
						    			<input type="submit" value="注 册">
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