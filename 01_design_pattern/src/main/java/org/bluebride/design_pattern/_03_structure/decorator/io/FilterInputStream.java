package org.bluebride.design_pattern._03_structure.decorator.io;


/**
 * 装饰者
 * @author lingwh
 *
 */
public class FilterInputStream extends InputStream {
	
	protected InputStream in;
	
    protected FilterInputStream(InputStream in) {
        this.in = in;
    }
    
	@Override
	public int read() {
		return in.read();
	}

}
