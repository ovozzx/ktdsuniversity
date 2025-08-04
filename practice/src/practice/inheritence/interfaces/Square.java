package practice.inheritence.interfaces;

public class Square implements Calculator{
	
	public int getArea(int length) {
		if(length == 0) {
			return Calculator.ERROR_CODE;
		}
		else {			
			return length * length;			
		}
	}

}
