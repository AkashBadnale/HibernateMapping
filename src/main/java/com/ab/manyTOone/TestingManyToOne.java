package com.ab.manyTOone;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ab.utilities.HibernateUtil;

public class TestingManyToOne {

	public static void main(String[] args) {
		
		Session session = null;
		Transaction tx = null;
		
		Stadium wankhedeStadium = new Stadium(121, "Wankhede", 40000, "INDIA");
		CricketMatch match1 = new CricketMatch(451, "IND", "AUS", "one-day", wankhedeStadium);
		CricketMatch match2 = new  CricketMatch(467, "AUS", "SA", "Test", wankhedeStadium);
		
		try {
			session = HibernateUtil.getSession();
			tx = session.beginTransaction();
			session.save(match1);
			session.save(match2);
			HibernateUtil.flushNcommit(session, tx);
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}finally {
			session.close();
		}
		
		
	}//main
}//TestingMapping
