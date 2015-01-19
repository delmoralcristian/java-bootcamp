package point7;

public class PlayList implements PlayListState {
	/**
	 * 
	 * @author cris14
	 * State Pattern
	 *
	 */
	private PlayListState playListState;
	
	public PlayList(PlayListState playListState){
		this.playListState= playListState;
	}
	
	@Override
	public void play() {
		this.playListState.play();

	}

	@Override
	public void pause() {
		this.playListState.pause();

	}

	@Override
	public void stop() {
		this.playListState.stop();

	}

	public void setPlayListState(PlayListState playListState) {
		this.playListState = playListState;
	}

}
