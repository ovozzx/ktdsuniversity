package com.ktdsuniversity.edu.reservationsystem;

import java.util.Scanner;

public class ReservationSystem {

	/**
	 * 설계 :
	 * 클래스 : 좌석 정보 
	 * 
	 */
	
	// 예매 ox 좌석 수 -> 연산자로 일단 하기 
	// 그림 출력 -> 공부 필요 
	// 문자열은 특정 인덱스에 해당하는 값을 변경할 수 없어, 배열 변환 후 -> 문자열로 다시 변환 필요
	// 개선 : 반복을 줄이는 방법, 클래스에 어디까지 넣을지
	public static void main(String[] args) {
		
		Seat[] seats = new Seat[5];
		// 반복되게 안하는 방법
		seats[0] = new Seat(); 		
		seats[0].price = 10000;
		seats[0].type = "일반";
		seats[0].isOnSale = true;
		
		seats[1] = new Seat(); 		
		seats[1].price = 30000;
		seats[1].type = "VIP";
		seats[1].isOnSale = true;
		
		seats[2] = new Seat(); 		
		seats[2].price = 10000;
		seats[2].type = "일반";
		seats[2].isOnSale = true;
		
		seats[3] = new Seat(); 		
		seats[3].price = 30000;
		seats[3].type = "VIP";
		seats[3].isOnSale = true;
		
		seats[4] = new Seat(); 		
		seats[4].price = 10000;
		seats[4].type = "일반";
		seats[4].isOnSale = true;
		
		int seatCnt = seats.length;
		int reservedCnt = 0;
		String seatImage = "◻".repeat(seats.length);
		char[] chars = seatImage.toCharArray();
		
		Scanner consoleInput = new Scanner(System.in);
		
		while(seats[0].isOnSale || 
			  seats[1].isOnSale ||
			  seats[2].isOnSale ||
			  seats[3].isOnSale ||
			  seats[4].isOnSale 
				) { // 판매중인 좌석이 있을 때
			System.out.println("===================");
			System.out.println("좌석 현황입니다.");
			System.out.println(seatImage);
			System.out.println("◻ : 예매할 수 있는 좌석. (" + seatCnt + ")" );
			System.out.println("◼ : 예매된 좌석. (" + reservedCnt + ")" );
			System.out.println("===================");
			System.out.println("예매할 좌석을 입력하세요. (1~5)");
			int seatNumber = consoleInput.nextInt();
			
			if(!seats[seatNumber-1].isOnSale) {
				System.out.println("해당 좌석은 예매할 수 없습니다.");
			}
			else {
				System.out.println("해당 좌석은 " + "\"" + seats[seatNumber-1].type + "\"" + " 좌석, "
								   + "비용은 " + seats[seatNumber-1].price + " 원 입니다.");
				System.out.println("예매하시겠습니까?");
				String buyConfirm = consoleInput.next();
				if(buyConfirm.equals("y")) { // ''로는 안됨.. 
					System.out.println( seatNumber + "번 " + "\"" + seats[seatNumber-1].type + "\"" + " 좌석 예매합니다.");
					System.out.println("납부할 비용을 입력하세요");
					int money = consoleInput.nextInt();
					int change = money - seats[seatNumber-1].price;
					
					if(change < 0) {
						System.out.println("금액이 충분하지 않아 예매할 수 없습니다.");
						System.out.println("환불금 " + money + " 입니다.");
						System.out.println("안녕히 가세요.");
					}
					else { // 최종 구매한 경우
						System.out.println( seatNumber + "번 " + "\"" + seats[seatNumber-1].type + "\"" + "좌석 예매되었습니다.");
						System.out.println("거스름돈 " + change + "입니다.");
						System.out.println("안녕히 가세요.");
						seats[seatNumber-1].isOnSale = false;
						reservedCnt += 1;
						seatCnt -= 1;
						chars[seatNumber-1] = '◼';
						seatImage = new String(chars);
					}

				}
				else {
					System.out.println("예매를 취소하였습니다.");
					System.out.println("안녕히 가세요.");
				}
			}
		}
		
		System.out.println("===================");
		System.out.println("좌석 현황입니다.");
		System.out.println(seatImage);
		System.out.println("◻ : 예매할 수 있는 좌석. (" + seatCnt + ")" );
		System.out.println("◼ : 예매된 좌석. (" + reservedCnt + ")" );
		System.out.println("===================");
		System.out.println("모든 좌석이 예매되었습니다.");
		System.out.println("시스템을 종료합니다.");
		System.out.println("안녕히 가세요.");
	}

}
