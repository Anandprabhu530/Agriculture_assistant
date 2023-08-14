import java.util.*;

public class implementor {
	
	void options1(){
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\n----Welcome to Your Agricultural Assistant----");
		System.out.println("\nEnter the corresponing number for below options");
		System.out.println("\n1.Dashboard\n2.Soil Feritility\n3.Last Yeild\n4.Crop Suggestion\n5.Latest News\n6.Support\n7.Logout");
		System.out.print("\nEnter Your Choice: ");
		int n = sc.nextInt();
		if(n==1) {
			Dashboard obj1 = new Dashboard();
			obj1.entered();
		}
		else if(n==2) {
			Soil_Fertility obj = new Soil_Fertility();
			obj.identifier();
		}
		else if(n==3) {
			Last_Yeild obj = new Last_Yeild();
			obj.viewable();
		}
		else if(n==4) {
			Crop_Suggestion obj1 = new Crop_Suggestion();
			obj1.suggestor();
		}
		else if(n==5) {
			Latest_News obj1 = new Latest_News();
			obj1.Show();
		}
		else if(n==6) {
			Support obj1 = new Support();
			obj1.contact();
		}else if(n==7) {
			Logout obj1 = new Logout();
			obj1.logging_out();
		}
		else{
			options1();
		}
		sc.nextLine();
	}
}
