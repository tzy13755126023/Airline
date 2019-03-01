package javabean1;

public class Lxs {
	
private String lxsID;       //旅行社代号
private String lxsname;     //旅行社名称
private String lxspassword; //旅行社密码
private String photo;       //旅行社头像
private String lxstel;      //联系电话 
private String lxsaddress;  //办公地址

public Lxs() {
	
}

public String getLxsID() {
	
	return lxsID;
}
public void setLxsID(String lxsID) {
	
	this.lxsID=lxsID;
		
}
public void setLxsname(String lxsname) {
	
   this.lxsname=lxsname;
}
public String getLxsname() {
	
	return lxsname;	
}
public void setLxspassword(String lxspassword) {
	this.lxspassword = lxspassword;
}
public String getLxspassword() {
	return lxspassword;
}
public void setLxsphoto(String photo) { 
	
	this.photo=photo;
}
public String  getLxsphoto() {
	
	return photo;	
}
public void setLxstel(String lxstel) {
	
	this.lxstel=lxstel;
}
public String getLxstel() {
	
	return lxstel;
}
public void setLxsaddress(String lxsaddress) {
	 
	this.lxsaddress=lxsaddress;
}
public String getLxsaddress() {
	return lxsaddress;
	
}

}