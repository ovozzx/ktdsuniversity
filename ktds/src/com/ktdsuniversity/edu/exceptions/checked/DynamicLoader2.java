package com.ktdsuniversity.edu.exceptions.checked;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class DynamicLoader2 { // 이렇게하면 안됨 
	
	
	public void createNewInstance() throws ClassNotFoundException, NoSuchMethodException,
	InstantiationException, IllegalAccessException, InvocationTargetException{ // 예외처리 떠넘기는 것
		Class<?> cls = Class.forName("com.ktdsuniversity.edu.reservationsystem.Seat"); // 불러오고 싶은 클래스 
		System.out.println(cls);
		
		Constructor constructor = cls.getDeclaredConstructor(null);
		System.out.println(constructor);
		
		Object seatObject = constructor.newInstance();		
		System.out.println(seatObject);
	}
	
	public void run() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
		this.createNewInstance();
	}
	
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
		// 운이 좋으면 실행됨
		DynamicLoader2 dl = new DynamicLoader2();
		dl.run();
	}

}
