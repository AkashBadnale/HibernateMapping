package com.ab.manyTOone;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Stadium {

	@Id
	private int  stadiumId;
	private String name;
	private int capacity;
	private String country;
	public Stadium() {
		super();
		
	}
	public Stadium(int stadiumId, String name, int capacity, String country) {
		super();
		this.stadiumId = stadiumId;
		this.name = name;
		this.capacity = capacity;
		this.country = country;
	}
	public int getStadiumId() {
		return stadiumId;
	}
	public void setStadiumId(int stadiumId) {
		this.stadiumId = stadiumId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Stadium [stadiumId=" + stadiumId + ", name=" + name + ", capacity=" + capacity + ", country=" + country
				+ "]";
	}
}//stadium
