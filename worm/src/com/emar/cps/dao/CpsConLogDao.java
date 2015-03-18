package com.emar.cps.dao;

import java.util.List;

import com.eamr.cps.db.*;

public interface CpsConLogDao {

	 public List<cps_confirm_log> getAllcps();
	 
	 public cps_confirm_log getorder(String on);
	 
	 public void add(cps_confirm_log student);
	 
	 public void delete(String  on);
	 
	 public void update(cps_confirm_log ccl);
	 

	
	
	
}
