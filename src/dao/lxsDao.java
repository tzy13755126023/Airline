package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javabean1.Lxs;
import javabean1.User;
import jdbc.jdbc;


public class lxsDao {
     /**
	 * 用户数据库操作类
     * @return 
	 */
public  void savaLxs(Lxs lxs) {
	// 获取数据库连接Connection对象
	Connection conn =jdbc.getConnection();
	// 插入用户注册信息的SQL语句
    String sql = "insert into lxs(lxsID,lxsname,lxspassword,photo,lxstel,lxsaddress) values(?,?,?,?,?,?)";
          try {
				// 获取PreparedStatement对象
				PreparedStatement ps = conn.prepareStatement(sql);
				// 对SQL语句的占位符参数进行动态赋值
				ps.setString(1, lxs.getLxsID());
				ps.setString(2, lxs.getLxsname());
				ps.setString(3, lxs.getLxspassword());
				ps.setString(4, lxs.getLxsphoto());
				ps.setString(5, lxs.getLxstel());
				ps.setString(6, lxs.getLxsaddress());
				// 执行更新操作
				ps.executeUpdate();
				// 释放此 PreparedStatement 对象的数据库和 JDBC 资源
				ps.close();
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				// 关闭数据库连接
				jdbc.closeConnection(conn);
			}
		}
/**
 * 用户登录
 * @param lxsname 旅行社姓名
 * @param lxspassword 密码
 * @return 用户对象
 */
public  Lxs login(String lxsname, String lxspassword){
	Lxs lxs = null;
	// 获取数据库连接Connection对象
	//System.out.println(lxsname);
	Connection conn = jdbc.getConnection();
	// 根据旅行社姓名及密码查询旅行社信息
	String sql = "select * from lxs where lxsname = ? and lxspassword = ?";
	try {
		// 获取PreparedStatement对象
		PreparedStatement ps = conn.prepareStatement(sql);
		// 对SQL语句的占位符参数进行动态赋值
		ps.setString(1, lxsname);
		ps.setString(2, lxspassword);
		// 执行查询获取结果集
		ResultSet rs = ps.executeQuery();
		// 判断结果集是否有效
		if(rs.next()){
			// 实例化一个用户对象
			lxs = new Lxs();
			// 对用户对象属性赋值
			lxs.setLxsID(rs.getString("lxsID"));
			lxs.setLxsname(rs.getString("lxsname"));
			lxs.setLxspassword(rs.getString("lxspassword"));
			lxs.setLxsphoto(rs.getString("photo"));
			lxs.setLxstel(rs.getString("lxstel"));
			lxs.setLxsaddress(rs.getString("lxsaddress"));
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
	return lxs;
}
/**
 * 判断用户名在数据库中是否存在
 * @param lxsname 用户名
 * @return 布尔值
 */
public boolean LxsIsExist(String lxsname){
	// 获取数据库连接Connection对象
	Connection conn = jdbc.getConnection();
	// 根据指定用户名查询用户信息
	String sql = "select * from lxs where lxsname = ?";
	try {
		// 获取PreparedStatement对象
		PreparedStatement ps = conn.prepareStatement(sql);
		// 对用户对象属性赋值
		ps.setString(1, lxsname);
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

}
