package javabean1;

public class hangban {

	private String hbid;         //航班号
	private String hbnames;       //航班名
	private String hbtype;       //飞机型号
	private String hbcompany;    //航空公司
	private String hbgotime;     //起飞时间
	private String hbtotime;     //到达时间
	private String hbgocity;     //起飞城市
	private String hbtocity;     //到达城市
	private String hbtimes;      //飞行时间
	private String hbprice;      //票价
	
 public hangban() {
		
 }

public String getHBid() {
	return hbid;
}

public void setHBid(String hbid) {
	this.hbid = hbid;
}

public String getHBnames() {
	return hbnames;
}

public void setHBnames(String hbnames) {
	this.hbnames = hbnames;
}

public String getHBtype() {
	return hbtype;
}

public void setHBtype(String hbtype) {
	this.hbtype = hbtype;
}

public String getHBgotime() {
	return hbgotime;
}

public void setHBgotime(String hbgotime) {
	this.hbgotime = hbgotime;
}

public String getHbcompany() {
	return hbcompany;
}

public void setHBcompany(String hbcompany) {
	this.hbcompany = hbcompany;
}

public String getHBtotime() {
	return hbtotime;
}

public void setHBtotime(String hbtotime) {
	this.hbtotime = hbtotime;
}

public String getHBgocity() {
	return hbgocity;
}

public void setHBgocity(String hbgocity) {
	this.hbgocity = hbgocity;
}

public String getHBtimes() {
	return hbtimes;
}

public void setHBtimes(String hbtimes) {
	this.hbtimes = hbtimes;
}

public String getHBtocity() {
	return hbtocity;
}

public void setHBtocity(String hbtocity) {
	this.hbtocity = hbtocity;
}

public String getHBprice() {
	return hbprice;
}

public void setHBprice(String hbprice) {
	this.hbprice = hbprice;
}

}
