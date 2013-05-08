package kow.tritonDigital.UnitTesting;

import java.io.File;

import org.junit.Test;
import org.junit.Assert;

public class TestEnoughSpace {

	private File file = new File(".");
	private long freeBytes = file.getFreeSpace();

	@Test
	public void testHaveSpace() {
		Assert.assertEquals("trying to write 1 byte in a freespace of "
				+ freeBytes + "bytes", true, DiskSpace.canWrite(1));
	}

	@Test
	public void testNotEnough() {
		Assert.assertEquals("trying to write " + (freeBytes + 1)
				+ " bytes in a freespace of " + freeBytes + "bytes", false,
				DiskSpace.canWrite(freeBytes + 1));
	}

}
