package org.bluebride.design_pattern._04_action.mediator.interfac;

/**
 * 抽象的同事类
 * 
 * @author lingwh
 *
 */
public interface Colleague {

	void insert(String data);

	void insertSafe(Mediator mediator, String data);
}
