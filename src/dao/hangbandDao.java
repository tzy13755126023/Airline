package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javabean1.hangban;
import jdbc.jdbc;



public class hangbandDao {

	public List<hangban> getchaxun(String chaxun){
		Connection conn = jdbc.getConnection();
		String sql="select * from hangban where hbid like '%"+chaxun+"%' or hbnames like '%"+chaxun+"%' or hbtype like '%"+chaxun+"%'  or  hbcompany like '%"+chaxun+"%' or hbgotime like '%"+chaxun+"%' or hbtotime like '%\"+chaxun+\"%' or hbgocity like '%"+chaxun+"%' or hbtocity like '%"+chaxun+"%'or  hbtimes like '%"+chaxun+"%' or hbprice like '%"+chaxun+"%'";
		List<hangban> list=new ArrayList<hangban>();
		Statement stmt=null;
		ResultSet rs=null;
		try {			
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			while(rs.next()) {
			
				hangban hb =new hangban();                     //����hangban����
				hb.setHBid(rs.getString("hbid"));              //��ȡ���еĺ����
				hb.setHBtype(rs.getString("hbnames"));          //��ȡ���к�����
				hb.setHBnames(rs.getString("hbtype"));        //��ȡ���к�������
				hb.setHBcompany(rs.getString("hbcompany"));    //��ȡ���к��๫˾
				hb.setHBgotime(rs.getString("hbgotime"));      //��ȡ�������ʱ��
				hb.setHBtotime(rs.getString("hbtotime"));        //��ȡ���е���ʱ��
				hb.setHBgocity(rs.getString("hbgocity"));        //��ȡ������ɳ���
				hb.setHBtocity(rs.getString("hbtocity"));        //��ȡ���е������
				hb.setHBtimes(rs.getString("hbtimes"));        //��ȡ���з���ʱ��
				hb.setHBprice(rs.getString("hbprice"));         //��ñ��е�Ʊ��
				list.add(hb);
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
			if(conn!=null){
				conn.close();
			}
		}catch(Exception e2){
			e2.printStackTrace();
		  }
		}
		
	return list;
	
}
	}
	

