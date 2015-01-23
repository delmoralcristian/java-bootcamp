package bootcamp.exercises;

import static org.junit.Assert.*;

import org.junit.Test;

public class FileListTest {

	
	FileList fileList= new FileList(3);
	
	@Test
	public void test() {
		assertEquals(fileList.getFiles(),"[]");
	}
	
	@Test
	public void test2() {
		fileList.addFile("hello");
		fileList.addFile("I");
		fileList.addFile("am");
		assertEquals(fileList.getFiles(),"[hello, I, am]");
	}
	
	@Test
	public void test3() {
		fileList.delete();
		fileList.setSize(4);
		fileList.addFile("five");
		fileList.addFile("ten");
		fileList.addFile("five");
		fileList.addFile("nine");
		assertEquals(fileList.getFiles(),"[ten, five, nine]");
	}

}
