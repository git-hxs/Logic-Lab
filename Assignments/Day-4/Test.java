package capgtraining;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		AccessDemo.methodone();
////		AccessDemo.methodtwo(); //Not accessible
//		AccessDemo.methodthree();
//		AccessDemo.methodfour();
		
		//for singleton_logger check
		SingletonLogger l1 = SingletonLogger.getInstance();
		SingletonLogger l2 = SingletonLogger.getInstance();
		System.out.println(l1 == l2); // truel1.log("Started");
		l1.log("Running");
		l2.log("running");
	}

}
