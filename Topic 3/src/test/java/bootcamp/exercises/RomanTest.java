package bootcamp.exercises;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomanTest {

	Roman roman = new Roman();

	@Test
	public void testConvertionToDecimal() {
		assertEquals(roman.toDecimal("IX"), 9);
		assertEquals(roman.toDecimal("CXXIX"), 129);
	}

	/**
	 * If the roman number is invalid, shoot me an exception.
	 */
	@Test(expected = OverflowException.class)
	public void testOverflow() {
		roman.toDecimal("AC");
		roman.toDecimal("IIV");
	}

}
