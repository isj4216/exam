package spring.main;

import spring.container.Assembler;
import spring.service.Service;

public class TestDI 
{
	public static void main(String[] args) 
	{
		Assembler container = new Assembler();//컨테이너 객체 생성
		
		/*Dao dao = container.getBean(); //필요한 Component(Bean)조회.
		Service service = new ServiceImpl(dao);*/
		
		//필요한 service객체를 직접 생성하지 않고 container로부터 받음. (DI개념.)
		//Assembler(조립기) == Spring컨테이너
		Service service = container.getBean();//Loose Coupling == 어떤 서비스객체가 넘어올지 모름.(무엇이 넘어오든 상관없음.)
														//코드변환없이 다른 기능을 사용.(다른 서비스객체 사용.)
		service.register();
	}
}