package capgtraining;

public class Counter {
	
	private int value;
	public static int instances;
	
	public Counter() {
		instances++;
	}

	void increment() {
		this.value++;
	}
	
	void decrement() {
		this.value--;
	}
	
	int getValue() {
		return this.value;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter a = new Counter();
		Counter b = new Counter();
		Counter c = new Counter();
//	    System.out.println(a.getValue());
//	    System.out.println(b.getValue());
//	    System.out.println(c.getValue());
		System.out.println(Counter.instances); // 3
	}

}
