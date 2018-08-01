package com.ab.manyTOmany;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Customer {

	@Id
	private int customerId;
	private String name;
	
	@ManyToMany(cascade=CascadeType.ALL)
	private Set<Bank>  bankAccounts;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int customerId, String name, Set<Bank> bankAccounts) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.bankAccounts = bankAccounts;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Bank> getBankAccounts() {
		return bankAccounts;
	}

	public void setBankAccounts(Set<Bank> bankAccounts) {
		this.bankAccounts = bankAccounts;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + ", bankAccounts=" + bankAccounts + "]";
	}
	
	
}//Customer
