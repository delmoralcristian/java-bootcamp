package bootcamp.exercises;

public class WordWrapping {
	
	public String wordWrap(String words, int length) {
		if (words.length() <= length) {
			return words;
		} else {
			return (words.substring(0, length) + "/" + wordWrap(words.substring(length), length));
		}
	}
}

