package com.ktdsuniversity.edu.interfaces;

public class SamsungRemoteController implements RemoteControl {

	
	@Override
	public void powerOn(TV tv) {
		// TODO Auto-generated method stub
		tv.welcome();
	}

	@Override
	public void powerOff(TV tv) {
		// TODO Auto-generated method stub
		tv.goodbye();
	}

	@Override
	public void channelChange(boolean up, TV tv) {
		// TODO Auto-generated method stub
		tv.channelChange(up);
	}

	@Override
	public void volumeChange(boolean up, TV tv) {
		// TODO Auto-generated method stub
		tv.volumeChange(up);
	}
	
	@Override
	public void printInformation() {
		// TODO Auto-generated method stub
		System.out.println("삼성 리모컨입니다.");
	}

}
