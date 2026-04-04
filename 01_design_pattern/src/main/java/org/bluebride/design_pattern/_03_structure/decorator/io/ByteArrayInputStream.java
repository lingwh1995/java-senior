package org.bluebride.design_pattern._03_structure.decorator.io;

public class ByteArrayInputStream extends InputStream {

	@Override
	public int read() {
		System.out.println("ByteArrayInputStream read...");
		return 0;
	}

}
