package com.eamr.cps.action;

import com.opensymphony.xwork2.ActionSupport;

public class OrderAction extends ActionSupport{

	private String on;
	
	public void seton(String on){
		this.on = on;
	}
	public String geton(){
		return this.on;
	}
	
	
	
	
	
}
