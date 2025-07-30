package com.ktdsuniversity.edu.starcraft;

/**
 *  Unit -> Healer
 *  Unit -> Special Skill -> Fly
 */
public interface Unit {
	
	void move(int distance);
	
	void stop();
	
	void hold();
	
	void patrol();
	
	int attack(Unit other);
	
	void damage(int damage, Unit other);
	
	

}
