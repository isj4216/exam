package spring.container;

import spring.dao.Dao;
import spring.dao.JdbcDaoImpl;
import spring.service.Service;
import spring.service.ServiceImpl;

public class Assembler
{
	public void hh234(){}
	
	public Service getBean()
	{
//		Dao dao = new JdbcDaoImpl();
		Dao dao = new JdbcDaoImpl();
		Service service = new ServiceImpl(dao);
		return service;
	}
}