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
			
				hangban hb =new hangban();                     //创建hangban对象
				hb.setHBid(rs.getString("hbid"));              //获取表中的航班号
				hb.setHBtype(rs.getString("hbnames"));          //获取表中航班名
				hb.setHBnames(rs.getString("hbtype"));        //获取表中航班类型
				hb.setHBcompany(rs.getString("hbcompany"));    //获取表中航班公司
				hb.setHBgotime(rs.getString("hbgotime"));      //获取表中起飞时间
				hb.setHBtotime(rs.getString("hbtotime"));        //获取表中到达时间
				hb.setHBgocity(rs.getString("hbgocity"));        //获取表中起飞城市
				hb.setHBtocity(rs.getString("hbtocity"));        //获取表中到达城市
				hb.setHBtimes(rs.getString("hbtimes"));        //获取表中飞行时间
				hb.setHBprice(rs.getString("hbprice"));         //获得表中的票价
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
	

