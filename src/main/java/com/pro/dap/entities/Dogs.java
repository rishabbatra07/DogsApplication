package com.pro.dap.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Dogs {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long dogId;
	private String dogName;
	private String dogColor;
	private String dogVacStatus;
	private Date createdDate;
	private Date updatedDate;
	private Date createdBy;
	private Date updatedBy;
	
	public Dogs() {
		
	}
	public Dogs(String dogName, String dogColor, String dogVacStatus) {
		super();
		this.dogName = dogName;
		this.dogColor = dogColor;
		this.dogVacStatus = dogVacStatus;
	}
	public long getDogId() {
		return dogId;
	}
	public void setDogId(long dogId) {
		this.dogId = dogId;
	}
	public String getDogName() {
		return dogName;
	}
	public void setDogName(String dogName) {
		this.dogName = dogName;
	}
	public String getDogColor() {
		return dogColor;
	}
	public void setDogColor(String dogColor) {
		this.dogColor = dogColor;
	}
	public String getdogVacStatus() {
		return dogVacStatus;
	}
	public void setdogVacStatus(String dogVacStatus) {
		this.dogVacStatus = dogVacStatus;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	public Date getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(Date createdBy) {
		this.createdBy = createdBy;
	}
	public Date getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(Date updatedBy) {
		this.updatedBy = updatedBy;
	}
	
	
	
}
