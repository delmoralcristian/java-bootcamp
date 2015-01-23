package bootcamp.exercises;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanTest {

	Roman roman= new Roman();
	
	@Test
	public void test1(){
		assertEquals(roman.toDecimal("V"),5);
	}
	
	@Test
	public void test2(){
		assertEquals(roman.toDecimal("I"),1);
	}
	
	/**
	 * If the roman number is invalid, shoot me an exception.
	 */
	@Test(expected= OverflowException.class)
	public void test3(){
		roman.toDecimal("AC");
	}


}
