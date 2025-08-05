package com.ktdsuniversity.edu.collections.map.shop;

public class Main {
	
	public static void main(String[] args) {
		
		Seller assacom = new ComputerSeller();
		assacom.sell("CPU i9", 10);
		assacom.sell("Hynix RAM", 2);
		assacom.sell("NVIDIA GTX5090", 1);
		assacom.sell("NVIDIA GPU", 20);
		
	}

}
