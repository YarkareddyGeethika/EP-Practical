package com.klu.Student.Student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class StudentDAO {
	public static void main(String args[])
	{
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();
		//brought your DB config from file to .xml
		SessionFactory factory=meta.getSessionFactoryBuilder().build();
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		Student s =new Student();
		s.setRegno(31792);
		s.setName("GEETHIKA");
		s.setEmail("g@gmail.com");
		session.save(s);//persistant
		t.commit();
		System.out.println("Data is saved");
		factory.close();
		session.close();
		
		
	}

}
