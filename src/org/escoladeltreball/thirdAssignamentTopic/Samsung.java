/**
 * 
 */
package org.escoladeltreball.thirdAssignamentTopic;

/**
 * @author iaw39397876
 *
 */
public final class Samsung extends Tablet {

	/**
	 * @param marca
	 * @param model
	 * @param speed
	 */
	public Samsung(String marca, String model, int speed) {
		super(marca, model, speed);
	}
	
	/**
	 * @param marca
	 * @param model
	 */
	public Samsung(String marca, String model) {
		this(marca, model, 150);
	}

	/* (non-Javadoc)
	 * @see org.escoladeltreball.thirdassignmenttopic.Device#turnOff()
	 */
	@Override
	public void turnOff() {
		System.out.println("Turning off Samsung tablet");

	}

}
