package com.ktdsuniversity.edu.fp.shop;

import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		Seller assacom = new ComputerSeller();
		// Seller 인터페이스 = Seller 인터페이스를 구현한 ComputerSeller 클래스
		
		assacom.sell("RAM 128GB", 10
				, ((List<Product> product, Product searchProduct) -> product.contains(searchProduct)) // = 람다식 객체
				// Contains contains 매개변수 부분 (내용 구현 안되어 있음)
				// 리스트 contain 함수 (포함 여부)
				// 내생각 : 함수형은 Contains 내용이 메서드 하나 밖에 없어서 그 값을 대체??
				, (list, search) -> {
					int index = list.indexOf(search);
					return list.get(index); // = 람다식 객체
				}); // 내생각 : 함수형은 메서드 하나 밖에 없어서 그 값을 대체??
		assacom.sell("RAM 64GB", 2
				, (list, search) -> list.contains(search)
				, (list, search) -> {
					int index = list.indexOf(search);
					return list.get(index);
				}); // 타입 생략 가능
		assacom.sell("RAM 32GB", 1
				, ($, s) -> $.contains(s)
				, (list, search) -> {
					int index = list.indexOf(search);
					return list.get(index);
				});
		assacom.sell("CPU", 20
				, (var a, var b) -> a.contains(b)
				, (list, search) -> {
					int index = list.indexOf(search);
					return list.get(index);
				});
		
	
	}

}
