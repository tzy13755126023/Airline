package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javabean1.User;
import jdbc.jdbc;
/**
 * �û����ݿ������
 */
public class UserDao {
     /**
	 * ����û�
	 * @param user �û�����
	 */
	public void saveUser(User user){
		// ��ȡ���ݿ�����Connection����
		Connection conn = jdbc.getConnection();
		// �����û�ע����Ϣ��SQL���
		String sql = "insert into passenger(username,password,sex,photo,tel,idcard) values(?,?,?,?,?,?)";
		try {
			// ��ȡPreparedStatement����
			PreparedStatement ps = conn.prepareStatement(sql);
			// ��SQL����ռλ���������ж�̬��ֵ
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPassword());
			ps.setString(3, user.getSex());
			ps.setString(4, user.getPhoto());
			ps.setString(5, user.getTel());
			ps.setString(6, user.getIdcard());
			// ִ�и��²���
			ps.executeUpdate();
			// �ͷŴ� PreparedStatement ��������ݿ�� JDBC ��Դ
			ps.close();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			// �ر����ݿ�����
			jdbc.closeConnection(conn);
		}
	}
	/**
	 * �û���¼
	 * @param username �û���
	 * @param password ����
	 * @return �û�����
	 */
	public User login(String username, String password){
		User user = null;
		// ��ȡ���ݿ�����Connection����
		//System.out.println(username);
		Connection conn = jdbc.getConnection();
		// �����û����������ѯ�û���Ϣ
		String sql = "select * from passenger where username = ? and password = ?";
		try {
			// ��ȡPreparedStatement����
			PreparedStatement ps = conn.prepareStatement(sql);
			// ��SQL����ռλ���������ж�̬��ֵ
			ps.setString(1, username);
			ps.setString(2, password);
			// ִ�в�ѯ��ȡ�����
			ResultSet rs = ps.executeQuery();
			// �жϽ�����Ƿ���Ч
			if(rs.next()){
				// ʵ����һ���û�����
				user = new User();
				// ���û��������Ը�ֵ
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				user.setSex(rs.getString("sex"));
				user.setPhoto(rs.getString("photo"));
				user.setTel(rs.getString("tel"));
				user.setIdcard(rs.getString("idcard"));
			}
			// �ͷŴ� ResultSet ��������ݿ�� JDBC ��Դ
			rs.close();
			// �ͷŴ� PreparedStatement ��������ݿ�� JDBC ��Դ
			ps.close();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			// �ر����ݿ�����
			jdbc.closeConnection(conn);
		}
		return user;
	}
	/**
	 * �ж��û��������ݿ����Ƿ����
	 * @param username �û���
	 * @return ����ֵ
	 */
	public boolean userIsExist(String username){
		// ��ȡ���ݿ�����Connection����
		Connection conn = jdbc.getConnection();
		// ����ָ���û�����ѯ�û���Ϣ
		String sql = "select * from passenger where username = ?";
		try {
			// ��ȡPreparedStatement����
			PreparedStatement ps = conn.prepareStatement(sql);
			// ���û��������Ը�ֵ
			ps.setString(1, username);
			// ִ�в�ѯ��ȡ�����
			ResultSet rs = ps.executeQuery();
			// �жϽ�����Ƿ���Ч
			if(!rs.next()){
				// �����Ч��֤�����û�������
				return true;
			}
			// �ͷŴ� ResultSet ��������ݿ�� JDBC ��Դ
			rs.close();
			// �ͷŴ� PreparedStatement ��������ݿ�� JDBC ��Դ
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			// �ر����ݿ�����
			jdbc.closeConnection(conn);
		}
		return false; 
	}
	
}