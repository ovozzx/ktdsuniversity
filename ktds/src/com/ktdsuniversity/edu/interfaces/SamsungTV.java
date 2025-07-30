package com.ktdsuniversity.edu.interfaces;

public class SamsungTV implements TV { // 인터페이스로 뭔가 만들 때, implements 붙여줌

	private final int MAX_CHANNEL = 99;
	private final int MAX_VOLUME = 30;
	
	private String manufacture;
	private String welcomeMessage;
	private String goodbyeMessage;
	
	private boolean isOn; // 기본값으로 두기
	private int channel; // 기본값으로 두기
	private int volume; // 기본값으로 두기
	
	public SamsungTV() {
		this.manufacture = "Samsung";
		this.welcomeMessage = "S A M S U N G";
		this.goodbyeMessage = "이제 TV가 꺼집니다.";
	}
	
	// 사용 인터페이스 (TV)에 있는 것을 여기에도 구현해야 함 (필수)
	@Override
	public void welcome() {
		// TODO Auto-generated method stub
		this.isOn = true;	
		this.channel = 0;
		this.volume = 0;
		System.out.println(this.welcomeMessage);
		System.out.println("현재 채널 : " + this.channel);
		System.out.println("현재 음량 : " + this.volume);
	}
	
	@Override
	public void goodbye() {
		// TODO Auto-generated method stub
		this.isOn = false;	
		this.channel = 0;
		this.volume = 0;
		System.out.println(this.goodbyeMessage);
	}
	
	@Override
	public void channelChange(boolean up) {
		// TODO Auto-generated method stub
		if(up) {
			this.channel++;
		}
		else {
			this.channel--;
		}
		if(this.channel > MAX_CHANNEL) {
			this.channel = 1;
		}
		else if (this.channel < 1) {
			this.channel = this.MAX_CHANNEL;
		}
		System.out.println("현재 채널 : " + this.channel);
	}
	
	@Override
	public void volumeChange(boolean up) {
		// TODO Auto-generated method stub
		if(up) {
			this.volume++;
		}
		else {
			this.volume--;
		}
		if(this.volume > this.MAX_VOLUME) {
			this.volume = this.MAX_VOLUME;
		}
		else if(this.volume < 0) {
			this.volume = 0;
		}
		System.out.println("현재 음량 : " + this.volume);
	}
	
	
}
