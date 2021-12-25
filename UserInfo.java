
public class UserInfo {

	private int count;
	private Long lastRequestTime;

	public UserInfo() {

	}

	public UserInfo(int count, Long lastRequestTime) {
		super();
		this.count = count;
		this.lastRequestTime = lastRequestTime;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Long getLastRequestTime() {
		return lastRequestTime;
	}

	public void setLastRequestTime(Long lastRequestTime) {
		this.lastRequestTime = lastRequestTime;
	}

}
