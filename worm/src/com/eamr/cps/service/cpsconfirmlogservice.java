package com.eamr.cps.service;

import com.eamr.cps.db.cps_confirm_log;

public interface cpsconfirmlogservice {

	public cps_confirm_log getcps(String on);
	
	public void deletcps(String on);
	
	
}
