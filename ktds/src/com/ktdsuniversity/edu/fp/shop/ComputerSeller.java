package com.ktdsuniversity.edu.fp.shop;

import java.util.ArrayList;
import java.util.List;

import com.ktdsuniversity.edu.collections.list.shop.file.db.FileHandler;


public class ComputerSeller implements Seller{

	private List<Product> computer;
	private FileHandler database;
	
	public ComputerSeller() {
		this.database = new FileHandler("C:\\Users\\User\\Desktop\\shop", "shop.db");
		this.computer = new ArrayList<>();
		
		List<String> productLine = this.database.readFile();
		// 제품명```가격```재고수량 -> CPU```50000```10
		for(String line : productLine) {
			String[] splitted = line.split("```");
			this.computer.add(new Product(splitted[0], 
					Integer.parseInt(splitted[1]), 
					Integer.parseInt(splitted[2])));
		}
		
	}
	                                       
	
	@Override
	public void addStock(String productName, int stock) {
		// TODO Auto-generated method stub
		Product searchProduct = new Product(productName, 0, 0);      
		if(this.computer.contains(searchProduct)) { // for 없이, contain을 통해 computer를 반복시킴 (요소가 인스턴스인 List도 가능)
			int partIndex = this.computer.indexOf(searchProduct); // -1 나올 일 없음
			Product part = this.computer.get(partIndex);
			
			int nowStcok = part.getStock();
			part.setStock(nowStcok + stock);
			
			List<String> productLine = new ArrayList<>();
			
			for(Product prod : this.computer) {
				productLine.add("%s```%d```%d```".formatted(prod.getName(), prod.getPrice(), prod.getStock()));
			}
			this.database.writeFile(productLine);
		}
	}
	
	@Override
	public void removeStock(String productName) {
		// TODO Auto-generated method stub
		Product searchProduct = new Product(productName, 0, 0);      
		if(this.computer.contains(searchProduct)) { // for 없이, contain을 통해 computer를 반복시킴 (요소가 인스턴스인 List도 가능)
			int partIndex = this.computer.indexOf(searchProduct);
			this.computer.remove(partIndex);
			
			List<String> productLine = new ArrayList<>();
			
			for(Product prod : this.computer) {
				productLine.add("%s```%d```%d```".formatted(prod.getName(), prod.getPrice(), prod.getStock()));
			}
			this.database.writeFile(productLine);
		}
	}

	@Override
	public void add(Object object) {
		// TODO Auto-generated method stub
		Product product = (Product) object;
		this.computer.add(product);
		
		List<String> productLine = new ArrayList<>();
		
		for(Product prod : this.computer) {
			productLine.add("%s```%d```%d```".formatted(prod.getName(), prod.getPrice(), prod.getStock()));
		}
		this.database.writeFile(productLine);
		
	}
	
	@Override
	public void sell(String productName, int orderQuantity, Contains contains, Extracter extracter) {
		// TODO Auto-generated method stub
		// 상품클래스 배열에서 상품명을 찾아 주문수량만큼 재고 감소시키기
		// 주문수량이 재고수보다 크거나 
		// 재고수가 0이라면 “판매할 수 없습니다“ 출력하기
		
		// 이렇게 해야 하는 이유 -> Product equals 
		Product searchProduct = new Product(productName, 0, 0);                                                                                                                                                                                                                                                                                                                                       
		
		// equals 오버라이딩 함
		if(contains.contains(this.computer, searchProduct)) { // for 없이, contain을 통해 computer를 반복시킴 (요소가 인스턴스인 List도 가능)
			Product part = extracter.get(this.computer, searchProduct);
			
	
			if(part.getStock() == 0 || part.getStock() < orderQuantity) {
				System.out.println("재고가 부족해서 판매할 수 없습니다.");
			}
			else {
				int stcok = part.getStock();
				part.setStock(stcok - orderQuantity);
				
				// 복붙
				List<String> productLine = new ArrayList<>();
				
				for(Product prod : this.computer) {
					productLine.add("%s```%d```%d```".formatted(prod.getName(), prod.getPrice(), prod.getStock()));
				}
				this.database.writeFile(productLine);
				
				
				System.out.println(part);
			}
			return;
		}
		else {
			System.out.println("찾으시는 제품이 없습니다.");
		}
	}
//		for(Product part : this.computer) {
//			
//			if(part.getName().equals(productName)) {
//				
//				if(part.getStock() == 0 || part.getStock() < orderQuantity) {
//					System.out.println("판매할 수 없습니다.");
//				}
//				else {
//					int stock = part.getStock();
//					part.setStock(stock - orderQuantity);
//					System.out.println("판매 완료했습니다.");
//				}
//				return; // 판매를 성공했거나 재고가 부족했을 때 메소드를 즉시 종료.
//						
//			}
//			
//		}
//		
//		System.out.println("찾으시는 제품이 없습니다.");
//		
//
//		
//	}

}
