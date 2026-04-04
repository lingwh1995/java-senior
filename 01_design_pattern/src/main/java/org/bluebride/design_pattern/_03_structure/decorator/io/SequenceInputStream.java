package org.bluebride.design_pattern._03_structure.decorator.io;

public class SequenceInputStream extends InputStream {

	@Override
	public int read() {
		System.out.println("SequenceInputStream read...");
		return 0;
	}

}
