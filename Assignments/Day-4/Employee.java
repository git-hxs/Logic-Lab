package capgtraining;

public class Employee {
	
	private String name;
	private double salary;
	
	void setName(String name) {
		if(name!=null)
		this.name=name;
		else
			System.out.println("Cannot be empty");
	}
	
	void setSalary(double salary) {
		if(salary>=10000&&salary<=500000)
		this.salary=salary;
		else
			System.out.println("Invalid");
	}
	
	void raise(double percent) {
		if(percent<=100&&percent>=0) {
			this.salary+=(percent/100)*this.salary;
		}
		else
		System.out.println("Invalid");
	}
	
	double getSalary() {
		return this.salary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		e.setName("");          // prints 
		e.setSalary(9000);      // prints 
		System.out.println(e.getSalary());
		e.setSalary(120000);
		System.out.println(e.getSalary());
		e.raise(10);            // salary -> 132000
		System.out.println(e.getSalary());
		e.raise(200);           // prints invalid
		System.out.println(e.getSalary());
	}

}
