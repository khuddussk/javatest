package com.xoriant;

import org.hibernate.Session;
import com.xoriant.ecart.config.HibConfig;
import com.xoriant.entity.Employee;
public class CRUD_Methods_Demo {

	public static void main(String[] args) {
		
		// Get session factory here
		//SessionFactory sessionFactory= HibConfig.getSessionFactory();
		
		// get / open session from session factory
		
		Session ses= HibConfig.getSessionFactory().openSession(); // opens / gets / creates new session object
		
		// create employee class object
		
		Employee e1=new Employee(); // java object
		
		e1.setEmpName("Praveen");
		e1.setSalary(9865755);
		
		Employee e2=new Employee(); // java object
	
		e2.setEmpName("Ravi");
		e2.setSalary(3435);
		
		
		Employee e3=new Employee(); // java object
	
		e3.setEmpName("James");
		e3.setSalary(474665);
		
		
		ses.save(e1); // ORM 
		ses.save(e2);
		ses.saveOrUpdate(e3);
		
		// commit all objects in session
		
		ses.beginTransaction().commit();
		
		System.out.println(">>>>> Done <<<<<");

	}

}
