/**
 * 
 */
package org.escoladeltreball.thirdAssignamentTopic;

/**
 * @author iaw39397876
 *
 */
public abstract class Tablet extends DeviceImpl {

	/**
	 * @param marca
	 * @param model
	 * @param speed
	 */
	public Tablet(String marca, String model, int speed) {
		super(marca, model, speed);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see org.escoladeltreball.thirdassignmenttopic.Device#turnOn()
	 */
	@Override
	public void turnOn() {
		System.out.println("Turning on tablet");

	}


}
