package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javabean1.Lxs;
import jdbc.jdbc;

public class LxsManagerDao {
	public List<Lxs> getAlllxs(){
		Connection con=jdbc.getConnection();
		String sql="select * from lxs ";
		List<Lxs> list1=new ArrayList<Lxs>();
		Statement stmt=null;
		ResultSet rs=null;
		try{
			stmt=con.createStatement();
			rs=stmt.executeQuery(sql);
			while(rs.next())
			{	
				Lxs l1=new Lxs();
				l1.setLxsID(rs.getString("lxsID"));
				l1.setLxsname(rs.getString("lxsname"));
				l1.setLxspassword(rs.getString("lxspassword"));
				l1.setLxsphoto(rs.getString("photo"));
				l1.setLxstel(rs.getString("lxstel"));
				l1.setLxsaddress(rs.getString("lxsaddress"));
				list1.add(l1);
				
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
		
	return list1;
   }
	
	
}