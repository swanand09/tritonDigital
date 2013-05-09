package kow.tritonDigital.map;

import org.junit.Test;

public class TestTritonMap {
	@Test
	public void testNumberOfPutsAndGets() {
		TritonMap<String, String> somemap = new TritonMap<String, String>();
		somemap.put("a", "1");
		somemap.put("b", "2");
		somemap.put("c", "3");
		somemap.put("d", "4");
		somemap.get("c");
		somemap.get("c");
		somemap.get("a");
	    org.junit.Assert.assertEquals("must be true", 4, somemap.getNumberOfPuts());
	    org.junit.Assert.assertEquals("must be true", 3, somemap.getNumberOfGets());
	  }
}
