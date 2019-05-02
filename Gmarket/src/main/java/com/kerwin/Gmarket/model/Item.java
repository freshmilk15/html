package com.kerwin.Gmarket.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.type.TrueFalseType;

@Entity
public class Item implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable = false)
	private String IdentityID;
	
	@Column(nullable = false)
	private String nickName;
	
	@Column(nullable = false)
	private String headImgUrl;
	
	@Column(nullable = false, unique = true)
	private String picAddress;
	
	@Column(nullable = false)
	private String description;
	
	@Column(nullable = false)
	private Integer laud;
	
	@Column(nullable = false)
	private Date regTime;
	
	
	
	
	public Item() {
		super();
	}
	public Item(String identityID, String nickName,String headImgUrl, String picAddress, String description,Integer laud,
			Date regTime) {
		super();
		this.IdentityID = identityID;
		this.nickName = nickName;
		this.headImgUrl = headImgUrl;
		this.picAddress = picAddress;
		this.description = description;
		this.laud = laud;
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
	public Date getRegTime() {
		return regTime;
	}
	public void setRegTime(Date regTime) {
		this.regTime = regTime;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public Integer getLaud() {
		return laud;
	}
	public void setLaud(Integer laud) {
		this.laud = laud;
	}
	public String getHeadImgUrl() {
		return headImgUrl;
	}
	public void setHeadImgUrl(String headImgUrl) {
		this.headImgUrl = headImgUrl;
	}

	

	
	
}
