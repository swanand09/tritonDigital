package kow.tritonDigital.Threads;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIncrement {
	private AtomicInteger ai;

	public AtomicIncrement(int i) {		
		this.ai = new AtomicInteger(i);		
	}
	
	public int inc() {
		return ai.incrementAndGet();		
	}
}
