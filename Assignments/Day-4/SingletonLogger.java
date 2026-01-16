package capgtraining;

public class SingletonLogger {
	
	private static SingletonLogger instance;
	
	private SingletonLogger() {
		
	}
	
	private static final String PREFIX = "[APP] ";
	
	public static SingletonLogger getInstance() {
		if(instance==null) {
			instance=new SingletonLogger();
		}
		return instance;
	}
	
	public void log(String msg) {
		System.out.println(PREFIX+msg);
	}
}
