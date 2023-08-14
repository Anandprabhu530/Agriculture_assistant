import java.util.*;

public class main {
	private static String username;
	private static String password;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----Welcome to your Agriculture Assistant----");
        System.out.print("\nEnter 1 to Login\nEnter 2 to Sign Up\n");
        System.out.print("\nEnter Your Choice : ");
        int n = sc.nextInt();
        sc.nextLine();
        String temp = "";
        if (n != 1 && n!=2) {
            System.out.println("Enter a valid choice Either 1 or 2");
            n = sc.nextInt();
            sc.nextLine();
        }
        
        if (n != 1)
            temp = "desired";
        System.out.print("\nEnter your " + temp + " Username: ");
        username = sc.nextLine();
        System.out.print("\nEnter your " + temp + " Password: ");
        password = sc.nextLine();
        authenticator obj1 = new authenticator();
        if (n == 1)
            obj1.login(username, password);
        else
            obj1.sign_up(username, password);
    }
    String user_get() {
    	return username;
    }
    String pass_get() {
    	return password;
    }
    void pass_set(String password) {
    	main.password = password;
    }
}