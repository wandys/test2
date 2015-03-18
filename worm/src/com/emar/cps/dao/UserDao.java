package com.emar.cps.dao;

import java.util.List;
import java.util.Map;

import com.eamr.cps.db.userDB;
import com.eamr.cps.db.userListDB;

public interface UserDao {

	
	public userDB selectuser(String name);
	
	public void updateuser(String name);
	
	//public void insertuser(userDB userdb);
	public void insertuser(Map userdb);
	public List<userDB> selectlistuser(String name);
}
