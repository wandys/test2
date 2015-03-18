package com.emar.cps.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
//import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.eamr.cps.db.cps_confirm_log;
import com.emar.cps.dao.*;

public class cpsConLogDaoImpl /*extends SqlMapClientDaoSupport*/ implements CpsConLogDao {

	
	
    public List<cps_confirm_log> getAllcps(){
    	SqlSession sqlSession = BasicDaoImpl.getSqlSessionFactory().openSession();
        List<cps_confirm_log> ccls = null;
        List<Object> olist = null;
        try
        {
        	//ccls
        	ccls =  sqlSession.selectList("mybatis.mapper.getAllcps");
        		/*for(int i=0;i<olist.size();i++){
        			ccls.add((cps_confirm_log)olist.get(i));
        		}*/
        }
        finally
        {
         sqlSession.close();
        }

        return ccls;
    }
	 
	 public cps_confirm_log getorder(String on){
		 SqlSession sqlSession = BasicDaoImpl.getSqlSessionFactory().openSession();
		 cps_confirm_log ccl = null;
		 try
	        {
	        	//ccls
	        	ccl =  sqlSession.selectOne("mybatis.mapper.getorder",on);
	        		/*for(int i=0;i<olist.size();i++){
	        			ccls.add((cps_confirm_log)olist.get(i));
	        		}*/
	        	sqlSession.commit();
	        }
	        finally
	        {
	         sqlSession.close();
	        }

	        return ccl;
	 }
	 
	 public void add(cps_confirm_log ccl){
		 SqlSession sqlSession = BasicDaoImpl.getSqlSessionFactory().openSession();
		 
		 try
	        {
	        	//ccls
	        	sqlSession.insert("mybatis.mapper.insertorder",ccl);
	        		/*for(int i=0;i<olist.size();i++){
	        			ccls.add((cps_confirm_log)olist.get(i));
	        		}*/
	        }
	        finally
	        {
	         sqlSession.close();
	        }

		 
		 
		 
	 }
	 
	 public void delete(String  on){
         SqlSession sqlSession = BasicDaoImpl.getSqlSessionFactory().openSession();
		 
		 try
	        {
	        	//ccls
	        	int i = sqlSession.delete("mybatis.mapper.deleteorder",on);
	        		/*for(int i=0;i<olist.size();i++){
	        			ccls.add((cps_confirm_log)olist.get(i));
	        		}*/
	        	sqlSession.commit();
	        	System.out.print("del back:"+i);
	        }
	        finally
	        {
	         sqlSession.close();
	        }
	 }
	 
	 public void update(cps_confirm_log ccl){
         SqlSession sqlSession = BasicDaoImpl.getSqlSessionFactory().openSession();
		 
		 try
	        {
	        	//ccls
	        	sqlSession.insert("mybatis.mapper.updateorder",ccl);
	        		/*for(int i=0;i<olist.size();i++){
	        			ccls.add((cps_confirm_log)olist.get(i));
	        		}*/
	        }
	        finally
	        {
	         sqlSession.close();
	        }
	 }
	 
}
