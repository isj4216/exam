package spring.container;

import spring.dao.Dao;
import spring.dao.MybatisDaoImpl;
import spring.service.Service;
import spring.service.ServiceImpl;

public class Assembler
{
	/*public Dao getBean()
	{
		return new JdbcDaoImpl();
	}*/
	
	public Service getBean()
	{
//		Dao dao = new JdbcDaoImpl();
		Dao dao = new MybatisDaoImpl();
		Service service = new ServiceImpl(dao);
		return service;
	}
}