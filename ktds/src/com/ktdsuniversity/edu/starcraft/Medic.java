package com.ktdsuniversity.edu.starcraft;

public class Medic implements Healer {

	private int health;
	private int baseHeal;
	private int defenceGrade;
	
	public Medic(int defenceGrade) {
		this.health = 100;
		this.baseHeal = 4;
		this.defenceGrade = defenceGrade;
	}
	
	@Override
	public void move(int distance) {
		// TODO Auto-generated method stub
		System.out.println("Medic이 " + distance + "m 이동했습니다.");
	}
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Medic이 모든 행동을 멈춥니다.");
	}
	@Override
	public void hold() {
		// TODO Auto-generated method stub
		System.out.println("Medic이 제자리에서 유지합니다.");
	}
	@Override
	public void patrol() {
		// TODO Auto-generated method stub
		System.out.println("Medic이  왔다갔다 정찰합니다.");
	}
	@Override
	public int attack(Unit other) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void damage(int damage, Unit other) {
		// TODO Auto-generated method stub
		System.out.println("Medic이 다른 Unit에게 " + (damage - this.defenceGrade) + " 만큼 피해를 입었습니다.");
		this.health -= (damage - this.defenceGrade);
	}
	@Override
	public void heal(Unit other) {
		// TODO Auto-generated method stub
		System.out.println("Medic이 다른 Unit의 체력을 회복시킵니다.");
		other.damage(this.baseHeal, this);
	}
	
	
	
	
}
