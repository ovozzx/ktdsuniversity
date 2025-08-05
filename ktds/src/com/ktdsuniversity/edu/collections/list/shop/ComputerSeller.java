package com.ktdsuniversity.edu.collections.list.shop;

import java.util.ArrayList;
import java.util.List;

public class ComputerSeller implements Seller{

	private List<Product> computer;
	
	public ComputerSeller() {
		this.computer = new ArrayList<>();
		this.computer.add(new Product("CPU", 500_000, 10));
		this.computer.add(new Product("RAM 8GB", 80_000, 100));
		this.computer.add(new Product("RAM 16GB", 140_000, 50));
		this.computer.add(new Product("RAM 32GB", 200_000, 10));
		this.computer.add(new Product("RAM 64GB", 400_000, 3));
		this.computer.add(new Product("NVIDIA GTX5090", 4_000_000, 1));
		this.computer.add(new Product("NVIDIA GTX5080", 2_000_000, 2));
		this.computer.add(new Product("NVIDIA GTX5070", 1_500_000, 10));
		this.computer.add(new Product("NVIDIA GTX5060", 700_000, 30));
		
	}
	
	@Override
	public void sell(String productName, int orderQuantity) {
		// TODO Auto-generated method stub
		// 상품클래스 배열에서 상품명을 찾아 주문수량만큼 재고 감소시키기
		// 주문수량이 재고수보다 크거나 
		// 재고수가 0이라면 “판매할 수 없습니다“ 출력하기
		
		// 이렇게 해야 하는 이유 -> Product equals 
		Product searchProduct = new Product(productName, 0, 0);                                                                                                                                                                                                                                                                                                                                       
		
		// equals 오버라이딩 함
		if(this.computer.contains(searchProduct)) { // for 없이, contain을 통해 computer를 반복시킴 (요소가 인스턴스인 List도 가능)
			int partIndex = this.computer.indexOf(searchProduct); // -1 나올 일 없음
			Product part = this.computer.get(partIndex);
			if(part.getStock() == 0 || part.getStock() < orderQuantity) {
				System.out.println("재고가 부족해서 판매할 수 없습니다.");
			}
			else {
				int stcok = part.getStock();
				part.setStock(stcok - orderQuantity);
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
