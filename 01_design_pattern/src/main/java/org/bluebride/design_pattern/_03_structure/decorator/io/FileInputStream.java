package org.bluebride.design_pattern._03_structure.decorator.io;

public class FileInputStream extends InputStream {

	@Override
	public int read() {
		System.out.println("FileInputStream read...");
		return 0;
	}

}
