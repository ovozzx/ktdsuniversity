package com.ktdsuniversity.edu.fp.shop2;

import java.util.List;

import com.ktdsuniversity.edu.fp.shop2.db.FileHandler;

/**
 * 코드의 구조를 개선시킨다.
 * 코드의 성능을 향상시킨다.
 * ==> Code Refactoring
 */
public class ComputerSeller implements Seller {

	private List<Product> computer;
	private FileHandler database;
	
	public ComputerSeller() {
		this.database = new FileHandler("/Users/codemakers/Desktop/shop", "shop.db");
		this.computer = this.database.readFile( // CreateProduct의 convert를 실제로 구현해서 넘겨주는 코드
				(arr) -> new Product(
								arr[0], 
								Integer.parseInt(arr[1]), 
								Integer.parseInt(arr[2])));
	}
	
	@Override
	public void add(Object object) {
		Product product = (Product) object;
		this.computer.add( product );
		
		this.save();
	}
	
	@Override
	public void addStock(String productName, int stock) {
		Product product = this.searchProduct(productName);
		if (product != null) {
			int nowStock = product.getStock();
			product.setStock(nowStock + stock);
			this.save();
		}
	}
	
	@Override
	public void removeStock(String productName) {
		this.computer // List<Product>
			.removeIf( (product) -> product.getName().equals(productName) );
		this.save();
	}
	
	@Override
	public void sell(String productName, int orderQuantity) {
		
		Product part = this.searchProduct(productName);
		if (part != null) {
			if (part.getStock() == 0 
					|| part.getStock() < orderQuantity) {
				System.out.println("재고가 부족해서 판매할 수 없습니다.");
			}
			else {
				int stock = part.getStock();
				part.setStock(stock - orderQuantity);
				
				this.save();
				System.out.println(part);
			}
		}
		else {
			System.out.println("찾으시는 제품이 없습니다.");
		}
	}
	
	@Override
	public void printItems() {
		this.computer // List<Product>
			.forEach( (product) -> {
				System.out.println(
						"%s, %d, %d".formatted(product.getName(), product.getPrice(), product.getStock())
				);
			});
	}
	
	private Product searchProduct(String searchKeyword) {
		return this.computer // List<Product>
					.stream() // Stream<Product>
					.filter((prod) -> prod.getName().equals(searchKeyword) ) // Stream<Product>
					.findFirst() // Optional<Product>
					.orElse(null); // Product
	}
	
	private void save() {
		this.database.writeFile(this.computer, 
				(prod) -> "%s```%d```%d".formatted(prod.getName(), prod.getPrice(), prod.getStock()));
	}
}






