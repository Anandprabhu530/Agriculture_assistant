import java.util.*;

public class Dashboard extends main{
	public void entered() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nHello " + user_get() + ". Welcome to Your "
				+ "Virtual Assistant\n");
		System.out.println("\n1.View Profile\n2.Change Password\n3.Change Location\n4.View Current Password\n5.Back");
		System.out.print("\nEnter your chocie : ");
		int n = sc.nextInt();
		sc.nextLine();
		if(n==1) {
			System.out.print("\nYour User Name is " + user_get() + " and your "
					+ "current location is Default\n");
			entered();
		}else if(n==2) {
			System.out.print("\nEnter your old Password: ");
			String temp = sc.nextLine();
			System.out.print("Enter your new Password: ");
			String new_pass = sc.nextLine();
			pass_set(new_pass);
			System.out.print("\nYour Password Updated from " + pass_get() + " to " + new_pass);
			entered();
		}else if(n==3) {
			System.out.print("\nYou are currenlty at Default Location.");
			System.out.print("\nEnter the changed location : ");
			String location = sc.nextLine();
			System.out.println("\nYou changed your location from Default to " + location);
			entered();
		}else if(n==4) {
			System.out.print("\nThe current password is " + pass_get()+ "\n");
			entered();
		}else if(n==5) {
			implementor obj = new implementor();
			obj.options1();
		}else{
			System.out.print("\nEnter a valid choice\n");
			entered();
		}
	}
}
