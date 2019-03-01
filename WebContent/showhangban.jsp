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
<h1>航班列表</h1>
<table cellspacing="1" cellpadding="0" width="65%" border="0">
<tbody>
<tr bgcolor="#fba661"  height="23">
<td><div align="center">航班号</div></td>
<td><div align="center">航班名称</div></td>
<td><div align="center">航班类型</div></td>
<td><div align="center">航班公司</div></td>
<td><div align="center">起飞时间</div></td>
<td><div align="center">到达时间</div></td>
<td><div align="center">起飞城市</div></td>
<td><div align="center">到达城市</div></td>
<td><div align="center">飞行时间</div></td>
<td><div align="center">航班票价</div></td>
<td><div align="center">预订</div></td>
</tr> 
<% 
List<hangban> list=(List<hangban>) request.getAttribute("ALLHB");
Iterator<hangban>it=list.iterator();
hangban h=null;
while(it.hasNext()){
	h=it.next();
%>
<tr bgcolor="#f3f3f3" height="26">
<td width="5%">
<div align="center"><%=h.getHBid() %></div>
</td>
<td width="8%"> 
<div align="center"><%=h.getHBnames() %> </div>
</td>
<td width="8%">
<div align="center"><%=h.getHBtype() %> </div>
</td>
<td width="8%">
<div align="center"><%=h.getHbcompany() %></div>
</td>
<td width="15%">
<div align="center"><%=h.getHBgotime() %></div>
</td>
<td width="15%">
<div align="center"><%=h.getHBtotime() %> </div>
</td>
<td width="8%">
<div align="center"><%=h.getHBgocity() %></div>
</td>
<td width="8%">
<div align="center"><%=h.getHBtocity() %></div>
</td>
<td width="8%">
<div align="center"><%=h.getHBtimes() %></div>
</td>
<td width="13%">
<div align="center"><%=h.getHBprice() %></div>
</td>
<!--   错误！！
<%session.setAttribute("hhbid",h.getHBid()); %>
<%session.setAttribute("hhbnames",h.getHBnames()); %>
<%session.setAttribute("hhbtype",h.getHBtype()); %>
 <%session.setAttribute("hhbcompany",h.getHbcompany()); %>
  <%session.setAttribute("hhbgotime",h.getHBgotime()); %>
 <%session.setAttribute("hhbtotime",h.getHBtotime()); %>
   <%session.setAttribute("hhbgocity",h.getHBgocity()); %>
     <%session.setAttribute("hhbtocity",h.getHBtocity()); %>
         <%session.setAttribute("hhbprice",h.getHBprice()); %>
        -->
<td width="13%">
<div align="center">
<form action="./goumai.jsp" method="post">
<input type="hidden" name="hid" value="<%=h.getHBid() %>">
<input type="hidden" name="hnames" value="<%=h.getHBnames() %>">
<input type="hidden" name="htype" value="<%=h.getHBtype() %>">
<input type="hidden" name="hcompany" value="<%=h.getHbcompany() %>">
<input type="hidden" name="hgotime" value="<%=h.getHBgotime() %>">
<input type="hidden" name="htotime" value="<%=h.getHBtotime() %>">
<input type="hidden" name="hgocity" value="<%=h.getHBgocity() %>">
<input type="hidden" name="htocity" value="<%=h.getHBtocity() %>">
<input type="hidden" name="hprice" value="<%=h.getHBprice() %>">
<input type="submit" value="预定">
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