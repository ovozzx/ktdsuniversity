package com.ktdsuniversity.edu.generics;

import java.util.Arrays;

public class Scores<A> { // 알파벳 맘대로
//<A extends Integer> : Integer 상속 받은 얘만 가능하도록
	//private A[] scores;
	// 제네릭 배열은 자바에서 직접 만들 수 없음 -> Object[]로 선언
	private Object[] scores;
	private int size;
	
	public Scores(int limitSize) {
		//this.scores = new A[limitSize]; // 타입을 몰라서 안됨? -> 제네릭 배열은 만들 수 없음
		this.scores = new Object[limitSize]; 
	}
	
	public void add(A value) { // Object[]에 들어감 (업캐스팅: A → Object (자동), 문제 없음)
		// 업캐스팅 : 자식 타입 -> 부모 타입 변환 (자동, 항상 안전)
		this.scores[this.size++] = value;
	}

	public A get(int index){
		// 다운캐스팅 : 부모 타입 -> 자식 타입 변환 (반드시 명시적 캐스팅 필요)
		// 에러 발생 이유 : this.score => Object[] => 타입 형변환 필요
		return (A) this.scores[index]; // Object → A 는 자동 변환이 불가능 (다운캐스팅 필요)
		// Object는 모든 걸 받을 수 있는 박스지만, 꺼낼 때는 원래 들어있던 타입을 알아야 안전하게 꺼낼 수 있음
	}
	
	public void printElements() {
		// for 3가지 반복문
		// (1) 일반 for : 반복중에 index 값이 반드시 필요할 때
		// 내가 찾고자 하는 값이 배열의 몇 번 인덱스에 존재하는가?
		// 인덱스 번호별 값 확인을 하려 할 때
		for(int i = 0 ; i < this.size ; i++) {
			System.out.println(this.scores[i]);
		}
		// for - each : (성능이) 향상된 For : 성능이 일반 for에 비해 월등히 높다
		// 반복중에 index 값이 필요로 하지 않을 때 = 그냥 값만 출력해라
		// this.cores가 Object이므로 
		for(Object eachValue : this.scores) {// for(Type varName : iterator ) {
			System.out.println("For-each > " + eachValue);
		}
		// for - each function (X)
		
		
	}
	
	@Override
	public String toString() {
		return Arrays.toString(this.scores);
	}
}
