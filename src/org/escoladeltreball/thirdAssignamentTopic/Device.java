/**
 * 
 */
package org.escoladeltreball.thirdAssignamentTopic;

/**
 * @author iaw39397876
 *
 */
public interface Device extends Cloneable{

	/**
	 * Turns device on
	 */
	public abstract void turnOn();

	/**
	 * Turns device off
	 */
	public abstract void turnOff();
	
	/**
	 * Causes device to over clock
	 * @return the overclocked speed
	 * @throws Exception
	 */
	public abstract int overClock() throws Exception;

}
