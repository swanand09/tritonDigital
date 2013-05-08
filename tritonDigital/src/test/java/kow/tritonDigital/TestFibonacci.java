package kow.tritonDigital;

import org.junit.Test;

public class TestFibonacci {
	@Test
	public void fiboPass() {
	    org.junit.Assert.assertEquals("must be true", 6765, Fibonacci.getFibo(20));
	  }	
}
