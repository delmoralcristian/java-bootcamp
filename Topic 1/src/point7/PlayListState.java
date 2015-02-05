package point7;

public interface PlayListState {
	/**
	 * 
	 * @author cris14
	 * State Pattern
	 *
	 */
	
	public void pause(Context contextState);
	
	public void play(Context contextState);
	
	public void stop(Context contextState);
	
	public String getDescription();
}
