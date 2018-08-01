package com.ab.manyTOmany;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ab.utilities.HibernateUtil;

public class TestingManyToMany {

	public static void main(String[] args) {
		Session session = null;
		Transaction tx = null;
		
		Bank axisBank = new Bank(141, "AXIS");
		Bank idbiBank = new Bank(173, "IDBI");
		
		Customer firstCustomer = new Customer(1, "AKASH", null);
		Customer secondCustomer = new Customer(2, "PRAVIN", null);
		Customer thirdCustomer = new Customer(3, "PRATIK", null);
		
		Set<Bank> setOfBanks = new HashSet<>();
		setOfBanks.add(axisBank);
		setOfBanks.add(idbiBank);
		
		Set<Customer>  setOfCustomers = new HashSet<>();
		setOfCustomers.add(firstCustomer);
		setOfCustomers.add(secondCustomer);
		setOfCustomers.add(thirdCustomer);
		
		firstCustomer.setBankAccounts(setOfBanks);
		secondCustomer.setBankAccounts(setOfBanks);
		thirdCustomer.setBankAccounts(setOfBanks);
		
		try {
			session = HibernateUtil.getSession();
			tx = session.beginTransaction();
		
			session.save(firstCustomer);
			session.save(secondCustomer);
			session.save(thirdCustomer);
			
			HibernateUtil.flushNcommit(session, tx);
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}finally {
			session.close();
		}	
	}//main
}//TestingManyToMany
