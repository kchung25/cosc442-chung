package edu.towson.cis.cosc442.project4.coffeemaker;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>InventoryTest</code> contains tests for the class <code>{@link Inventory}</code>.
 *
 * @generatedBy CodePro at 3/22/15 5:27 PM
 * @author Kenway Chung
 * @version $Revision: 1.0 $
 */
public class InventoryTest {
	/**
	 * Run the Inventory() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/15 5:27 PM
	 */
	@Test
	public void testInventory_1()
		throws Exception {

		Inventory result = new Inventory();

		// add additional test code here
		assertNotNull(result);
		assertEquals("Coffee: 15\r\nMilk: 15\r\nSugar: 15\r\nChocolate: 15\r\n", result.toString());
		assertEquals(15, result.getCoffee());
		assertEquals(15, result.getChocolate());
		assertEquals(15, result.getSugar());
		assertEquals(15, result.getMilk());
	}

	/**
	 * Run the boolean enoughIngredients(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/15 5:27 PM
	 */
	@Test
	public void testEnoughIngredients_1()
		throws Exception {
		Inventory fixture = new Inventory();
		Recipe r = new Recipe();
		r.setAmtCoffee(50);
		boolean result = fixture.enoughIngredients(r);

		// add additional test code here
		assertFalse(result);
	}

	/**
	 * Run the boolean enoughIngredients(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/15 5:27 PM
	 */
	@Test
	public void testEnoughIngredients_2()
		throws Exception {
		Inventory fixture = new Inventory();
		Recipe r = new Recipe();
		r.setAmtMilk(50);
		boolean result = fixture.enoughIngredients(r);

		// add additional test code here
		assertFalse(result);
	}
	
	@Test
	public void testEnoughIngredients_3()
		throws Exception {
		Inventory fixture = new Inventory();
		Recipe r = new Recipe();
		r.setAmtSugar(50);
		boolean result = fixture.enoughIngredients(r);

		// add additional test code here
		assertFalse(result);
	}
	
	@Test
	public void testEnoughIngredients_4()
		throws Exception {
		Inventory fixture = new Inventory();
		Recipe r = new Recipe();
		r.setAmtChocolate(50);
		boolean result = fixture.enoughIngredients(r);

		// add additional test code here
		assertFalse(result);
	}
	
	@Test
	public void testEnoughIngredients_5()
		throws Exception {
		Inventory fixture = new Inventory();
		Recipe r = new Recipe();
		r.setAmtCoffee(15);
		boolean result = fixture.enoughIngredients(r);

		// add additional test code here
		assertTrue(result);
	}
	
	@Test
	public void testEnoughIngredients_6()
		throws Exception {
		Inventory fixture = new Inventory();
		Recipe r = new Recipe();
		r.setAmtMilk(15);
		boolean result = fixture.enoughIngredients(r);

		// add additional test code here
		assertTrue(result);
	}
	
	@Test
	public void testEnoughIngredients_7()
		throws Exception {
		Inventory fixture = new Inventory();
		Recipe r = new Recipe();
		r.setAmtSugar(15);
		boolean result = fixture.enoughIngredients(r);

		// add additional test code here
		assertTrue(result);
	}
	
