package com.eamr.cps.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.eamr.cps.db.cps_confirm_log;
import com.eamr.cps.service.cpsconfirmlogservice;
import com.eamr.cps.serviceimpl.cpsconfirmlogserviceimpl;
import com.emar.cps.impl.cpsConLogDaoImpl;

public class cps_confirma_log_test {

	
	@Test
	public void test() {
		//fail("Not yet implemented");
		
		cps_confirm_log cclnew = null;
		cpsConLogDaoImpl ccldao = new cpsConLogDaoImpl();
		//ccldao.delete("test1");
		cclnew = ccldao.getorder("test1");
		System.out.print("id:"+cclnew.getid()
				+"\non:"+cclnew.geton()
				+"\nwid:"+cclnew.getwid()
				+"\ncid:"+cclnew.getcid()
				+"\nst:"+cclnew.getstarttime()
				+"\nut:"+cclnew.getupdatetime()
				
				
				
				);
		
		
	}

}
