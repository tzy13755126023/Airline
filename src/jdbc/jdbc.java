package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbc {
	/* 
	 * 获取数据库连接
	 * @return 
	 * @return Connection对象
	 */
	public static   Connection getConnection() { //获取到当前的数据库连接
		Connection conn = null;
		try { 
			// 加载驱动
			Class.forName("com.mysql.jdbc.Driver");
			// 数据库连接url
			String url = "jdbc:mysql://localhost:3306/tzy";
			// 获取数据库连接
			conn = DriverManager.getConnection(url, "root", "123456");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	/**
	 * 关闭数据库连接
	 * @param conn Connection对象
	 */
	public static void closeConnection(Connection conn){
		// 判断conn是否为空
		if(conn != null){
			try {
				conn.close();	// 关闭数据库连接
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}

	