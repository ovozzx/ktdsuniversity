package practice.inheritence.interfaces;

public class Circle implements Calculator{

	public int getArea(int ridus) { // 매개변수명은 바꿔도 되는듯
		
		if(ridus == 0) {
			return Calculator.ERROR_CODE;
		}
		else {			
			return (int) (ridus * ridus * Calculator.PI);
		}
		
	}
	
}
