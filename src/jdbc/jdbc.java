package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbc {
	/* 
	 * ��ȡ���ݿ�����
	 * @return 
	 * @return Connection����
	 */
	public static   Connection getConnection() { //��ȡ����ǰ�����ݿ�����
		Connection conn = null;
		try { 
			// ��������
			Class.forName("com.mysql.jdbc.Driver");
			// ���ݿ�����url
			String url = "jdbc:mysql://localhost:3306/tzy";
			// ��ȡ���ݿ�����
			conn = DriverManager.getConnection(url, "root", "123456");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	/**
	 * �ر����ݿ�����
	 * @param conn Connection����
	 */
	public static void closeConnection(Connection conn){
		// �ж�conn�Ƿ�Ϊ��
		if(conn != null){
			try {
				conn.close();	// �ر����ݿ�����
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}

	