<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>hangtian.jsp</title>
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
  </script>
<script type="text/javascript">
function check(form) {
if (form.chaxun.value == "") {
	alert("请输入查询条件！");
	form.chaxun.focus();
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
                   <form action="./chaxunservlet1" method="post" onsubmit="return check(this);">
                   &nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp; &nbsp;  
                   &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; 
                   <h7>请输入所要查询机票的关键字：</h7>
                   <input type="text" name="chaxun" style="height:17px;width:160px;"/> 
                  <input type="submit" value="查询" style="height:24px;width:40px">
                  </form>
                  </li>
            </ul> 
     </div>    
</div>
<div id="main">
<div id="main1">
<br><br>
  <!-- 长沙——>厦门  -->
 <a href="https://travel.xiamenair.com/trip-detail/6188da61-7613-4df1-8fc9-dbf674b6f0b6.html">
 <img src="images/hangtian1.jpg"style="margin-left:115px;width:265px;height:200px"/></a>
 <br>
<p align="center" style="font-size:13px">长沙厦门三天两晚游&nbsp;&nbsp;&nbsp;&nbsp;<h7>￥1250.0 </h7></p>
  <!--长沙——>香港 -->
  <br>
   <a href="https://baike.baidu.com/item/香港/128775?fr=aladdin">
  <img src="images/hangtian2.jpg"style="margin-left:115px;width:265px;height:200px"/></a>
  <br>
  <p align="center" style="font-size:13px">长沙香港四天三晚游&nbsp;&nbsp;&nbsp;&nbsp;<h7>￥1862.0 </h7></p>
 </div>
   <!---------------------------------------- -->
<div id="main2hangtian">
 <!------------上海！---------------- -->
 <br><br>
 <a href="https://baike.so.com/doc/1253613-1325811.html">
 <img src="images/hangtian5.jpg" style="width:265px;height:200px"/></a>
 <p style="font-size:13px">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;上海外滩双人三天游&nbsp;&nbsp;&nbsp;&nbsp;<h7>￥2135.0 </h7></p>
  <!------------连云港---------------- -->
 <br>
 <a href="http://image.so.com/i?q=%E8%BF%9E%E4%BA%91%E6%B8%AF&src=srp">
 <img src="images/hangtian6.jpg" style="width:265px;height:200px"/></a>
 <p style="font-size:13px">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;连云港三天两晚游&nbsp;&nbsp;&nbsp;&nbsp;<h7>￥1680.0 </h7></p>

</div>
  
  <!---------------------------------------- -->
<div id="main3hangtian">
   <!--长沙——>厦门-->
  <br><br>
<a href="https://travel.xiamenair.com/trip-detail/6188da61-7613-4df1-8fc9-dbf674b6f0b6.html">
  <img src="images/hangtian3.jpg"style="margin-left:50px;width:265px;height:200px"/></a>
  <br>
  <p style="font-size:13px">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;长沙厦门四天三晚游&nbsp;&nbsp;&nbsp;&nbsp;<h7>￥1862.0 </h7></p>
  <!-- 长沙———>北京 -->
  <br>
  <a href="https://baike.baidu.com/item/北京/128981?fr=aladdin">
  <img src="images/hangtian4.jpg"style="margin-left:50px;width:265px;height:200px"/></a>
  <br>
  <p style="font-size:13px">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;长沙北京六天五晚晚游&nbsp;&nbsp;&nbsp;&nbsp;<h7>￥3162.0 </h7></p>
  </div>
  </div>
  </div>
<div id="footer">
<p align="center"><a href="http://sz.aisino.com/" >版权所有：长沙学院&copy;2018-2024|湘ICP备05005681</a></p>
<img src="images/dibu.jpg" style="width:1630px;height:200px"/>
</div>
</body>
</html>