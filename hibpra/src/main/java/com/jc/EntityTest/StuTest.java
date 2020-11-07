package com.jc.EntityTest;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.jc.Entity.Student;
import com.jc.utils.HibernateUtils;

public class StuTest {

	public static void main(String[] args) {

		Student student = new Student(101, "Vasu", "Fadatare", "rameshfadatare@javaguides.com");
		Student student1 = new Student(102, "Shakir", "Cena", "john@javaguides.com");

		//seesion or connectioon will be getting from sessionfactory on demand
		Session session = HibernateUtils.getSession();

		Transaction tx = session.beginTransaction();

		session.save(student);
		session.save(student1);

		tx.commit();

		HibernateUtils.shutdown();

	}

}
