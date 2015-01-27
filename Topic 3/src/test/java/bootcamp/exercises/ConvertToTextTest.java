package bootcamp.exercises;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ConvertToTextTest {

	ConvertToText number = new ConvertToText();

	@Test
	public void testConvertToText() {
		assertEquals(number.convert("73,30"), "seventy-three and 30/100 dollars.");
		assertEquals(number.convert("102,47"), "one hundred two and 47/100 dollars.");
		assertEquals(number.convert("2523.04"), "two thousand five hundred twenty-three and 04/100 dollars.");
		assertEquals(number.convert("12523.04"), "twelve thousand five hundred twenty-three and 04/100 dollars.");
		assertEquals(number.convert("20020.04"), "twenty thousand twenty and 04/100 dollars.");
		assertEquals(number.convert("2000.04"), "two thousand  and 04/100 dollars.");
		assertEquals(number.convert("130540.04"), "one hundred and thirty thousand five hundred forty and 04/100 dollars.");
		assertEquals(number.convert("102130540.04"),
				"one hundred two million one hundred and thirty thousand five hundred forty and 04/100 dollars.");
	}

	/**
	 * If the entered number is out of range, shoot me an exception.
	 */
	@Test(expected = OverflowException.class)
	public void testOverflow() {
		number.convert("9999999999");
		number.convert("-1");
	}

}
