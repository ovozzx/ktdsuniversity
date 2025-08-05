package com.ktdsuniversity.edu.collections.map.shop;

import java.util.HashMap;
import java.util.Map;

// 해당 class만 수정
public class ComputerSeller implements Seller{

	private Map<String, Product> parts;
	
	public ComputerSeller() {
		// List는 add를 한 순서가 보장되지만 Map은 put한 순서가 보장되지 않음
		// List는 index를 기반으로 데이터가 쌓이고
		// Map은 Key의 hash 값을 기반으로 데이터가 쌓인다 ==> 순서를 보장할 수 없다
		this.parts = new HashMap<>();
		this.parts.put("CPU i9", new Product("CPU i9", 200000000, 5));
		this.parts.put("Hynix RAM", new Product("Hynix RAM", 80000, 15));
		this.parts.put("NVIDIA GPU", new Product("NVIDIA GPU", 1500000000, 20));
	}
	
	@Override
	public void sell(String productName, int orderQuantity) {
		if(this.parts.containsKey(productName)) {
			Product part = this.parts.get(productName);
			if(part.getStock() == 0 || part.getStock() < orderQuantity) {
				System.out.println("재고가 부족해 판매할 수 없습니다.");
			}
			else {
				int stock = part.getStock();
				part.setStock(stock - orderQuantity);
				System.out.println(part);
			}
		}
		else {
			System.out.println("그런 제품 없습니다.");
		}
	}

}
