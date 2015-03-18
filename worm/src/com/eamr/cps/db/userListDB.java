package com.eamr.cps.db;

import java.sql.Date;
import java.util.List;

public class userListDB {

	public List<userDB> list ;
	public void setList(List ls){
		this.list = ls;
	}

	
	public List getList(){
		return this.list;
	}
}
