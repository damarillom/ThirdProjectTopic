/**
 * 
 */
package org.escoladeltreball.thirdAssignamentTopic;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author iaw26509397
 *
 */
public class WindowsBasedLaptopTest {

	WindowsBasedLaptop win;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		win = new WindowsBasedLaptop("Windows", "10", 100);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		win = null;
	}

	/**
	 * Test method for {@link org.escoladeltreball.thirdAssignamentTopic.DeviceImpl#overClock()}.
	 */
	@Test
	public final void testOverClock() throws Exception  {
		assertEquals(150, win.overClock());
	}

}
