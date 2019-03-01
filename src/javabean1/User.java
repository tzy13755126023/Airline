package javabean1;

public class User {

	private String username;   //旅客姓名
	private String password;   //密码
	private String sex;        //性别
	private String photo;      //头像
	private String tel;        //联系电话
	private String idcard;     //身份证
	
public User() {
	
}

public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username=username;
} 
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password=password;
} 
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex=sex;
} 
public String getPhoto() {
	return photo;
}
public void setPhoto(String photo) {
	this.photo=photo;
}
public String getTel() {
	return tel;
}
public void setTel(String tel) {
	this.tel=tel;
}
public String getIdcard() {
	return idcard;
}
public void setIdcard(String idcard) {
	this.idcard=idcard;
}
}

