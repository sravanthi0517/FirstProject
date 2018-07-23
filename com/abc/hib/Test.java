package com.abc.hib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test
{

	public static void main(String[] args) 
	{
	 Configuration cfg =new Configuration().configure("com/abc/hib/hibernate.cfg.xml");
	 
	 SessionFactory sf=cfg.buildSessionFactory();
	 
	 Session ses=sf.openSession();
	 
	 Transaction tx = ses.beginTransaction();
	 
	 Employee e1 = new Employee();
	e1.setEid(500);
	e1.setEname("swathy");
	e1.setEsalary("5000");
	
	ses.save(e1);
	
	tx.commit();
	
	System.out.println("success");

	}

}