	@Test
	public void testEnoughIngredients_8()
		throws Exception {
		Inventory fixture = new Inventory();
		Recipe r = new Recipe();
		r.setAmtChocolate(15);
		boolean result = fixture.enoughIngredients(r);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the int getChocolate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/15 5:27 PM
	 */
	@Test
	public void testGetChocolate_1()
		throws Exception {
		Inventory fixture = new Inventory();

		int result = fixture.getChocolate();

		// add additional test code here
		assertEquals(15, result);
	}

	/**
	 * Run the int getCoffee() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/15 5:27 PM
	 */
	@Test
	public void testGetCoffee_1()
		throws Exception {
		Inventory fixture = new Inventory();

		int result = fixture.getCoffee();

		// add additional test code here
		assertEquals(15, result);
	}

	/**
	 * Run the int getMilk() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/15 5:27 PM
	 */
	@Test
	public void testGetMilk_1()
		throws Exception {
		Inventory fixture = new Inventory();

		int result = fixture.getMilk();

		// add additional test code here
		assertEquals(15, result);
	}

	/**
	 * Run the int getSugar() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/15 5:27 PM
	 */
	@Test
	public void testGetSugar_1()
		throws Exception {
		Inventory fixture = new Inventory();

		int result = fixture.getSugar();

		// add additional test code here
		assertEquals(15, result);
	}

	/**
	 * Run the void setChocolate(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/15 5:27 PM
	 */
	@Test
	public void testSetChocolate_1()
		throws Exception {
		Inventory fixture = new Inventory();
		int chocolate = -1;

		fixture.setChocolate(chocolate);

		// add additional test code here
		assertTrue(fixture.getChocolate() == 0);
	}

	/**
	 * Run the void setChocolate(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/15 5:27 PM
	 */
	@Test
	public void testSetChocolate_2()
		throws Exception {
		Inventory fixture = new Inventory();
		int chocolate = 1;

		fixture.setChocolate(chocolate);

		// add additional test code here
		assertTrue(fixture.getChocolate() == 1);
	}

	@Test
	public void testSetChocolate_3()
		throws Exception {
		Inventory fixture = new Inventory();
		int chocolate = 0;

		fixture.setChocolate(chocolate);
		
		assertTrue(fixture.getChocolate() == 0);
	}

	/**
	 * Run the void setCoffee(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/15 5:27 PM
	 */
	@Test
	public void testSetCoffee_1()
		throws Exception {
		Inventory fixture = new Inventory();
		int coffee = -1;

		fixture.setCoffee(coffee);

		// add additional test code here
		assertTrue(fixture.getCoffee() == 0);
	}

	/**
	 * Run the void setCoffee(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/15 5:27 PM
	 */
	@Test
	public void testSetCoffee_2()
		throws Exception {
		Inventory fixture = new Inventory();
		int coffee = 1;

		fixture.setCoffee(coffee);

		// add additional test code here
		assertTrue(fixture.getCoffee() == 1);
	}

	@Test
	public void testSetCoffee_3()
		throws Exception {
		Inventory fixture = new Inventory();
		int coffee = 0;
		
		fixture.setCoffee(coffee);
		
		assertTrue(fixture.getCoffee() == 0);
	}

	/**
	 * Run the void setMilk(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/15 5:27 PM
	 */
	@Test
	public void testSetMilk_1()
		throws Exception {
		Inventory fixture = new Inventory();
		int milk = -1;

		fixture.setMilk(milk);

		// add additional test code here
		assertTrue(fixture.getMilk() == 0);
	}
	

	/**
	 * Run the void setMilk(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/15 5:27 PM
	 */
	@Test
	public void testSetMilk_2()
		throws Exception {
		Inventory fixture = new Inventory();
		int milk = 1;

		fixture.setMilk(milk);

		// add additional test code here
		assertTrue(fixture.getMilk() == 1);
	}

	@Test
	public void testSetMilk_3()
		throws Exception {
		Inventory fixture = new Inventory();
		int milk = 0;
		fixture.setMilk(milk);
		
		assertTrue(fixture.getMilk() == 0);
	}

	/**
	 * Run the void setSugar(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/15 5:27 PM
	 */
	@Test
	public void testSetSugar_1()
		throws Exception {
		Inventory fixture = new Inventory();
		int sugar = -1;

		fixture.setSugar(sugar);

		// add additional test code here
		assertTrue(fixture.getSugar() == 0);
	}

	/**
	 * Run the void setSugar(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/15 5:27 PM
	 */
	@Test
	public void testSetSugar_2()
		throws Exception {
		Inventory fixture = new Inventory();
		int sugar = 1;

		fixture.setSugar(sugar);

		// add additional test code here
		assertTrue(fixture.getSugar() == sugar);
	}

	@Test
	public void testSetSugar_3()
		throws Exception {
		Inventory fixture = new Inventory();
		int sugar = 0;
		fixture.setSugar(sugar);
		
		assertTrue(fixture.getSugar() == sugar);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/15 5:27 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		Inventory fixture = new Inventory();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("Coffee: 15\r\nMilk: 15\r\nSugar: 15\r\nChocolate: 15\r\n", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 3/22/15 5:27 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 3/22/15 5:27 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 3/22/15 5:27 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(InventoryTest.class);
	}
}