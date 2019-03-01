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
	 * �û����ݿ������
     * @return 
	 */
public  void savaLxs(Lxs lxs) {
	// ��ȡ���ݿ�����Connection����
	Connection conn =jdbc.getConnection();
	// �����û�ע����Ϣ��SQL���
    String sql = "insert into lxs(lxsID,lxsname,lxspassword,photo,lxstel,lxsaddress) values(?,?,?,?,?,?)";
          try {
				// ��ȡPreparedStatement����
				PreparedStatement ps = conn.prepareStatement(sql);
				// ��SQL����ռλ���������ж�̬��ֵ
				ps.setString(1, lxs.getLxsID());
				ps.setString(2, lxs.getLxsname());
				ps.setString(3, lxs.getLxspassword());
				ps.setString(4, lxs.getLxsphoto());
				ps.setString(5, lxs.getLxstel());
				ps.setString(6, lxs.getLxsaddress());
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
 * @param lxsname ����������
 * @param lxspassword ����
 * @return �û�����
 */
public  Lxs login(String lxsname, String lxspassword){
	Lxs lxs = null;
	// ��ȡ���ݿ�����Connection����
	//System.out.println(lxsname);
	Connection conn = jdbc.getConnection();
	// ���������������������ѯ��������Ϣ
	String sql = "select * from lxs where lxsname = ? and lxspassword = ?";
	try {
		// ��ȡPreparedStatement����
		PreparedStatement ps = conn.prepareStatement(sql);
		// ��SQL����ռλ���������ж�̬��ֵ
		ps.setString(1, lxsname);
		ps.setString(2, lxspassword);
		// ִ�в�ѯ��ȡ�����
		ResultSet rs = ps.executeQuery();
		// �жϽ�����Ƿ���Ч
		if(rs.next()){
			// ʵ����һ���û�����
			lxs = new Lxs();
			// ���û��������Ը�ֵ
			lxs.setLxsID(rs.getString("lxsID"));
			lxs.setLxsname(rs.getString("lxsname"));
			lxs.setLxspassword(rs.getString("lxspassword"));
			lxs.setLxsphoto(rs.getString("photo"));
			lxs.setLxstel(rs.getString("lxstel"));
			lxs.setLxsaddress(rs.getString("lxsaddress"));
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
	return lxs;
}
/**
 * �ж��û��������ݿ����Ƿ����
 * @param lxsname �û���
 * @return ����ֵ
 */
public boolean LxsIsExist(String lxsname){
	// ��ȡ���ݿ�����Connection����
	Connection conn = jdbc.getConnection();
	// ����ָ���û�����ѯ�û���Ϣ
	String sql = "select * from lxs where lxsname = ?";
	try {
		// ��ȡPreparedStatement����
		PreparedStatement ps = conn.prepareStatement(sql);
		// ���û��������Ը�ֵ
		ps.setString(1, lxsname);
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
