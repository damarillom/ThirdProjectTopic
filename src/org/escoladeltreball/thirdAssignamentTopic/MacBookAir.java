/**
 * 
 */
package org.escoladeltreball.thirdAssignamentTopic;

/**
 * @author iaw39397876
 *
 */
public final class MacBookAir extends Laptop {

	/**
	 * @param marca
	 * @param model
	 * @param speed
	 */
	public MacBookAir(String marca, String model, int speed) {
		super(marca, model, speed, LaptopType.LIGHT);
	}
	
	/**
	 * @param marca
	 * @param model
	 */
	public MacBookAir(String marca, String model) {
		this(marca, model, 367);
	}

	/* (non-Javadoc)
	 * @see org.escoladeltreball.thirdassignmenttopic.Device#turnOff()
	 */
	@Override
	public void turnOff() {
		System.out.println("closing mac smoothly");
	}

}
