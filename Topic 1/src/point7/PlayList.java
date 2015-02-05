package point7;

public class PlayList {

	private Context contextState;
	
	public PlayList(){
		PlayListState initialState = new StopState();
        this.contextState = new Context(initialState);
	}
	
	 public void play() {
		 this.contextState.getState().play(this.contextState);
	 }

	 public void pause() {
		 this.contextState.getState().pause(this.contextState);
	 }

	 public void stop() {
	     this.contextState.getState().stop(this.contextState);
	 }
}
