package com.bridgelabz.colletion_prgms;

public class Product {

	String product_name;
	int id;
	double cost;
	
	
	public Product(String product_name, int id, double cost) {
		super();
		this.product_name = product_name;
		this.id = id;
		this.cost = cost;
	}

@Override
	public int hashCode() {
		return this.id+=25;
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Product))
		return false;
		Product product=(Product)obj;
		return product_name.equals(product.product_name) && id==product.id && cost==product.cost;
	
	
		}

	@Override
	public String toString() {
		return "Product [product_name=" + product_name + ", id=" + id + ", cost=" + cost + "]";
	}}