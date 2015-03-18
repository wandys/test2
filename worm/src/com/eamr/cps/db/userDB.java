package com.eamr.cps.db;

import java.sql.Date;

public class userDB {

	
	private int id;
	private String userName;
	private String pw;
	private String sex;
	private int age;
	private Date birthday;
	private String phone;
	private String email;
	private String address;
	private String role;
	
	public void setid(int id){
		this.id = id;
	}
	public int getid(){
		return this.id;
	}
	
	public void setUserName(String name){
		this.userName = name;
	}
	public String getUserName(){
		return this.userName;
	}
	
	public void setPw(String pw){
		this.pw = pw;
	}
	public String getPw(){
		return this.pw;
	}
	
	
	public void setSex(String sex){
		this.sex = sex;
	}
	public String getSex(){
		return this.sex;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return this.age;
	}
	
	public void setBirthday(Date date){
		this.birthday = date;
	}
	public Date getBirthday(){
		return this.birthday;
	}
	
	public void setPhone(String phone){
		this.phone = phone;
		
	}
	public String getPhone(){
		return this.phone;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	public String getEmail(){
		return this.email;
	}
	
	public void setAddress(String add){
		this.address = add;
	}
	public String getAddress(){
		return this.address;
	}
	
	public void setRole(String ro){
		this.role = ro;
	}
	public String getRole(){
		return this.role;
	}
}
