package com.ktdsuniversity.edu.starcraft;

public class Wraith implements Fly {

	private int health;
	private int mana;
	
	public Wraith() {
		this.health = 100;
		this.mana = 100;
	}
	
	@Override
	public int fireSkill(String skillName, Unit other) {
		// TODO Auto-generated method stub
		System.out.println("레이스가 " + skillName + " 을 사용했습니다.");
		this.mana -= 10;
		return 0;
	}

	@Override
	public void move(int distance) {
		// TODO Auto-generated method stub
		System.out.println("레이스가 " + distance + "m 이동했습니다.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("레이스가 모든 행동을 멈춥니다.");
	}

	@Override
	public void hold() {
		// TODO Auto-generated method stub
		System.out.println("레이스가  제자리에서 유지합니다.");
	}

	@Override
	public void patrol() {
		// TODO Auto-generated method stub
		System.out.println("레이스가 왔다갔다 정찰합니다.");
	}

	@Override
	public int attack(Unit other) {
		// TODO Auto-generated method stub
		System.out.println("레이스가 다른 Unit에게 공격합니다.");
		other.damage(7, this);
		return 0;
	}

	@Override
	public void damage(int damage, Unit other) {
		// TODO Auto-generated method stub
		System.out.println("레이스가 다른 Unit에게 공격을 받았습니다.");
		this.health -= damage;
		
	}
	

}
