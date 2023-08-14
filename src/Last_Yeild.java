import java.util.*;

public class Last_Yeild {
	implementor obj = new implementor();
	ArrayList<String> list = new ArrayList<>();
	void viewable() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\n1.Add Last Yield\n2.View Last Yeild\n3.Back\nEnter your choice: ");
		int n = sc.nextInt();
		sc.nextLine();
		if(n==1) {
			System.out.print("\nEner your Yield Name: ");
			String id = sc.nextLine();
			list.add(id);
			System.out.print("\nAdding.");
			try {
				Thread.sleep(1500);
				System.out.print("..");
				Thread.sleep(1000);
				System.out.print("...\n");
				System.out.print("\nYield Added Successfully\n");
				viewable(list);
			}catch(Exception e) {
				System.out.print(e);
			}
		}else if(n==2) {
			System.out.print("\nThe last yeild's are: \n");
			int j =1;
			for(int i=0;i<list.size();i++) {
				int temp = (int)(Math.random()*1000);
				System.out.print("\n"+ j++ + "." +list.get(i)+"_"+temp);
			}
			System.out.print("\n");
			viewable();
		}else if(n==3){
			obj.options1();
		}else{
			System.out.print("\nEnter a Valid choice");
			viewable();
		}
	}
	void viewable(ArrayList<String> list) {
		System.out.print("\nThe last yeild's are: ");
		int j = 1;
		for(int i=0;i<list.size();i++) {
			int temp = (int)(Math.random()*10);
			System.out.print("\n"+ j++ + "." +list.get(i)+"_"+temp);
		}
		System.out.print("\n");
		viewable();
	}
}
