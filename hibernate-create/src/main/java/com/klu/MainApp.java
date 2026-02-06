package com.klu;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class MainApp {

	public static void main(String[] args) {
		//Load configuration & create the sesstion factory
		
		SessionFactory factory=new Configuration()
				.configure().buildSessionFactory();
		
		//open session
		
		Session session=factory.openSession();
		
		//begin transaction
		Transaction tx=session.beginTransaction();
		
		//create table/object
		Student s=new Student("Satish");
		
		//save the dad/object
		session.save(s);
		
		//commit
		tx.commit();
		
		//close the connection
		session.close();
		factory.close();
		
		System.out.println("Student data inserted Successfully");
	}

}
