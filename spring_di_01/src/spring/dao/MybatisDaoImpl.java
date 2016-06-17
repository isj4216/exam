package spring.dao;

public class MybatisDaoImpl implements Dao 
{
	public void insert() 
	{
		System.out.println("Mybatis 를 이용해 insert.");
	}

	public void select() 
	{
		System.out.println("Mybatis 를 이용해 select.");
	}
}