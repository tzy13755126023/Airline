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
		// ��ȡ���ݿ�����Connection����
		Connection conn = jdbc.getConnection();
		// �����û��������֤�ţ��绰��ѯ�û���Ϣ
		String sql="select * from passenger where username = ? and idcard = ? and tel =?";
		try {
			// ��ȡPreparedStatement����
			PreparedStatement ps = conn.prepareStatement(sql);
			// ��SQL����ռλ���������ж�̬��ֵ
			ps.setString(1, username);
			ps.setString(2, idcard);
			ps.setString(3, tel);
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
 
 public boolean dingdanIsExist(String uname) {
	// ��ȡ���ݿ�����Connection����
			Connection conn = jdbc.getConnection();
			// ����ָ���û�����ѯ�û���Ϣ
			String sql = "select * from dingdan where uname = ?";
			try {
				// ��ȡPreparedStatement����
				PreparedStatement ps = conn.prepareStatement(sql);
				// ���û��������Ը�ֵ
				ps.setString(1, uname);
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
//��ѯ����	 
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
	PreparedStatement pst = null;  //Ԥ�������
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

