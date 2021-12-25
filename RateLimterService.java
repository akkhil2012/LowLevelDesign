
public class RateLimterService {

	RateLimterUtil rateLimterUtil;
	
	RateLimterService(String clientID){
		rateLimterUtil = new RateLimterUtil(clientID);
	}
	
	boolean isAllowed() {
		  return rateLimterUtil.validate();
	}

}
