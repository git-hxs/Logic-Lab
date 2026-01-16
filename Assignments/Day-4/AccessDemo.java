package capgtraining;

public class AccessDemo {
	public static void methodone() {
		System.out.println("This is a public method");
	}
	private static void methodtwo(){
		System.out.println("This is a private method");
	}
	protected static void methodthree() {
		System.out.println("This is a protected method");
	}
	static void methodfour() {
		System.out.println("This is a default method");
	}
}
