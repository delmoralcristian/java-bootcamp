package point7;

import java.util.List;
import java.util.ArrayList;

public class PlayList {
	private List<Music> playList;
	private String name;
	
	public PlayList(String n) {
		this.setName(n);
		this.setPlayList(new ArrayList<Music>());
	}
 
	public List<Music> getPlayList() {
		return playList;
	}

	public void setPlayList(List<Music> playList) {
		this.playList = playList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void addMusic(Music music){ // I have to redefine the equals in Music
		if(!this.playList.contains(music)){
			this.playList.add(music);
		}
		else{
			System.out.println("This song belongs to playlist");
		}
	}
	
	public void deleteMusic(Music music){ // I have to redefine the equals in Music
		if(this.playList.contains(music)){
			playList.remove(music);
		}
		else{
			System.out.println("This song not belongs to playlist");
		}
	}
	
	public Music search(int number) throws Exception{
		if((number < this.playList.size()) && (number>= 0)){
			return this.getPlayList().get(number);
		}
		else{
			throw new Exception("The number is incorrect, please enter a valid song");
		}
	}
	
	
	public void playMusic(int number){
		try{
			Music music= this.search(number);
			if(music.getState()){
				System.out.println("The song is playing");
			}
			else{
				music.play();
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public Music songPlay(){ // find the song that is playing
		for(Music i: this.playList){
			if(i.getState()){
				return i;
			}	
		}
		return null;
	}
	
	public void pauseMusic(int number){
		try{
			Music music= this.search(number);
			if(!music.getState()){
				System.out.println("The song is not playing");
			}
			else{
				music.pause();
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void stopMusic(){ // this method pause the playlist
		Music music= this.songPlay();
		if(music != null){
			music.pause();
			System.out.println("The playlist was stop");
		}
	}
	
	
	public void printOut(){
		String title="PlayList Name: "+this.getName()+"\n"+"Musics:";
		System.out.println(title);
		for (Music i: this.playList) {
			i.setState(true);
			System.out.println(i.toString());
			try {
				Thread.sleep(5000); // I guess this time it lasts the song
			}catch (Exception e){
				System.out.println("Error");
			}
			i.setState(false);
		}
	}
	
}
