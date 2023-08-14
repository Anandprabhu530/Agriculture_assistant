import java.util.*;

public class authenticator {
    void login(String username, String password) {
    	Scanner sc = new Scanner(System.in);
        if (username.equals("Admin") && password.equals("1234")) {
        	System.out.print("\nLoading");
        	sleepin();
            System.out.print("\n\nLogin successfull");
            System.out.flush();
            obj.options1();
        }else {
        	System.out.println("\nLogin Failed");
        	System.out.println("\nInvalid Username or Password");
        	System.out.print("\nEnter 1 to Login\nEnter 2 to Sign Up\n");
            System.out.print("\nEnter Your Choice : ");
            int n = sc.nextInt();
            sc.nextLine();
            if(n==1) {
	            System.out.print("\nEnter your Username :");
	        	username = sc.nextLine();
	            System.out.print("\nEnter your Password : ");
	        	password = sc.nextLine();
	        	login(username,password);
            }else if(n==2) {
            	System.out.print("\nEnter your desired Username :");
	        	username = sc.nextLine();
	            System.out.print("\nEnter your desired Password : ");
	        	password = sc.nextLine();
	        	sign_up(username,password);
            }else {
            	System.out.print("\nRestart the Application");
            }
        }
    }

    void sign_up(String username, String password) {
    	System.out.print("\nCreating User");
    	sleepin();
        System.out.println("\nSign-up Successful");
        obj.options1();
    }
    
    void sleepin() {
    	try {
    		Thread.sleep(1500);
    		System.out.print(".");
    		Thread.sleep(1300);
    		System.out.print("..");
    		Thread.sleep(1500);
    		System.out.print("...");
    	}catch(Exception e) {
    		System.out.println(e);
    	}
    }
    implementor obj = new implementor();
    
}
