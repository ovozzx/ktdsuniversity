package generics;

public class Scores<A> {
	
	private Object[] scores;
	private int size;
	
	public Scores(int limitsize) {
		this.scores = new Object[limitsize];
	}

	public void add(A value) {
		this.scores[this.size++] = value;
	}
	
	public A get(int index) {
		return (A) this.scores[index];
	}
	
	public void printElements() {
		
		for(Object each : this.scores) {
			System.out.println(each);
		}
		
	}
}
