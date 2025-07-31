package com.ktdsuniversity.edu.exceptions.checked;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;


/**
 * 
 * 예외 종류 : throwable (최상위 부모)는 잘 안씀
 * 1. exception : try - catch 필수 => checked exception
 * 2. runtime exception : try - catch 옵션 (필요에 따라 사용) => unchecked exeption
 * 
 * 
 */
public class DynamicLoader {

	public static void main(String[] args) {
		
//		NumberFormatException;
//		NullPointerException;
//		InputMismatchException;
//		ArrayInedexOutofBou
//		
		
		// reflection
		Class<?> cls = null;
		try {
			cls = Class.forName("com.ktdsuniversity.edu.reservationsystem.Seat"); // 불러오고 싶은 클래스 
			// -> 던지는 예외 - ClassNotFoundException (ctrl로 들어가서 보면 나옴_
		}
		catch(ClassNotFoundException cnfe) { // 타고 타고 들어가면 exeption으로 try catch 필요!
			System.out.println("예외가 발생했습니다.");
			System.out.println(cnfe.getMessage()); // 예외가 발생한 사유 출력
			cnfe.printStackTrace(); // 콜스택 출력 기능
		}
		
		System.out.println(cls);
		
		if (cls == null) {
			return;
		}
		Constructor constructor = null;
		try {
			// Seat의 생성자를 가져온다
			//constructor = cls.getDeclaredConstructor(String.class); // 동일한 매개변수를 갖는 생성자를 찾음-> 에러발생 해당 형태 생성자 없음
			constructor = cls.getDeclaredConstructor(null);
		}
		catch(NoSuchMethodException nsme) { // null check 필요
			System.out.println("생성자가 존재하지 않습니다.");
			System.out.println(nsme.getMessage());
			nsme.printStackTrace(); // 콜스택 출력 기능
		}
//		
		if (constructor == null) {
			return;
		}
		
		
		
		
		Object seatObject = null;
		
		try {
//		// 생성자를 호출한다
			seatObject = constructor.newInstance("", "", 123);			
		}
		// multi catch
		catch(IllegalArgumentException | InstantiationException | InvocationTargetException iae) {
			System.out.println("객체 생성에 실패했습니다.");
			System.out.println(iae.getMessage());
			//iae.printStackTrace();			
		}
		catch(IllegalAccessException iae) {
		System.out.println("생성자 접근에 실패하였습니다.");
		System.out.println(iae.getMessage());
		iae.printStackTrace();
		}
		// 아래 여러 catch -> 한개의 catch로 처리하자
//		catch(IllegalArgumentException iae) {
//			System.out.println("객체 생성에 실패했습니다.");
//			System.out.println(iae.getMessage());
//			iae.printStackTrace();
//		}
//		catch(InstantiationException ie) {
//			System.out.println("객체 생성에 실패했습니다.");
//			System.out.println(ie.getMessage());
//			ie.printStackTrace();
//		}
//		catch(IllegalAccessException iae) {
//			System.out.println("생성자 접근에 실패하였습니다.");
//			System.out.println(iae.getMessage());
//			iae.printStackTrace();
//		}
//		catch(InvocationTargetException ite) {
//			System.out.println("객체 생성에 실패했습니다.");
//			System.out.println(ite.getMessage());
//			ite.printStackTrace();
//		}
		System.out.println(seatObject);
	}
	
}
