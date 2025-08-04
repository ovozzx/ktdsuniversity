package com.ktdsuniversity.edu.market;

public class Market {

	public static void main(String[] args) {
		
		Store appleStore = new Store(1_000_000, 3, 2_500_000, 1000);
		Store galaxyStore = new Store(500_000, 100, 1_250_000, 3000);
		Store hwaweiStore = new Store(300_000, 1000, 500_000, 15_000);		
		
		//Store appleStore = new Store();
		//Store galaxyStore = new Store();
		//Store hwaweiStore = new Store();
		/*appleStore.safe = 0;
		appleStore.stock = 10;
		appleStore.price = 1_000_000;
		appleStore.saleCount = 0;*/
		
		Customer kim = new Customer();
		//kim.wallet = 3_500_000;
		//kim.buyCount = 0;
		
		/**
		 * Customer에게 물건을 판매하는 기능
		 * 	1. Customer가 구매하려는 구매 개수보다 재고가 많아야 한다. (O)
		 * 	2. Customer가 구매하려는 최종 금액보다 지갑에 돈이 많아야 한다.(O)
		 * 	3. 1, 2가 만족이 되어서 판매가 완료되었을 경우, 판매 개수는 구매 개수만큼 증가해야 하고 (O)
		 * 	4. 구매 개수 X 단가만큼 safe가 증가되어야 하고 (O)
		 * 	5. 구매개수 만큼 stock이 감소해야 한다. (O)
		 * 	6. Customer의 지갑에서는 구매개수 X 단가만큼이 감소되어야 하고 (O)
		 * 	7. Customer의 buyCount는 구매개수 만큼 증가되어야 한다.
		 */
		
		// Customer와 Store의 상호작용
		/*while(appleStore.stock > 0) {
			
			int count = (int) (Math.random() * 10);
			kim.get(count, appleStore);
			appleStore.sell(appleStore.price, count);
			
		}*/

		appleStore.sell(5, kim);
		galaxyStore.sell(8, kim);
		hwaweiStore.sell(3, kim);
	}
	
}
