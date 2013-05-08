package kow.tritonDigital.Threads;
/**
 * 
 * 
 * @author Renghen
 * safe increment using locks and monitors
 */
public class LockIncrement {
	private int i;
	
	private static Object object = new Object();

	public LockIncrement(int i) {
		super();
		this.i = i;
	}

	public synchronized int inc() {
		i += 1;
		return i;
	}
	
	public int incLock(){
		synchronized (object) {
			i += 1;
			return i;
		}
	}
}
