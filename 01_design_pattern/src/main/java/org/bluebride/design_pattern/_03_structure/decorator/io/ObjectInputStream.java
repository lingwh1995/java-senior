package org.bluebride.design_pattern._03_structure.decorator.io;

public class ObjectInputStream extends InputStream {

	@Override
	public int read() {
		System.out.println("ObjectInputStream read...");
		return 0;
	}

}
