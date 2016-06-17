package spring.dao;

public class JdbcDaoImpl implements Dao 
{
	public void insert() 
	{
		System.out.println("JDBC 를 이용해 insert");
	}

	public void select() 
	{
		System.out.println("JDBC 를 이용해 select");
	}
}