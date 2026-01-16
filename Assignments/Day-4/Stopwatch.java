package capgtraining;

public class Stopwatch {
	
	private boolean running;
	private int ticks;
	
	public void start() {
		running=true;
	}
	
	public void stop() {
		running =false;
	}
	
	public void reset() {
		ticks=0;
	}
	
	public int elapsed() {
		return ticks;
	}
	
	public boolean isRunning() {
		if(running == true)
			return true;
		return false;
	}
	
	public void incrementTick() {
		ticks++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stopwatch sw = new Stopwatch();
		sw.start();
		for (int i = 0; i < 1000; i++) { // simulate ticks
		    if (sw.isRunning()) { // optional helper if you add it
		        sw.incrementTick(); // or encapsulate tick logic inside start/stop
		    }
		}
		sw.stop();
		System.out.println(sw.elapsed()); // expected: 1000
		sw.reset();
	}

}
