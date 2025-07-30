package com.ktdsuniversity.edu.starcraft;

public class Marine implements SpecialSkill{

	private int health;
	private int baseDamage;
	private int attackGrade;
	private int defenceGrade;
	
	public Marine() {
		this.health = 100;
		this.baseDamage = 5;
		this.attackGrade = 0;
		this.defenceGrade = 0;
	}
	
	public Marine(int attackGrade, int defenceGrade) {
		super();
		this.attackGrade = attackGrade;
		this.defenceGrade = defenceGrade;
	}
	
	@Override
	public void move(int distance) {
		// TODO Auto-generated method stub
		System.out.println("Marine이 " + distance + "m 이동했습니다.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Marine이 모든 행동을 멈춥니다.");
	}

	@Override
	public void hold() {
		// TODO Auto-generated method stub
		System.out.println("Marine이 제자리에서 유지합니다.");
	}

	@Override
	public void patrol() {
		// TODO Auto-generated method stub
		System.out.println("Marine이 왔다갔다 정찰합니다.");
	}

	@Override
	public int attack(Unit other) {
		// TODO Auto-generated method stub
		System.out.println("Marine이 다른 Unit에게 공격합니다.");
		other.damage(this.baseDamage + this.attackGrade, this);
		return this.baseDamage + this.attackGrade;
	}

	@Override
	public void damage(int damage, Unit other) {
		// TODO Auto-generated method stub
		
		if(other instanceof Healer) {
			System.out.println("Marine이 Healer에게서 체력을 회복받았습니다.");
			this.health += damage;
		}
		else {
			System.out.println("Marine이 다른 Unit에게 " + (damage - this.defenceGrade) + " 만큼 피해를 입었습니다.");
			this.health -= (damage - this.defenceGrade);
		}
			
	}

	@Override
	public int fireSkill(String skillName, Unit other) {
		// TODO Auto-generated method stub
		System.out.println("Marine이 " + skillName + " 을 사용했습니다.");
		this.health -= 10;
		other.damage(this.baseDamage + this.attackGrade, this);
		other.damage(this.baseDamage + this.attackGrade, this);
		return 0;
	}
	

}
