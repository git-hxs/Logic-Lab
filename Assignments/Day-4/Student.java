package capgtraining;

public class Student {
	
	final int id;
	private String name;
	
	public Student(int id) {
		this.id=id;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student(101);
		s.setName("Alice");
		System.out.println(s.getId()); // 101
		// s.id = 202; // should not compile
	}

}
