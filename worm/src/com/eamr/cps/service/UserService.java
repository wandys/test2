package com.eamr.cps.service;

import java.util.List;
import java.util.Map;

import com.eamr.cps.db.userDB;
import com.eamr.cps.db.userListDB;

public interface UserService {
	public userDB selectuser(String name);
	public void resetuser(String name);
	//public void insertuser(userDB ub);
	public void insertuser(Map ub);
	
	 public List<userDB> selectlistuser(String name);
}
