/**
 * 
 */
package org.escoladeltreball.thirdAssignamentTopic;

/**
 * @author iaw39397876
 *
 */
public class WindowsBasedLaptop extends Laptop {

	/**
	 * @param marca
	 * @param model
	 * @param speed
	 */
	public WindowsBasedLaptop(String marca, String model, int speed) {
		super(marca, model, speed, LaptopType.HEAVY);
	}
	
	/**
	 * @param marca
	 * @param model
	 */
	public WindowsBasedLaptop(String marca, String model) {
		this(marca, model, 399);
	}

	/* (non-Javadoc)
	 * @see org.escoladeltreball.thirdassignmenttopic.Device#turnOff()
	 */
	@Override
	public void turnOff() {
		System.out.println("clicking inicio to turn off");

	}

}
