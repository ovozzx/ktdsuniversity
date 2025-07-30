package com.ktdsuniversity.edu.starcraft;

public class Main {

	public static void main(String[] args) {
		
		// 앞에 타입은 인터페이스 => 뒤 객체는 클래스 "다형성"
		SpecialSkill marine = new Marine(3, 3);
		SpecialSkill marine2 = new Marine(0, 0);
		
		Healer medic = new Medic(2);
		
		Fly wraith = new Wraith();
		Fly wraith2 = new Wraith();
		
		marine.attack(marine2);
		marine.attack(wraith2);

		wraith2.attack(marine);

		medic.attack(marine);
		medic.attack(marine2);
		
		
		
		
	}
}
