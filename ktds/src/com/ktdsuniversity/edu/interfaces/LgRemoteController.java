package com.ktdsuniversity.edu.interfaces;

public class LgRemoteController implements RemoteControl{

	
	private int battery;
	
	public LgRemoteController(int battery) {
	 this.battery = battery;  
	}
	
	@Override
	public void powerOn(TV tv) {
		// TODO Auto-generated method stub
		if(this.battery > 0) {
			this.battery -= 1;
			tv.welcome();
		}
	}

	@Override
	public void powerOff(TV tv) {
		// TODO Auto-generated method stub
		if(this.battery > 0) {
			this.battery -= 2;
			tv.goodbye();
		}
	}

	@Override
	public void channelChange(boolean up, TV tv) {
		// TODO Auto-generated method stub
		if (this.battery > 0) {
			this.battery -= 3;
			tv.channelChange(up);
		}
	}

	@Override
	public void volumeChange(boolean up, TV tv) {
		// TODO Auto-generated method stub
		if(this.battery > 0) {
			this.battery--;
			tv.volumeChange(up);
		}
	}
	

}
