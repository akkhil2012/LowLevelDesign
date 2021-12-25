import java.util.UUID;

public class Client {

	public static void main(String args[]) {

		String id = UUID.randomUUID().toString();

		RateLimterService service = new RateLimterService(id);

		for (int i = 0; i < 10; i++) {
			boolean res = service.isAllowed();
			System.out.println("is re allowed " + res);

			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
