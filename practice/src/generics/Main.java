package generics;

public class Main {

	public static void main(String[] args) {
		
		GenericsPrinter<String, Integer> printer = new GenericsPrinter<>();
		System.out.println(printer.getMessage("안녕하세요", 50));
		
		// 파라미터에 클래스도 넣을 수 있음
		
//		GenericPrintMessage<Integer> gpi = new GenericPrintMessage<>();
//		// 정의한 제네릭 대로 파라미터 들어가야 함 (같은 제네릭 타입)
//		gpi.print(123);
//		
//		GenericPrintMessage<String> gps = new GenericPrintMessage<>();
//		gps.print("안녕하세요");

		GenericPrintMessage gpi = new GenericPrintMessage();
		// 정의한 제네릭 대로 파라미터 들어가야 함 (같은 제네릭 타입)
		gpi.print(123);
		
		GenericPrintMessage gps = new GenericPrintMessage();
		gps.print("안녕하세요");
		
		System.out.println("=".repeat(30));
		Scores<Integer> scores = new Scores<>(3);
		
		scores.add(1);
		scores.add(2);
		//scores.add(3); // 안채우면 null로 들어감
		scores.printElements();
		System.out.println(scores.get(0));
		
		System.out.println("=".repeat(30));
		Scores<String> scoresString = new Scores<>(3);
		
		scoresString.add("안녕");
		//scoresString.add(2); 에러남
		//scores.add(3); // 안채우면 null로 들어감
		scoresString.printElements();
		System.out.println(scoresString.get(0));
		
		

	}
}
