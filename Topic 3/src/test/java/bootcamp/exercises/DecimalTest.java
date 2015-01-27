package bootcamp.exercises;

import static org.junit.Assert.*;

import org.junit.Test;

public class DecimalTest {

	Decimal decimal= new Decimal();
	
	@Test
	public void testConvertionToRomanNumber(){
		assertEquals(decimal.toRoman(129),"CXXIX");
		assertEquals(decimal.toRoman(1),"I");
		assertEquals(decimal.toRoman(7),"VII");
	}
	
	/**
	 * If the entered number is invalid, shoot me an exception.
	 */
	@Test(expected= OverflowException.class)
	public void testOverflow(){
		decimal.toRoman(0);
	}

}
