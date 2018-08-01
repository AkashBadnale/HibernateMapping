package com.ab.manyTOmany;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bank {

	@Id
	private int bankId;
	private String bankName;
	//private Set<Customer> customers;
	
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bank(int bankId, String bankName) {
		super();
		this.bankId = bankId;
		this.bankName = bankName;
	}

	public int getBankId() {
		return bankId;
	}

	public void setBankId(int bankId) {
		this.bankId = bankId;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}


	@Override
	public String toString() {
		return "Bank [bankId=" + bankId + ", bankName=" + bankName +  "]";
	}
	
	
}//Bank
