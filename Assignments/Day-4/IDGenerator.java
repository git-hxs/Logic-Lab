package capgtraining;

public class IDGenerator { //For User class
	
	private static int next=1000;
	
	public static int nextId() {
		return next++;
	}
}
