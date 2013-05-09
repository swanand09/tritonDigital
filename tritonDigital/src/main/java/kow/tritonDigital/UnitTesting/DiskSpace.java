package kow.tritonDigital.unitTesting;

import java.io.File;

public class DiskSpace {
	public static boolean canWrite(long bytesToWrite){				
		return canWrite(".",bytesToWrite);
	}
	
	public static boolean canWrite(String path, long bytesToWrite){
		File file = new File(path);
		long freeSpace = file.getFreeSpace();		
		return (bytesToWrite > freeSpace) ? false : true;				
	}

}
