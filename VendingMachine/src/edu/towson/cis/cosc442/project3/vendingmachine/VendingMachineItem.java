package edu.towson.cis.cosc442.project3.vendingmachine;

/**
 * Class for items in the vending machine
 */
public class VendingMachineItem {

	// The name of the item
	private String name;

	// The price of the item
	private double price;
	
	// Exception message for when the name is null
	private final static String NAME_IS_NULL_MESSAGE ="Name cannot be null";
	
	// Exception message for when the price is less than zero
	private final static String PRICE_LESS_THAN_ZERO_MESSAGE = "Price cannot be less than zero";
	
	/**
	 * Constructor which fills in the name and price of the item
	 * Precondition: price argument >= 0
	 * Postcondition:  The name and price of the item is set to be the values in the arguments
	 * @param name The name of the item
	 * @param price The price of the item
	 * @throws VendingMachineException Thrown if price is less than zero
	 */
	public VendingMachineItem( String name, double price ) throws VendingMachineException {
		if(name == null){
			throw new VendingMachineException(NAME_IS_NULL_MESSAGE);
		}
		else{
			this.name = name;
		}
		if( price <= 0 ) {
			throw new VendingMachineException(PRICE_LESS_THAN_ZERO_MESSAGE);
		} else {
			this.price = price;
		}
	}
	
	/**
	 * Gets the name of the vending machine item
	 * @return The string corresponding to the name of the vending machine item
	 * Postcondition: the actual name of the item is returned
	 */
	public String getName() {
        return name;
    }
    
    /**
     * Gets the price of the vending machine item
     * @return The price of the vending machine item in dollars
     * Postcondition: The actual price of the item is returned
     */
    public double getPrice() {
        return price;
    }
}
