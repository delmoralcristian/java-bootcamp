package point7;

public class Music {
	private String disk; // indicates which disk or album the song belongs
	private String artist;
	private String title;
	private int duration;
	private boolean state; // indicates whether this on or off
	
	public Music(String disk, String artist, String title, int duration){
		this.setDisk(disk);
		this.setArtist(artist);
		this.setTitle(title);
		this.setDuration(duration);
		this.setState(false);
	}

	public boolean equals (Object o) {
		Music d= (Music)o;
		return ((d.getTitle().equals(this.getTitle())) && (d.getDisk().equals(this.getDisk())));
	}
	
	public String getDisk() {
		return disk;
	}

	public void setDisk(String disk) {
		this.disk = disk;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public boolean getState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}
	
	public void play(){
		this.setState(true);
		System.out.println(" the song " + this.getTitle() + " is playing ");
		System.out.println(this.toString());
	}
			
	public void pause(){
		this.setState(false);
		System.out.println(" the song " + this.getTitle() + " is paused ");		
	}
		
	public String toString(){
		return  " Name: "+ title +", Duration: "+ duration +", Artist"+ artist +", Disk: "+ disk;
	}
	
}
