
import java.util.HashMap;
import java.util.Map;

public class RateLimterUtil {

	private final String clientID;

	private final int timeSpan = 1800;
	private final int count = 10;

	Map<String, UserInfo> clientRequestMap;

	public RateLimterUtil(String clientID) {
		super();
		this.clientID = clientID;
		clientRequestMap = new HashMap<String, UserInfo>();
	}

	public boolean validate() {
		Long current = System.currentTimeMillis();
		if (clientRequestMap.containsKey(clientID)) {
			UserInfo infor = clientRequestMap.get(clientID);
			Long lastRequest = infor.getLastRequestTime();
			if (current - lastRequest < timeSpan) {
				return false;
			}

			int requestTillNow = infor.getCount();
			if (requestTillNow < count) {
				infor.setCount(requestTillNow + 1);
				infor.setLastRequestTime(current);
				return true;
			}
		} else {
			UserInfo userInfo = new UserInfo(1, current);
			clientRequestMap.put(clientID, userInfo);
			return true;
		}
		return false;

	}

}
