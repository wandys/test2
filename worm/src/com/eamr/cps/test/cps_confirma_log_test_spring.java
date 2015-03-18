package com.eamr.cps.test;

//import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.eamr.cps.db.cps_confirm_log;
import com.eamr.cps.service.cpsconfirmlogservice;
import com.eamr.cps.serviceimpl.cpsconfirmlogserviceimpl;
import com.eamr.cps.serviceimpl.UserServiceimpl;
//import com.emar.cps.impl.cpsConLogDaoImpl;

public class cps_confirma_log_test_spring {

	ApplicationContext context = null;
	cpsconfirmlogserviceimpl Service = null;
	
	
	
	
	@Before
	public void initContext(){
		this.context = new FileSystemXmlApplicationContext("wwwroot/WEB-INF/classes/applicationContext.xml");
		this.Service = (cpsconfirmlogserviceimpl) context.getBean("cpsService");
		}
	
	
	
	
	@Test
	public void test() {
		//fail("Not yet implemented");
		
		cps_confirm_log cclnew = null;
		//cpsConLogDaoImpl ccldao = new cpsConLogDaoImpl();
		//ccldao.delete("test1");
		
		cclnew = Service.getcps("test2");
		System.out.print("id:"+cclnew.getid()
				+"\non:"+cclnew.geton()
				+"\nwid:"+cclnew.getwid()
				+"\ncid:"+cclnew.getcid()
				+"\nst:"+cclnew.getstarttime()
				+"\nut:"+cclnew.getupdatetime()
				
				
				
				
				);
		
		
	}

}
