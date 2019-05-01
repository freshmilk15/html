package com.kerwin.Gmarket.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Item implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable = false)
	private String IdentityID;
	
	@Column(nullable = false, unique = true)
	private String picAddress;
	
	@Column(nullable = false)
	private String description;
	
	@Column(nullable = false)
	private String regTime;
	
	
	
	
	public Item() {
		super();
	}
	public Item(String identityID, String picAddress, String description,
			String regTime) {
		super();
		this.IdentityID = identityID;
		this.picAddress = picAddress;
		this.description = description;
		this.regTime = regTime;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getIdentityID() {
		return IdentityID;
	}
	public void setIdentityID(String identityID) {
		IdentityID = identityID;
	}
	public String getPicAddress() {
		return picAddress;
	}
	public void setPicAddress(String picAddress) {
		this.picAddress = picAddress;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getRegTime() {
		return regTime;
	}
	public void setRegTime(String regTime) {
		this.regTime = regTime;
	}

	

	
	
}
