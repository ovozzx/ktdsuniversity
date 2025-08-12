package com.ktdsuniversity.edu.fp.shop2;

public class Main {

	public static void main(String[] args) {
		
		Seller assacom = new ComputerSeller();
		assacom.printItems();
//		assacom.add(new Product("RAM 128GB", 120000, 100));
//		assacom.add(new Product("RAM 64GB", 100000, 100));
//		assacom.add(new Product("RAM 32GB", 80000, 100));
//		assacom.add(new Product("RAM 16GB", 60000, 100));
//		assacom.add(new Product("RAM 8GB", 40000, 100));
//		assacom.add(new Product("CPU", 400000, 50));
		
		assacom.add(new Product("GPU", 400000, 50));
		
		assacom.sell("RAM 16GB", 10);
		assacom.addStock("CPU", 100);
		assacom.removeStock("RAM 128GB");
		assacom.printItems();
		
	}
	
}