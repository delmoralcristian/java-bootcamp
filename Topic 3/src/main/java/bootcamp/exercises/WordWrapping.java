package bootcamp.exercises;

public class WordWrapping {

	private static final String lineSeparator = System.getProperty("line.separator");

	public String wordWrap(String words, int length) {
		if (length > 0) {
			if (words.length() > 0 && (words.charAt(0) == ' ')) {
				words = words.substring(1);
			}
			if (words.length() <= length) {
				return words;
			}
			if (words.substring(0, length).contains(lineSeparator)) {
				return words.substring(0, words.indexOf(lineSeparator)).trim() + ", "
						+ wordWrap(words.substring(words.indexOf("\n") + 1), length);
			}
			int spaceIndex = Math.max(Math.max(words.lastIndexOf(" ", length), words.lastIndexOf("\t", length)),
					words.lastIndexOf("-", length));
			if (spaceIndex == -1) {
				spaceIndex = length;
			}
			return words.substring(0, spaceIndex).trim() + ", " + wordWrap(words.substring(spaceIndex), length);
		} else {
			throw new OverflowException();
		}
	}
}
