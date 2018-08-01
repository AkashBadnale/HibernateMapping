package com.ab.oneTOmany;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ab.utilities.HibernateUtil;

public class TestingOneToMany {

	public static void main(String[] args) {
		Session session = null;
		Transaction tx = null;
		
		Teacher java = new Teacher(538, "Mr. Yogesh", "Java");
		Teacher testing = new Teacher(453,"Mr. Sangram","Testing");
		Teacher project = new Teacher(467,"Mr. Ajit","Project");
		
		Set<Teacher>  setOfTeachers = new HashSet<>();
		setOfTeachers.add(java);
		setOfTeachers.add(testing);
		setOfTeachers.add(project);
		
		Student   nilya  = new Student(321, "Nilesh", setOfTeachers);
		
		try {
			session = HibernateUtil.getSession();
			tx = session.beginTransaction();
			session.save(nilya);
			HibernateUtil.flushNcommit(session, tx);
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}finally {
			session.close();
		}	
	}//main
	
}//TestingOneToMany
