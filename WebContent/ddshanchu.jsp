<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
   <link rel="stylesheet" href="1.css"/>
    <link rel="stylesheet" href="css/style.css"/>
    <link rel="stylesheet" href="css/luara.left.css"/>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ddshanchu.jsp</title> 
</head>
<body bgcolor="#d2e9ff">
    <script src="js/jquery-1.8.3.min.js"></script>
    <!--Luara js文件-->
    <script src="js/jquery.luara.0.0.1.min.js"></script>
 
    <!--Luara图片切换骨架begin-->
    <div class="example2">
        <ul>
            <li><img src="images/bofang1.jpg" alt="1"/></li>
            <li><img src="images/bofang3.jpg" alt="2"/></li>
            <li><img src="images/bofang2.jpg" alt="3"/></li>
            <li><img src="images/bofang4.jpg" alt="4"/></li>
        </ul>
        <ol>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
        </ol>
    </div>
    <!--Luara图片切换骨架end-->
    <script>
        $(function(){
            <!--调用Luara示例-->
            $(".example2").luara({width:"1630",height:"280",interval:4500,selected:"seleted",deriction:"left"});

        });
  </script>
 <script type="text/javascript">
function check(form) {
	if (form.hangbanhao.value == "") {
		alert("请输入要删除的航班号!!");
		form.hangbanhao.focus();
		return false;
	}
}
</script> 
<br>
<div id="b">
<div id="head">
<div class="navlist" id="navlist">
                <ul class="container">
                    <li class="nav-title"><a href="message1.jsp">返回界面</a> </li>
                    <li class="nav-title"><a href="index1.html">首页</a> </li>
                    <li class="nav-title"><a href="ITFW.jsp">IT服务</a></li>
                    <li class="nav-title"><a href="hangtian.jsp">航天售票</a> </li>
                    <li class="nav-title"><a href="dingdan.jsp">订单管理</a> </li>
					<li class="nav-title"><a href="ygzp.jsp">员工招聘</a>	 </li>
                    <li class="nav-title"><a href="gywm.jsp">关于我们</a> </li>
                   <li>
            </ul> 
     </div>    
</div>
<div id="main">
<div id="main3">
<form action="./ddshanchuservlet1" method="post" onsubmit="return check(this);">
						    <table  width="200" border="0" class="tb1">
						    	<br><br><br>
                             <img src="images/dingdan.jpg" style="width:400px;height:300px"/>
						        <br> 
						        <br>
						    	<tr>
								<td align="left">请输入要删除的航班号:</td>
								</tr>
								<tr>
								<td align="left"><input type="text" name="hangbanhao"></td>
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
<div id="footer">
<p align="center"><a href="http://sz.aisino.com/" >版权所有：长沙学院&copy;2018-2024|湘ICP备05005681</a></p>
<img src="images/dibu.jpg" style="width:1630px;height:200px"/>
</div>
 </div>
</body>
</html>