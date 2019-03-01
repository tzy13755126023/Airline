package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javabean1.User;
import jdbc.jdbc;


public class UserManagerDao {
	public List<User> getAlluser(){
		Connection con=jdbc.getConnection();
		String sql="select * from passenger ";
		List<User> list=new ArrayList<User>();
		Statement stmt=null;
		ResultSet rs=null;
		try{
			stmt=con.createStatement();
			rs=stmt.executeQuery(sql);
			while(rs.next())
			{	
				User t1=new User();
				t1.setUsername(rs.getString("username"));
				t1.setPassword(rs.getString("password"));
				t1.setSex(rs.getString("sex"));
				t1.setPhoto(rs.getString("photo"));
				t1.setTel(rs.getString("tel"));
				t1.setIdcard(rs.getString("idcard"));
				list.add(t1);
				
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
	
	public void  deleteuser(String shanchu){
		Connection con=jdbc.getConnection();
		PreparedStatement pst = null;  //‘§±‡“Î”Ôæ‰
		//PreparedStatement p = null;
		String sql="delete from passenger where username='"+shanchu+"'";
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
