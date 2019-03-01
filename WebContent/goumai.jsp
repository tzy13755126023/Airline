<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>goumai.jsp</title>
<!-- 幻灯片等链接 -->
    <link rel="stylesheet" href="1.css"/>
    <link rel="stylesheet" href="css/style.css"/>
    <link rel="stylesheet" href="css/luara.left.css"/>
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
 
//表单的简单校验      

function tianjiaxinxi(form) {
        	if(form.uname.value == ""){
        		alert("请填写真实姓名！！");
        		form.uname.focus();
        		return false;
        	}
        	if(form.uidcard.value == ""){
        		alert("请填写真实身份证！！");
        		form.uidcard.focus();
        		return false;
        	}
        	if(form.uiphone.value == ""){
        		alert("请填写手机号！！");
        		form.uiphone.focus();
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
                </ul>
            </div>
    </div>
 <div id="mian">

 <form action="./querenzhifu.jsp" method="post" onsubmit="return tianjiaxinxi(this);">
 
<input type="hidden" name="hhid" value="<%=request.getParameter("hid") %>">
<input type="hidden" name="hhnames" value="<%=request.getParameter("hnames") %>">
<input type="hidden" name="hhtype" value="<%=request.getParameter("htype") %>">
<input type="hidden" name="hhcompany" value="<%=request.getParameter("hcompany") %>">
<input type="hidden" name="hhgotime" value="<%=request.getParameter("hgotime") %>">
<input type="hidden" name="hhtotime" value="<%=request.getParameter("htotime") %>">
<input type="hidden" name="hhgocity" value="<%=request.getParameter("hgocity") %>">
<input type="hidden" name="hhtocity" value="<%=request.getParameter("htocity") %>">
<input type="hidden" name="hhprice" value="<%=request.getParameter("hprice") %>">
<br><br><br><br><br><br>
<table align="center" width="450" border="0">
		    	<tr>
		    		<td align="right">乘客姓名：</td>
		    		<td>
		    			<input type="text" name="uname">
		    		</td>
		    	</tr>
		    	<tr>
		    		<td align="right">乘客身份证：</td>
		    		<td>
		    			<input type="text" name="uidcard">
		    		</td>
		    	</tr>
		    	<tr>
		    		<td align="right">乘客电话：</td>
		    		<td>
		    			<input type="text" name="uiphone">
		    		</td>
		    	</tr>
		    	<tr>
		    		<td colspan="2" align="center">
		    			<input type="submit" value="确定订购">
		    			<input type="reset" value="重 置">
		    		</td>
		    	</tr>
</table>
</form>
</div>
<br><br><br><br><br><br>
<br><br><br><br><br><br>
<div id="footer">
<p align="center"><a href="http://sz.aisino.com/" >版权所有：长沙学院&copy;2018-2024|湘ICP备05005681</a></p>
<img src="images/dibu.jpg" style="width:1630px;height:200px"/>
</div>
</div>
</body>
</html>