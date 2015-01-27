package bootcamp.exercises;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WordWrappingTest {

	WordWrapping wordWrapping = new WordWrapping();

	@Test
	public void testWordWrap2() {
		assertEquals(wordWrapping.wordWrap("Hello Word!", 7), "Hello, Word!");
		assertEquals(wordWrapping.wordWrap("Excelent", 5), "Excel, ent");
		assertEquals(wordWrapping.wordWrap("Excelent", 10), "Excelent");
		assertEquals(wordWrapping.wordWrap("a b c d e f", 3), "a b, c d, e f");

	}

}
