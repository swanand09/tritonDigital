package kow.tritonDigital.Threads;
/**
 * 
 * @author Renghen
 * using volatile to have thread safe increment 
 */
public class VolatileIncrement {
	private volatile int i;

	public VolatileIncrement(int i) {
		super();
		this.i = i;
	}

	public int inc() {
		i += 1;
		return i;
	}
}
