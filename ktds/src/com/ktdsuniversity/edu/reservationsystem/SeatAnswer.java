package com.ktdsuniversity.edu.reservationsystem;

public class SeatAnswer {


	boolean isReserved;
	int fee;
	int type;
	
	void reserveSeat() {
		isReserved = true;
	}
	
	void printReserveMessage() {
		String seatTypeName = "일반";
		if (type == 1) {
			seatTypeName = "VIP";
		}
		System.out.println("해당좌석은 \""+ seatTypeName +"\" 좌석, 비용은 " + fee + "원 입니다.");
	}
	
	void printStatus() {
		if (isReserved) {
			System.out.print("◼");
		}
		else {
			System.out.print("◻︎");
		}
	}
	
}
