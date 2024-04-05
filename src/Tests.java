
import static org.junit.Assert.*;

import org.junit.*;

public class Tests {

	@Test
	public void testDivision() {
		// Testing successful division
		assertEquals("Division of 4 by 2 should be 2", 2, Group.divide(4, 2));
		
		// Testing division by zero should throw an ArithmeticException
		try {
			Group.divide(4, 0);
			fail("Division by zero should throw an ArithmeticException");
		} catch (ArithmeticException e) {
			assertEquals("Exception message should be 'Cannot divide by zero.'", "Cannot divide by zero.", e.getMessage());
		}
		
		// Testing division that doesn't result in a whole number should throw an ArithmeticException
		try {
			Group.divide(5, 2);
			fail("Division resulting in a non-whole number should throw an ArithmeticException");
		} catch (ArithmeticException e) {
			assertEquals("Exception message should be 'Result is not a whole number.'", "Result is not a whole number.", e.getMessage());
		}
	}
	
	@Test
	public void testMultiplication() {
		// Testing multiplication with positive numbers
		assertEquals("Multiplication of 6 by 6 should be 36", 36, Group.multiply(6, 6));
		
		// Testing multiplication where one operand is zero
		assertEquals("Multiplication of 0 by 5 should be 0", 0, Group.multiply(0, 5));
		
		// Testing multiplication with negative numbers
		assertEquals("Multiplication of -3 by 4 should be -12", -12, Group.multiply(-3, 4));
	}
	
	@Test
	public void testExponentiation() {
		// Testing exponentiation with positive exponent
		assertEquals("3 raised to the power of 3 should be 27", 27, Group.power(3, 3));
		
		// Testing exponentiation with zero as exponent
		assertEquals("Any number raised to the power of 0 should be 1", 1, Group.power(5, 0));
		
		// Testing exponentiation with 0 as base
		assertEquals("0 raised to any power should be 0", 0, Group.power(0, 5));
		
		// Testing exponentiation with 1 as base
		assertEquals("1 raised to any power should be 1", 1, Group.power(1, 5));
	}
}
