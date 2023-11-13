package com.example.test.modals;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Alien {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int aid;
	private String aName;
	private String aAddress;
	private int aCountry;
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	public String getaAddress() {
		return aAddress;
	}
	public void setaAddress(String aAddress) {
		this.aAddress = aAddress;
	}
	public int getaCountry() {
		return aCountry;
	}
	public void setaCountry(int aCountry) {
		this.aCountry = aCountry;
	}
}
