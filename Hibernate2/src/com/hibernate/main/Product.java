package com.hibernate.main;

public class Product {
	private int id;
	private int productid;
	private String productname;
	private String productmodel;
	private int productprice;
	
	public Product() {
		
	}
	public Product(int productid,String productname,String productmodel,int productprice) {
		super();
		// TODO Auto-generated constructor stub
		this.productid=productid;
		this.productname=productname;
		this.productmodel=productmodel;
		this.productprice=productprice;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getProductmodel() {
		return productmodel;
	}
	public void setProductmodel(String productmodel) {
		this.productmodel = productmodel;
	}
	public int getProductprice() {
		return productprice;
	}
	public void setProductprice(int productprice) {
		this.productprice = productprice;
	}
	
	
	
}