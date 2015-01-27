package bootcamp.exercises;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FileListTest {

	FileList fileList = new FileList(3);

	@Test
	public void testListEmpty() {
		assertEquals(fileList.getFiles(), "[]");
	}

	@Test
	public void testAddedToTheRecentFileList() {
		fileList.addFile("hello");
		fileList.addFile("I");
		fileList.addFile("am");
		assertEquals(fileList.getFiles(), "[am, I, hello]");
	}

	@Test
	public void testFileAlreadyExists() {
		fileList.setSize(4);
		fileList.addFile("five");
		fileList.addFile("ten");
		fileList.addFile("five");
		fileList.addFile("nine");
		assertEquals(fileList.getFiles(), "[nine, five, ten]");
	}

}
