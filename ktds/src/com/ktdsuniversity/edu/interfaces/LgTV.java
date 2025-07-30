package com.ktdsuniversity.edu.interfaces;

public class LgTV implements TV {

	@Override
	public void welcome() {
		// TODO Auto-generated method stub
		System.out.println("쨍~한 느낌의 화질");
		
	}

	@Override
	public void goodbye() {
		// TODO Auto-generated method stub
		System.out.println("픽");
	}

	@Override
	public void channelChange(boolean up) {
		// TODO Auto-generated method stub
		if(up) {
			System.out.println("채널을 올립니다.");
		}
		else {
			System.out.println("채널을 내립니다.");
		}
	}

	@Override
	public void volumeChange(boolean up) {
		// TODO Auto-generated method stub
		if(up) {
			System.out.println("음량을 올립니다.");
		}
		else {
			System.out.println("음량을 내립니다.");
		}
	}

}
