package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javabean1.User;
import javabean1.dingdan;
import jdbc.jdbc;

public class dingdanDao {

	

 public  User jiaoyan(String username ,String idcard,String tel) {
	    User user = null;
		// 获取数据库连接Connection对象
		Connection conn = jdbc.getConnection();
		// 根据用户名，身份证号，电话查询用户信息
		String sql="select * from passenger where username = ? and idcard = ? and tel =?";
		try {
			// 获取PreparedStatement对象
			PreparedStatement ps = conn.prepareStatement(sql);
			// 对SQL语句的占位符参数进行动态赋值
			ps.setString(1, username);
			ps.setString(2, idcard);
			ps.setString(3, tel);
			ResultSet rs = ps.executeQuery();
			// 判断结果集是否有效
			if(rs.next()){
				// 实例化一个用户对象
				user = new User();
				// 对用户对象属性赋值
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				user.setSex(rs.getString("sex"));
				user.setPhoto(rs.getString("photo"));
				user.setTel(rs.getString("tel"));
				user.setIdcard(rs.getString("idcard"));


			}
			// 释放此 ResultSet 对象的数据库和 JDBC 资源
			rs.close();
			// 释放此 PreparedStatement 对象的数据库和 JDBC 资源
			ps.close();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			// 关闭数据库连接
			jdbc.closeConnection(conn);
		}
		return user;
	}
 
 public boolean dingdanIsExist(String uname) {
	// 获取数据库连接Connection对象
			Connection conn = jdbc.getConnection();
			// 根据指定用户名查询用户信息
			String sql = "select * from dingdan where uname = ?";
			try {
				// 获取PreparedStatement对象
				PreparedStatement ps = conn.prepareStatement(sql);
				// 对用户对象属性赋值
				ps.setString(1, uname);
				// 执行查询获取结果集
				ResultSet rs = ps.executeQuery();
				// 判断结果集是否有效
				if(!rs.next()){
					// 如果无效则证明此用户名可用
					return true;
				}
				// 释放此 ResultSet 对象的数据库和 JDBC 资源
				rs.close();
				// 释放此 PreparedStatement 对象的数据库和 JDBC 资源
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}finally{
				// 关闭数据库连接
				jdbc.closeConnection(conn);
			}
			return false; 
		}
//查询订单	 
public  List<dingdan> getAlldingdan(){
	Connection con =jdbc.getConnection();
	String sql="select * from dingdan";
	List<dingdan> list=new ArrayList<dingdan>();
	Statement stmt=null;
	ResultSet rs=null;
	try{
		stmt=con.createStatement();
		rs=stmt.executeQuery(sql);
		while(rs.next()) {
		dingdan dd =new dingdan();	
		dd.setUname(rs.getString("uname"));
		dd.setUidcard(rs.getString("uidcard"));
		dd.setUiphone(rs.getString("uiphone"));
		dd.setHbid(rs.getString("hbid"));
		dd.setHbnames(rs.getString("hbnames"));
		dd.setHbtype(rs.getString("hbtype"));
		dd.setHbcompany(rs.getString("hbcompany"));
		dd.setHbgotime(rs.getString("hbgotime"));
		dd.setHbtotime(rs.getString("hbtotime"));
		dd.setHbgocity(rs.getString("hbgocity"));
		dd.setHbtocity(rs.getString("hbtocity"));
		dd.setHbprice(rs.getString("hbprice"));
		list.add(dd);
		}
	}catch(SQLException e){
		e.printStackTrace();
	}finally{
		try {
			if(rs!=null){
				rs.close();
			}
			if(stmt!=null){
				stmt.close();
			}
			if(con!=null){
				con.close();
			}
		}catch(Exception e2){
			e2.printStackTrace();
		  }
}
	return list;
	
   } 

public void  deletedingdan(String hangbanhao){
	Connection con=jdbc.getConnection();
	PreparedStatement pst = null;  //预编译语句
	//PreparedStatement p = null;
	String sql="delete from dingdan where hbid='"+hangbanhao+"'";
	try{
		pst = con.prepareStatement(sql);
		pst.executeUpdate();

	}catch(SQLException e){
		e.printStackTrace();
	}
		try{
			
			if(pst!=null){
				pst.close();
			}
			if(con!=null){
				con.close();
			}
			
		}catch (Exception e2){
			e2.printStackTrace();
	}
}

}

