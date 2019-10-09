/**
 * @author Ashwath Reddy Koppala
 * @classID CSE360
 * @Assignment 2
 * @Descricption This file contains tests for the class AddingMachine.java.
 */
package cse360assign2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddingMachineTest {

	@Test
	void testAddingMachine1() {
		AddingMachine test=new AddingMachine();
		test.add(5);
		assertEquals(5,test.getTotal());
	}
	@Test
	void testAddingMachine2() {
		AddingMachine test=new AddingMachine();
		test.subtract(2);
		assertEquals(-2,test.getTotal());
	}
	@Test
	void testAddingMachine3() {
		AddingMachine test=new AddingMachine();
		test.subtract(2);
		test.add(5);
		assertEquals(3,test.getTotal());
	}
	@Test
	void testAddingMachine4() {
		AddingMachine test=new AddingMachine();
		test.subtract(2);
		test.add(5);
		test.add(5);
		assertEquals("0 - 2 + 5 + 5",test.toString ());
	}
	@Test
	void testAddingMachine5() {
		AddingMachine test=new AddingMachine();
		test.subtract(2);
		test.add(5);
		test.add(5);
		test.clear();
		assertEquals(0,test.getTotal());
	}
	@Test
	void testAddingMachine6() {
		AddingMachine test=new AddingMachine();
		test.subtract(2);
		test.add(5);
		test.add(5);
		test.clear();
		assertEquals("0",test.toString());
	}
	
	

}
