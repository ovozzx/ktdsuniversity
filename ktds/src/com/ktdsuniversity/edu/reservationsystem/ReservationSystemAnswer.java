package com.ktdsuniversity.edu.reservationsystem;

import java.util.Scanner;

public class ReservationSystemAnswer {

	
	public static void main(String[] args) {
		
		SeatAnswer[] seats = new SeatAnswer[7];
		for (int i = 0; i < seats.length; i++) {
			seats[i] = new SeatAnswer();
			seats[i].isReserved = false;
			seats[i].type = (int) (Math.random() * 2);
			if (seats[i].type == 0) {
				seats[i].fee = 10_000;
			}
			else {
				seats[i].fee = 30_000;
			}
		}
		
		Scanner consoleInput = new Scanner(System.in);
		while (true) {
			int reservedSeatsCount = 0;
			System.out.println("=".repeat(30));
			System.out.println("좌석 현황입니다.");
			for (int i = 0; i < seats.length; i++) {
				seats[i].printStatus();
				if (seats[i].isReserved) {
					reservedSeatsCount += 1;
				}
			}
			System.out.println();
			System.out.println("◻:예매할 수 있는 좌석 (" + (seats.length - reservedSeatsCount) +")");
			System.out.println("◼:예매된 좌석 (" + reservedSeatsCount + ")");
			System.out.println("=".repeat(30));
			
			if (reservedSeatsCount == seats.length) {
				System.out.println("모든 좌석이 예매되었습니다.");
				System.out.println("시스템을 종료합니다.");
				System.out.println("안녕히 가세요.");
				break;
			}
			
			System.out.println("예매할 좌석을 입력하세요.");
			System.out.print("> ");
			int chosenSeatNumber = consoleInput.nextInt();
			if (seats[chosenSeatNumber].isReserved) {
				System.out.println("해당 좌석은 예매할 수 없습니다.");
			}
			else {
				seats[chosenSeatNumber].printReserveMessage();
				System.out.println("예매하시겠습니까?");
				System.out.print("> ");
				String yn = consoleInput.next();
				
				if (yn.equals("y")) {
					String seatType = "일반";
					if (seats[chosenSeatNumber].type == 1) {
						seatType = "VIP";
					}
					System.out.println(chosenSeatNumber + "번 \"" + seatType + " \"좌석 예매합니다.");
					System.out.println("납부할 비용을 입력하세요.");
					System.out.print("> ");
					int paidMoney = consoleInput.nextInt();
					if (seats[chosenSeatNumber].fee <= paidMoney) {
						seats[chosenSeatNumber].reserveSeat();
						System.out.println(chosenSeatNumber + "번 \"" + seatType + " \"좌석 예매되었습니다.");
						int refundMoney = paidMoney - seats[chosenSeatNumber].fee;
						if (refundMoney > 0) {
							System.out.println("거스름돈 " + refundMoney + "원 입니다.");
						}
						System.out.println("안녕히 가세요.");
					}
					else {
						System.out.println("금액이 충분하지 않아 예매할 수 없습니다.");
						System.out.println("환불금 " + paidMoney + "원입니다.");
						System.out.println("안녕히 가세요.");
					}
					
				}
				else {
					System.out.println("예매를 취소하셨습니다.");
					System.out.println("안녕히 가세요.");
				}
			}
		}
	}
	
	
}
