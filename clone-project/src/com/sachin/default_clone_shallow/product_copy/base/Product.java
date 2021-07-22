package com.sachin.product_copy.base;

import com.sachin.product_copy.constant.ProductType;

public class Product implements Cloneable {
	public int productId;
	public String name;
	public double price;
	public ProductType type;

	@Override
	public Product clone() throws CloneNotSupportedException {
		System.out.println("invoking clone method");
		return (Product) super.clone();
	}

	public void displayInfo() {
		System.out.println("  ProductId "+ this.productId);
		System.out.println(" Name " + this.name);
		System.out.println(" Price " + this.price);
		System.out.println("  ProductType " + this.type);

	}

}