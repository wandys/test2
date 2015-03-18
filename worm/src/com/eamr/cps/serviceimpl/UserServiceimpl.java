package com.eamr.cps.serviceimpl;

import java.util.List;
import java.util.Map;

import com.eamr.cps.db.userDB;
import com.eamr.cps.db.userListDB;
import com.eamr.cps.service.UserService;
import com.emar.cps.dao.UserDao;

public class UserServiceimpl implements UserService {
	
    private UserDao user;
    
    public void setUserDao(UserDao us){
    	this.user = us;
    }
    public UserDao getUserDao(){
	   return this.user;
    }
    
    public userDB selectuser(String name) {
		// TODO Auto-generated method stub
		
		return user.selectuser(name);
	}
	@Override
	public void resetuser(String name) {
		user.updateuser(name);
		
	}
   
  /* public void insertuser(userDB ub){
	   user.insertuser(ub);
   }*/
   
	 public void insertuser(Map ub){
		   user.insertuser(ub);
	   }
	 
	 public List<userDB> selectlistuser(String name){
		return user.selectlistuser(name);
	 }
}
