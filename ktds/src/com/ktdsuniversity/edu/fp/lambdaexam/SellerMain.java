package com.ktdsuniversity.edu.fp.lambdaexam;

import com.ktdsuniversity.edu.collections.list.shop.Product;
// public인데 import 필요?

public class SellerMain {
	
	public static void main(String[] args) {
		
		Seller seller = new Seller();
		
		// 가격이 10 만원 미만인 제품만 출력
		// (1) 람다식
		seller.print((prod) -> prod.getPrice() < 100000); // filter.test(prod)에 들어갈 내용
		// (2) 함수화 (메서드 레퍼런스)
		seller.print(Product::isLowPrice);
	}

}
