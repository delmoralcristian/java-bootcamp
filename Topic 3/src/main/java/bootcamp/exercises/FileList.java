package bootcamp.exercises;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;

public class FileList {
	private int size;
	private List<String> files;

	public FileList(int size) {
		this.size = size;
		this.files = new ArrayList<String>(this.size);
	}

	@Before
	public void startList() {
		this.files = new ArrayList<String>(this.size);
	}

	public int getSize() {
		return size;
	}

	@After
	public void delete() {
		this.files.clear();
	}

	public void setSize(int size) {
		this.size = size;
	}

	private boolean isFull() {
		return this.files.size() == size;
	}

	public void addFile(String file) {
		if (this.isFull()) {
			files.remove(size);
		}
		if (fileUnique(file)) {
			files.add(0, file);
		} else {
			files.remove(file);
			files.add(0, file);
		}
	}

	private boolean fileUnique(String file) {
		for (String i : this.files) {
			if (i == file) {
				return false;
			}
		}
		return true;
	}

	public String getFiles() {
		return files.toString();
	}
}
