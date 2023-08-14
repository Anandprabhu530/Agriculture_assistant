public class Crop_Suggestion {
	static String[] arr = {"Maize","Wheat","Barley","Potato","Rice","Tomato","Sugarcane"};
	void suggestor(){
		System.out.print("\nLocating");
		try{
			System.out.print(".");
			Thread.sleep(1500);
			System.out.print("..");
			Thread.sleep(1500);
			System.out.print("...");
			int random = (int)(Math.random()*arr.length);
			System.out.print("\n\n" + arr[random] + " is recommended crop based on your Location and Soil Fertility.");
			implementor obj = new implementor();
			obj.options1();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
