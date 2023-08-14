
public class Logout {
	void logging_out() {
		System.out.print("\n\nLogging Out");
		try {
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.print("..");
			Thread.sleep(1000);
			System.out.print("...");
			System.out.print("\n\nYou can close the Application now.");
			return;
		}catch(Exception e) {
			System.out.print(e);
		}
	}
}
