  <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ page language="java" contentType="text/html" pageEncoding="GBK"%>
<%@ page import="javabean1.User" %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>��ʾ��Ϣ</title>
		<link rel="stylesheet" type="text/css" href="1.css">
	</head>

	<body bgcolor="pink">
		<div align="center">
		  	<div class="div1">
		  		<div class="top1">��ʾ��Ϣ</div>
		  		<div class="bottom">
					<div class="div2">
					<br>
				  		<ul>
				  			<li><a href="reg.jsp">�û�ע��</a></li>
				  			<li><a href="login.jsp">�û���¼</a></li>
				  			<li><a href="yonghuxuzhi.jsp">�û���֪</a></li>
				  			<li><a href="ExitServlet1">�˳��û�</a></li>
				  		</ul>
				  	</div>
				  	 <div class="div3"> 
                     <br>
					 <%
		               	// ��ȡ��ʾ��Ϣ
		  					String info = (String)request.getAttribute("info");
		  			    	// �����ʾ��Ϣ��Ϊ�գ��������ʾ��Ϣ
		  					if(info != null){

		  						out.println(info);
		  					}
		  			    	// ��ȡ��¼���û���Ϣ
		  					User user = (User)session.getAttribute("user");
		  			    	// �ж��û��Ƿ��¼
		  					if(user !=null){
 					  %>
						<table align="center" width="350" border="1" height="200" bordercolor="white">
							<tr>
					    		<td align="center" colspan="2">
					    			<span style="font-weight: bold;font-size: 12px;"></span>
					    			���ѵ�¼�ɹ���
					    		</td>
					    	</tr>
			              <tr>
			              <td align="center"><a href="index1.html">��ӭ�����ÿ���ҳ</a></td>
			              </tr>
						</table>
						<br><br>
						<%								
							}
							else{
							    out.println("<br><br>�Բ�������û�е�¼��");}
						%>
						
				  	 </div>
				</div>
		  	</div>
	  </div>
	</body>
</html>