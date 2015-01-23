package bootcamp.exercises;

import static org.junit.Assert.*;

import org.junit.Test;

public class WordWrappingTest {

	WordWrapping wordWrapping= new WordWrapping();
	
	@Test
	public void test1() {		
		assertEquals(wordWrapping.wordWrap("Hello World!",7),"Hello W/orld!");
	}
	
	@Test
	public void test2() {
		assertEquals(wordWrapping.wordWrap("a b c d e f", 3), "a b/ c /d e/ f");
	}
	
	@Test
	public void test3() {
		assertEquals(wordWrapping.wordWrap("Excelent",5),"Excel/ent");
	}
	
	@Test
	public void test4() {
		assertEquals(wordWrapping.wordWrap("Excelent",10),"Excelent");
	}
}
