package com.eamr.cps.db;

public class cps_confirm_log {

	/**
	 * db id
	 */
	private int id;
	/**
	 * order_no 订单编号
	 */
	private String on;
	/**
	 * website_id 订单编号
	 */
	private String wid;
	/**
	 * campaign_id 活动编号
	 */
	private String cid;
	/**
	 * 开始时间
	 */
	private String starttime;
	/**
	 * 更新时间
	 */
	private String updatetime;
	
	public void setid(int id){
		this.id = id;
	}
	public int getid(){
		return id;
	}
	
	public void seton(String on){
		this.on = on;
	}
	public String geton(){
		return on;
	}
	
	public void setwid(String wid){
		this.wid = wid;
	}
	public String getwid(){
		return wid;
	}
	
	
	public void setcid(String cid){
		
		this.cid = cid;
		
	}
	public String getcid(){
		return cid;
	}
	
	public void setupdatetime(String ut){
	
		this.updatetime = ut;
	}
	public String getupdatetime(){
		return updatetime;
	}
	
	public void setstarttime(String st){
		this.starttime = st;
	}
	public String getstarttime(){
		return starttime;
	}
}
