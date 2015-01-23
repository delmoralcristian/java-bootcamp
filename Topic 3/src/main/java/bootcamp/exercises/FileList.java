package bootcamp.exercises;

import java.util.ArrayList;
import java.util.List;

public class FileList {
	private int size;
	private List<String> files;
	
	public FileList(int size){
		this.size= size;
		this.files= new ArrayList<String>(this.size);
	}
	
	public int getSize(){
		return size;
	}
	
	public void delete(){
		this.files.clear();
	}
	
	public void setSize(int size){
		this.size=size;
	}
	
	private boolean isFull(){
		return this.files.size()== size;
	}
	
	public void addFile(String file){
		if (this.isFull()){ 
	        files.remove(0);
	     }		
		if (fileUnique(file)){
			files.add(file);
	    }
		else{
	        files.remove(file);
	        files.add(file);	        	
	    }
	}
	
	private boolean fileUnique(String file) {
		for(String i: this.files){
			if(i == file){
				return false;
			}
		}		
		return true;
	}
	
	public String getFiles() {
		return files.toString();
	}
}
