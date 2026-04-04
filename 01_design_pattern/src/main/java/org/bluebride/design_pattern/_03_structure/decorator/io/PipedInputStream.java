package org.bluebride.design_pattern._03_structure.decorator.io;

public class PipedInputStream extends InputStream {

	@Override
	public int read() {
		System.out.println("PipedInputStream read...");
		return 0;
	}

}
