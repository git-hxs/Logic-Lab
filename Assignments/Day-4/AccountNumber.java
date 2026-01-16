package capgtraining;

public class AccountNumber {
	
	public final String digits;
	
	public AccountNumber(String s) {
		if(isValid(s))
			this.digits=s;
		else {
			digits="000000000000";
			System.out.println("Invalid account number");
		}
	}
	
	public static boolean isValid(String s) {
		if(s.length()!=12)
			return false;
		for(int i=0;i<s.length();i++) {
			if(!Character.isDigit(s.charAt(i)))
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountNumber a = new AccountNumber("123456789012"); // valid
		AccountNumber b = new AccountNumber("ABC");          // prints invalid, uses default
		System.out.println(a.digits);
		System.out.println(b.digits);
	}

}
