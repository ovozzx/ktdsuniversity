package com.ktdsuniversity.edu.fp.lambdaexam;

import java.util.ArrayList;
import java.util.List;

import com.ktdsuniversity.edu.collections.list.shop.Product;

public class Seller {

	private List<Product> items;
	
	public Seller() {
		this.items = new ArrayList<>();
		this.items.add(new Product("Item1", 100000, 500));
		this.items.add(new Product("Item2", 50000, 1000));
		this.items.add(new Product("Item3", 10000, 1500));
	}
	
	public void print(ProductFilter filter) {
		for(Product prod : this.items) {
			if(filter.test(prod)) {
				System.out.println(prod);
			}
		}
	}
	
}
