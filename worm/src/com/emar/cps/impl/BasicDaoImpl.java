package com.emar.cps.impl;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.emar.cps.dao.BasicDao;

public class BasicDaoImpl implements BasicDao {

	
		 private static SqlSessionFactory sqlSessionFactory = null;
		 static
		 {
		  String resource = "mybatis_config.xml";
		  try
		  {
		   Reader reader = Resources.getResourceAsReader(resource);
		   sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		  }
		  catch (IOException e)
		  {
		   System.out.println( "´´½¨SqlSessionFactoryÊµÀýÊ§°Ü");
		  }
		 }

		 public static SqlSessionFactory getSqlSessionFactory()
		 {
		  return sqlSessionFactory;
		 }
	
	
}
