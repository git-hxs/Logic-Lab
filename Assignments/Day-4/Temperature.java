package capgtraining;

public class Temperature {
	
	private final double celsius;
	
	public Temperature(double celsius) {
		this.celsius=celsius;
	}
	
	public double toFahrenheit() {
		return (this.celsius*1.8)+32;
	}
	
	public Temperature withCelsius(double c) {
		return new Temperature(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Temperature t = new Temperature(25.0);
		System.out.println(t.toFahrenheit()); // 77.0
		Temperature t2 = t.withCelsius(30.0); // t unchanged
		System.out.println(t.toFahrenheit());   // 77.0 (unchanged)
        System.out.println(t2.toFahrenheit());
	}

}
