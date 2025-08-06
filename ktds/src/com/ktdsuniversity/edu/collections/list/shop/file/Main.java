package com.ktdsuniversity.edu.collections.list.shop.file;

public class Main {
	
	public static void main(String[] args) {
		
		Seller assacom = new ComputerSeller();

//		assacom.add(new Product("RAM 128GB", 14000000, 10));		
//		assacom.add(new Product("RAM 64GB", 13000000, 10));
//		assacom.add(new Product("RAM 32GB", 12000000, 10));
//		assacom.add(new Product("CPU", 400000, 50));
		
//		assacom.sell("CPU", 10); // .db 파일에서도 누적 반영됨
		
		assacom.addStock("CPU", 100); // 재고 추가
		assacom.removeStock("RAM 64GB"); // 제품 삭제
		assacom.sell("RAM 64GB", 1); 
	}

}
