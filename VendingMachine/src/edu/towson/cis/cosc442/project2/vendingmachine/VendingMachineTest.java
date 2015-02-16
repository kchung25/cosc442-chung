package edu.towson.cis.cosc442.project2.vendingmachine;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class VendingMachineTest {
	//Declaring test objects for the test cases
	VendingMachine emptyVM, fullVM;
	VendingMachineItem itemA, itemB, itemC, itemD;
	
	/*
	 * Initialize test objects for the test cases
	 */
	@Before
	public void setUp() throws Exception{
		emptyVM = new VendingMachine();
		fullVM = new VendingMachine();
		itemA = new VendingMachineItem("Skittles", 1.25);
		itemB = new VendingMachineItem("M&M", 1.00);
		itemC = new VendingMachineItem("Starburst", 1.25);
		itemD = new VendingMachineItem("Fritos", 1.50);
		fullVM.addItem(itemA, "A");
		fullVM.addItem(itemB, "B");
		fullVM.addItem(itemC, "C");
		fullVM.addItem(itemD, "D");
	}
	
	/*
	 * Test for the addItem method of the VendingMachine class
	 */
	@Test
	public void testAddItem(){
		emptyVM.addItem(itemA, "A");
		assertEquals(itemA, emptyVM.getItem("A"));
		emptyVM.addItem(itemB, "B");
		assertEquals(itemB, emptyVM.getItem("B"));
	}
	
	/*
	 * Test for the addItem method to throw an exception for an occupied slot
	 */
	
	@Test(expected = VendingMachineException.class)
	public void testAddItemVendingMachineOccupiedException(){
		fullVM.addItem(itemA, "A");
	}
	
	/*
	 * Test for the addItem method to throw an exception for an invalid code
	 */
	@Test(expected = VendingMachineException.class)
	public void testAddItemVendingMachineInvalidCodeException(){
		emptyVM.addItem(itemC, "Z");
	}
	
	/*
	 * Test for the removeItem method in the VendingMachine class
	 */
	@Test
	public void testRemoveItem(){
		assertEquals(itemD, fullVM.removeItem("D"));
	}
	
	/*
	 * Test for the removeItem method to throw an exception for an empty slot
	 */
	@Test(expected = VendingMachineException.class)
	public void testRemoveItemEmptySlotException(){
		emptyVM.removeItem("A");
	}
	
	/*
	 * Test for the insertMoney method for the VendingMachine class
	 */
	@Test
	public void testInsertMoney(){
		fullVM.insertMoney(1.00);
		assertEquals(1.00, fullVM.getBalance(), 0.01);
		fullVM.insertMoney(0.50);
		assertEquals(1.50, fullVM.getBalance(), 0.01);
	}
	
	/*
	 * Test for the insertMoney method to throw an exception for an amount <= 0
	 */
	
	@Test(expected = VendingMachineException.class)
	public void testInsertMoneyInvalidMoneyException(){
		fullVM.insertMoney(0.00);
		fullVM.insertMoney(-1.00);
	}
	
	/*
	 * Test for the getBalance method in the VendingMachine class
	 */
	
	@Test
	public void testGetBalance(){
		assertEquals(0, fullVM.getBalance(), 0.01);
		fullVM.insertMoney(2.00);
		assertEquals(2.00,fullVM.getBalance(), 0.01);
	}
	
	/*
	 * Test for the makePurchase method in the VendingMachine class
	 */
	@Test
	public void testMakePurchase(){
		fullVM.insertMoney(1.25);
		assertTrue(fullVM.makePurchase("A"));
		fullVM.insertMoney(1.00);
		assertTrue(fullVM.makePurchase("B"));
		fullVM.insertMoney(1.25);
		assertTrue(fullVM.makePurchase("C"));
		fullVM.insertMoney(1.50);
		assertTrue(fullVM.makePurchase("D"));
		assertFalse(fullVM.makePurchase("A"));
		assertFalse(fullVM.makePurchase("B"));
		assertFalse(fullVM.makePurchase("C"));
		assertFalse(fullVM.makePurchase("D"));
	}
	
	/*
	 * Test for the returnChange method in the VendingMachine class
	 */
	@Test
	public void testReturnChange(){
		emptyVM.insertMoney(1.00);
		assertEquals(1.00, emptyVM.returnChange(), 0.01);
		assertEquals(0, emptyVM.getBalance(), 0.01);
	}
	
	/*
	 *  Clean up test objects after test cases have been executed
	 */
	@After
	public void tearDown(){
		emptyVM = null;
		fullVM = null;
		itemA = null;
		itemB = null;
		itemC = null;
		itemD = null;
	}
}
