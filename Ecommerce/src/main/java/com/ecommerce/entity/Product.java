package com.ecommerce.entity;

import java.sql.Blob;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ProductDetails")
public class Product {

	@Id
	@Column(name="pid")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long pid;
	
	@Column(name="pName")
	private String pName;
	
	@Column(name="pCost")
	private  String pCost;
	
	@Column(name="photo")
	private Blob photo;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(long pid, String pName, String pCost, Blob photo) {
		super();
		this.pid = pid;
		this.pName = pName;
		this.pCost = pCost;
		this.photo = photo;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pName=" + pName + ", pCost=" + pCost + ", photo=" + photo + "]";
	}

	public long getPid() {
		return pid;
	}

	public void setPid(long pid) {
		this.pid = pid;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getpCost() {
		return pCost;
	}

	public void setpCost(String pCost) {
		this.pCost = pCost;
	}

	public Blob getPhoto() {
		return photo;
	}

	public void setPhoto(Blob photo) {
		this.photo = photo;
	}
	

	
	
	
	
}
