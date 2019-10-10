/**
 * @author Ashwath Reddy Koppala
 * @classID CSE360
 * @Assignment 2
 * @Descricption This file contains a package cse360assign2 and within the package there is a class AddingMachine.
 */
package cse360assign2;
/**
 * @Description
 * This class AddingMachine has an attribute total(int),Constructor and methods getTotal (),add (value),
 * subtract (value),String toString (),clear().
 * @Attribute total
 * @constructor  AddingMachine ()
 * @methods getTotal (),add (value),
 * subtract (value),String toString (),clear().
 */

public class AddingMachine {

	private int total;
	private String st;
	
	public AddingMachine () {
		total = 0; // not needed - included for clarity
		st = Integer.toString(total);
	}
	/**
	 * @Description This method is used to return the current total.
	 * @return total
	 */
	public int getTotal () {
		return this.total;
	}
	/**
	 * @Description This function adds the given parameter 'value' to 'total'.
	 * @param value
	 */
	public void add (int value) {
		this.total = this.total + value;
		st = st +" + " + Integer.toString(value);
		
	}
	/**
	 * @Description This function subtracts the given parameter 'value' from 'total'.
	 * @param value
	 */
	public void subtract (int value) {
		this.total = this.total-value;
		st = st + " - " + Integer.toString(value);
		
	}
	/**
	 * @Description This function is used to return the string which keeps track of
	 * all transactions that took place.
	 * @return String
	 */
		
	public String toString () {
		return st;
	}
	/**
	 * @Description This function is used to make total '0' and clear the string
	 */

	public void clear() {
		total = 0;
		st = "0";
	}
}
