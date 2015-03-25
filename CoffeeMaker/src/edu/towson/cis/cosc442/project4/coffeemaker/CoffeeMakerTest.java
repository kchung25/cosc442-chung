package edu.towson.cis.cosc442.project4.coffeemaker;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>CoffeeMakerTest</code> contains tests for the class <code>{@link CoffeeMaker}</code>.
 *
 * @generatedBy CodePro at 3/22/15 5:24 PM
 * @author Kenway Chung
 * @version $Revision: 1.0 $
 */
public class CoffeeMakerTest {
	CoffeeMaker fullRecipes, noRecipes, oneRecipe;
	Recipe r1, r2, r3, r4, coffee;
	
	/**
	 * Run the CoffeeMaker() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/15 5:24 PM
	 */
	@Test
	public void testCoffeeMaker_1()
		throws Exception {

		CoffeeMaker result = new CoffeeMaker();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CoffeeMaker() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/15 5:24 PM
	 */
	@Test
	public void testCoffeeMaker_2()
		throws Exception {

		CoffeeMaker result = new CoffeeMaker();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean addInventory(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/15 5:24 PM
	 */
	@Test
	public void testAddInventory_1()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		int amtCoffee = 1;
		int amtMilk = 1;
		int amtSugar = 0;
		int amtChocolate = -1;

		boolean result = fixture.addInventory(amtCoffee, amtMilk, amtSugar, amtChocolate);

		// add additional test code here
		assertFalse(result);
		
	}


	/**
	 * Run the boolean addInventory(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/15 5:24 PM
	 */
	@Test
	public void testAddInventory_2()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		int amtCoffee = -1;
		int amtMilk = 1;
		int amtSugar = 1;
		int amtChocolate = 1;

		boolean result = fixture.addInventory(amtCoffee, amtMilk, amtSugar, amtChocolate);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean addInventory(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/15 5:24 PM
	 */
	@Test
	public void testAddInventory_3()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		int coffeeBeforeAdd = fixture.checkInventory().getCoffee();
		int milkBeforeAdd = fixture.checkInventory().getMilk();
		int sugarBeforeAdd = fixture.checkInventory().getSugar();
		int chocolateBeforeAdd = fixture.checkInventory().getChocolate();
		int amtCoffee = 10;
		int amtMilk = 5;
		int amtSugar = 5;
		int amtChocolate = 10;

		boolean result = fixture.addInventory(amtCoffee, amtMilk, amtSugar, amtChocolate);

		// add additional test code here
		assertEquals(true, result);
		assertTrue(fixture.checkInventory().getCoffee() > coffeeBeforeAdd);
		assertTrue(fixture.checkInventory().getMilk() > milkBeforeAdd);
		assertTrue(fixture.checkInventory().getSugar() > sugarBeforeAdd);
		assertTrue(fixture.checkInventory().getChocolate() > chocolateBeforeAdd);
	}

	/**
	 * Run the boolean addInventory(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/15 5:24 PM
	 */
	@Test
	public void testAddInventory_4()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		int amtCoffee = 0;
		int amtMilk = 0;
		int amtSugar = 0;
		int amtChocolate = 0;

		boolean result = fixture.addInventory(amtCoffee, amtMilk, amtSugar, amtChocolate);

		// add additional test code here
		assertTrue(result);
	}


	/**
	 * Run the boolean addRecipe(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/15 5:24 PM
	 */
	@Test
	public void testAddRecipe1()
		throws Exception {
		//CoffeeMaker fixture = new CoffeeMaker();
		Recipe r = new Recipe();
		r.setName("Coffee");
		r.setPrice(50);
		r.setAmtCoffee(3);
		r.setAmtMilk(1);
		r.setAmtSugar(1);
		r.setAmtChocolate(0);
		boolean result = noRecipes.addRecipe(r);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean addRecipe(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/15 5:24 PM
	 */
	@Test
	public void testAddRecipe2()
		throws Exception {
		Recipe r = new Recipe();
		r.setName("Coffee");
		r.setPrice(50);
		r.setAmtCoffee(3);
		r.setAmtMilk(1);
		r.setAmtSugar(1);
		r.setAmtChocolate(0);
		boolean result = oneRecipe.addRecipe(r);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean addRecipe(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/15 5:24 PM
	 */
	@Test
	public void testAddRecipe3()
		throws Exception {
		Recipe r = new Recipe();
		r.setName("Mocha Latte");
		r.setPrice(150);
		r.setAmtCoffee(4);
		r.setAmtMilk(3);
		r.setAmtSugar(2);
		r.setAmtChocolate(3);
		boolean result = fullRecipes.addRecipe(r);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the Inventory checkInventory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/15 5:24 PM
	 */
	@Test
	public void testCheckInventory_1()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();

		Inventory result = fixture.checkInventory();

		// add additional test code here
		assertNotNull(result);
		assertEquals("Coffee: 15\r\nMilk: 15\r\nSugar: 15\r\nChocolate: 15\r\n", result.toString());
		assertEquals(15, result.getMilk());
		assertEquals(15, result.getSugar());
		assertEquals(15, result.getCoffee());
		assertEquals(15, result.getChocolate());
	}

	/**
	 * Run the boolean deleteRecipe(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/15 5:24 PM
	 */
	@Test
	public void testDeleteRecipe1()
		throws Exception {
		boolean result = oneRecipe.deleteRecipe(coffee);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean deleteRecipe(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/15 5:24 PM
	 */
	@Test
	public void testDeleteRecipe2()
		throws Exception {
		Recipe r = new Recipe();
		r.setName("Tea");
		r.setAmtCoffee(0);
		r.setAmtMilk(2);
		r.setAmtChocolate(0);
		r.setAmtSugar(3);
		boolean result = fullRecipes.deleteRecipe(r);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean doesRecipeExist(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/15 5:24 PM
	 */
	@Test
	public void testDoesRecipeExist_1()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		Recipe r = new Recipe();

		boolean result = fixture.doesRecipeExist(r);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean editRecipe(Recipe,Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/15 5:24 PM
	 */
	@Test
	public void testEditRecipe1()
		throws Exception {
		Recipe newRecipe = new Recipe();
		newRecipe.setName("Coffee");
		newRecipe.setAmtCoffee(3);
		newRecipe.setAmtMilk(1);
		newRecipe.setAmtSugar(1);
		newRecipe.setAmtChocolate(0);
		boolean result = oneRecipe.editRecipe(coffee, newRecipe);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean editRecipe(Recipe,Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/15 5:24 PM
	 */
	@Test
	public void testEditRecipe2()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		Recipe oldRecipe = new Recipe();
		Recipe newRecipe = new Recipe();

		boolean result = fixture.editRecipe(oldRecipe, newRecipe);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the Recipe getRecipeForName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/15 5:24 PM
	 */
	@Test
	public void testGetRecipeForName_1()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		String name = "";

		Recipe result = fixture.getRecipeForName(name);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.toString());
		assertEquals(null, result.getName());
		assertEquals(0, result.getPrice());
		assertEquals(0, result.getAmtCoffee());
		assertEquals(0, result.getAmtMilk());
		assertEquals(0, result.getAmtSugar());
		assertEquals(0, result.getAmtChocolate());
	}

	/**
	 * Run the Recipe getRecipeForName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/15 5:24 PM
	 */
	@Test
	public void testGetRecipeForName_2()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		String name = "";

		Recipe result = fixture.getRecipeForName(name);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.toString());
		assertEquals(null, result.getName());
		assertEquals(0, result.getPrice());
		assertEquals(0, result.getAmtCoffee());
		assertEquals(0, result.getAmtMilk());
		assertEquals(0, result.getAmtSugar());
		assertEquals(0, result.getAmtChocolate());
	}

	/**
	 * Run the Recipe getRecipeForName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/15 5:24 PM
	 */
	@Test
	public void testGetRecipeForName_3()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		String name = "";

		Recipe result = fixture.getRecipeForName(name);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.toString());
		assertEquals(null, result.getName());
		assertEquals(0, result.getPrice());
		assertEquals(0, result.getAmtCoffee());
		assertEquals(0, result.getAmtMilk());
		assertEquals(0, result.getAmtSugar());
		assertEquals(0, result.getAmtChocolate());
	}

	/**
	 * Run the Recipe getRecipeForName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/15 5:24 PM
	 */
	@Test
	public void testGetRecipeForName_4()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		String name = "";

		Recipe result = fixture.getRecipeForName(name);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.toString());
		assertEquals(null, result.getName());
		assertEquals(0, result.getPrice());
		assertEquals(0, result.getAmtCoffee());
		assertEquals(0, result.getAmtMilk());
		assertEquals(0, result.getAmtSugar());
		assertEquals(0, result.getAmtChocolate());
	}

	/**
	 * Run the Recipe[] getRecipes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/15 5:24 PM
	 */
	@Test
	public void testGetRecipes_1()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();

		Recipe[] result = fixture.getRecipes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(4, result.length);
		assertNotNull(result[0]);
		assertEquals(null, result[0].toString());
		assertEquals(null, result[0].getName());
		assertEquals(0, result[0].getPrice());
		assertEquals(0, result[0].getAmtCoffee());
		assertEquals(0, result[0].getAmtMilk());
		assertEquals(0, result[0].getAmtSugar());
		assertEquals(0, result[0].getAmtChocolate());
		assertNotNull(result[1]);
		assertEquals(null, result[1].toString());
		assertEquals(null, result[1].getName());
		assertEquals(0, result[1].getPrice());
		assertEquals(0, result[1].getAmtCoffee());
		assertEquals(0, result[1].getAmtMilk());
		assertEquals(0, result[1].getAmtSugar());
		assertEquals(0, result[1].getAmtChocolate());
		assertNotNull(result[2]);
		assertEquals(null, result[2].toString());
		assertEquals(null, result[2].getName());
		assertEquals(0, result[2].getPrice());
		assertEquals(0, result[2].getAmtCoffee());
		assertEquals(0, result[2].getAmtMilk());
		assertEquals(0, result[2].getAmtSugar());
		assertEquals(0, result[2].getAmtChocolate());
		assertNotNull(result[3]);
		assertEquals(null, result[3].toString());
		assertEquals(null, result[3].getName());
		assertEquals(0, result[3].getPrice());
		assertEquals(0, result[3].getAmtCoffee());
		assertEquals(0, result[3].getAmtMilk());
		assertEquals(0, result[3].getAmtSugar());
		assertEquals(0, result[3].getAmtChocolate());
	}

	/**
	 * Run the int makeCoffee(Recipe,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/15 5:24 PM
	 */
	@Test
	public void testMakeCoffee1()
		throws Exception {
		int amtPaid = 50;
		int amtCoffee = oneRecipe.checkInventory().getCoffee();
		int amtMilk = oneRecipe.checkInventory().getMilk();
		int amtSugar = oneRecipe.checkInventory().getSugar();
		int amtChocolate = oneRecipe.checkInventory().getChocolate();
		int result = oneRecipe.makeCoffee(coffee, amtPaid);

		// add additional test code here
		assertEquals(0, result);
		assertTrue(oneRecipe.checkInventory().getCoffee() < amtCoffee);
		assertTrue(oneRecipe.checkInventory().getMilk() < amtMilk);
		assertTrue(oneRecipe.checkInventory().getSugar() < amtSugar);
		assertTrue(oneRecipe.checkInventory().getChocolate() <= amtChocolate);
	}

	/**
	 * Run the int makeCoffee(Recipe,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/15 5:24 PM
	 */
	@Test
	public void testMakeCoffee2()
		throws Exception {
		int amtPaid = 25;

		int result = oneRecipe.makeCoffee(coffee, amtPaid);

		// add additional test code here
		assertEquals(25, result);
	}
	
	/**
	 * Run the int makeCoffee(Recipe,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/15 5:24 PM
	 */
	@Test
	public void testMakeCoffee3()
		throws Exception {
		int amtPaid = 50;
		
		for(int i = 0; i < 100; i++)
			oneRecipe.makeCoffee(coffee, amtPaid);
		
		int result = oneRecipe.makeCoffee(coffee, amtPaid);
		
		// add additional test code here
		assertEquals(50, result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 3/22/15 5:24 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
		fullRecipes = new CoffeeMaker();
		noRecipes = new CoffeeMaker();
		oneRecipe = new CoffeeMaker();
		coffee = new Recipe();
		coffee.setName("Coffee");
		coffee.setPrice(50);
		coffee.setAmtCoffee(3);
		coffee.setAmtMilk(1);
		coffee.setAmtSugar(1);
		coffee.setAmtChocolate(0);
		r1 = new Recipe();
		r2 = new Recipe();
		r3 = new Recipe();
		r4 = new Recipe();
		fullRecipes.addRecipe(r1);
		fullRecipes.addRecipe(r2);
		fullRecipes.addRecipe(r3);
		fullRecipes.addRecipe(r4);
		oneRecipe.addRecipe(coffee);
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 3/22/15 5:24 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
		fullRecipes = null; 
		noRecipes = null; 
		oneRecipe = null;
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 3/22/15 5:24 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CoffeeMakerTest.class);
	}
}