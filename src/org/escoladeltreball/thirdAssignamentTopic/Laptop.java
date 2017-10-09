/**
 * 
 */
package org.escoladeltreball.thirdAssignamentTopic;

/**
 * @author iaw39397876
 *
 */
public abstract class Laptop extends DeviceImpl {

	private LaptopType type;
	/**
	 * @param marca
	 * @param model
	 * @param speed
	 */
	public Laptop(String marca, String model, int speed, LaptopType type) {
		super(marca, model, speed);
		this.type = type;
	}

	/* (non-Javadoc)
	 * @see org.escoladeltreball.thirdassignmenttopic.Device#turnOn()
	 */
	@Override
	public void turnOn() {
		System.out.println("turning on device");
	}

}
