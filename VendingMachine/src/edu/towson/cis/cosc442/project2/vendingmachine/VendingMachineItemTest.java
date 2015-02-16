package edu.towson.cis.cosc442.project2.vendingmachine;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
/*
 * Unit test class of VendingMachineItem
 */
public class VendingMachineItemTest {
	//Declaring objects for the test
	VendingMachineItem item1, item2, item3;
	
	/*
	 * Initialize the test objects for the test class
	 */
	@Before
	public void setUp() throws Exception {
		item1 = new VendingMachineItem("Snickers", 1.25);
		item2 = new VendingMachineItem("Swedish Fish", 1.50);
	}
	
	/*
	 * Test to raise an exception when a price of 0 is passed to the constructor
	 */
	@Test(expected = VendingMachineException.class)
	public void testVendingMachineException(){
		item3 = new VendingMachineItem("Cinnabon", 0);
	}
	
	/*
	 * Test the getName method of the VendingMachineItem class
	 */
	@Test
	public void testGetName(){
		assertEquals("Snickers", item1.getName());
		assertEquals("Swedish Fish", item2.getName());
	}
	/*
	 * Test the getPrice method of the VendingMachineItem class
	 */
	@Test
	public void testGetPrice(){
		assertEquals(1.25, item1.getPrice(), 0.01);
		assertEquals(1.50, item2.getPrice(), 0.01);
	}
	
	
	/*
	 * Clean up objects after test cases have been executed
	 */
	@After
	public void tearDown(){
		item1 = null;
		item2 = null;
		item3 = null;
	}
}
