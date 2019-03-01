<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>旅行社注册</title>
<style type="text/css">
@import url(1.css);
</style>
<script type="text/javascript">
   function reg2(form) {
	   if(form.lxsID.value==""){
	   alert("旅行社代号不能为空！");
	   form.lxsID.focus();
	   return false;   
    }
	   if(form.lxsname.value==""){
		   alert("旅行社名称不能为空！");
		   form.lxsname.focus();
		   return false;   
    }	   
	   if(form.lxspassword.value==""){
		   alert("密码不能为空！");
		   form.lxspassword.focus();
		   return false;   
    }
	   if(form.lxsrepassword.value==""){
		   alert("确认密码不能为空！");
		   form.lxsrepassword.focus();
		   return false;   
    }
	   if(form.lxspassword.value!=form.lxsrepassword.value){
		   alert("两次密码输入不一致！");
		   return false;   
    }
	   if(form.lxstel.value==""){
		   alert("电话号码不能为空！");
		   form.lxstel.focus();
		   return false;   
    }
	   if(form.lxsaddress.value==""){
		   alert("办公地址不能为空！");
		   form.lxsaddress.focus();
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
		  		<div class="top1">旅行社注册页面</div>
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
                       <form action="./reg2servlet" method="post" onsubmit="return reg2(this);">
				    <table align="center" width="450" border="0">
				    	<tr>
				    		<td align="right">旅行社代号：</td>
				    		<td>
				    			<input type="text" name="lxsID">
				    		</td>
				    	</tr>
				    	<tr>
				    		<td align="right">旅行社名称：</td>
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
				    		<td align="right">确认密码：</td>
				    		<td>
				    			<input type="password" name="lxsrepassword">
				    		</td>
				    	</tr>
				    	
				    	<tr>
				    		<td align="right">头 像：</td>
				    		<td>
				    			<select name="photo" id="photo" onchange="change();">
				    				<option value="images/photo1.jpg"selected="selected">photo1</option>
				    				<option value="images/photo2.jpg">photo2</option>
				    				<option value="images/photo3.jpg">photo3</option>
				    			</select>
				    			<img id="photoImg" src="images/photo1.jpg">
				    		</td>
				    	</tr>
			    	<tr>
				    		<td align="right">联系电话：</td>
				    		<td>
				    			<input type="text" name="lxstel">
				    		</td>
				    	</tr>
				    	<tr>
				    		<td align="right">办公地址：</td>
				    		<td>
				    			<input type="text" name="lxsaddress">
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