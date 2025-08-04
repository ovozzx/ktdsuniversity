package exceptions;

public class Main {
	
	public static void main(String[] args) {
		
		try {
			String text = null;
			System.out.println(text.length());
			
			int[] arr = new int[3];
			System.out.println(arr[5]);
		}
		catch (NullPointerException | ArrayIndexOutOfBoundsException e) {// 여러 예외 중 가장 먼저 발생한 하나만 처리
			System.out.println("예외 발생 : " + e);
		}
		
		try {
			
			int result = 10 / 0;
			
		}
		catch(ArithmeticException e) {
			System.out.println("예외 발생 : " + e);
		}
		
		
		
	}

}
