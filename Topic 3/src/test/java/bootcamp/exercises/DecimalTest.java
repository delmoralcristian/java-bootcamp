package bootcamp.exercises;

import static org.junit.Assert.*;

import org.junit.Test;

public class DecimalTest {

	Decimal decimal= new Decimal();
	
	@Test
	public void test1(){
		assertEquals(decimal.toRoman(6),"VI");
	}
	
	@Test
	public void test2(){
		assertEquals(decimal.toRoman(1),"I");
	}
	
	/**
	 * If the entered number is invalid, shoot me an exception.
	 */
	@Test(expected= OverflowException.class)
	public void test3(){
		decimal.toRoman(0);
	}

}
