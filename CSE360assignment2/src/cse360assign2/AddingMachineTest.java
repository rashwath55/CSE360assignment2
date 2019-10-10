/**
 * @author Ashwath Reddy Koppala
 * @classID CSE360
 * @Assignment 2
 * @Descricption This file contains tests for the class AddingMachine.java.
 */
package cse360assign2;
/**
 * @author Ashwath Reddy Koppala
 * @classID CSE360
 * @Assignment 2
 * @Descricption This file contains tests for the class AddingMachine.java.
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddingMachineTest {

	@Test
	void testAddingMachine1() {
		/*
		*testing the add method
		*/
		AddingMachine test=new AddingMachine();
		test.add(5);
		assertEquals(5,test.getTotal());
	}
	@Test
	void testAddingMachine2() {
		/*
		 *testing the subtract method 
		 */
		AddingMachine test=new AddingMachine();
		test.subtract(2);
		assertEquals(-2,test.getTotal());
	}
	@Test
	void testAddingMachine3() {
		/*
		 *testing the subtract and add method combined
		 */
		AddingMachine test=new AddingMachine();
		test.subtract(2);
		test.add(5);
		assertEquals(3,test.getTotal());
	}
	@Test
	void testAddingMachine4() {
		/*
		 * testing the subtract,add,tostring methods methods
		 */
		AddingMachine test=new AddingMachine();
		test.subtract(2);
		test.add(5);
		test.add(5);
		assertEquals("0 - 2 + 5 + 5",test.toString ());
	}
	@Test
	void testAddingMachine5() {
		/*
		 * testing the subtract,add,tostring,clear method methods methods
		 */
		AddingMachine test=new AddingMachine();
		test.subtract(2);
		test.add(5);
		test.add(5);
		test.clear();
		assertEquals(0,test.getTotal());
	}
	@Test
	void testAddingMachine6() {
		/*
		 * testing the subtract,add,tostring,clear method methods methods
		 */
		AddingMachine test=new AddingMachine();
		test.subtract(2);
		test.add(5);
		test.add(5);
		test.clear();
		assertEquals("0",test.toString());
	}
	
	

}
