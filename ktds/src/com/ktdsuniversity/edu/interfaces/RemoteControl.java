package com.ktdsuniversity.edu.interfaces;

/**
 * TV를 제어하는 리모컨과의 통신 규약
 */
public interface RemoteControl {

	// 1. 전역 상수
	// 2. 추상 메소드
	//public abstract void powerOn();
	void powerOn(TV tv); // 인터페이스에 만드는 메소드는 모두 추상 메소드이다
	void powerOff(TV tv);
	
	void channelChange(boolean up, TV tv);
	void volumeChange(boolean up, TV tv);

	default void printInformation() {
		System.out.println("리모컨의 통신 규약입니다.");
	}
	
}
