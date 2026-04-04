package org.bluebride.design_pattern._04_action.command.command_1;

/**
 * Receiver
 * @author lingwh
 *
 */
public class LightCommandReceiver {
	
	public void on() {
		System.out.println("打开电灯...");
	}
	
	
	public void off() {
		System.out.println("关闭电灯...");
	}
}
