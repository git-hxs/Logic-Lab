package capgtraining;

public class User { //For IDGenerator class
	
	private final int id;
	String name;
	
	public User(String name) {
		this.id=IDGenerator.nextId();
		this.name=name;
	}
	
	public int getId() {
		return this.id;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User u1 = new User("A");
		User u2 = new User("B");
		System.out.println(u1.getId()); // 1000
		System.out.println(u2.getId()); // 1001Show more lines
	}

}
