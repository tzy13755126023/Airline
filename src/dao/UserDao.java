package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javabean1.User;
import jdbc.jdbc;
/**
 * 用户数据库操作类
 */
public class UserDao {
     /**
	 * 添加用户
	 * @param user 用户对象
	 */
	public void saveUser(User user){
		// 获取数据库连接Connection对象
		Connection conn = jdbc.getConnection();
		// 插入用户注册信息的SQL语句
		String sql = "insert into passenger(username,password,sex,photo,tel,idcard) values(?,?,?,?,?,?)";
		try {
			// 获取PreparedStatement对象
			PreparedStatement ps = conn.prepareStatement(sql);
			// 对SQL语句的占位符参数进行动态赋值
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPassword());
			ps.setString(3, user.getSex());
			ps.setString(4, user.getPhoto());
			ps.setString(5, user.getTel());
			ps.setString(6, user.getIdcard());
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
	 * @param username 用户名
	 * @param password 密码
	 * @return 用户对象
	 */
	public User login(String username, String password){
		User user = null;
		// 获取数据库连接Connection对象
		//System.out.println(username);
		Connection conn = jdbc.getConnection();
		// 根据用户名及密码查询用户信息
		String sql = "select * from passenger where username = ? and password = ?";
		try {
			// 获取PreparedStatement对象
			PreparedStatement ps = conn.prepareStatement(sql);
			// 对SQL语句的占位符参数进行动态赋值
			ps.setString(1, username);
			ps.setString(2, password);
			// 执行查询获取结果集
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
	/**
	 * 判断用户名在数据库中是否存在
	 * @param username 用户名
	 * @return 布尔值
	 */
	public boolean userIsExist(String username){
		// 获取数据库连接Connection对象
		Connection conn = jdbc.getConnection();
		// 根据指定用户名查询用户信息
		String sql = "select * from passenger where username = ?";
		try {
			// 获取PreparedStatement对象
			PreparedStatement ps = conn.prepareStatement(sql);
			// 对用户对象属性赋值
			ps.setString(1, username);
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