package com.eamr.cps.serviceimpl;

import com.eamr.cps.db.cps_confirm_log;
import com.eamr.cps.service.cpsconfirmlogservice;
import com.emar.cps.dao.CpsConLogDao;

public class cpsconfirmlogserviceimpl implements cpsconfirmlogservice{

	private CpsConLogDao ccds;
	
	public void setCpsConLogDao(CpsConLogDao ccds){
		this.ccds = ccds;
	}
	public CpsConLogDao getCpsConLogDao(){
		return this.ccds;
	}
	
	
	public void setccds(CpsConLogDao ccds){
		this.ccds = ccds;
	}
	public CpsConLogDao getccds(){
		return this.ccds;
	}
	
	public cps_confirm_log getcps(String on) {
		// TODO Auto-generated method stub
		
		
		return ccds.getorder(on);
		
		//return null;
	}

	public void deletcps(String on) {
		// TODO Auto-generated method stub
		ccds.delete(on);
	}

	
	
}
