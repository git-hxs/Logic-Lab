package capgtraining;

public class BankAccount {
	
	private String owner;
	private double balance;
	
	public BankAccount(String owner, double balance) {
		this.owner=owner;
		this.balance=balance;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public String getOwner() {
		return this.owner;
	}
	
	void deposit(double amount) {
		if(amount>0)
			this.balance+=amount;
		else
			System.out.println("Invalid amount");
	}
	
	void withdraw(double amount) {
		if(amount<=this.balance)
			this.balance-=amount;
		else
			System.out.println("Insufficient Balance");
	}
	
	protected void applyFee(double fee) {
		System.out.println("To simulate internal fee. For a future subclass to implement");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount acc = new BankAccount("Sarthak", 1000.0);
		acc.deposit(500);acc.withdraw(300);
		System.out.println(acc.getOwner());
		System.out.println(acc.getBalance()); // 1200.0 
	}

}
