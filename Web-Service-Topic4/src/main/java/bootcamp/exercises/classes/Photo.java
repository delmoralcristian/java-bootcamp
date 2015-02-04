package bootcamp.exercises.classes;

public class Photo {
	
	private String url;
	private int likeCount;
	private String userAccount;
	
	public Photo(String url, String userAccount) {
		super();
		this.url = url;
		this.likeCount = 0;
		this.userAccount = userAccount;
	}
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getLikeCount() {
		return likeCount;
	}
	public void setLikeCount(int likeCount) {
		this.likeCount = likeCount;
	}
	public String getUserAccount() {
		return userAccount;
	}
	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}
	

}
