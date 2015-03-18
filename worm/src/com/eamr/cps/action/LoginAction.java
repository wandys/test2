package com.eamr.cps.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.eamr.cps.db.userDB;
import com.eamr.cps.db.userListDB;
import com.eamr.cps.service.UserService;


public class LoginAction {

	private String name;
	
	private String passWord;
	
    public UserService userService;
	
    public userDB usdb = null;
    
    public List<userDB> ulist;
    
   // private HttpServletRequest request = ServletActionContext.getRequest();
    
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	
	public void setPassWord(String pw){
		this.passWord = pw;
	}
	public String getPassWord(){
		return this.passWord;
	}
	
	
	public void setUserService(UserService user){
	    this.userService = user;
	   
	}
	public UserService getUserService(){
		return this.userService;
	}
	
	
	public void setUsdb(userDB ub){
		this.usdb = ub;
	}
	public userDB getUsdb(){
		return this.usdb;
	}
	
	
	public String loginM(){
		HttpServletRequest request = ServletActionContext.getRequest();
		//System.out.print("name\t"+name);
		//System.out.print("pw\t"+passWord);
		
		//System.out.print("loginM work\n");
		//System.out.print("userService"+userService.toString()+"\n");
		//usdb = userService.selectuser(name);
		//usdb = userService.selectuser(name);
		
		ulist =userService.selectlistuser(name);
		
		for(int i=0;i<ulist.size();i++){
			System.out.print(i+" id:"+ulist.get(i).getid()+"\n");
			
			
		}
		return "success";
		//System.out.print("userpw:"+usdb.getpw());
		/*if(passWord.equals(usdb.getPw())){
			request.setAttribute("name", name);
			return "success";
		}else{
			return "error";
		}*/
		
		
	}
	public String resetM(){
		HttpServletRequest request = ServletActionContext.getRequest();
		//request.getParameter("name");
		userService.resetuser(request.getParameter("name"));
		
		
		return "success";
		
	}
	//user.selectuser(name).getpw();
	public String regM(){
		System.out.print("PW"+usdb.getPw());
		//userService.insertuser(usdb);
		Map<String,String> map = new HashMap<String,String>();
		map.put("userName", usdb.getUserName());
		map.put("pw", usdb.getPw());
		map.put("sex", usdb.getSex());
		map.put("age", String.valueOf(usdb.getAge()));
		map.put("birthday", String.valueOf(usdb.getBirthday()));
		map.put("phone", usdb.getPhone());
		map.put("email", usdb.getEmail());
		map.put("address", usdb.getAddress());
		map.put("role", usdb.getRole());
		userService.insertuser(map);
		return "success";
	}
	
	
}
