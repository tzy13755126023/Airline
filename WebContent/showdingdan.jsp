<%@ page language="java" import="java.util.*,javabean1.*,dao.*" contentType="text/html; "
    pageEncoding="UTF-8"%>
    <%
    String path=request.getContextPath();
    String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN""http://www.w3.org/TR/html4/loose.dtd" >
<html>
<head>
<link rel="stylesheet" href="1.css"/>
    <link rel="stylesheet" href="css/style.css"/>
    <link rel="stylesheet" href="css/luara.left.css"/>
<base href="<%=basePath %>">
<title>showhangban.jsp</title>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="this is my page">
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
<div id="main">
<center>
<h1>订单信息</h1>
<table cellspacing="1" cellpadding="0" width="80%" border="0">
<tbody>
<tr bgcolor="#fba661"  height="23">
<td><div align="center">用户名</div></td>
<td><div align="center">身份证号</div></td>
<td><div align="center">电话号码</div></td>
<td><div align="center">航班号</div></td>
<td><div align="center">航班名称</div></td>
<td><div align="center">航班类型</div></td>
<td><div align="center">航班公司</div></td>
<td><div align="center">起飞时间</div></td>
<td><div align="center">到达时间</div></td>
<td><div align="center">起飞城市</div></td>
<td><div align="center">到达城市</div></td>
<td><div align="center">票价</div></td>
<td><div align="center">已支付</div></td>
</tr> 
<% 
List<dingdan> list=(List<dingdan>) request.getAttribute("Alldingdan");
Iterator<dingdan>it=list.iterator();
dingdan d=null;
while(it.hasNext()){
	d=it.next();%>
<tr bgcolor="#f3f3f3" height="26">
<td width="6%">
<div align="center"><%=d.getUname() %></div>
</td>	
<td width="8%"> 
<div align="center"><%=d.getUidcard() %> </div>
</td>
<td width="8%">
<div align="center"><%=d.getUiphone() %> </div>
</td>
<td width="6%">
<div align="center"><%=d.getHbid() %></div>
</td>
<td width="6%">
<div align="center"><%=d.getHbnames() %></div>
</td>
<td width="8%">
<div align="center"><%=d.getHbtype() %> </div>
</td>
<td width="8%">
<div align="center"><%=d.getHbcompany() %></div>
</td>
<td width="12%">
<div align="center"><%=d.getHbgotime() %></div>
</td>
<td width="12%">
<div align="center"><%=d.getHbtotime() %></div>
</td>
<td width="8%">
<div align="center"><%=d.getHbgocity() %></div>
</td>	
<td width="8%">
<div align="center"><%=d.getHbtocity() %></div>
</td>
<td width="8%">
<div align="center"><%=d.getHbprice() %></div>
</td>
<td width="10%">
<div align="center">
<form action="./qupiao.jsp" method="post">
<input type="hidden" name="uname" value="<%=d.getUname() %>">
<input type="hidden" name="uidcard" value="<%=d.getUidcard() %>">
<input type="hidden" name="uiphone" value="<%=d.getUiphone() %>">
<input type="hidden" name="hid" value="<%=d.getHbid() %>">
<input type="hidden" name="hnames" value="<%=d.getHbnames() %>">
<input type="hidden" name="htype" value="<%=d.getHbtype() %>">
<input type="hidden" name="hcompany" value="<%=d.getHbcompany() %>">
<input type="hidden" name="hgotime" value="<%=d.getHbgotime() %>">
<input type="hidden" name="htotime" value="<%=d.getHbtotime() %>">
<input type="hidden" name="hgocity" value="<%=d.getHbgocity() %>">
<input type="hidden" name="htocity" value="<%=d.getHbtocity() %>">
<input type="hidden" name="hprice" value="<%=d.getHbprice() %>">
<input type="submit" value="取票">
</form>
</div>
</td>
</tr>
<%} %>
</tbody>
</table>
</center>
</div>
<div id="footer">
<p align="center"><a href="http://sz.aisino.com/" >版权所有：长沙学院&copy;2018-2024|湘ICP备05005681</a></p>
<img src="images/dibu.jpg" style="width:1630px;height:200px"/>
</div>
</div>
</body>
</html>