import java.util.*;

public class Soil_Fertility extends main{
	void identifier() {
		Scanner sc = new Scanner(System.in);
		int[] arr = {10,56,89,56,23,62,79,65,56,92};
		System.out.print("\nWelcome " + user_get() + ". You currently live at"
				+ " Default location.\n");
		System.out.print("\nYour Current location is Default and the soil ferility level "
				+ "is " + arr[(int)(Math.random()*arr.length)] +"%\n");
		System.out.print("\n1.Call Surveyor for report generation.");
		System.out.print("\n2.Return back\n");
		System.out.print("\nEnter your choice : ");
		int n = sc.nextInt();
		sc.nextLine();
		implementor obj = new implementor();
		if(n==2) {
			obj.options1();
		}else if(n==1) {
			try {
				System.out.print("\nRequesting.");
				Thread.sleep(1500);
				System.out.print("...");
				Thread.sleep(1500);
				System.out.print("....");
				System.out.print("\nRequest Sent.Surveyors will contact you soon.\n");
				System.out.print("\nRedirecting to DashBoard....");
				Thread.sleep(3000);
				obj.options1();
			}catch(Exception e) {
				System.out.print(e);
			}
		}else {
			System.out.print("\nEnter a Valid Choice ");
			identifier();
		}
	}
}
