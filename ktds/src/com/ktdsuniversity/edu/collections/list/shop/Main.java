package com.ktdsuniversity.edu.collections.list.shop;

public class Main {
	
	public static void main(String[] args) {
		
		Seller assacom = new ComputerSeller();
		assacom.sell("RAM 128GB", 10);
		assacom.sell("RAM 64GB", 2);
		assacom.sell("NVIDIA GTX5090", 1);
		assacom.sell("CPU", 20);
	}

}
