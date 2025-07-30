package com.ktdsuniversity.edu.interfaces;

public class Main {
	
	public static void main(String[] args) {
	
		/*
		TV sstv = new SamsungTV();
		sstv.welcome();
		sstv.goodbye();
		for(int i = 0 ; i < 200 ; i++) {
			sstv.channelChange(true);
		}
		for(int i = 0 ; i < 200 ; i++) {
			sstv.volumeChange(true);
		}		
		
		TV lgtv = new LgTV();
		lgtv.welcome();
		lgtv.goodbye();
		for(int i = 0 ; i < 200 ; i++) {
			lgtv.channelChange(true);
		}
		for(int i = 0 ; i < 200 ; i++) {
			lgtv.volumeChange(true);
		}*/
		
		TV sstv = new SamsungTV();
		TV lgtv = new LgTV();
		
		RemoteControl ssrc = new SamsungRemoteController();
		RemoteControl lgrc = new LgRemoteController(30);
		
		
		ssrc.printInformation();
		// 컨트롤러로 tv 제어
		lgrc.powerOn(sstv);
		lgrc.powerOff(sstv);
		
		ssrc.powerOn(lgtv);
		ssrc.powerOff(lgtv);
		
		lgrc.channelChange(true, lgtv);
		lgrc.volumeChange(true, sstv);
		
		ssrc.channelChange(false, lgtv);
		ssrc.volumeChange(false, sstv);
	}

}
