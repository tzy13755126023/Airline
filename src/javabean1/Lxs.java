package javabean1;

public class Lxs {
	
private String lxsID;       //���������
private String lxsname;     //����������
private String lxspassword; //����������
private String photo;       //������ͷ��
private String lxstel;      //��ϵ�绰 
private String lxsaddress;  //�칫��ַ

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